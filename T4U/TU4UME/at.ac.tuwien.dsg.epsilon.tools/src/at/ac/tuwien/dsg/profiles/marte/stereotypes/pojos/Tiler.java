package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the Tiler stereotype
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

public class Tiler {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute origin.
	*/ 
	private List<String> _origin = new ArrayList<String>();
	

		
	/*
	Variable for the attribute paving.
	*/ 
	private List<String> _paving = new ArrayList<String>();
	

		
	/*
	Variable for the attribute fitting.
	*/ 
	private List<String> _fitting = new ArrayList<String>();
	

		
	/*
	Variable for the attribute tiler.
	*/ 
	private List<String> _tiler = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("Tiler");

	public Tiler() {
		/*
		Variable for the attribute origin.
		*/ 
		this._origin = new ArrayList<String>();
		/*
		Variable for the attribute paving.
		*/ 
		this._paving = new ArrayList<String>();
		/*
		Variable for the attribute fitting.
		*/ 
		this._fitting = new ArrayList<String>();
		/*
		Variable for the attribute tiler.
		*/ 
		this._tiler = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the Tiler POJO class
		
		Tiler _stereo = new Tiler();
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
	 * @return the origin
	 */
	public List<String> getOrigin() {
		return this._origin;
	}
	/**
	 * @param origin the origin to add
	 */
	public void addOrigin(String _origin) {
		this._origin.add(_origin.toString());
	}
	/**
	 * @return the paving
	 */
	public List<String> getPaving() {
		return this._paving;
	}
	/**
	 * @param paving the paving to add
	 */
	public void addPaving(String _paving) {
		this._paving.add(_paving.toString());
	}
	/**
	 * @return the fitting
	 */
	public List<String> getFitting() {
		return this._fitting;
	}
	/**
	 * @param fitting the fitting to add
	 */
	public void addFitting(String _fitting) {
		this._fitting.add(_fitting.toString());
	}
	/**
	 * @return the tiler
	 */
	public List<String> getTiler() {
		return this._tiler;
	}
	/**
	 * @param tiler the tiler to add
	 */
	public void addTiler(String _tiler) {
		this._tiler.add(_tiler.toString());
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