package at.tuwien.dsg.tools.t4u.uml2json;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

//import datamodel.website.MyWeb;
//import datamodel.website.WebsitePackage;
//import datamodel.website.impl.WebsitePackageImpl;

//import struct.*;
//import struct.impl.*;

public class EMFModelLoad {
	
//        public StructModel structModelLoad() {
//                // Initialize the model
//                StructPackage.eINSTANCE.eClass();
//
//                // Register the XMI resource factory for the .struct extension
//
//                Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//                Map<String, Object> m = reg.getExtensionToFactoryMap();
//                m.put("struct", new XMIResourceFactoryImpl());
//
//                // Obtain a new resource set
//                ResourceSet resSet = new ResourceSetImpl();
//
//                // Get the resource
//                Resource resource = resSet.getResource(URI
//                                .createURI("struct/testclasses.struct"), true);
//                // Get the first model element and cast it to the right type, in my
//                // example everything is hierarchical included in this first node
//                StructModel structmodel = (StructModel) resource.getContents().get(0);
//                
//                return structmodel;
//        }
        
//        public EObject umlModelLoad() {
//            // Initialize the model
//        	ResourceSet set = new ResourceSetImpl();
//        	set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
//        	set.getResourceFactoryRegistry().getExtensionToFactoryMap()
//        	   .put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
//        	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
//        	   .put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
//
//        	Resource res = set.getResource(URI.createFileURI("../FUTestModels_Papyrus_Model_Tests/models/simpleinputmodel.uml"), true);            // Get the first model element and cast it to the right type, in my
//            // example everything is hierarchical included in this first node
//            EObject model = (EObject) res.getContents().get(0);
//            
//            return model;
//    }
        
        public EObject umlModelLoad(String relativepath) {
            // Initialize the model
        	ResourceSet set = new ResourceSetImpl();
        	set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
        	set.getResourceFactoryRegistry().getExtensionToFactoryMap()
        	   .put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
        	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
        	   .put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);

        	Resource res = set.getResource(URI.createFileURI(relativepath), true);            // Get the first model element and cast it to the right type, in my
            // example everything is hierarchical included in this first node
            EObject model = (EObject) res.getContents().get(0);
            
            return model;
    }
                
//    public Resource getStructModelResource() {
//            // Initialize the model
//            StructPackage.eINSTANCE.eClass();
//
//            // Register the XMI resource factory for the .struct extension
//
//            Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//            Map<String, Object> m = reg.getExtensionToFactoryMap();
//            m.put("struct", new XMIResourceFactoryImpl());
//
//            // Obtain a new resource set
//            ResourceSet resSet = new ResourceSetImpl();
//
//            // Get the resource
//            Resource resource = resSet.getResource(URI
//                            .createURI("struct/testclasses.struct"), true);
//            return resource;
//    }
        
//    public Resource getUMLModelResource() {
//            // Initialize the model
//        	ResourceSet set = new ResourceSetImpl();
//        	set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
//        	set.getResourceFactoryRegistry().getExtensionToFactoryMap()
//        	   .put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
//        	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
//        	   .put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
//
//        	Resource res = set.getResource(URI.createFileURI("../FPX_Papyrus_Model_Sanitized/profiles/InfrastructureCPSProfile.profile.uml"), true);            // Get the first model element and cast it to the right type, in my
//
//            return res;
//    }   
    
    public Resource getUMLModelResource(String path) {
        // Initialize the model
    	ResourceSet set = new ResourceSetImpl();
    	set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
    	set.getResourceFactoryRegistry().getExtensionToFactoryMap()
    	   .put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
    	   .put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);

    	Resource res = set.getResource(URI.createFileURI(path), true);            // Get the first model element and cast it to the right type, in my

        return res;
}        
   
//    public String structModelResourceToString() {
//    	
//    	String serializedModel = null;
//        Resource resource = this.getStructModelResource();
//                
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        try
//        {
//        	resource.save(outputStream, null);
//        }
//        catch (IOException ioe) { ioe.printStackTrace(); }
//
//        serializedModel = outputStream.toString();
//        return serializedModel;
//    }

        
//    public String umlModelResourceToString() {
//        	
//    	String serializedModel = null;
//        Resource resource = this.getUMLModelResource();
//                
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        try
//        {
//        	resource.save(outputStream, null);
//        }
//        catch (IOException ioe) { ioe.printStackTrace(); }
//
//        serializedModel = outputStream.toString();
//        return serializedModel;
//    }
    
    public String umlModelResourceToString(String path) {
    	
    	String serializedModel = null;
        Resource resource = this.getUMLModelResource(path);
                
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try
        {
        	resource.save(outputStream, null);
        }
        catch (IOException ioe) { ioe.printStackTrace(); }

        serializedModel = outputStream.toString();
        return serializedModel;
    }        
        /**
         * Convert a JSON string to pretty print version
         * @param jsonString
         * @return
         */
        public String toPrettyFormat(String jsonString) 
        {
            JsonParser parser = new JsonParser();
            JsonObject json = parser.parse(jsonString).getAsJsonObject();

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String prettyJson = gson.toJson(json);

            return prettyJson;
        }

}