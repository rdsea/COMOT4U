package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the MessageResourceKind enumeration
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

public class MessageResourceKind {


		
	/*
	Static Variable for the literal MessageQueue.
	*/ 
	public String _MessageQueue = new String("MessageQueue");
	

		
	/*
	Static Variable for the literal Pipe.
	*/ 
	public String _Pipe = new String("Pipe");
	

		
	/*
	Static Variable for the literal Blackboard.
	*/ 
	public String _Blackboard = new String("Blackboard");
	

		
	/*
	Static Variable for the literal Undef.
	*/ 
	public String _Undef = new String("Undef");
	

		
	/*
	Static Variable for the literal Other.
	*/ 
	public String _Other = new String("Other");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("MessageResourceKind");

	public MessageResourceKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the MessageResourceKind POJO class
		
		MessageResourceKind enumeration = new MessageResourceKind();
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
	 * @return the _MessageQueue
	 */
	public String getMessageQueue() {
		return _MessageQueue;
	}
	/**
	 * @return the _Pipe
	 */
	public String getPipe() {
		return _Pipe;
	}
	/**
	 * @return the _Blackboard
	 */
	public String getBlackboard() {
		return _Blackboard;
	}
	/**
	 * @return the _Undef
	 */
	public String getUndef() {
		return _Undef;
	}
	/**
	 * @return the _Other
	 */
	public String getOther() {
		return _Other;
	}
}