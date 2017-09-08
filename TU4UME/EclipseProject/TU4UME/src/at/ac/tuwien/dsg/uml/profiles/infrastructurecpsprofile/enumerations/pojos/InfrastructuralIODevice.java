package at.ac.tuwien.dsg.uml.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the InfrastructuralIODevice enumeration
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

public class InfrastructuralIODevice {


		
	/*
	Static Variable for the literal GATEWAY.
	*/ 
	public String _GATEWAY = new String("GATEWAY");
	

		
	/*
	Static Variable for the literal ROUTER.
	*/ 
	public String _ROUTER = new String("ROUTER");
	

		
	/*
	Static Variable for the literal SWITCH.
	*/ 
	public String _SWITCH = new String("SWITCH");
	

		
	/*
	Static Variable for the literal HUB.
	*/ 
	public String _HUB = new String("HUB");
	

		
	/*
	Static Variable for the literal PROTOCOLCONVERTER.
	*/ 
	public String _PROTOCOLCONVERTER = new String("PROTOCOLCONVERTER");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("InfrastructuralIODevice");

	public InfrastructuralIODevice() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the InfrastructuralIODevice POJO class
		
		InfrastructuralIODevice enumeration = new InfrastructuralIODevice();
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
	 * @return the _GATEWAY
	 */
	public String getGATEWAY() {
		return _GATEWAY;
	}
	/**
	 * @return the _ROUTER
	 */
	public String getROUTER() {
		return _ROUTER;
	}
	/**
	 * @return the _SWITCH
	 */
	public String getSWITCH() {
		return _SWITCH;
	}
	/**
	 * @return the _HUB
	 */
	public String getHUB() {
		return _HUB;
	}
	/**
	 * @return the _PROTOCOLCONVERTER
	 */
	public String getPROTOCOLCONVERTER() {
		return _PROTOCOLCONVERTER;
	}
}