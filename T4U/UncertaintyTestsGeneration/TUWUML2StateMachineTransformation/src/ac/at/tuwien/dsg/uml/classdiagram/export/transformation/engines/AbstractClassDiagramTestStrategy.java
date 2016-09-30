package ac.at.tuwien.dsg.uml.classdiagram.export.transformation.engines;


import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.TagElement;
import org.eclipse.jdt.core.dom.TextElement;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.Document;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.ChangeEvent;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.SignalEvent;
import org.eclipse.uml2.uml.TimeEvent;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;

import ac.at.tuwien.dsg.uml.statemachine.export.transformation.internal.StateMachineState;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.util.StringFormatter;

/**
 * Class used to generate test configurations for the run*time testing platform https://github.com/tuwiendsg/RuntimeVerification
 *
 *To be extended by concrete test plan generation strategies
 * 
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
* __license__ = EULA currently in development. Current terms of usage below.
* __license_body__ We grant the right to use this software and create derivative work based on it for all non-commercial non-profit education purposes. 
* __license_body__ 
* __license_body__ For any commercial-related or profit-related usage of this software please contact 
* __license_body__ Hong-Linh Truong truong@dsg.tuwien.ac.at
* __license_body__ 
* __license_body__ Warranty:
* __license_body__ The software is provided "AS IS", without warranty of any kind, express or implied,
* __license_body__ including but not limited to the warranties of merchantability, fitness for a
* __license_body__ particular purpose and noninfringement. in no event shall the authors or copyright
* __license_body__ holders be liable for any claim, damages or other liability, whether in an action of
* __license_body__ contract, tort or otherwise, arising from, out of or in connection with the software or
* __license_body__ the use or other dealings in the software.
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 */

public abstract class AbstractClassDiagramTestStrategy {
	
//	protected static final String ASSERT_STATE_LEADING = "currentStateIs_";
//	protected static final String ASSERT_GUARD_LEADING = "conditionIsTrue_";
//	protected static final String FORCE_GUARD_LEADING = "setToTrue_";
//	protected static final String INVOKE_LEADING = "invoke_";
//	protected static final String GENERATE_EVENT_LEADING = "generateEvent_";
//	protected static final String PLAN_METHOD_LEADING = "testPlan_";
//	
//	public static final String TEST_PLAN_CLASS_LEADING="TestPlanForStateMachine";
	
//	//cache of generated methods to avoid writing in the generated file the same method twice
//	protected Map<String,MethodDeclaration> generatedAbstractMethods;
//	
//	//multiple plan methods an be generated if branching occurs, if-else in state diagram. Then we need to be able to test each flow.
//	protected Map<String,MethodDeclaration> generatedPlans;
//	
//	{
//		generatedAbstractMethods = new ConcurrentHashMap<>();
//		generatedPlans = new ConcurrentHashMap<>();
//	}
	
	private String description;
	
	/**
	 * Map <Message, Thread>
	 * Useful to avoid notifying the same error multiple times
	 */
	private static Map<String,Thread> notificationThreads;
	
	static{
		notificationThreads = new ConcurrentHashMap<>();
	}
	
	
	public AbstractClassDiagramTestStrategy(String description) {
		super();
		this.description = description;
	}

	
	public String getDescription() {
		return description;
	}


	/**
	 * Must important method any concrete test strategy must implement as it is used t generate the test plan
	 * @param stateGraph - graph of  state machine states and transitions parsed from UML state diagram 
	 */
   public abstract List<Document> generateTestConfig(Class classImpl);
	
   
   /**
    * Below there are a set of helper methods
    */
   
	/**
	 * Method which for any type of trigger Event, from CallEvent, to ChangeEvent, TimeEvent, etc, creates an abstract method
	 * @param trigger
	 * @param ast
	 * @return
	 */
	protected MethodDeclaration helper(Trigger trigger, AST ast){
		return null;
	}
	
	 
	/**
	 * Method used to display message boxes with warnings or instructions to users
	 * @param message
	 */
	protected static void notifyUser(String message) {

		//add notification only of previous was closed
		if (!notificationThreads.containsKey(message)
				|| !notificationThreads.get(message).isAlive()) {

			Thread t = new Thread() {

				@Override
				public void run() {
					Display.getDefault().syncExec(new Runnable() {
						public void run() {
							MessageDialog.openWarning(Display.getDefault()
									.getActiveShell(), "Warning", message);
						}
					});
				}

			};

			notificationThreads.put(message, t);

			t.setDaemon(true);
			t.start();
		}
	}



	@Override
	protected void finalize() throws Throwable {
		for (Thread t : notificationThreads.values()){
			if (t.isAlive()){
				t.interrupt();
				t.join();
			}
		}
	}
	
	
	
	
}
