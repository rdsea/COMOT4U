package at.ac.tuwien.dsg.profiles.cpsinfrastructure.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the MessageHandling stereotype
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@65a2200c (name: Stereotype) (instanceClassName: null) (abstract: false, interface: false)
uml::Stereotype
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class MessageHandling {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute messageMode.
	*/ 
	private List<String> _messageMode = new ArrayList<String>();
	

		
	/*
	Variable for the attribute customTemplate.
	*/ 
	private List<String> _customTemplate = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("MessageHandling");

	public MessageHandling() {
		/*
		Variable for the attribute messageMode.
		*/ 
		this._messageMode = new ArrayList<String>();
		/*
		Variable for the attribute customTemplate.
		*/ 
		this._customTemplate = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the MessageHandling POJO class
		
		MessageHandling _stereo = new MessageHandling();
		_stereo.toJson();
		
	}
	
	public String toJson(){
	

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        // Convert numbers array into JSON string.
        String _element = gson.toJson(this);
        
        System.out.println("element = " + _element);    
        
        return _element;   
	}

	/**
	 * @return the messageMode
	 */
	public List<String> getMessageMode() {
		return this._messageMode;
	}
	/**
	 * @param messageMode the messageMode to add
	 */
	public void addMessageMode(String _messageMode) {
		this._messageMode.add(_messageMode.toString());
	}
	/**
	 * @return the customTemplate
	 */
	public List<String> getCustomTemplate() {
		return this._customTemplate;
	}
	/**
	 * @param customTemplate the customTemplate to add
	 */
	public void addCustomTemplate(String _customTemplate) {
		this._customTemplate.add(_customTemplate.toString());
	}
	/**
	 * @return the _name
	 */
	public String getName() {
		return this.__name;
	}
	/**
	 * @param end the Communication to add
	 */
	public void setName(String __name) {
		this.__name = __name;
	}
	
}