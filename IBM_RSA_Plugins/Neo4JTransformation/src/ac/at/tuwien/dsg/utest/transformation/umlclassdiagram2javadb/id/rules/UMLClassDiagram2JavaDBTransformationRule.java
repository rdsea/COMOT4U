/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2004.  All Rights Reserved.                    |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package ac.at.tuwien.dsg.utest.transformation.umlclassdiagram2javadb.id.rules;


import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.text.edits.UndoEdit;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;

import com.ibm.xtools.transform.core.ITransformContext;
import com.ibm.xtools.transform.core.ModelRule;


/*
 * (non-Javadoc)
 * 
 * @see com.ibm.xtools.transform.core.AbstractRule
 */
public class UMLClassDiagram2JavaDBTransformationRule extends ModelRule {

	
	/**
	 * Default constructor to create a rule.
	 */
	public UMLClassDiagram2JavaDBTransformationRule() {
		super();
	}
	/**
	 * constructor
	 * @param id
	 * @param name
	 */
	public UMLClassDiagram2JavaDBTransformationRule(String id, String name) {
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
		
		
		Document document = new Document("@NodeType \n public class " + source.getName() + "{ \n");
		
		
		//below helper classes toi generate our desired .java file
		ASTParser parser = ASTParser.newParser(AST.JLS8);
        parser.setSource(document.get().toCharArray());
	    CompilationUnit cu = (CompilationUnit) parser.createAST(null);
	    cu.recordModifications();  
	    AST ast = cu.getAST();
	    
	    ASTRewrite rewriter = ASTRewrite.create(ast);
		    
	    ListRewrite listRewrite = rewriter.getListRewrite(cu, CompilationUnit.TYPES_PROPERTY);
	       
		
		//TODO: here we take each property introduced by each Stereotype
		
         for(Stereotype stereotype : source.getAppliedStereotypes()){
			
			//get all properties
			for (Property attribute :  stereotype.getAllAttributes()) {
				
				//todo
			}
         }
         
		
		for (Property property : source.getAllAttributes()){
			System.out.println(property.getName());
			
			Association assoc = property.getAssociation();
			
			if (assoc == null){
				System.out.format("this is simple %s \n", property.getName());
				
				VariableDeclarationFragment varDecl = ast.newVariableDeclarationFragment();
				varDecl.setName(ast.newSimpleName(property.getName()));
				
				FieldDeclaration propertyField = ast.newFieldDeclaration(varDecl);
				propertyField.setType(ast.newSimpleType(ast.newName(property.getType().getName())));
				
				
				final SingleMemberAnnotation annot = ast.newSingleMemberAnnotation();
				annot.setTypeName(ast.newName("Property"));
				
				StringLiteral st = ast.newStringLiteral();
				st.setLiteralValue("type=\"variable\"");
				
			    annot.setValue(st);
			    
				
				listRewrite.insertLast(annot, null);
				listRewrite.insertLast(propertyField, null);
				
				
				
			}else{
				System.out.format("this is complex %s \n", property.getName());
				Type type = assoc.getEndTypes().stream().filter(a -> ! a.equals(source)).findFirst().get();
				System.out.format("Association end is   %s \n", type.getName());
				
				AggregationKind kind = property.getAggregation();
				if (kind.equals(AggregationKind.COMPOSITE)){
					System.out.format("Composition \n");
				}else if(kind.equals(AggregationKind.SHARED)){
					System.out.format("Aggregation \n");
				}else if(kind.equals(AggregationKind.NONE)){
					System.out.format("Association \n");
				}
				
			}
			
		}
		
		 TextEdit edits = rewriter.rewriteAST(document, null);
	        try {
	            UndoEdit undo = edits.apply(document);
	        } catch (MalformedTreeException | BadLocationException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
		    }

		    System.out.println(document.get());
		
		
		return null;
	}

}
