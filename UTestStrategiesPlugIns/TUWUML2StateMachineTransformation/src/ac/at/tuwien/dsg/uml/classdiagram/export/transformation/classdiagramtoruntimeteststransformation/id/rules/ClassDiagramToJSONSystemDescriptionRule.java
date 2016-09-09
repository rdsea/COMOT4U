/**
 * Class providing the rule to convert UML classes to whatever is desired 
 * 
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
 * __license__ = "Apache LICENSE V2.0"
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 */

package ac.at.tuwien.dsg.uml.classdiagram.export.transformation.classdiagramtoruntimeteststransformation.id.rules;

import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.Document;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;
import org.eclipse.uml2.uml.internal.impl.PackageImpl;

import ac.at.tuwien.dsg.uml.classdiagram.export.transformation.internal.entities.RunTimeTestingSystemDescriptionEntity;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.SharedContext;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.factories.impl.SingletonVolatileContextFactory;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.util.JavaClassOutputter;

import com.ibm.xtools.transform.core.ITransformContext;
import com.ibm.xtools.transform.core.ModelRule;


/*
 * (non-Javadoc)
 * 
 * @see com.ibm.xtools.transform.core.AbstractRule
 */
public class ClassDiagramToJSONSystemDescriptionRule extends ModelRule {
	

	private SharedContext sharedContext;
	
