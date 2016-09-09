/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2003, 2004. All Rights Reserved.               |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package ac.at.tuwien.dsg.utest.umlclassdiagram2javadb.transformation.provider;

import com.ibm.xtools.transform.core.AbstractTransform;
import com.ibm.xtools.transform.core.AbstractTransformationProvider;
import com.ibm.xtools.transform.core.ITransformationDescriptor;
import com.ibm.xtools.transform.core.ITransformContext;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import ac.at.tuwien.dsg.utest.umlclassdiagram2javadb.transformation.provider.UMLClassDiagram2JavaDB;

/**
 * ClassDiagram2JavaDBTransformationProvider is registered in plugin.xml as a Transformation Provider.
 * 
 */
/** 
 * @see com.ibm.xtools.transform.core.AbstractTransformationProvider
 */
public class ClassDiagram2JavaDBTransformationProvider
	extends AbstractTransformationProvider 
	{
	
	/**
	 * @see com.ibm.xtools.transform.core.AbstractTransformationProvider#createTransformation(com.ibm.xtools.transform.core.ITransformationDescriptor)
	 */
	public AbstractTransform createTransformation(ITransformationDescriptor descriptor) {
		if (descriptor.getId().equals("ac.at.tuwien.dsg.utest.transformation.UMLClassDiagram2JavaDB.id")) {
			UMLClassDiagram2JavaDB transform = new UMLClassDiagram2JavaDB(descriptor);
			return transform;
		}
		//TODO Add specialized transformation initialization code here if necessary.
		return null;
	}

	/**
	 * @see com.ibm.xtools.transform.core.AbstractTransformationProvider#validateContext(com.ibm.xtools.transform.core.ITransformationDescriptor, com.ibm.xtools.transform.core.ITransformContext)
	 */
    public IStatus validateContext(ITransformationDescriptor descriptor, ITransformContext context) {
		if (descriptor.getId().equals("ac.at.tuwien.dsg.utest.transformation.UMLClassDiagram2JavaDB.id"))
			return new Status(IStatus.OK, "ac.at.tuwien.dsg.utest.UMLClassDiagram2JavaDB", CODE_SOURCE, "Context is valid", null);
    	//TODO Add code to validate the context for the specific transformation.
    	return new Status(IStatus.OK, "ac.at.tuwien.dsg.utest.UMLClassDiagram2JavaDB", CODE_SOURCE, "your error message goes here", null); //NON-NLS-1
    }
}

