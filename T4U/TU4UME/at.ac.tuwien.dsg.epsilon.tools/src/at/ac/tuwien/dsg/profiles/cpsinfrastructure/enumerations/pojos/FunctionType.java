package at.ac.tuwien.dsg.profiles.cpsinfrastructure.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the FunctionType enumeration
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

public class FunctionType {


		
	/*
	Static Variable for the literal Entropy.
	*/ 
	public String _Entropy = new String("Entropy");
	

		
	/*
	Static Variable for the literal Distribution.
	*/ 
	public String _Distribution = new String("Distribution");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("FunctionType");

	public FunctionType() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the FunctionType POJO class
		
		FunctionType enumeration = new FunctionType();
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
	 * @return the _Entropy
	 */
	public String getEntropy() {
		return _Entropy;
	}
	/**
	 * @return the _Distribution
	 */
	public String getDistribution() {
		return _Distribution;
	}
}