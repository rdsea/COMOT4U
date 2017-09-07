package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the BoundedSubtype stereotype
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

public class BoundedSubtype {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute baseType.
	*/ 
	private List<String> _baseType = new ArrayList<String>();
	

		
	/*
	Variable for the attribute minValue.
	*/ 
	private List<String> _minValue = new ArrayList<String>();
	

		
	/*
	Variable for the attribute maxValue.
	*/ 
	private List<String> _maxValue = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isMinOpen.
	*/ 
	private List<String> _isMinOpen = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isMaxOpen.
	*/ 
	private List<String> _isMaxOpen = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("BoundedSubtype");

	public BoundedSubtype() {
		/*
		Variable for the attribute baseType.
		*/ 
		this._baseType = new ArrayList<String>();
		/*
		Variable for the attribute minValue.
		*/ 
		this._minValue = new ArrayList<String>();
		/*
		Variable for the attribute maxValue.
		*/ 
		this._maxValue = new ArrayList<String>();
		/*
		Variable for the attribute isMinOpen.
		*/ 
		this._isMinOpen = new ArrayList<String>();
		/*
		Variable for the attribute isMaxOpen.
		*/ 
		this._isMaxOpen = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the BoundedSubtype POJO class
		
		BoundedSubtype _stereo = new BoundedSubtype();
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
	 * @return the baseType
	 */
	public List<String> getBaseType() {
		return this._baseType;
	}
	/**
	 * @param baseType the baseType to add
	 */
	public void addBaseType(String _baseType) {
		this._baseType.add(_baseType.toString());
	}
	/**
	 * @return the minValue
	 */
	public List<String> getMinValue() {
		return this._minValue;
	}
	/**
	 * @param minValue the minValue to add
	 */
	public void addMinValue(String _minValue) {
		this._minValue.add(_minValue.toString());
	}
	/**
	 * @return the maxValue
	 */
	public List<String> getMaxValue() {
		return this._maxValue;
	}
	/**
	 * @param maxValue the maxValue to add
	 */
	public void addMaxValue(String _maxValue) {
		this._maxValue.add(_maxValue.toString());
	}
	/**
	 * @return the isMinOpen
	 */
	public List<String> getIsMinOpen() {
		return this._isMinOpen;
	}
	/**
	 * @param isMinOpen the isMinOpen to add
	 */
	public void addIsMinOpen(String _isMinOpen) {
		this._isMinOpen.add(_isMinOpen.toString());
	}
	/**
	 * @return the isMaxOpen
	 */
	public List<String> getIsMaxOpen() {
		return this._isMaxOpen;
	}
	/**
	 * @param isMaxOpen the isMaxOpen to add
	 */
	public void addIsMaxOpen(String _isMaxOpen) {
		this._isMaxOpen.add(_isMaxOpen.toString());
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