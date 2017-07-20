package at.ac.tuwien.dsg.profiles.cpsinfrastructure.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the TemporalManifestation stereotype
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

public class TemporalManifestation {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute persistent_manifestation.
	*/ 
	private List<String> _persistent_manifestation = new ArrayList<String>();
	

		
	/*
	Variable for the attribute recurring_manifestation.
	*/ 
	private List<String> _recurring_manifestation = new ArrayList<String>();
	

		
	/*
	Variable for the attribute sporadic_manifestation.
	*/ 
	private List<String> _sporadic_manifestation = new ArrayList<String>();
	

		
	/*
	Variable for the attribute configuration.
	*/ 
	private List<String> _configuration = new ArrayList<String>();
	

		
	/*
	Variable for the attribute description.
	*/ 
	private List<String> _description = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("TemporalManifestation");

	public TemporalManifestation() {
		/*
		Variable for the attribute persistent_manifestation.
		*/ 
		this._persistent_manifestation = new ArrayList<String>();
		/*
		Variable for the attribute recurring_manifestation.
		*/ 
		this._recurring_manifestation = new ArrayList<String>();
		/*
		Variable for the attribute sporadic_manifestation.
		*/ 
		this._sporadic_manifestation = new ArrayList<String>();
		/*
		Variable for the attribute configuration.
		*/ 
		this._configuration = new ArrayList<String>();
		/*
		Variable for the attribute description.
		*/ 
		this._description = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the TemporalManifestation POJO class
		
		TemporalManifestation _stereo = new TemporalManifestation();
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
	 * @return the persistent_manifestation
	 */
	public List<String> getPersistent_manifestation() {
		return this._persistent_manifestation;
	}
	/**
	 * @param persistent_manifestation the persistent_manifestation to add
	 */
	public void addPersistent_manifestation(String _persistent_manifestation) {
		this._persistent_manifestation.add(_persistent_manifestation.toString());
	}
	/**
	 * @return the recurring_manifestation
	 */
	public List<String> getRecurring_manifestation() {
		return this._recurring_manifestation;
	}
	/**
	 * @param recurring_manifestation the recurring_manifestation to add
	 */
	public void addRecurring_manifestation(String _recurring_manifestation) {
		this._recurring_manifestation.add(_recurring_manifestation.toString());
	}
	/**
	 * @return the sporadic_manifestation
	 */
	public List<String> getSporadic_manifestation() {
		return this._sporadic_manifestation;
	}
	/**
	 * @param sporadic_manifestation the sporadic_manifestation to add
	 */
	public void addSporadic_manifestation(String _sporadic_manifestation) {
		this._sporadic_manifestation.add(_sporadic_manifestation.toString());
	}
	/**
	 * @return the configuration
	 */
	public List<String> getConfiguration() {
		return this._configuration;
	}
	/**
	 * @param configuration the configuration to add
	 */
	public void addConfiguration(String _configuration) {
		this._configuration.add(_configuration.toString());
	}
	/**
	 * @return the description
	 */
	public List<String> getDescription() {
		return this._description;
	}
	/**
	 * @param description the description to add
	 */
	public void addDescription(String _description) {
		this._description.add(_description.toString());
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