package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the NonFunctionalDimensionalityType enumeration
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

public class NonFunctionalDimensionalityType {


		
	/*
	Static Variable for the literal dependability.
	*/ 
	public String _dependability = new String("dependability");
	

		
	/*
	Static Variable for the literal compliance.
	*/ 
	public String _compliance = new String("compliance");
	

		
	/*
	Static Variable for the literal quality.
	*/ 
	public String _quality = new String("quality");
	

		
	/*
	Static Variable for the literal performance.
	*/ 
	public String _performance = new String("performance");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("NonFunctionalDimensionalityType");

	public NonFunctionalDimensionalityType() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the NonFunctionalDimensionalityType POJO class
		
		NonFunctionalDimensionalityType enumeration = new NonFunctionalDimensionalityType();
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
	 * @return the _dependability
	 */
	public String getDependability() {
		return _dependability;
	}
	/**
	 * @return the _compliance
	 */
	public String getCompliance() {
		return _compliance;
	}
	/**
	 * @return the _quality
	 */
	public String getQuality() {
		return _quality;
	}
	/**
	 * @return the _performance
	 */
	public String getPerformance() {
		return _performance;
	}
}