
package ac.at.tuwien.dsg.uml.statemachine.export.transformation.statemachinetransformation.rules;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;

import ac.at.tuwien.dsg.uml.statemachine.export.transformation.internal.StateMachineState;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.internal.StateMachineStateGraph;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.internal.StateMachineStateTransition;

import com.ibm.xtools.transform.core.ITransformContext;
import com.ibm.xtools.transform.core.ModelRule;


/**
 * Class containing the method to convert an UML State Machine Diagram to Java Representation
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
 * __license__ = "Apache LICENSE V2.0"
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 */


/*
 * (non-Javadoc)
 * 
 * @see com.ibm.xtools.transform.core.AbstractRule
 */
public class StateMachineTransformationRule extends ModelRule {

	
	/**
	 * Default constructor to create a rule.
	 */
	public StateMachineTransformationRule() {
		super();
	}
	/**
	 * constructor
	 * @param id
	 * @param name
	 */
	public StateMachineTransformationRule(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.xtools.transform.core.AbstractRule#createTarget(com.ibm.xtools.transform.core.ITransformContext)
	 */
	public Object createTarget(ITransformContext ruleContext) {
		
		StateMachine source = (StateMachine) ruleContext.getSource();
		Object targetContainer = ruleContext.getTargetContainer();      
		
		if (!(targetContainer instanceof IResource)) {
			System.err.println("Target must be Resource (folder/project)");
		}
	  
		IResource res = (IResource) ruleContext.getTargetContainer(); 
		IPath targetPath = res.getLocation();
		
		StateMachineStateGraph stateGraphc = new StateMachineStateGraph();
		stateGraphc.setStateMachineName(source.getName()); //TODO: check if name correct

		Map<StateMachineState,StateMachineState> statesMap = stateGraphc.getStatesMap();

//		DOMFactory domFactory = new DOMFactory();
//
//		IDOMType clas = domFactory.createClass();
//		clas.setName(source.getName());
//
//		IDOMType class2 = domFactory.createClass();
//		class2.setName("State");
//
//		IDOMField f = domFactory.createField();
//		IDOMMethod m = domFactory.createMethod();
//
//		clas.addChild(class2);

		for (Region re : source.getRegions()) {
			for (Transition t : re.getTransitions()) {
				Vertex tSource = t.getSource();
				Vertex tTarget = t.getTarget();

				StateMachineState sSource = new StateMachineState(tSource);
				StateMachineState sTarget = new StateMachineState(tTarget);

				// still untreated ComplexState and ChoicePoint

				// if state exist, retrieve and update it, else put it in map
				if (!statesMap.containsKey(sSource)) {
					statesMap.put(sSource, sSource);
				} else {
					sSource = statesMap.get(sSource);
				}

				if (!statesMap.containsKey(sTarget)) {
					statesMap.put(sTarget, sTarget);
				} else {
					sTarget = statesMap.get(sTarget);
				}

				StateMachineStateTransition st = new StateMachineStateTransition(sSource, sTarget, t);

				sSource.getOutTransitions().add(st);
				sTarget.getInTransitions().add(st);
			}
		}

		System.out.println(stateGraphc.toString());
		System.out.println(stateGraphc.getStatesWithUncertainties());

		
		//TODO: generate transformation output file
    	
		 String filename = targetPath.toOSString() + File.separatorChar + source.getName() + "_SM.xml";
		 File myFile = new File(filename);
		 FileWriter fw;
		 try {
			 fw = new FileWriter(myFile,true);
			 fw.write(stateGraphc.toString());
			 fw.flush();
			 fw.close();
		 } catch (IOException e) {
			 // TODO Auto-generated catch block
			 e.printStackTrace();
		 }

		return stateGraphc.toString();
	}
	
	
	public boolean canAccept(ITransformContext context) {
		return (context.getSource() instanceof StateMachine);
	}
	

}
