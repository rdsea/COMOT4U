/**
 * Custom UML Class transformation provider
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

