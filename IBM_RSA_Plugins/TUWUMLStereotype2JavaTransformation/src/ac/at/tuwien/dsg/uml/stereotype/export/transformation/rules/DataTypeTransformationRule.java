/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2004.  All Rights Reserved.                    |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package ac.at.tuwien.dsg.uml.stereotype.export.transformation.rules;

import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.jdom.DOMFactory;
import org.eclipse.jdt.core.jdom.IDOMField;
import org.eclipse.jdt.core.jdom.IDOMImport;
import org.eclipse.jdt.core.jdom.IDOMMethod;
import org.eclipse.jdt.core.jdom.IDOMType;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;

import ac.at.tuwien.dsg.uml.stereotype.export.transformation.util.JavaClassOutputter;

import com.ibm.xtools.transform.core.ITransformContext;
import com.ibm.xtools.transform.core.ModelRule;


/*
 * (non-Javadoc)
 * 
 * @see com.ibm.xtools.transform.core.AbstractRule
 */
public class DataTypeTransformationRule extends ModelRule {

	
	/**
	 * Default constructor to create a rule.
	 */
	public DataTypeTransformationRule() {
		super();
	}
	/**
	 * constructor
	 * @param id
	 * @param name
	 */
	public DataTypeTransformationRule(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ibm.xtools.transform.core.AbstractRule#createTarget(com.ibm.xtools.transform.core.ITransformContext)
	 */
	public Object createTarget(ITransformContext context) {
		DOMFactory domFactory = new DOMFactory();

		//create output content
		IDOMType target = domFactory.createClass();
			
		/**
		 * Get the transformation UML Class
		 */
		DataType dataType = (DataType) context.getSource();
	    target.setName(dataType.getName());
			
		//get all properties
		for (Property attribute :  dataType.getAllAttributes()) {
			
			String name = attribute.getName();
			Type type = attribute.getType();
			String typeName = type.getName();
		    
			org.eclipse.uml2.uml.Package packageType = type.getPackage();
			/**
			 * Create Java field/class variable for each attribute 
			 */
			Namespace namespace = attribute.getNamespace();
			 
			IDOMField field = domFactory.createField();
			field.setName(name);
			field.setFlags(Flags.AccPrivate);
			/**
			 * In case the model is incomplete, we add the field with Object as type
			 */
			if (typeName == null){
				field.setType("Object");
				//add in the generated code a comment explaining why field type is Object
				field.setComment("/*Type for attribute \"" + name + "\" on stereotype \"" + dataType + "\" is null */");
				System.err.println("Type for attribute \"" + name + "\" on stereotype \"" + dataType + "\" is null");
			}else{
				field.setType(typeName);
			}
		
			target.addChild(field);
			
			/**
			 * Add setter/getter for the added field
			 */
			IDOMMethod setter = domFactory.createMethod();
			/**
			 * Capitalize the first letter of the variable name so we have nice camel-case 
			 */
			setter.setName("set" + name.substring(0, 1).toUpperCase() + name.substring(1));
			setter.setFlags(Flags.AccPublic);
			setter.setReturnType("void");
			setter.addParameter(typeName, name);
			setter.setBody("{ \n this." + name + "=" + name + ";\n }");
			
			target.addChild(setter);
			
			IDOMMethod getter = domFactory.createMethod();
			getter.setName("get" + name.substring(0, 1).toUpperCase() + name.substring(1));
			getter.setFlags(Flags.AccPublic);
			getter.setReturnType(typeName);
			getter.setBody("{ \n return this." + name + ";\n }");
			
			target.addChild(getter);
			
		}
		
		//create Java file from UML class
		JavaClassOutputter.outputFile(context, target);
			
		return target;
	}

}
