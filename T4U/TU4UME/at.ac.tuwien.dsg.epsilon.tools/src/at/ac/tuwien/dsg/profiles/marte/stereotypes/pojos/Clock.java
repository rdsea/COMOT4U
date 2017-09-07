package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the Clock stereotype
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@4c06bbf9 (name: Stereotype) (instanceClassName: null) (abstract: false, interface: false)
uml::Stereotype
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class Clock {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute standard.
	*/ 
	private List<String> _standard = new ArrayList<String>();
	

		
	/*
	Variable for the attribute type.
	*/ 
	private List<String> _type = new ArrayList<String>();
	

		
	/*
	Variable for the attribute unit.
	*/ 
	private List<String> _unit = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("Clock");

	public Clock() {
		/*
		Variable for the attribute standard.
		*/ 
		this._standard = new ArrayList<String>();
		/*
		Variable for the attribute type.
		*/ 
		this._type = new ArrayList<String>();
		/*
		Variable for the attribute unit.
		*/ 
		this._unit = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the Clock POJO class
		
		Clock _stereo = new Clock();
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
	 * @return the standard
	 */
	public List<String> getStandard() {
		return this._standard;
	}
	/**
	 * @param standard the standard to add
	 */
	public void addStandard(String _standard) {
		this._standard.add(_standard.toString());
	}
	/**
	 * @return the type
	 */
	public List<String> getType() {
		return this._type;
	}
	/**
	 * @param type the type to add
	 */
	public void addType(String _type) {
		this._type.add(_type.toString());
	}
	/**
	 * @return the unit
	 */
	public List<String> getUnit() {
		return this._unit;
	}
	/**
	 * @param unit the unit to add
	 */
	public void addUnit(String _unit) {
		this._unit.add(_unit.toString());
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