package at.ac.tuwien.dsg.uml.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the UncertaintyKind enumeration
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

public class UncertaintyKind {


		
	/*
	Static Variable for the literal Environment.
	*/ 
	public String _Environment = new String("Environment");
	

		
	/*
	Static Variable for the literal GeographicalLocation.
	*/ 
	public String _GeographicalLocation = new String("GeographicalLocation");
	

		
	/*
	Static Variable for the literal Content.
	*/ 
	public String _Content = new String("Content");
	

		
	/*
	Static Variable for the literal Time.
	*/ 
	public String _Time = new String("Time");
	

		
	/*
	Static Variable for the literal Occurrence.
	*/ 
	public String _Occurrence = new String("Occurrence");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("UncertaintyKind");

	public UncertaintyKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the UncertaintyKind POJO class
		
		UncertaintyKind enumeration = new UncertaintyKind();
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
	 * @return the _Environment
	 */
	public String getEnvironment() {
		return _Environment;
	}
	/**
	 * @return the _GeographicalLocation
	 */
	public String getGeographicalLocation() {
		return _GeographicalLocation;
	}
	/**
	 * @return the _Content
	 */
	public String getContent() {
		return _Content;
	}
	/**
	 * @return the _Time
	 */
	public String getTime() {
		return _Time;
	}
	/**
	 * @return the _Occurrence
	 */
	public String getOccurrence() {
		return _Occurrence;
	}
}