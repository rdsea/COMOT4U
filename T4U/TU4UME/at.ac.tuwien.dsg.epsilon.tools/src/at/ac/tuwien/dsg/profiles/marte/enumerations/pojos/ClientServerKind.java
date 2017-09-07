package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the ClientServerKind enumeration
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

public class ClientServerKind {


		
	/*
	Static Variable for the literal required.
	*/ 
	public String _required = new String("required");
	

		
	/*
	Static Variable for the literal provided.
	*/ 
	public String _provided = new String("provided");
	

		
	/*
	Static Variable for the literal proreq.
	*/ 
	public String _proreq = new String("proreq");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("ClientServerKind");

	public ClientServerKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ClientServerKind POJO class
		
		ClientServerKind enumeration = new ClientServerKind();
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
	 * @return the _provided
	 */
	public String getProvided() {
		return _provided;
	}
	/**
	 * @return the _proreq
	 */
	public String getProreq() {
		return _proreq;
	}
}