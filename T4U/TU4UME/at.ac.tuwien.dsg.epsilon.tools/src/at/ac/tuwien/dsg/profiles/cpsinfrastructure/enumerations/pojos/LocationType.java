package at.ac.tuwien.dsg.profiles.cpsinfrastructure.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the LocationType enumeration
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

public class LocationType {


		
	/*
	Static Variable for the literal Hardware.
	*/ 
	public String _Hardware = new String("Hardware");
	

		
	/*
	Static Variable for the literal Platform.
	*/ 
	public String _Platform = new String("Platform");
	

		
	/*
	Static Variable for the literal External.
	*/ 
	public String _External = new String("External");
	

		
	/*
	Static Variable for the literal Human.
	*/ 
	public String _Human = new String("Human");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("LocationType");

	public LocationType() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the LocationType POJO class
		
		LocationType enumeration = new LocationType();
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
	 * @return the _Hardware
	 */
	public String getHardware() {
		return _Hardware;
	}
	/**
	 * @return the _Platform
	 */
	public String getPlatform() {
		return _Platform;
	}
	/**
	 * @return the _External
	 */
	public String getExternal() {
		return _External;
	}
	/**
	 * @return the _Human
	 */
	public String getHuman() {
		return _Human;
	}
}