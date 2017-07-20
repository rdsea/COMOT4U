package at.ac.tuwien.dsg.profiles.cpsinfrastructure.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the TimeField enumeration
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

public class TimeField {


		
	/*
	Static Variable for the literal Past.
	*/ 
	public String _Past = new String("Past");
	

		
	/*
	Static Variable for the literal Present.
	*/ 
	public String _Present = new String("Present");
	

		
	/*
	Static Variable for the literal Future.
	*/ 
	public String _Future = new String("Future");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("TimeField");

	public TimeField() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the TimeField POJO class
		
		TimeField enumeration = new TimeField();
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
	 * @return the _Past
	 */
	public String getPast() {
		return _Past;
	}
	/**
	 * @return the _Present
	 */
	public String getPresent() {
		return _Present;
	}
	/**
	 * @return the _Future
	 */
	public String getFuture() {
		return _Future;
	}
}