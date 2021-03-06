/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *|																		   |
 *| com.ibm.xtools.transform.core.authoring.ide						       |
 *|																		   |
 *| Copyright IBM Corp. 2003, 2007.  All Rights Reserved.                  |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package ac.at.tuwien.dsg.utest.umlclassdiagram2javadb.transformation.provider;
import com.ibm.xtools.transform.core.RootTransform;
import com.ibm.xtools.uml.transform.core.UMLKindTransform;
import com.ibm.xtools.transform.core.ITransformationDescriptor;
import org.eclipse.uml2.uml.UMLPackage;
import ac.at.tuwien.dsg.utest.transformation.umlclassdiagram2javadb.id.rules.UMLClassDiagram2JavaDBTransformationRule;

/** 
 * @see com.ibm.xtools.transform.core.RootTransform
 */
public class UMLClassDiagram2JavaDB extends RootTransform 
	{
	
	public final static String MAIN_TRANSFORM_SUFFIX = ".main"; //NON-NLS-1

	/**
	 * Constructor.
	 * @param descriptor  A transformation descriptor.
	 */
	public UMLClassDiagram2JavaDB(ITransformationDescriptor descriptor) {
		super(descriptor);
		
		StringBuffer buf = new StringBuffer(descriptor.getId());
		buf.append(MAIN_TRANSFORM_SUFFIX);
		UMLKindTransform umlkindTransform = new UMLKindTransform(buf.toString());

		buf = new StringBuffer(descriptor.getName());
		buf.append(MAIN_TRANSFORM_SUFFIX);
		umlkindTransform.setName(buf.toString());

		// Initialize root transform with main UML transform. 
		// The false argument indicates the main transform will only
		// accept individual source objects (and not the list of selected objects).
		initialize(umlkindTransform, false);
		
		// Define the rules to be executed before and after the main UML transform.
		setupInitialize();
		setupFinalize();
		
		// Add the rules to the main UML transform.
		addUMLRules(umlkindTransform);
	}
	
	/**
	 * Add rules in this method that will be called once before the
	 * main UML transform is executed.
	 */
	private void setupInitialize () {
		//	TODO Auto-generated method
		// addToInit(transformElement);
	}
	/**
	 * Add rules in this method that will be called once after the
	 * main UML transform has been executed.
	 */
	private void setupFinalize () {
		//	TODO Auto-generated method
		// addToFinal(transformElement);
	}

	/**
	 * Add rules to the main UML transform where each rule is
	 * associated with a UML language element kind.
	 * 
	 * @param transform  The main UML transform.
	 * @generated
	 */
	private void addUMLRules(UMLKindTransform transform)
	{
		transform.addByKind(UMLPackage.eINSTANCE.getClass_(), new UMLClassDiagram2JavaDBTransformationRule("ac.at.tuwien.dsg.utest.transformation.UMLClassDiagram2JavaDB.id.rule", "UMLClassDiagram2JavaDBTransformationRule"));
	
	}

}

