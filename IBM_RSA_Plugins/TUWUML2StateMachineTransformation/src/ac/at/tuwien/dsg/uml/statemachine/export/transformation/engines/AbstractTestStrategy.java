package ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines;


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
import org.eclipse.uml2.uml.TimeEvent;
import org.eclipse.uml2.uml.Trigger;

import ac.at.tuwien.dsg.uml.statemachine.export.transformation.internal.StateMachineState;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.internal.StateMachineStateGraph;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.util.StringFormatter;

/**
 * Class used to generate a Test Plan 
 *
 *To be extended by concrete test plan generation strategies
 * 
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
 * __license__ = "Apache LICENSE V2.0"
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 */

public abstract class AbstractTestStrategy {
	
	protected static final String ASSERT_STATE_LEADING = "currentStateIs_";
	protected static final String ASSERT_GUARD_LEADING = "conditionIsTrue_";
	protected static final String FORCE_GUARD_LEADING = "setToTrue_";
	protected static final String INVOKE_LEADING = "invoke_";
	protected static final String GENERATE_EVENT_LEADING = "generateEvent_";
	protected static final String PLAN_METHOD_LEADING = "testPlan_";
	
	public static final String TEST_PLAN_CLASS_LEADING="TestPlanForStateMachine";
	
	//cache of generated methods to avoid writing in the generated file the same method twice
	protected Map<String,MethodDeclaration> generatedAbstractMethods;
	
	//multiple plan methods an be generated if branching occurs, if-else in state diagram. Then we need to be able to test each flow.
	protected Map<String,MethodDeclaration> generatedPlans;
	
	{
		generatedAbstractMethods = new ConcurrentHashMap<>();
		generatedPlans = new ConcurrentHashMap<>();
	}
	
	private String description;
	
	
	
