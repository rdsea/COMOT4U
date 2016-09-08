/**
 * Class adding to RSA the rule for converting UML classes to whatever is desired 
 * 
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
 * __license__ = "Apache LICENSE V2.0"
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 */

package ac.at.tuwien.dsg.uml.classdiagram.export.transformation.provider;
import com.ibm.xtools.transform.core.RootTransform;
import com.ibm.xtools.uml.transform.core.UMLKindTransform;
import com.ibm.xtools.transform.core.ITransformationDescriptor;

import org.eclipse.uml2.uml.UMLPackage;

import ac.at.tuwien.dsg.uml.classdiagram.export.transformation.classdiagramtoruntimeteststransformation.id.rules.ClassDiagramToRunTimeTestsSystemDescriptionTransformationRule;
import ac.at.tuwien.dsg.uml.classdiagram.export.transformation.classdiagramtoruntimeteststransformation.id.rules.ClassDiagramToRunTimeTestsTransformationRule;

/** 
 * @see com.ibm.xtools.transform.core.RootTransform
 */
public class ClassDiagramToRunTimeTestsTransformation extends RootTransform {
	
	public final static String MAIN_TRANSFORM_SUFFIX = ".main"; //NON-NLS-1

	/**
	 * Constructor.
	 * @param descriptor  A transformation descriptor.
	 */
	public ClassDiagramToRunTimeTestsTransformation(ITransformationDescriptor descriptor) {
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
		transform.addByKind(UMLPackage.eINSTANCE.getClass_(), new ClassDiagramToRunTimeTestsTransformationRule("ac.at.tuwien.dsg.uml.classdiagram.export.transformation.classdiagramtransformation.1", "ClassDiagramToRunTimeTestsTransformationRule"));
		transform.addByKind(UMLPackage.eINSTANCE.getPackage(), new ClassDiagramToRunTimeTestsSystemDescriptionTransformationRule("ac.at.tuwien.dsg.uml.classdiagram.export.transformation.classdiagramtransformation.2", "ClassDiagramToRunTimeTestsSystemDescriptionTransformationRule"));
	}

}

