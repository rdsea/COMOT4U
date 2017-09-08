package at.ac.tuwien.dsg.uml.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the CallConcurrencyKind enumeration
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

public class CallConcurrencyKind {


		
	/*
	Static Variable for the literal sequential.
	*/ 
	public String _sequential = new String("sequential");
	

		
	/*
	Static Variable for the literal guarded.
	*/ 
	public String _guarded = new String("guarded");
	

		
	/*
	Static Variable for the literal concurrent.
	*/ 
	public String _concurrent = new String("concurrent");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("CallConcurrencyKind");

	public CallConcurrencyKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the CallConcurrencyKind POJO class
		
		CallConcurrencyKind enumeration = new CallConcurrencyKind();
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
	 * @return the _sequential
	 */
	public String getSequential() {
		return _sequential;
	}
	/**
	 * @return the _guarded
	 */
	public String getGuarded() {
		return _guarded;
	}
	/**
	 * @return the _concurrent
	 */
	public String getConcurrent() {
		return _concurrent;
	}
}