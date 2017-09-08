package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the VisibilityKind enumeration
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@30d4287c (name: Enumeration) (instanceClassName: null) (abstract: false, interface: false)
uml::Enumeration
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.tu4ume.epsilon.externaltools.SampleTool;

public class VisibilityKind {


		
	/*
	Static Variable for the literal public.
	*/ 
	public String _public = new String("public");
	

		
	/*
	Static Variable for the literal private.
	*/ 
	public String _private = new String("private");
	

		
	/*
	Static Variable for the literal protected.
	*/ 
	public String _protected = new String("protected");
	

		
	/*
	Static Variable for the literal package.
	*/ 
	public String _package = new String("package");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("VisibilityKind");

	public VisibilityKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the VisibilityKind POJO class
		
		VisibilityKind enumeration = new VisibilityKind();
		enumeration.toJson();
		
	}
	
	public String toJson(){
	

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        // Convert numbers array into JSON string.
        String elem = gson.toJson(this);
        
        System.out.println("elem = " + elem);    
        
        return elem;   
	}

	/**
	 * @return the _public
	 */
	public String getPublic() {
		return _public;
	}
	/**
	 * @return the _private
	 */
	public String getPrivate() {
		return _private;
	}
	/**
	 * @return the _protected
	 */
	public String getProtected() {
		return _protected;
	}
	/**
	 * @return the _package
	 */
	public String getPackage() {
		return _package;
	}
}