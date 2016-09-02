/**
 * Custom UML Class transformation provider
 * 
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
 * __license__ = "Apache LICENSE V2.0"
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 */
package ac.at.tuwien.dsg.uml.classdiagram.export.transformation.provider;

import com.ibm.xtools.transform.core.AbstractTransform;
import com.ibm.xtools.transform.core.AbstractTransformationProvider;
import com.ibm.xtools.transform.core.ITransformationDescriptor;
import com.ibm.xtools.transform.core.ITransformContext;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import ac.at.tuwien.dsg.uml.classdiagram.export.transformation.provider.ClassDiagramToRunTimeTestsTransformation;

/**
 * ClassDiagramTransformationProvider is registered in plugin.xml as a Transformation Provider.
 * 
 */
/** 
 * @see com.ibm.xtools.transform.core.AbstractTransformationProvider
 */
public class ClassDiagramTransformationProvider
	extends AbstractTransformationProvider 
	{
	
	/**
	 * @see com.ibm.xtools.transform.core.AbstractTransformationProvider#createTransformation(com.ibm.xtools.transform.core.ITransformationDescriptor)
	 */
	public AbstractTransform createTransformation(ITransformationDescriptor descriptor) {
		if (descriptor.getId().equals("ac.at.tuwien.dsg.uml.classdiagram.export.transformation.classdiagramtransformation")) {
			ClassDiagramToRunTimeTestsTransformation transform = new ClassDiagramToRunTimeTestsTransformation(descriptor);
			return transform;
		}
		//TODO Add specialized transformation initialization code here if necessary.
		return null;
	}

	/**
	 * @see com.ibm.xtools.transform.core.AbstractTransformationProvider#validateContext(com.ibm.xtools.transform.core.ITransformationDescriptor, com.ibm.xtools.transform.core.ITransformContext)
	 */
    public IStatus validateContext(ITransformationDescriptor descriptor, ITransformContext context) {
		if (descriptor.getId().equals("ac.at.tuwien.dsg.uml.classdiagram.export.transformation.classdiagramtransformation"))
			return new Status(IStatus.OK, "StateMachineTransformation", CODE_SOURCE, "Context is valid", null);
    	//TODO Add code to validate the context for the specific transformation.
    	return new Status(IStatus.OK, "StateMachineTransformation", CODE_SOURCE, "your error message goes here", null); //NON-NLS-1
    }
}

