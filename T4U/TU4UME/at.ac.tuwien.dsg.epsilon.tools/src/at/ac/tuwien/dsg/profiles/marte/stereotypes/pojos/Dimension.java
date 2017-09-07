package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the Dimension stereotype
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

public class Dimension {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute symbol.
	*/ 
	private List<String> _symbol = new ArrayList<String>();
	

		
	/*
	Variable for the attribute baseDimension.
	*/ 
	private List<String> _baseDimension = new ArrayList<String>();
	

		
	/*
	Variable for the attribute baseExponent.
	*/ 
	private List<String> _baseExponent = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("Dimension");

	public Dimension() {
		/*
		Variable for the attribute symbol.
		*/ 
		this._symbol = new ArrayList<String>();
		/*
		Variable for the attribute baseDimension.
		*/ 
		this._baseDimension = new ArrayList<String>();
		/*
		Variable for the attribute baseExponent.
		*/ 
		this._baseExponent = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the Dimension POJO class
		
		Dimension _stereo = new Dimension();
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
	 * @return the symbol
	 */
	public List<String> getSymbol() {
		return this._symbol;
	}
	/**
	 * @param symbol the symbol to add
	 */
	public void addSymbol(String _symbol) {
		this._symbol.add(_symbol.toString());
	}
	/**
	 * @return the baseDimension
	 */
	public List<String> getBaseDimension() {
		return this._baseDimension;
	}
	/**
	 * @param baseDimension the baseDimension to add
	 */
	public void addBaseDimension(String _baseDimension) {
		this._baseDimension.add(_baseDimension.toString());
	}
	/**
	 * @return the baseExponent
	 */
	public List<String> getBaseExponent() {
		return this._baseExponent;
	}
	/**
	 * @param baseExponent the baseExponent to add
	 */
	public void addBaseExponent(String _baseExponent) {
		this._baseExponent.add(_baseExponent.toString());
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