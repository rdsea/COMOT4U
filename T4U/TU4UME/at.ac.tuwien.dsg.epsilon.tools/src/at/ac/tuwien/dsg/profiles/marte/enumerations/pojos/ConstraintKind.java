package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the ConstraintKind enumeration
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@113b5546 (name: Enumeration) (instanceClassName: null) (abstract: false, interface: false)
uml::Enumeration
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class ConstraintKind {


		
	/*
	Static Variable for the literal required.
	*/ 
	public String _required = new String("required");
	

		
	/*
	Static Variable for the literal offered.
	*/ 
	public String _offered = new String("offered");
	

		
	/*
	Static Variable for the literal contract.
	*/ 
	public String _contract = new String("contract");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("ConstraintKind");

	public ConstraintKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ConstraintKind POJO class
		
		ConstraintKind enumeration = new ConstraintKind();
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
	 * @return the _required
	 */
	public String getRequired() {
		return _required;
	}
	/**
	 * @return the _offered
	 */
	public String getOffered() {
		return _offered;
	}
	/**
	 * @return the _contract
	 */
	public String getContract() {
		return _contract;
	}
}