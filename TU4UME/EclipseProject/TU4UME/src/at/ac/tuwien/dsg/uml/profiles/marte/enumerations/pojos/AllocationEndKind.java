package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the AllocationEndKind enumeration
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

public class AllocationEndKind {


		
	/*
	Static Variable for the literal undef.
	*/ 
	public String _undef = new String("undef");
	

		
	/*
	Static Variable for the literal application.
	*/ 
	public String _application = new String("application");
	

		
	/*
	Static Variable for the literal executionPlatform.
	*/ 
	public String _executionPlatform = new String("executionPlatform");
	

		
	/*
	Static Variable for the literal both.
	*/ 
	public String _both = new String("both");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("AllocationEndKind");

	public AllocationEndKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the AllocationEndKind POJO class
		
		AllocationEndKind enumeration = new AllocationEndKind();
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
	 * @return the _undef
	 */
	public String getUndef() {
		return _undef;
	}
	/**
	 * @return the _application
	 */
	public String getApplication() {
		return _application;
	}
	/**
	 * @return the _executionPlatform
	 */
	public String getExecutionPlatform() {
		return _executionPlatform;
	}
	/**
	 * @return the _both
	 */
	public String getBoth() {
		return _both;
	}
}