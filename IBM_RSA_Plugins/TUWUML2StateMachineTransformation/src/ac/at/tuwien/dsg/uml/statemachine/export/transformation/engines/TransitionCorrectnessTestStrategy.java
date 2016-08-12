package ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines;


import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.AssertStatement;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.InfixExpression.Operator;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.NumberLiteral;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jdt.core.jdom.DOMFactory;
import org.eclipse.jdt.core.jdom.IDOMType;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.text.edits.UndoEdit;

import ac.at.tuwien.dsg.uml.statemachine.export.transformation.internal.StateMachineStateGraph;



/**
 * Class used to generate a Test Plan which check correctness of state transitions by using a State Machine State Graph
 * obtained from parsing a State Machine diagram
 * 
 * Uses Eclipse recommended AST/DOM API which replaced the traditional dom api
 * 
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
 * __license__ = "Apache LICENSE V2.0"
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 */

public class TransitionCorrectnessTestStrategy {
	
	
	/**
	 * Generates a class to be used in executing the test plan.
	 * The class is abstract because at this point it is unclear how to assert that a certain state has been reached.
	 * Thus, the assertStateReached will be abstract methods.
	 * @param stateGraph
	 */
//	public static void generateTestPlan(StateMachineStateGraph stateGraph){
	public static void main(String[] args){
		
		StateMachineStateGraph stateGraph = new StateMachineStateGraph();
		stateGraph.setStateMachineName("StateMachineState");
		
		DOMFactory domFactory = new DOMFactory();

		//create output content
		IDOMType planClass = domFactory.createClass();
		planClass.setName(stateGraph.getStateMachineName());
		
		//create the plan as an abstract class
		Document doc = new Document("public abstract class " + stateGraph.getStateMachineName() +" {}\n");		 
		ASTParser parser = ASTParser.newParser(AST.JLS8);
		parser.setSource(doc.get().toCharArray());
		CompilationUnit cu = (CompilationUnit) parser.createAST(null);
		cu.recordModifications();
		AST ast = cu.getAST();
		ASTRewrite rewriter = ASTRewrite.create(ast);
		
		//from here we use the cumbersome and extremely detailed Eclipse recommended DOM/AST library
		
		MethodDeclaration testPlanMethodDeclaration = ast.newMethodDeclaration();
		testPlanMethodDeclaration.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
		testPlanMethodDeclaration.setName(ast.newSimpleName("myMethodName"));
		testPlanMethodDeclaration.setReturnType2(ast.newPrimitiveType(PrimitiveType.VOID));
		
		Block testPlanMethodBody = ast.newBlock();
		
		VariableDeclarationFragment v = ast.newVariableDeclarationFragment();
		SimpleName vName =  ast.newSimpleName("sssssss");
		v.setName(vName);
		VariableDeclarationStatement vStmp = ast.newVariableDeclarationStatement(v);
		vStmp.setType(ast.newSimpleType(ast.newName("at.ac.TUW")));
		
		testPlanMethodBody.statements().add(vStmp);
				
		Assignment asgm = ast.newAssignment();
		asgm.setLeftHandSide(ast.newSimpleName(vName.getFullyQualifiedName()));
			
		AssertStatement assertStmt = ast.newAssertStatement();
//		assertStmt.setExpression();
				
////		asgm.setRightHandSide(invocation);
//		PrefixExpression expr = ast.newPrefixExpression();
//		expr.setOperator(Operator.);
//		
		
		
		testPlanMethodBody.statements().add(ast.newExpressionStatement(asgm));
		testPlanMethodBody.statements().add(assertStmt);
		
		IfStatement ifStmt = ast.newIfStatement();		
//		ifStmt.setExpression();
		InfixExpression infix = ast.newInfixExpression();
		infix.setOperator(Operator.NOT_EQUALS);
		infix.setLeftOperand(ast.newSimpleName("a"));
		
		NumberLiteral nrLit = ast.newNumberLiteral();
		nrLit.setToken("3");
		
		infix.setRightOperand(nrLit);
				
		ifStmt.setExpression(infix);
		
		ifStmt.setElseStatement(ast.newBlock());
		
		Block thenBlock = ast.newBlock();
		Assignment tASG = ast.newAssignment();
		tASG.setLeftHandSide(ast.newSimpleName("s"));
		tASG.setRightHandSide(ast.newSimpleName("b"));
		
		thenBlock.statements().add(ast.newExpressionStatement(tASG));
		ifStmt.setThenStatement(thenBlock);
		
		testPlanMethodBody.statements().add(ifStmt);
		
		testPlanMethodDeclaration.setBody(testPlanMethodBody);

		ListRewrite lrw = rewriter.getListRewrite(cu, CompilationUnit.TYPES_PROPERTY);
		lrw.insertLast(testPlanMethodDeclaration, null);

		
		TextEdit edits = rewriter.rewriteAST(doc, null);
		try {
			UndoEdit undo = edits.apply(doc);
		} catch (MalformedTreeException | BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
		
		System.out.println(doc.get());
		
//		StateMachineState state = stateGraph.getInitialState();
//		Map<>
		
		/**
		 * Transitions are triggered by class operations.
		 * So, I create one field for each class we use as trigger for state transition.
		 */
		VariableDeclarationFragment variable = ast.newVariableDeclarationFragment();
		
		
		
	}
}
