package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the ChoiceType stereotype
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@5947c75e (name: Stereotype) (instanceClassName: null) (abstract: false, interface: false)
uml::Stereotype
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.tu4ume.epsilon.externaltools.SampleTool;

public class ChoiceType {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute choiceAttrib.
	*/ 
	private List<String> _choiceAttrib = new ArrayList<String>();
	

		
	/*
	Variable for the attribute defaultAttrib.
	*/ 
	private List<String> _defaultAttrib = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("ChoiceType");

	public ChoiceType() {
		/*
		Variable for the attribute choiceAttrib.
		*/ 
		this._choiceAttrib = new ArrayList<String>();
		/*
		Variable for the attribute defaultAttrib.
		*/ 
		this._defaultAttrib = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ChoiceType POJO class
		
		ChoiceType _stereo = new ChoiceType();
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
	 * @return the choiceAttrib
	 */
	public List<String> getChoiceAttrib() {
		return this._choiceAttrib;
	}
	/**
	 * @param choiceAttrib the choiceAttrib to add
	 */
	public void addChoiceAttrib(String _choiceAttrib) {
		this._choiceAttrib.add(_choiceAttrib.toString());
	}
	/**
	 * @return the defaultAttrib
	 */
	public List<String> getDefaultAttrib() {
		return this._defaultAttrib;
	}
	/**
	 * @param defaultAttrib the defaultAttrib to add
	 */
	public void addDefaultAttrib(String _defaultAttrib) {
		this._defaultAttrib.add(_defaultAttrib.toString());
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