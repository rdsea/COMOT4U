package at.ac.tuwien.dsg.profiles.cpsinfrastructure.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the NonFunctionalDimensionality stereotype
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

public class NonFunctionalDimensionality {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute description.
	*/ 
	private List<String> _description = new ArrayList<String>();
	

		
	/*
	Variable for the attribute non_functional_attributes.
	*/ 
	private List<String> _non_functional_attributes = new ArrayList<String>();
	

		
	/*
	Variable for the attribute configuration.
	*/ 
	private List<String> _configuration = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("NonFunctionalDimensionality");

	public NonFunctionalDimensionality() {
		/*
		Variable for the attribute description.
		*/ 
		this._description = new ArrayList<String>();
		/*
		Variable for the attribute non_functional_attributes.
		*/ 
		this._non_functional_attributes = new ArrayList<String>();
		/*
		Variable for the attribute configuration.
		*/ 
		this._configuration = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the NonFunctionalDimensionality POJO class
		
		NonFunctionalDimensionality _stereo = new NonFunctionalDimensionality();
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
	 * @return the non_functional_attributes
	 */
	public List<String> getNon_functional_attributes() {
		return this._non_functional_attributes;
	}
	/**
	 * @param non_functional_attributes the non_functional_attributes to add
	 */
	public void addNon_functional_attributes(String _non_functional_attributes) {
		this._non_functional_attributes.add(_non_functional_attributes.toString());
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