	public AbstractTestStrategy(String description) {
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
   public abstract Document generateTestPlan(StateMachineStateGraph stateGraph);
	
	
   
   /**
    * Below there are a set of helper methods
    */
   
	/**
	 * Method which for any type of trigger Event, from CallEvent, to ChangeEvent, TimeEvent, etc, creates an abstract method
	 * @param trigger
	 * @param ast
	 * @return
	 */
	protected MethodDeclaration createAbstractTriggerInvocation(Trigger trigger, AST ast){
		
		//get trigger event
		Event event = trigger.getEvent();
		//if UML operation triggers event (so CLass method)
		
		String methodName = GENERATE_EVENT_LEADING;
		Javadoc javadoc = ast.newJavadoc();
		TagElement tag  = ast.newTagElement();
		TextElement textElement = ast.newTextElement();
		
		if (event instanceof CallEvent){
			
			CallEvent callEvent = (CallEvent) event;
			Operation operation = callEvent.getOperation();
			Class operationClass = (Class) operation.eContainer();
			
			methodName = operationClass.getName().replaceAll("\\W","") + "_" + operation.getName().replaceAll("\\W","");
			textElement.setText("Method must return true if method invocation is successfull."
					+ " Method designed to allow particular implementation  call of \"" + operation.getName()+"\"" + " on class \"" + operationClass.getName() +"\" so we can assert if transition after event is correct");
			
		}else if (event instanceof ChangeEvent){
			
			ChangeEvent changeEvent = (ChangeEvent) event;
			OpaqueExpression changeExpression = (OpaqueExpression) changeEvent.getChangeExpression();
			if (changeExpression.getBodies().isEmpty()){
				System.err.println("Event " + event.getName()+ " has no body/expression");
			}else{
				String body = changeExpression.getBodies().iterator().next();
				body = StringFormatter.convertNonAlphanumericalSymbolsToUnderscore(StringFormatter.convertMathSymbolsToText(body));
				
				methodName = changeEvent.getName().replaceAll("\\W","") + "_" + body;
				textElement.setText("Method must return true if event invocation is successfull"
						+ " Method designed to allow particular implementation  for forcing condition \"" + body + "\" encountered on event \"" + changeEvent.getName() + "\" to true so we can assert if transition after event is correct");
			}
		}else if (event instanceof TimeEvent){
			
			TimeEvent timeEvent = (TimeEvent) event;
			
			if (timeEvent.getWhen() == null || timeEvent.getWhen().getExpr() == null){
				System.err.println("Event " + event.getName()+ " has no when/expression");
			}else{
				String expression = ((LiteralString) timeEvent.getWhen().getExpr()).getValue(); // maybe can do something more with TimeExpression
				expression = StringFormatter.convertNonAlphanumericalSymbolsToUnderscore(StringFormatter.convertMathSymbolsToText(expression));
				
				methodName = timeEvent.getName().replaceAll("\\W","") + "_" + expression;
				textElement.setText("Method must return true if event invocation is successfull"
						+ " Method designed to allow particular implementation  for forcing the time event " + timeEvent.getName() + " with body \"" + expression + "\" to happen so we can assert if transition after event is correct");
			}
			
		}else{
			
			System.err.println("Event type of " + event.getClass() + " not supported yet ");
			methodName = "invoke"+ event.getName().replaceAll("\\W", "_");
			textElement.setText("Event type of " + event.getClass() + " not supported yet so generated javadoc not very usefull. Method must ensure the event is called so we can assert if transition after event is correct.");
		}
		
		tag.fragments().add(textElement);
		javadoc.tags().add(tag);

		MethodDeclaration method = createAbstractAssertMethod(javadoc, methodName, ast);
		return method;
	}
	
	protected MethodDeclaration createAbstractMethodForState(StateMachineState state, AST ast){
		
		String stateName = state.equals(StateMachineState.INITIAL_STATE)? "InitialState" : state.getName().replaceAll("\\W","");
		
		Javadoc javadoc = ast.newJavadoc();
		TagElement tag  = ast.newTagElement();
		TextElement textElement = ast.newTextElement();
		textElement.setText("Method must return true if the current state is " + stateName);
		tag.fragments().add(textElement);
		javadoc.tags().add(tag);
		
		MethodDeclaration method = createAbstractAssertMethod(javadoc, ASSERT_STATE_LEADING + stateName, ast);
		return method;
	}
	
	protected MethodDeclaration createAbstractMethodForGuard(String condition, AST ast){
		
		String conditionName = StringFormatter.convertNonAlphanumericalSymbolsToUnderscore(StringFormatter.convertMathSymbolsToText(condition));
		
		Javadoc javadoc = ast.newJavadoc();
		TagElement tag  = ast.newTagElement();
		TextElement textElement = ast.newTextElement();
		textElement.setText("Method must evaluate and return true if the following condition is true:  state is " + condition);
		tag.fragments().add(textElement);
		javadoc.tags().add(tag);
	
		MethodDeclaration method = createAbstractAssertMethod(javadoc, ASSERT_GUARD_LEADING + (conditionName.substring(0,1).toUpperCase() + conditionName.substring(1)), ast);
		return method;
	}
	
	protected  MethodDeclaration createAbstractForceConditionMethod(String condition, AST ast){
		
		String conditionName =  StringFormatter.convertNonAlphanumericalSymbolsToUnderscore(StringFormatter.convertMathSymbolsToText(condition));
		
		Javadoc javadoc = ast.newJavadoc();
		TagElement tag  = ast.newTagElement();
		TextElement textElement = ast.newTextElement();
		textElement.setText("Method must call tested system and ensure the following condition is true so the test can progress on the current test branch: " + condition);
		tag.fragments().add(textElement);
		javadoc.tags().add(tag);
	
		MethodDeclaration method = createAbstractAssertMethod(javadoc, FORCE_GUARD_LEADING + (conditionName.substring(0,1).toUpperCase() + conditionName.substring(1)), ast);
		return method;
	}
	
	
	/**
	 * Creates abstract methods which return true	
	 * @param javadoc
	 * @param methodName
	 * @param ast
	 * @return an AST method declaration
	 */
	protected  MethodDeclaration createAbstractAssertMethod(Javadoc javadoc, String methodName, AST ast){
		
		MethodDeclaration method = ast.newMethodDeclaration();
		
		method.setJavadoc(javadoc);
		
		method.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
		method.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.ABSTRACT_KEYWORD));
		method.setName(ast.newSimpleName(methodName)); //escape all spaces in state name
		
		/**
		 * add to method generic arguments  Object... arguments
		 */
		SingleVariableDeclaration param  = ast.newSingleVariableDeclaration();
		param.setName(ast.newSimpleName("arguments"));
		param.setType(ast.newSimpleType(ast.newName("Object")));
		param.setStructuralProperty(SingleVariableDeclaration.VARARGS_PROPERTY, true);
		
		method.setReturnType2(ast.newPrimitiveType(PrimitiveType.BOOLEAN));
		
		return method;
	}
	
	
	protected MethodDeclaration cloneMethodDeclaration(MethodDeclaration declaration){
		MethodDeclaration clone = (MethodDeclaration)ASTNode.copySubtree(declaration.getAST(), declaration);
		clone.setName(declaration.getAST().newSimpleName(declaration.getName().getIdentifier()+ "_clone"));
		return clone;
    }
	
	/**
	 * Method used to display message boxes with warnings or instructions to users
	 * @param message
	 */
	protected void notifyUser(String message){
	   Display.getDefault().syncExec(new Runnable() {
			    public void run() {
		    	MessageDialog.openWarning(Display.getDefault().getActiveShell(), "Warning", message);
		    }
		});
	}
	
}
