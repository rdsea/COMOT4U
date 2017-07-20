package at.ac.tuwien.dsg.profiles.cpsinfrastructure.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the MessageKind enumeration
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@3c6dd051 (name: Enumeration) (instanceClassName: null) (abstract: false, interface: false)
uml::Enumeration
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class MessageKind {


		
	/*
	Static Variable for the literal complete.
	*/ 
	public String _complete = new String("complete");
	

		
	/*
	Static Variable for the literal lost.
	*/ 
	public String _lost = new String("lost");
	

		
	/*
	Static Variable for the literal found.
	*/ 
	public String _found = new String("found");
	

		
	/*
	Static Variable for the literal unknown.
	*/ 
	public String _unknown = new String("unknown");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("MessageKind");

	public MessageKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the MessageKind POJO class
		
		MessageKind enumeration = new MessageKind();
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
	 * @return the _complete
	 */
	public String getComplete() {
		return _complete;
	}
	/**
	 * @return the _lost
	 */
	public String getLost() {
		return _lost;
	}
	/**
	 * @return the _found
	 */
	public String getFound() {
		return _found;
	}
	/**
	 * @return the _unknown
	 */
	public String getUnknown() {
		return _unknown;
	}
}