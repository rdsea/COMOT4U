package at.ac.tuwien.dsg.profiles.cpsinfrastructure.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the SoftwareDefinedMetric stereotype
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

public class SoftwareDefinedMetric {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute measuredProperty.
	*/ 
	private List<String> _measuredProperty = new ArrayList<String>();
	

		
	/*
	Variable for the attribute measurementProtocol.
	*/ 
	private List<String> _measurementProtocol = new ArrayList<String>();
	

		
	/*
	Variable for the attribute endpoint.
	*/ 
	private List<String> _endpoint = new ArrayList<String>();
	

		
	/*
	Variable for the attribute description.
	*/ 
	private List<String> _description = new ArrayList<String>();
	

		
	/*
	Variable for the attribute period.
	*/ 
	private List<String> _period = new ArrayList<String>();
	

		
	/*
	Variable for the attribute id.
	*/ 
	private List<String> _id = new ArrayList<String>();
	

		
	/*
	Variable for the attribute quantity.
	*/ 
	private List<String> _quantity = new ArrayList<String>();
	

		
	/*
	Variable for the attribute unit.
	*/ 
	private List<String> _unit = new ArrayList<String>();
	

		
	/*
	Variable for the attribute infrastructure_level_uncertainty.
	*/ 
	private List<String> _infrastructure_level_uncertainty = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("SoftwareDefinedMetric");

	public SoftwareDefinedMetric() {
		/*
		Variable for the attribute measuredProperty.
		*/ 
		this._measuredProperty = new ArrayList<String>();
		/*
		Variable for the attribute measurementProtocol.
		*/ 
		this._measurementProtocol = new ArrayList<String>();
		/*
		Variable for the attribute endpoint.
		*/ 
		this._endpoint = new ArrayList<String>();
		/*
		Variable for the attribute description.
		*/ 
		this._description = new ArrayList<String>();
		/*
		Variable for the attribute period.
		*/ 
		this._period = new ArrayList<String>();
		/*
		Variable for the attribute id.
		*/ 
		this._id = new ArrayList<String>();
		/*
		Variable for the attribute quantity.
		*/ 
		this._quantity = new ArrayList<String>();
		/*
		Variable for the attribute unit.
		*/ 
		this._unit = new ArrayList<String>();
		/*
		Variable for the attribute infrastructure_level_uncertainty.
		*/ 
		this._infrastructure_level_uncertainty = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the SoftwareDefinedMetric POJO class
		
		SoftwareDefinedMetric _stereo = new SoftwareDefinedMetric();
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
	 * @return the measuredProperty
	 */
	public List<String> getMeasuredProperty() {
		return this._measuredProperty;
	}
	/**
	 * @param measuredProperty the measuredProperty to add
	 */
	public void addMeasuredProperty(String _measuredProperty) {
		this._measuredProperty.add(_measuredProperty.toString());
	}
	/**
	 * @return the measurementProtocol
	 */
	public List<String> getMeasurementProtocol() {
		return this._measurementProtocol;
	}
	/**
	 * @param measurementProtocol the measurementProtocol to add
	 */
	public void addMeasurementProtocol(String _measurementProtocol) {
		this._measurementProtocol.add(_measurementProtocol.toString());
	}
	/**
	 * @return the endpoint
	 */
	public List<String> getEndpoint() {
		return this._endpoint;
	}
	/**
	 * @param endpoint the endpoint to add
	 */
	public void addEndpoint(String _endpoint) {
		this._endpoint.add(_endpoint.toString());
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
	 * @return the period
	 */
	public List<String> getPeriod() {
		return this._period;
	}
	/**
	 * @param period the period to add
	 */
	public void addPeriod(String _period) {
		this._period.add(_period.toString());
	}
	/**
	 * @return the id
	 */
	public List<String> getId() {
		return this._id;
	}
	/**
	 * @param id the id to add
	 */
	public void addId(String _id) {
		this._id.add(_id.toString());
	}
	/**
	 * @return the quantity
	 */
	public List<String> getQuantity() {
		return this._quantity;
	}
	/**
	 * @param quantity the quantity to add
	 */
	public void addQuantity(String _quantity) {
		this._quantity.add(_quantity.toString());
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
	 * @return the infrastructure_level_uncertainty
	 */
	public List<String> getInfrastructure_level_uncertainty() {
		return this._infrastructure_level_uncertainty;
	}
	/**
	 * @param infrastructure_level_uncertainty the infrastructure_level_uncertainty to add
	 */
	public void addInfrastructure_level_uncertainty(String _infrastructure_level_uncertainty) {
		this._infrastructure_level_uncertainty.add(_infrastructure_level_uncertainty.toString());
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