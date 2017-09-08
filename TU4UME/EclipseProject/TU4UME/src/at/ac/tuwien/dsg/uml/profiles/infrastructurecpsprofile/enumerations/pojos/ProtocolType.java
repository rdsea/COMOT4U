package at.ac.tuwien.dsg.uml.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the ProtocolType enumeration
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

public class ProtocolType {


		
	/*
	Static Variable for the literal MQTT.
	*/ 
	public String _MQTT = new String("MQTT");
	

		
	/*
	Static Variable for the literal TCP.
	*/ 
	public String _TCP = new String("TCP");
	

		
	/*
	Static Variable for the literal UDP.
	*/ 
	public String _UDP = new String("UDP");
	

		
	/*
	Static Variable for the literal Other.
	*/ 
	public String _Other = new String("Other");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("ProtocolType");

	public ProtocolType() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ProtocolType POJO class
		
		ProtocolType enumeration = new ProtocolType();
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
	 * @return the _MQTT
	 */
	public String getMQTT() {
		return _MQTT;
	}
	/**
	 * @return the _TCP
	 */
	public String getTCP() {
		return _TCP;
	}
	/**
	 * @return the _UDP
	 */
	public String getUDP() {
		return _UDP;
	}
	/**
	 * @return the _Other
	 */
	public String getOther() {
		return _Other;
	}
}