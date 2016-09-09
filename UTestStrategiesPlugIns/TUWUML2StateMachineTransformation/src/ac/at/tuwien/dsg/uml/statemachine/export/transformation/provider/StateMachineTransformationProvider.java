/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2003, 2004. All Rights Reserved.               |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package ac.at.tuwien.dsg.uml.statemachine.export.transformation.provider;

import com.ibm.xtools.transform.core.AbstractTransform;
import com.ibm.xtools.transform.core.AbstractTransformationProvider;
import com.ibm.xtools.transform.core.ITransformationDescriptor;
import com.ibm.xtools.transform.core.ITransformContext;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.provider.StateMachineTransformation;

/**
 * StateMachineTransformationProvider is registered in plugin.xml as a Transformation Provider.
 * 
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
 * __license__ = "Apache LICENSE V2.0"
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 * 
 * @see com.ibm.xtools.transform.core.AbstractTransformationProvider
 */
public class StateMachineTransformationProvider
	extends AbstractTransformationProvider 
	{
	
	/**
	 * @see com.ibm.xtools.transform.core.AbstractTransformationProvider#createTransformation(com.ibm.xtools.transform.core.ITransformationDescriptor)
	 */
	public AbstractTransform createTransformation(ITransformationDescriptor descriptor) {
		if (descriptor.getId().equals("ac.at.tuwien.dsg.uml.statemachine.export.transformation.statemachinetransformation")) {
			StateMachineTransformation transform = new StateMachineTransformation(descriptor);
			return transform;
		}
		//TODO Add specialized transformation initialization code here if necessary.
		return null;
	}

	/**
	 * @see com.ibm.xtools.transform.core.AbstractTransformationProvider#validateContext(com.ibm.xtools.transform.core.ITransformationDescriptor, com.ibm.xtools.transform.core.ITransformContext)
	 */
    public IStatus validateContext(ITransformationDescriptor descriptor, ITransformContext context) {
		if (descriptor.getId().equals("ac.at.tuwien.dsg.uml.statemachine.export.transformation.statemachinetransformation"))
			return new Status(IStatus.OK, "ac.at.tuwien.dsg.uml.statemachine.export.transformation", CODE_SOURCE, "Context is valid", null);
    	//TODO Add code to validate the context for the specific transformation.
    	return new Status(IStatus.OK, "ac.at.tuwien.dsg.uml.statemachine.export.transformation", CODE_SOURCE, "your error message goes here", null); //NON-NLS-1
    }
}

