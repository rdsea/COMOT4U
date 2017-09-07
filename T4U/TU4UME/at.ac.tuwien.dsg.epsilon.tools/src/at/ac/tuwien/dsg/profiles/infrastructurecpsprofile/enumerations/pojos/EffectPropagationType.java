package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the EffectPropagationType enumeration
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

public class EffectPropagationType {


		
	/*
	Static Variable for the literal application.
	*/ 
	public String _application = new String("application");
	

		
	/*
	Static Variable for the literal physical_environment.
	*/ 
	public String _physical_environment = new String("physical_environment");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("EffectPropagationType");

	public EffectPropagationType() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the EffectPropagationType POJO class
		
		EffectPropagationType enumeration = new EffectPropagationType();
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
	 * @return the _application
	 */
	public String getApplication() {
		return _application;
	}
	/**
	 * @return the _physical_environment
	 */
	public String getPhysical_environment() {
		return _physical_environment;
	}
}