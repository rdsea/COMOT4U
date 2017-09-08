package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the ConnectorKind enumeration
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

public class ConnectorKind {


		
	/*
	Static Variable for the literal assembly.
	*/ 
	public String _assembly = new String("assembly");
	

		
	/*
	Static Variable for the literal delegation.
	*/ 
	public String _delegation = new String("delegation");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("ConnectorKind");

	public ConnectorKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ConnectorKind POJO class
		
		ConnectorKind enumeration = new ConnectorKind();
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
	 * @return the _assembly
	 */
	public String getAssembly() {
		return _assembly;
	}
	/**
	 * @return the _delegation
	 */
	public String getDelegation() {
		return _delegation;
	}
}