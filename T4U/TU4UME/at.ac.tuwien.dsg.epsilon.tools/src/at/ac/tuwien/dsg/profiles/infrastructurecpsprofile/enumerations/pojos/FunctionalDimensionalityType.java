package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the FunctionalDimensionalityType enumeration
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

public class FunctionalDimensionalityType {


		
	/*
	Static Variable for the literal actuation.
	*/ 
	public String _actuation = new String("actuation");
	

		
	/*
	Static Variable for the literal composite_function.
	*/ 
	public String _composite_function = new String("composite_function");
	

		
	/*
	Static Variable for the literal data_delivery.
	*/ 
	public String _data_delivery = new String("data_delivery");
	

		
	/*
	Static Variable for the literal elasticity.
	*/ 
	public String _elasticity = new String("elasticity");
	

		
	/*
	Static Variable for the literal execution_environment.
	*/ 
	public String _execution_environment = new String("execution_environment");
	

		
	/*
	Static Variable for the literal governance.
	*/ 
	public String _governance = new String("governance");
	

		
	/*
	Static Variable for the literal storage.
	*/ 
	public String _storage = new String("storage");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("FunctionalDimensionalityType");

	public FunctionalDimensionalityType() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the FunctionalDimensionalityType POJO class
		
		FunctionalDimensionalityType enumeration = new FunctionalDimensionalityType();
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
	 * @return the _actuation
	 */
	public String getActuation() {
		return _actuation;
	}
	/**
	 * @return the _composite_function
	 */
	public String getComposite_function() {
		return _composite_function;
	}
	/**
	 * @return the _data_delivery
	 */
	public String getData_delivery() {
		return _data_delivery;
	}
	/**
	 * @return the _elasticity
	 */
	public String getElasticity() {
		return _elasticity;
	}
	/**
	 * @return the _execution_environment
	 */
	public String getExecution_environment() {
		return _execution_environment;
	}
	/**
	 * @return the _governance
	 */
	public String getGovernance() {
		return _governance;
	}
	/**
	 * @return the _storage
	 */
	public String getStorage() {
		return _storage;
	}
}