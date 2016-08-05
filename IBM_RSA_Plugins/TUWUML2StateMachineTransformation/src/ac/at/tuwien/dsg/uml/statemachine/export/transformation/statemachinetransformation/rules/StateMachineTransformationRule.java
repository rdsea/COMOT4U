/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2004.  All Rights Reserved.                    |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package ac.at.tuwien.dsg.uml.statemachine.export.transformation.statemachinetransformation.rules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.jdt.core.jdom.DOMFactory;
import org.eclipse.jdt.core.jdom.IDOMField;
import org.eclipse.jdt.core.jdom.IDOMMethod;
import org.eclipse.jdt.core.jdom.IDOMType;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Vertex;
import org.eclipse.uml2.uml.internal.impl.CallEventImpl;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;
import org.eclipse.uml2.uml.internal.impl.OpaqueExpressionImpl;
import org.eclipse.uml2.uml.internal.impl.StateMachineImpl;

import ac.at.tuwien.dsg.uml.statemachine.export.activator.transformation.internal.StateMachineState;
import ac.at.tuwien.dsg.uml.statemachine.export.activator.transformation.internal.StateMachineStateTransition;

import com.ibm.xtools.transform.core.ITransformContext;
import com.ibm.xtools.transform.core.ModelRule;


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

		HashMap<StateMachineState, StateMachineState> statesMap = new LinkedHashMap<>();

		StateMachineImpl source = (StateMachineImpl) ruleContext.getSource();
		ruleContext.getTarget();

		DOMFactory domFactory = new DOMFactory();

		IDOMType clas = domFactory.createClass();
		clas.setName(source.getName());

		IDOMType class2 = domFactory.createClass();
		class2.setName("State");

		IDOMField f = domFactory.createField();
		IDOMMethod m = domFactory.createMethod();

		clas.addChild(class2);

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

		// at this point we should go through our map and generate a transition
		// graph

		StateMachineState initialS = statesMap.keySet().iterator().next();

		List<StateMachineState> statesQueue = new ArrayList<>();
		statesQueue.add(initialS);

		// BFS to process the state graph
		//TODO: output state machine in Java/XML
		while (!statesQueue.isEmpty()) {
			StateMachineState state = statesQueue.remove(0);
			System.out.println("State " + state.getName() + "->");
			for (StateMachineStateTransition transition : state.getOutTransitions()) {
				StateMachineState targetState = transition.getTargetState();
				statesQueue.add(targetState);
				System.out.println("	goes to " + targetState.getName());

				List<Trigger> triggers  =  transition.getTransition().getTriggers();
				if (!triggers.isEmpty()){
					System.out.println("	with triggers:");
				}

				for (Trigger trigger :triggers) {
					Event event = trigger.getEvent();
					//if UML operation triggers event
					if (event instanceof CallEventImpl){
						CallEventImpl callEvent = (CallEventImpl) event;
						Operation operation = callEvent.getOperation();
						ClassImpl operationCLass = (ClassImpl) operation.eContainer();
						System.out.println("		= Trigger Operation: " + operationCLass.getName() +"."+ operation.getName());
					}
					
				}

				Constraint guard = transition.getTransition().getGuard();
				if (guard != null) {
					System.out.println("	under Guard conditions ");
					for (Element element : guard.allOwnedElements()) {
						OpaqueExpressionImpl expression = (OpaqueExpressionImpl) element;
						for (String body : expression.getBodies()) {
							System.out.println("		Condition: " + body);
						}
					}
				}

			}
		}

		// System.out.println(clas.toString());
		//
		// String filename ="C:\\tmp\\TSTSTSTS.java";
		// File myFile = new File(filename);
		// FileWriter fw;
		// try {
		// fw = new FileWriter(myFile,true);
		// fw.write(clas.getContents());
		// fw.flush();
		// fw.close();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		return clas;
	}

}
