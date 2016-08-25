
package ac.at.tuwien.dsg.uml.statemachine.export.transformation.statemachinetransformation.rules;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.Document;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;

import ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.SharedContext;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.factories.impl.SingletonVolatileContextFactory;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.AbstractTestStrategy;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.TestEngineFactory;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.exceptions.NoSuchEngineTypeException;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.gui.SelectTestGenerationStrategyTab;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.internal.StateMachineState;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.internal.StateMachineStateGraph;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.internal.StateMachineStateTransition;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.util.JavaClassOutputter;

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

	
	private SharedContext sharedContext;
	
	{
		sharedContext = new SingletonVolatileContextFactory().createSharedContext();
	}
	
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
	public Object createTarget(ITransformContext context) {
		
		StateMachine source = (StateMachine) context.getSource();
		Object targetContainer = context.getTargetContainer();      
		
		if (!(targetContainer instanceof IResource)) {
			System.err.println("Target must be Resource (folder/project)");
		}
	  
		IResource res = (IResource) context.getTargetContainer(); 
		IPath targetPath = res.getLocation();
		
		StateMachineStateGraph stateGraph = new StateMachineStateGraph();
		stateGraph.setStateMachineName(source.getName()); //TODO: check if name correct

		Map<StateMachineState,StateMachineState> statesMap = stateGraph.getStatesMap();

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

				if(tSource.getName() == null){
					notifyUser("Transition " + t.getName() + " to " + tTarget.getName() + " starts from State with no name. \n "
							+ "Assuming state is initial state. Can generate problems if more states have no name (usually choice states)");
				}
				
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
  
		stateGraph.getStatesWithUncertainties(); //TODO: go deep in the properties.
		
		//generate test plan
		
		Object selectedStrategy = sharedContext.getProperty(SelectTestGenerationStrategyTab.SELECTED_STRATEGY_PROPERTY);
		
		if (selectedStrategy == null){
			notifyUser("Please select a test generation strategy from the Select Test Generation Strategy Tab");
			return null;
		}
		
		AbstractTestStrategy strategy;
		try {
			strategy = TestEngineFactory.createTestEngine(selectedStrategy.toString());
		} catch (NoSuchEngineTypeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}
		Document plan = strategy.generateTestPlan(stateGraph);
		
		//save generated test plan as java class
		String filename = targetPath.toOSString() + File.separatorChar + ( strategy.getClass().getSimpleName() + "_" + AbstractTestStrategy.TEST_PLAN_CLASS_LEADING + stateGraph.getStateMachineName()) + ".java";
		JavaClassOutputter.outputFile(context, plan, filename, strategy.getClass().getName() , source.getQualifiedName());
		
		return plan;
	}
	
	
	public boolean canAccept(ITransformContext context) {
		return (context.getSource() instanceof StateMachine);
	}
	
	private void notifyUser(String message){
		   Display.getDefault().syncExec(new Runnable() {
				    public void run() {
			    	MessageDialog.openWarning(Display.getDefault().getActiveShell(), "Warning", message);
			    }
			});
		}
	

}
