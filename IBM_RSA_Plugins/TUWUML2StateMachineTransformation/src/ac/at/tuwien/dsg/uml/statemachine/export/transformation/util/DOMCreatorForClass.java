//package ac.at.tuwien.dsg.uml.statemachine.export.transformation.util;
//
//import org.eclipse.jdt.core.Flags;
//import org.eclipse.jdt.core.jdom.IDOMField;
//import org.eclipse.jdt.core.jdom.IDOMMethod;
//import org.eclipse.uml2.uml.Class;
//import org.eclipse.uml2.uml.Namespace;
//import org.eclipse.uml2.uml.Property;
//import org.eclipse.uml2.uml.Stereotype;
//import org.eclipse.uml2.uml.Type;
//
//public class DOMCreatorForClass {
//	
//	public void parseClassProperties(){
//		Class umlCls = (Class) context.getSource();
//		target.setName(umlCls.getName());
//
//		/**
//		 * We go through all applied stereotypes and for each we go through each attribute, and create a class field.
//		 */
//		
//		// CHECK WHY TRANSFORMATION DOES NOT CONSIDER Stereotypes
//			
//		
//		for(Stereotype stereotype : umlCls.getAppliedStereotypes()){
//			
//			//get all properties
//			for (Property attribute :  stereotype.getAllAttributes()) {
//				
//				String name = attribute.getName();
//				Type type = attribute.getType();
//				String typeName = type.getName();
//			    
//				org.eclipse.uml2.uml.Package packageType = type.getPackage();
//				/**
//				 * Create Java field/class variable for each attribute 
//				 */
//				Namespace namespace = attribute.getNamespace();
//				 
//				//create import statement for each added field 
////				IDOMImport importStatement = domFactory.createImport();
////				importStatement.setName(packageType+"."+typeName);
////				
////				target.addChild(importStatement);
//				
//				IDOMField field = domFactory.createField();
//				field.setName(name);
//				field.setFlags(Flags.AccPrivate);
//				/**
//				 * In case the model is incomplete, we add the field with Object as type
//				 */
//				if (typeName == null){
//					field.setType("Object");
//					//add in the generated code a comment explaining why field type is Object
//					field.setComment("/*Type for attribute \"" + name + "\" on stereotype \"" + stereotype + "\" is null */");
//					System.err.println("Type for attribute \"" + name + "\" on stereotype \"" + stereotype + "\" is null");
//				}else{
//					field.setType(typeName);
//				}
//			
//				target.addChild(field);
//				
//				/**
//				 * Add setter/getter for the added field
//				 */
//				IDOMMethod setter = domFactory.createMethod();
//				/**
//				 * Capitalize the first letter of the variable name so we have nice camel-case 
//				 */
//				setter.setName("set" + name.substring(0, 1).toUpperCase() + name.substring(1));
//				setter.setFlags(Flags.AccPublic);
//				setter.setReturnType("void");
//				setter.addParameter(typeName, name);
//				setter.setBody("{ \n this." + name + "=" + name + ";\n }");
//				
//				target.addChild(setter);
//				
//				IDOMMethod getter = domFactory.createMethod();
//				getter.setName("get" + name.substring(0, 1).toUpperCase() + name.substring(1));
//				getter.setFlags(Flags.AccPublic);
//				getter.setReturnType(typeName);
//				getter.setBody("{ \n return this." + name + ";\n }");
//				
//				target.addChild(getter);
//				
//			}
//			
//		}
//	}
//}
