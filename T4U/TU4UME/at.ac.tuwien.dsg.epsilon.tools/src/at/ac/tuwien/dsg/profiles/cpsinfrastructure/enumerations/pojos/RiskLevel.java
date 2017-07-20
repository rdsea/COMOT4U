package at.ac.tuwien.dsg.profiles.cpsinfrastructure.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the RiskLevel enumeration
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

public class RiskLevel {


		
	/*
	Static Variable for the literal Low.
	*/ 
	public String _Low = new String("Low");
	

		
	/*
	Static Variable for the literal Medium.
	*/ 
	public String _Medium = new String("Medium");
	

		
	/*
	Static Variable for the literal High.
	*/ 
	public String _High = new String("High");
	

		
	/*
	Static Variable for the literal Extreme.
	*/ 
	public String _Extreme = new String("Extreme");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("RiskLevel");

	public RiskLevel() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the RiskLevel POJO class
		
		RiskLevel enumeration = new RiskLevel();
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
	 * @return the _Low
	 */
	public String getLow() {
		return _Low;
	}
	/**
	 * @return the _Medium
	 */
	public String getMedium() {
		return _Medium;
	}
	/**
	 * @return the _High
	 */
	public String getHigh() {
		return _High;
	}
	/**
	 * @return the _Extreme
	 */
	public String getExtreme() {
		return _Extreme;
	}
}