package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the Severity enumeration
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

public class Severity {


		
	/*
	Static Variable for the literal ERROR.
	*/ 
	public String _ERROR = new String("ERROR");
	

		
	/*
	Static Variable for the literal WARNING.
	*/ 
	public String _WARNING = new String("WARNING");
	

		
	/*
	Static Variable for the literal INFO.
	*/ 
	public String _INFO = new String("INFO");
	

		
	/*
	Static Variable for the literal CANCEL.
	*/ 
	public String _CANCEL = new String("CANCEL");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("Severity");

	public Severity() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the Severity POJO class
		
		Severity enumeration = new Severity();
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
	 * @return the _ERROR
	 */
	public String getERROR() {
		return _ERROR;
	}
	/**
	 * @return the _WARNING
	 */
	public String getWARNING() {
		return _WARNING;
	}
	/**
	 * @return the _INFO
	 */
	public String getINFO() {
		return _INFO;
	}
	/**
	 * @return the _CANCEL
	 */
	public String getCANCEL() {
		return _CANCEL;
	}
}