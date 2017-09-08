package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the Unit stereotype
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

public class Unit {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute convFactor.
	*/ 
	private List<String> _convFactor = new ArrayList<String>();
	

		
	/*
	Variable for the attribute convOffset.
	*/ 
	private List<String> _convOffset = new ArrayList<String>();
	

		
	/*
	Variable for the attribute baseUnit.
	*/ 
	private List<String> _baseUnit = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("Unit");

	public Unit() {
		/*
		Variable for the attribute convFactor.
		*/ 
		this._convFactor = new ArrayList<String>();
		/*
		Variable for the attribute convOffset.
		*/ 
		this._convOffset = new ArrayList<String>();
		/*
		Variable for the attribute baseUnit.
		*/ 
		this._baseUnit = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the Unit POJO class
		
		Unit _stereo = new Unit();
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
	 * @return the convFactor
	 */
	public List<String> getConvFactor() {
		return this._convFactor;
	}
	/**
	 * @param convFactor the convFactor to add
	 */
	public void addConvFactor(String _convFactor) {
		this._convFactor.add(_convFactor.toString());
	}
	/**
	 * @return the convOffset
	 */
	public List<String> getConvOffset() {
		return this._convOffset;
	}
	/**
	 * @param convOffset the convOffset to add
	 */
	public void addConvOffset(String _convOffset) {
		this._convOffset.add(_convOffset.toString());
	}
	/**
	 * @return the baseUnit
	 */
	public List<String> getBaseUnit() {
		return this._baseUnit;
	}
	/**
	 * @param baseUnit the baseUnit to add
	 */
	public void addBaseUnit(String _baseUnit) {
		this._baseUnit.add(_baseUnit.toString());
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