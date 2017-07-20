package at.ac.tuwien.dsg.profiles.cpsinfrastructure.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the TestStrategy enumeration
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

public class TestStrategy {


		
	/*
	Static Variable for the literal all_path_strategy.
	*/ 
	public String _all_path_strategy = new String("all_path_strategy");
	

		
	/*
	Static Variable for the literal uncertainty_affected_path.
	*/ 
	public String _uncertainty_affected_path = new String("uncertainty_affected_path");
	

		
	/*
	Static Variable for the literal min_cost.
	*/ 
	public String _min_cost = new String("min_cost");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("TestStrategy");

	public TestStrategy() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the TestStrategy POJO class
		
		TestStrategy enumeration = new TestStrategy();
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
	 * @return the _all_path_strategy
	 */
	public String getAll_path_strategy() {
		return _all_path_strategy;
	}
	/**
	 * @return the _uncertainty_affected_path
	 */
	public String getUncertainty_affected_path() {
		return _uncertainty_affected_path;
	}
	/**
	 * @return the _min_cost
	 */
	public String getMin_cost() {
		return _min_cost;
	}
}