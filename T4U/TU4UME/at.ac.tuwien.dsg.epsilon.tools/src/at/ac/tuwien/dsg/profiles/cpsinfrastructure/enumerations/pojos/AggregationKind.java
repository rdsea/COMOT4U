package at.ac.tuwien.dsg.profiles.cpsinfrastructure.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the AggregationKind enumeration
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@3c6dd051 (name: Enumeration) (instanceClassName: null) (abstract: false, interface: false)
uml::Enumeration
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class AggregationKind {


		
	/*
	Static Variable for the literal none.
	*/ 
	public String _none = new String("none");
	

		
	/*
	Static Variable for the literal shared.
	*/ 
	public String _shared = new String("shared");
	

		
	/*
	Static Variable for the literal composite.
	*/ 
	public String _composite = new String("composite");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("AggregationKind");

	public AggregationKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the AggregationKind POJO class
		
		AggregationKind enumeration = new AggregationKind();
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
	 * @return the _none
	 */
	public String getNone() {
		return _none;
	}
	/**
	 * @return the _shared
	 */
	public String getShared() {
		return _shared;
	}
	/**
	 * @return the _composite
	 */
	public String getComposite() {
		return _composite;
	}
}