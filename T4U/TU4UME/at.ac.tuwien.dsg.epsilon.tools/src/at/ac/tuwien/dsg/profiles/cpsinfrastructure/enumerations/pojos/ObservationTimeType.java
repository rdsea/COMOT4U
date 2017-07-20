package at.ac.tuwien.dsg.profiles.cpsinfrastructure.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the ObservationTimeType enumeration
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

public class ObservationTimeType {


		
	/*
	Static Variable for the literal deployment_time.
	*/ 
	public String _deployment_time = new String("deployment_time");
	

		
	/*
	Static Variable for the literal runtime.
	*/ 
	public String _runtime = new String("runtime");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("ObservationTimeType");

	public ObservationTimeType() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ObservationTimeType POJO class
		
		ObservationTimeType enumeration = new ObservationTimeType();
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
	 * @return the _deployment_time
	 */
	public String getDeployment_time() {
		return _deployment_time;
	}
	/**
	 * @return the _runtime
	 */
	public String getRuntime() {
		return _runtime;
	}
}