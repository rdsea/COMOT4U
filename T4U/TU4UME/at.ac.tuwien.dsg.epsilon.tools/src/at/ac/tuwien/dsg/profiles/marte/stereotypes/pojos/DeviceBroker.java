package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the DeviceBroker stereotype
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

public class DeviceBroker {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute accessPolicy.
	*/ 
	private List<String> _accessPolicy = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isBuffered.
	*/ 
	private List<String> _isBuffered = new ArrayList<String>();
	

		
	/*
	Variable for the attribute devices.
	*/ 
	private List<String> _devices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute closeServices.
	*/ 
	private List<String> _closeServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute controlServices.
	*/ 
	private List<String> _controlServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute openServices.
	*/ 
	private List<String> _openServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute readServices.
	*/ 
	private List<String> _readServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute writeServices.
	*/ 
	private List<String> _writeServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute identifierElements.
	*/ 
	private List<String> _identifierElements = new ArrayList<String>();
	

		
	/*
	Variable for the attribute stateElements.
	*/ 
	private List<String> _stateElements = new ArrayList<String>();
	

		
	/*
	Variable for the attribute memorySizeFootprint.
	*/ 
	private List<String> _memorySizeFootprint = new ArrayList<String>();
	

		
	/*
	Variable for the attribute createServices.
	*/ 
	private List<String> _createServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute deleteServices.
	*/ 
	private List<String> _deleteServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute initializeServices.
	*/ 
	private List<String> _initializeServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute resMult.
	*/ 
	private List<String> _resMult = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isProtected.
	*/ 
	private List<String> _isProtected = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isActive.
	*/ 
	private List<String> _isActive = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("DeviceBroker");

