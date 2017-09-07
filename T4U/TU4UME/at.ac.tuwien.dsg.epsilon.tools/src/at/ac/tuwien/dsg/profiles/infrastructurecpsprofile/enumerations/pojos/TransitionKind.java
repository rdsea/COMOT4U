package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the TransitionKind enumeration
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@21658f0b (name: Enumeration) (instanceClassName: null) (abstract: false, interface: false)
uml::Enumeration
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class TransitionKind {


		
	/*
	Static Variable for the literal internal.
	*/ 
	public String _internal = new String("internal");
	

		
	/*
	Static Variable for the literal local.
	*/ 
	public String _local = new String("local");
	

		
	/*
	Static Variable for the literal external.
	*/ 
	public String _external = new String("external");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("TransitionKind");

	public TransitionKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the TransitionKind POJO class
		
		TransitionKind enumeration = new TransitionKind();
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
	 * @return the _internal
	 */
	public String getInternal() {
		return _internal;
	}
	/**
	 * @return the _local
	 */
	public String getLocal() {
		return _local;
	}
	/**
	 * @return the _external
	 */
	public String getExternal() {
		return _external;
	}
}