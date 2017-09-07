package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the NameBasedMsgMode enumeration
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

public class NameBasedMsgMode {


		
	/*
	Static Variable for the literal Default.
	*/ 
	public String _Default = new String("Default");
	

		
	/*
	Static Variable for the literal NameIsMessage.
	*/ 
	public String _NameIsMessage = new String("NameIsMessage");
	

		
	/*
	Static Variable for the literal CustomTemplate.
	*/ 
	public String _CustomTemplate = new String("CustomTemplate");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("NameBasedMsgMode");

	public NameBasedMsgMode() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the NameBasedMsgMode POJO class
		
		NameBasedMsgMode enumeration = new NameBasedMsgMode();
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
	 * @return the _Default
	 */
	public String getDefault() {
		return _Default;
	}
	/**
	 * @return the _NameIsMessage
	 */
	public String getNameIsMessage() {
		return _NameIsMessage;
	}
	/**
	 * @return the _CustomTemplate
	 */
	public String getCustomTemplate() {
		return _CustomTemplate;
	}
}