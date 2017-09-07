package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the MessageSort enumeration
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

public class MessageSort {


		
	/*
	Static Variable for the literal synchCall.
	*/ 
	public String _synchCall = new String("synchCall");
	

		
	/*
	Static Variable for the literal asynchCall.
	*/ 
	public String _asynchCall = new String("asynchCall");
	

		
	/*
	Static Variable for the literal asynchSignal.
	*/ 
	public String _asynchSignal = new String("asynchSignal");
	

		
	/*
	Static Variable for the literal createMessage.
	*/ 
	public String _createMessage = new String("createMessage");
	

		
	/*
	Static Variable for the literal deleteMessage.
	*/ 
	public String _deleteMessage = new String("deleteMessage");
	

		
	/*
	Static Variable for the literal reply.
	*/ 
	public String _reply = new String("reply");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("MessageSort");

	public MessageSort() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the MessageSort POJO class
		
		MessageSort enumeration = new MessageSort();
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
	 * @return the _synchCall
	 */
	public String getSynchCall() {
		return _synchCall;
	}
	/**
	 * @return the _asynchCall
	 */
	public String getAsynchCall() {
		return _asynchCall;
	}
	/**
	 * @return the _asynchSignal
	 */
	public String getAsynchSignal() {
		return _asynchSignal;
	}
	/**
	 * @return the _createMessage
	 */
	public String getCreateMessage() {
		return _createMessage;
	}
	/**
	 * @return the _deleteMessage
	 */
	public String getDeleteMessage() {
		return _deleteMessage;
	}
	/**
	 * @return the _reply
	 */
	public String getReply() {
		return _reply;
	}
}