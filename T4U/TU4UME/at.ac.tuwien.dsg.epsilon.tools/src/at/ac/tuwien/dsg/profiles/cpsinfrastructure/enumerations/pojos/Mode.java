package at.ac.tuwien.dsg.profiles.cpsinfrastructure.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the Mode enumeration
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

public class Mode {


		
	/*
	Static Variable for the literal Batch.
	*/ 
	public String _Batch = new String("Batch");
	

		
	/*
	Static Variable for the literal Live.
	*/ 
	public String _Live = new String("Live");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("Mode");

	public Mode() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the Mode POJO class
		
		Mode enumeration = new Mode();
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
	 * @return the _Batch
	 */
	public String getBatch() {
		return _Batch;
	}
	/**
	 * @return the _Live
	 */
	public String getLive() {
		return _Live;
	}
}