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

import java.io.File;
import java.util.List;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.Document;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;

import ac.at.tuwien.dsg.uml.classdiagram.export.transformation.engines.AbstractClassDiagramTestStrategy;
import ac.at.tuwien.dsg.uml.classdiagram.export.transformation.engines.ClassDiagramTestEngineFactory;
import ac.at.tuwien.dsg.uml.classdiagram.export.transformation.gui.SelectClassDiagramTestGenerationStrategyTab;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.SharedContext;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.factories.impl.SingletonVolatileContextFactory;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.AbstractStateMachineTestStrategy;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.exceptions.NoSuchEngineTypeException;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.util.JavaClassOutputter;

import com.ibm.xtools.transform.core.ITransformContext;
import com.ibm.xtools.transform.core.ModelRule;


/*
 * (non-Javadoc)
 * 
 * @see com.ibm.xtools.transform.core.AbstractRule
 */
public class ClassDiagramToRunTimeTestsTransformationRule extends ModelRule {
	

	private SharedContext sharedContext;
	
	{
		sharedContext = new SingletonVolatileContextFactory().createSharedContext();
	}
	

	
	/**
	 * Default constructor to create a rule.
	 */
	public ClassDiagramToRunTimeTestsTransformationRule() {
		super();
	}
	/**
	 * constructor
	 * @param id
	 * @param name
	 */
	public ClassDiagramToRunTimeTestsTransformationRule(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.xtools.transform.core.AbstractRule#createTarget(com.ibm.xtools.transform.core.ITransformContext)
	 */
	public Object createTarget(ITransformContext context) {
		
		ClassImpl source =  (ClassImpl) context.getSource();
//		PackageImpl pimpl = (PackageImpl) source.getOwner();
//		
//		//retrieve all state machines (should be only one) which have the same name as the class under processing
//		List<Element> stateMachines = pimpl.allOwnedElements().stream().filter(e -> e instanceof  StateMachine && ((StateMachine)e).getName().equals(source.getName())).collect(Collectors.toList());
//		
//		for (Element element: stateMachines){
//			 StateMachine stateMachine = (StateMachine) element;
//			 
//			 System.out.format("State machine %s targets class %s \n", new Object[]{stateMachine.getName(), source.getName()});
//			 
//			 
////			 for (Relationship rel: stateMachine.getRelationships()){
////				 for (Element el: rel.getRelatedElements()){
////					 //This assumes that each StateMachine has a relationship "directAssociation" indicating the class described by the state machine (although I can do name-based resolution)
////					 if ( el instanceof ClassImpl && !el.equals(stateMachine)){
////					   System.out.format("State machine %s targets class %s \n", new Object[]{stateMachine.getName(), ((ClassImpl)el).getName()});
////					   
////					   //parse the state machine diagram
////					   StateMachineStateGraph stateGraph = StateMachineStateGraph.fromStateMachine(stateMachine);
////					   c
////					   //here we can check each transition, extract its trigger, and for each trigger, if it is an operation
////					   //on a separate class, check the class instance is "accessible" through the network
////					   
////					   
////					 }
////				 }
////			 }
//			 Object a = element;
//		}
//		
//		//get all class properties, i.e. attributes
//		for (Property p: source.getAllAttributes()){
//			
//			
//			   
//			   //get what type of aggregation is this. Can be AggregationKind.NONE, AggregationKind.COMPOSITE (composition), AggregationKind.SHARED (aggregation)
//			   AggregationKind agg = p.getAggregation();
//			   
//			   if (agg.getValue() == AggregationKind.COMPOSITE){
//				   System.out.println("COMPOSITION");
//			   }else if (agg.getValue() == AggregationKind.SHARED){
//				   System.out.println("AGGREGATION");
//			   }else{
//				   System.out.println("ASSOCIATION");
//			   }
//			   
//			   //check if the property is an association or not (if not the assoc is null)
//			   Association assoc = p.getAssociation();
//			   if (assoc != null){
//				   
//				   //if we have association, check its end types. one end is current class, and one is target
//				   for(Type type : assoc.getEndTypes()){
//						ClassImpl typeClass = (ClassImpl) type;
//						if(typeClass.equals(source)){ // skip over current class, as we know who we are
//							continue;
//						}
//						System.out.println("T: " + typeClass.getQualifiedName());
//						
//						//check if the association target has a stereotype applied to it
//						//the applied stereotypes should determine how we test the system.
//						for (Stereotype st: typeClass.getAppliedStereotypes()){
//							System.out.println("ST: " + st.getName());
//						}
//						Object ow = type;
//					}
//			   }
//			   
//			   
//			   
//		}
//		
//		for (Association ass: source.getAssociations()){
//				
//			
//			    for (Property p : ass.getMemberEnds()){
//			    	System.out.println("P: " + p.getName());
//			    }
//			
//				for(Type type : ass.getEndTypes()){
//					ClassImpl typeClass = (ClassImpl) type;
//					if(typeClass.equals(source)){
//						continue;
//					}
//					System.out.println("T: " + typeClass.getQualifiedName());
//					for (Stereotype st: typeClass.getAppliedStereotypes()){
//						System.out.println("ST: " + st.getName());
//					}
//					Object ow = type;
//				}
//			 
//		}
//		PackageImpl packageImpl = (PackageImpl) source.getOwner();
//		System.out.println("====: " + source.getClass());
		
		
		
		
		
		Object selectedStrategy = sharedContext.getProperty(SelectClassDiagramTestGenerationStrategyTab.SELECTED_STRATEGY_PROPERTY);
		
		if (selectedStrategy == null){
			notifyUser("Please select a test generation strategy from the Select Test Generation Strategy Tab");
			return null;
		}
		
		AbstractClassDiagramTestStrategy strategy;
		try {
			strategy = ClassDiagramTestEngineFactory.createTestEngine(selectedStrategy.toString());
		} catch (NoSuchEngineTypeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}
		
		
		List<Document> documents = strategy.generateTestConfig(source);

		//if documents empty, do not generate directory 
		if (!documents.isEmpty()){
			//write generated configuration files
			JavaClassOutputter.outputFiles(context, documents, source.getName(), selectedStrategy.toString());
		}
		
		return context;
	}
	
	
	private void notifyUser(String message){
		   Display.getDefault().syncExec(new Runnable() {
				    public void run() {
			    	MessageDialog.openWarning(Display.getDefault().getActiveShell(), "Warning", message);
			    }
			});
		}
	

	
	
}