	{
		sharedContext = new SingletonVolatileContextFactory().createSharedContext();
	}
	

	
	/**
	 * Default constructor to create a rule.
	 */
	public ClassDiagramToJSONSystemDescriptionRule() {
		super();
	}
	/**
	 * constructor
	 * @param id
	 * @param name
	 */
	public ClassDiagramToJSONSystemDescriptionRule(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.xtools.transform.core.AbstractRule#createTarget(com.ibm.xtools.transform.core.ITransformContext)
	 */
	public Object createTarget(ITransformContext context) {
		
		if (! (context.getSource() instanceof PackageImpl)){
			return null;
		}
		
		Map<RunTimeTestingSystemDescriptionEntity, RunTimeTestingSystemDescriptionEntity> classEntities = new HashMap<>();
		
		PackageImpl source =  (PackageImpl) context.getSource();
		
		String sourceName = source.getName().replaceAll("\\W", "");
		
		//get all classes with applied stereotypes
		List<Element> classes = source.allOwnedElements().stream().filter(e -> e.getClass().equals(ClassImpl.class) && !e.getAppliedStereotypes().isEmpty()).collect(Collectors.toList());
		
		//go through each class and create its JSON representation for system description for runtime testing platform configuration
		for (Element element: classes){
			 ClassImpl classImpl = (ClassImpl) element;
			 
			 if (classImpl.getAppliedStereotypes().isEmpty()){
				 continue;
			 }
			 
			 RunTimeTestingSystemDescriptionEntity entity = new RunTimeTestingSystemDescriptionEntity(classImpl);
			 
			 if (classEntities.containsKey(entity)){
				//update stored entity 
				entity = classEntities.get(entity);
			 }else{
				 classEntities.put(entity, entity);
			 }
			 
			 processClassRelationships(classImpl, entity, classEntities);
		}
		
		//convert everything nicely to JSON.
		
		//rule is. if entity contains no HostedOn, we create for it its Composite element
		//else, the entity's toJSON method creates all we need
		
		String serviceDescription = String.format("\n"
				+ "{\n"
				+ "'name': '%s',\n"
				+ "'containedUnits': [\n",sourceName);
		//will need to add closing ] }
		
		for (RunTimeTestingSystemDescriptionEntity entity: classEntities.keySet()){
			if (entity.hasHostedOn()){
				//if it is hosted on something, it will appear in that element's JSON
				continue;
			}else if(entity.getContainedUnits().isEmpty() && entity.getCommunicatesWith().isEmpty()){
				//if entity is not hosted on anything, and it also does not communicate with anything, 
				//there is no point in putting it in the system description as nobody uses it and it uses nobody
				continue;
				
			}else{
				String jsonString = entity.toJSONString();
				//null is improperly formed object, e.g.. null type
				if (jsonString!= null){
					//else need to create Complex component for it
					String complexEntityDescription = String.format("\n  {"
							+"'name': 'Composite.%s',"
							+"'type': 'Composite',"
							+"'containedUnits': [ \n %s \n] \n } ",entity.getName(),jsonString );
					serviceDescription += complexEntityDescription + ",\n";
				}
			}
		}
		
		serviceDescription = serviceDescription.substring(0,serviceDescription.length()-2); // remove  ",\n" 
				
		serviceDescription += "\n ] \n }";
		

		//dynamically load the JSON jar to pretty print JSON text
		String formattedJSON = serviceDescription;
		try {
			//StateMachineTransformation is plug-in ID
			URL jarfile = new URL("platform:/plugin/StateMachineTransformation/lib/json-20160810.jar");
			URLClassLoader cl = URLClassLoader.newInstance(new URL[] {jarfile });   
			Class loadedClass = cl.loadClass("org.json.JSONObject");
			Object instance = loadedClass.getConstructor(String.class).newInstance(serviceDescription);
			formattedJSON = (String) loadedClass.getMethod("toString", int.class).invoke(instance, 4);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
		
		Document doc = new Document(formattedJSON);
		
		//write generated configuration files
		JavaClassOutputter.outputRawFile(context, doc, sourceName);
		
		//here we return target because in a rule we create a target object, which is reused by the text transformations
		return context.getTarget();
		
	}
	
	
	/**
	 * Method with side effects. Takes each association relationship, checks what type it is, creates for each end (if not existing) a 
	 * RunTimeTestingSystemDescriptionEntity instance, and stores it in processedEntities.
	 * @param impl
	 * @param classEntity
	 * @param processedEntities
	 */
	private void processClassRelationships(ClassImpl impl, RunTimeTestingSystemDescriptionEntity classEntity, Map<RunTimeTestingSystemDescriptionEntity, RunTimeTestingSystemDescriptionEntity> processedEntities){

		//get all class properties, i.e. attributes
		for (Property p: impl.getAllAttributes()){
			
			// get what type of aggregation is this. Can be
			// AggregationKind.NONE, AggregationKind.COMPOSITE (composition),
			// AggregationKind.SHARED (aggregation)
			AggregationKind agg = p.getAggregation();
			
			boolean isComposition = false;

			if (agg.getValue() == AggregationKind.COMPOSITE) {
				isComposition = true;
			} 
			
//			else if (agg.getValue() == AggregationKind.SHARED) {
//				System.out.println("AGGREGATION");
//			} else {
//				System.out.println("ASSOCIATION");
//			}

			// check if the property is an association or not (if not the assoc
			// is null)
			Association assoc = p.getAssociation();
			if (assoc != null) {

				// if we have association, check its end types. one end is
				// current class, and one is target
				for (Type type : assoc.getEndTypes()) {
					ClassImpl typeClass = (ClassImpl) type;
					
					//if no stereotype applied on the type, we do not care about the relationship
					
					if (typeClass.getAppliedStereotypes().isEmpty()){
						continue;
					}
					
					if (typeClass.equals(impl)) { // skip over current class,
												  // as we know who we are
						continue;
					}
					
					RunTimeTestingSystemDescriptionEntity associated = new RunTimeTestingSystemDescriptionEntity(typeClass);
					
					if (processedEntities.containsKey(associated)){
						associated = processedEntities.get(associated);
					}else{
						processedEntities.put(associated, associated);
					}
					
					if (isComposition){
						//if composition, associated is hosted on parent
						classEntity.addContainedUnit(associated);
						associated.setHostedOn(classEntity);
					}else{
						//if not composition, there is just a communication thing.
						classEntity.addCommunicatesToUnit(associated);
					}
				 
				}
			}

		}
 
	}
	
	
	private void notifyUser(String message){
	   Display.getDefault().syncExec(new Runnable() {
			    public void run() {
		    	MessageDialog.openWarning(Display.getDefault().getActiveShell(), "Warning", message);
		    }
		});
	}
	

	
	
}
