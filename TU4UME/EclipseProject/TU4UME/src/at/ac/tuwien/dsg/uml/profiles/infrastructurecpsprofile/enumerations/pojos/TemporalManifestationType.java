package at.ac.tuwien.dsg.uml.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the TemporalManifestationType enumeration
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@30d4287c (name: Enumeration) (instanceClassName: null) (abstract: false, interface: false)
uml::Enumeration
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.tu4ume.epsilon.externaltools.SampleTool;

public class TemporalManifestationType {


		
	/*
	Static Variable for the literal sporadic.
	*/ 
	public String _sporadic = new String("sporadic");
	

		
	/*
	Static Variable for the literal recurring.
	*/ 
	public String _recurring = new String("recurring");
	

		
	/*
	Static Variable for the literal persistent.
	*/ 
	public String _persistent = new String("persistent");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("TemporalManifestationType");

	public TemporalManifestationType() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the TemporalManifestationType POJO class
		
		TemporalManifestationType enumeration = new TemporalManifestationType();
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
	 * @return the _sporadic
	 */
	public String getSporadic() {
		return _sporadic;
	}
	/**
	 * @return the _recurring
	 */
	public String getRecurring() {
		return _recurring;
	}
	/**
	 * @return the _persistent
	 */
	public String getPersistent() {
		return _persistent;
	}
}