	public DeviceBroker() {
		/*
		Variable for the attribute accessPolicy.
		*/ 
		this._accessPolicy = new ArrayList<String>();
		/*
		Variable for the attribute isBuffered.
		*/ 
		this._isBuffered = new ArrayList<String>();
		/*
		Variable for the attribute devices.
		*/ 
		this._devices = new ArrayList<String>();
		/*
		Variable for the attribute closeServices.
		*/ 
		this._closeServices = new ArrayList<String>();
		/*
		Variable for the attribute controlServices.
		*/ 
		this._controlServices = new ArrayList<String>();
		/*
		Variable for the attribute openServices.
		*/ 
		this._openServices = new ArrayList<String>();
		/*
		Variable for the attribute readServices.
		*/ 
		this._readServices = new ArrayList<String>();
		/*
		Variable for the attribute writeServices.
		*/ 
		this._writeServices = new ArrayList<String>();
		/*
		Variable for the attribute identifierElements.
		*/ 
		this._identifierElements = new ArrayList<String>();
		/*
		Variable for the attribute stateElements.
		*/ 
		this._stateElements = new ArrayList<String>();
		/*
		Variable for the attribute memorySizeFootprint.
		*/ 
		this._memorySizeFootprint = new ArrayList<String>();
		/*
		Variable for the attribute createServices.
		*/ 
		this._createServices = new ArrayList<String>();
		/*
		Variable for the attribute deleteServices.
		*/ 
		this._deleteServices = new ArrayList<String>();
		/*
		Variable for the attribute initializeServices.
		*/ 
		this._initializeServices = new ArrayList<String>();
		/*
		Variable for the attribute resMult.
		*/ 
		this._resMult = new ArrayList<String>();
		/*
		Variable for the attribute isProtected.
		*/ 
		this._isProtected = new ArrayList<String>();
		/*
		Variable for the attribute isActive.
		*/ 
		this._isActive = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the DeviceBroker POJO class
		
		DeviceBroker _stereo = new DeviceBroker();
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
	 * @return the accessPolicy
	 */
	public List<String> getAccessPolicy() {
		return this._accessPolicy;
	}
	/**
	 * @param accessPolicy the accessPolicy to add
	 */
	public void addAccessPolicy(String _accessPolicy) {
		this._accessPolicy.add(_accessPolicy.toString());
	}
	/**
	 * @return the isBuffered
	 */
	public List<String> getIsBuffered() {
		return this._isBuffered;
	}
	/**
	 * @param isBuffered the isBuffered to add
	 */
	public void addIsBuffered(String _isBuffered) {
		this._isBuffered.add(_isBuffered.toString());
	}
	/**
	 * @return the devices
	 */
	public List<String> getDevices() {
		return this._devices;
	}
	/**
	 * @param devices the devices to add
	 */
	public void addDevices(String _devices) {
		this._devices.add(_devices.toString());
	}
	/**
	 * @return the closeServices
	 */
	public List<String> getCloseServices() {
		return this._closeServices;
	}
	/**
	 * @param closeServices the closeServices to add
	 */
	public void addCloseServices(String _closeServices) {
		this._closeServices.add(_closeServices.toString());
	}
	/**
	 * @return the controlServices
	 */
	public List<String> getControlServices() {
		return this._controlServices;
	}
	/**
	 * @param controlServices the controlServices to add
	 */
	public void addControlServices(String _controlServices) {
		this._controlServices.add(_controlServices.toString());
	}
	/**
	 * @return the openServices
	 */
	public List<String> getOpenServices() {
		return this._openServices;
	}
	/**
	 * @param openServices the openServices to add
	 */
	public void addOpenServices(String _openServices) {
		this._openServices.add(_openServices.toString());
	}
	/**
	 * @return the readServices
	 */
	public List<String> getReadServices() {
		return this._readServices;
	}
	/**
	 * @param readServices the readServices to add
	 */
	public void addReadServices(String _readServices) {
		this._readServices.add(_readServices.toString());
	}
	/**
	 * @return the writeServices
	 */
	public List<String> getWriteServices() {
		return this._writeServices;
	}
	/**
	 * @param writeServices the writeServices to add
	 */
	public void addWriteServices(String _writeServices) {
		this._writeServices.add(_writeServices.toString());
	}
	/**
	 * @return the identifierElements
	 */
	public List<String> getIdentifierElements() {
		return this._identifierElements;
	}
	/**
	 * @param identifierElements the identifierElements to add
	 */
	public void addIdentifierElements(String _identifierElements) {
		this._identifierElements.add(_identifierElements.toString());
	}
	/**
	 * @return the stateElements
	 */
	public List<String> getStateElements() {
		return this._stateElements;
	}
	/**
	 * @param stateElements the stateElements to add
	 */
	public void addStateElements(String _stateElements) {
		this._stateElements.add(_stateElements.toString());
	}
	/**
	 * @return the memorySizeFootprint
	 */
	public List<String> getMemorySizeFootprint() {
		return this._memorySizeFootprint;
	}
	/**
	 * @param memorySizeFootprint the memorySizeFootprint to add
	 */
	public void addMemorySizeFootprint(String _memorySizeFootprint) {
		this._memorySizeFootprint.add(_memorySizeFootprint.toString());
	}
	/**
	 * @return the createServices
	 */
	public List<String> getCreateServices() {
		return this._createServices;
	}
	/**
	 * @param createServices the createServices to add
	 */
	public void addCreateServices(String _createServices) {
		this._createServices.add(_createServices.toString());
	}
	/**
	 * @return the deleteServices
	 */
	public List<String> getDeleteServices() {
		return this._deleteServices;
	}
	/**
	 * @param deleteServices the deleteServices to add
	 */
	public void addDeleteServices(String _deleteServices) {
		this._deleteServices.add(_deleteServices.toString());
	}
	/**
	 * @return the initializeServices
	 */
	public List<String> getInitializeServices() {
		return this._initializeServices;
	}
	/**
	 * @param initializeServices the initializeServices to add
	 */
	public void addInitializeServices(String _initializeServices) {
		this._initializeServices.add(_initializeServices.toString());
	}
	/**
	 * @return the resMult
	 */
	public List<String> getResMult() {
		return this._resMult;
	}
	/**
	 * @param resMult the resMult to add
	 */
	public void addResMult(String _resMult) {
		this._resMult.add(_resMult.toString());
	}
	/**
	 * @return the isProtected
	 */
	public List<String> getIsProtected() {
		return this._isProtected;
	}
	/**
	 * @param isProtected the isProtected to add
	 */
	public void addIsProtected(String _isProtected) {
		this._isProtected.add(_isProtected.toString());
	}
	/**
	 * @return the isActive
	 */
	public List<String> getIsActive() {
		return this._isActive;
	}
	/**
	 * @param isActive the isActive to add
	 */
	public void addIsActive(String _isActive) {
		this._isActive.add(_isActive.toString());
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