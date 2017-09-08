package at.ac.tuwien.dsg.uml.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the SupportedCommunicationProtocols enumeration
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

public class SupportedCommunicationProtocols {


		
	/*
	Static Variable for the literal MQTT.
	*/ 
	public String _MQTT = new String("MQTT");
	

		
	/*
	Static Variable for the literal HTTP.
	*/ 
	public String _HTTP = new String("HTTP");
	

		
	/*
	Static Variable for the literal TCP.
	*/ 
	public String _TCP = new String("TCP");
	

		
	/*
	Static Variable for the literal UDP.
	*/ 
	public String _UDP = new String("UDP");
	

		
	/*
	Static Variable for the literal AMQP.
	*/ 
	public String _AMQP = new String("AMQP");
	

		
	/*
	Static Variable for the literal STOMP.
	*/ 
	public String _STOMP = new String("STOMP");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("SupportedCommunicationProtocols");

	public SupportedCommunicationProtocols() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the SupportedCommunicationProtocols POJO class
		
		SupportedCommunicationProtocols enumeration = new SupportedCommunicationProtocols();
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
	 * @return the _HTTP
	 */
	public String getHTTP() {
		return _HTTP;
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
	 * @return the _AMQP
	 */
	public String getAMQP() {
		return _AMQP;
	}
	/**
	 * @return the _STOMP
	 */
	public String getSTOMP() {
		return _STOMP;
	}
}