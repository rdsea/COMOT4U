package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the CauseType enumeration
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

public class CauseType {


		
	/*
	Static Variable for the literal technological.
	*/ 
	public String _technological = new String("technological");
	

		
	/*
	Static Variable for the literal natural_phenomenon.
	*/ 
	public String _natural_phenomenon = new String("natural_phenomenon");
	

		
	/*
	Static Variable for the literal human_action.
	*/ 
	public String _human_action = new String("human_action");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("CauseType");

	public CauseType() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the CauseType POJO class
		
		CauseType enumeration = new CauseType();
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
	 * @return the _technological
	 */
	public String getTechnological() {
		return _technological;
	}
	/**
	 * @return the _natural_phenomenon
	 */
	public String getNatural_phenomenon() {
		return _natural_phenomenon;
	}
	/**
	 * @return the _human_action
	 */
	public String getHuman_action() {
		return _human_action;
	}
}