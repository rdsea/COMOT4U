package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the NotificationResource stereotype
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

public class NotificationResource {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute occurence.
	*/ 
	private List<String> _occurence = new ArrayList<String>();
	

		
	/*
	Variable for the attribute mechanism.
	*/ 
	private List<String> _mechanism = new ArrayList<String>();
	

		
	/*
	Variable for the attribute occurenceCountElements.
	*/ 
	private List<String> _occurenceCountElements = new ArrayList<String>();
	

		
	/*
	Variable for the attribute maskElements.
	*/ 
	private List<String> _maskElements = new ArrayList<String>();
	

		
	/*
	Variable for the attribute flushServices.
	*/ 
	private List<String> _flushServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute signalServices.
	*/ 
	private List<String> _signalServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute waitServices.
	*/ 
	private List<String> _waitServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute clearServices.
	*/ 
	private List<String> _clearServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isIntraMemoryPartitionInteraction.
	*/ 
	private List<String> _isIntraMemoryPartitionInteraction = new ArrayList<String>();
	

		
	/*
	Variable for the attribute waitingQueuePolicy.
	*/ 
	private List<String> _waitingQueuePolicy = new ArrayList<String>();
	

		
	/*
	Variable for the attribute waitingQueueCapacity.
	*/ 
	private List<String> _waitingQueueCapacity = new ArrayList<String>();
	

		
	/*
	Variable for the attribute waitingPolicyElements.
	*/ 
	private List<String> _waitingPolicyElements = new ArrayList<String>();
	

		
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
	public String __type = new String ("NotificationResource");

	public NotificationResource() {
		/*
		Variable for the attribute occurence.
		*/ 
		this._occurence = new ArrayList<String>();
		/*
		Variable for the attribute mechanism.
		*/ 
		this._mechanism = new ArrayList<String>();
		/*
		Variable for the attribute occurenceCountElements.
		*/ 
		this._occurenceCountElements = new ArrayList<String>();
		/*
		Variable for the attribute maskElements.
		*/ 
		this._maskElements = new ArrayList<String>();
		/*
		Variable for the attribute flushServices.
		*/ 
		this._flushServices = new ArrayList<String>();
		/*
		Variable for the attribute signalServices.
		*/ 
		this._signalServices = new ArrayList<String>();
		/*
		Variable for the attribute waitServices.
		*/ 
		this._waitServices = new ArrayList<String>();
		/*
		Variable for the attribute clearServices.
		*/ 
		this._clearServices = new ArrayList<String>();
		/*
		Variable for the attribute isIntraMemoryPartitionInteraction.
		*/ 
		this._isIntraMemoryPartitionInteraction = new ArrayList<String>();
		/*
		Variable for the attribute waitingQueuePolicy.
		*/ 
		this._waitingQueuePolicy = new ArrayList<String>();
		/*
		Variable for the attribute waitingQueueCapacity.
		*/ 
		this._waitingQueueCapacity = new ArrayList<String>();
		/*
		Variable for the attribute waitingPolicyElements.
		*/ 
		this._waitingPolicyElements = new ArrayList<String>();
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
		// TODO Auto-generated method to test the NotificationResource POJO class
		
		NotificationResource _stereo = new NotificationResource();
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
	 * @return the occurence
	 */
	public List<String> getOccurence() {
		return this._occurence;
	}
	/**
	 * @param occurence the occurence to add
	 */
	public void addOccurence(String _occurence) {
		this._occurence.add(_occurence.toString());
	}
	/**
	 * @return the mechanism
	 */
	public List<String> getMechanism() {
		return this._mechanism;
	}
	/**
	 * @param mechanism the mechanism to add
	 */
	public void addMechanism(String _mechanism) {
		this._mechanism.add(_mechanism.toString());
	}
	/**
	 * @return the occurenceCountElements
	 */
	public List<String> getOccurenceCountElements() {
		return this._occurenceCountElements;
	}
	/**
	 * @param occurenceCountElements the occurenceCountElements to add
	 */
	public void addOccurenceCountElements(String _occurenceCountElements) {
		this._occurenceCountElements.add(_occurenceCountElements.toString());
	}
	/**
	 * @return the maskElements
	 */
	public List<String> getMaskElements() {
		return this._maskElements;
	}
	/**
	 * @param maskElements the maskElements to add
	 */
	public void addMaskElements(String _maskElements) {
		this._maskElements.add(_maskElements.toString());
	}
	/**
	 * @return the flushServices
	 */
	public List<String> getFlushServices() {
		return this._flushServices;
	}
	/**
	 * @param flushServices the flushServices to add
	 */
	public void addFlushServices(String _flushServices) {
		this._flushServices.add(_flushServices.toString());
	}
	/**
	 * @return the signalServices
	 */
	public List<String> getSignalServices() {
		return this._signalServices;
	}
	/**
	 * @param signalServices the signalServices to add
	 */
	public void addSignalServices(String _signalServices) {
		this._signalServices.add(_signalServices.toString());
	}
	/**
	 * @return the waitServices
	 */
	public List<String> getWaitServices() {
		return this._waitServices;
	}
	/**
	 * @param waitServices the waitServices to add
	 */
	public void addWaitServices(String _waitServices) {
		this._waitServices.add(_waitServices.toString());
	}
	/**
	 * @return the clearServices
	 */
	public List<String> getClearServices() {
		return this._clearServices;
	}
	/**
	 * @param clearServices the clearServices to add
	 */
	public void addClearServices(String _clearServices) {
		this._clearServices.add(_clearServices.toString());
	}
	/**
	 * @return the isIntraMemoryPartitionInteraction
	 */
	public List<String> getIsIntraMemoryPartitionInteraction() {
		return this._isIntraMemoryPartitionInteraction;
	}
	/**
	 * @param isIntraMemoryPartitionInteraction the isIntraMemoryPartitionInteraction to add
	 */
	public void addIsIntraMemoryPartitionInteraction(String _isIntraMemoryPartitionInteraction) {
		this._isIntraMemoryPartitionInteraction.add(_isIntraMemoryPartitionInteraction.toString());
	}
	/**
	 * @return the waitingQueuePolicy
	 */
	public List<String> getWaitingQueuePolicy() {
		return this._waitingQueuePolicy;
	}
	/**
	 * @param waitingQueuePolicy the waitingQueuePolicy to add
	 */
	public void addWaitingQueuePolicy(String _waitingQueuePolicy) {
		this._waitingQueuePolicy.add(_waitingQueuePolicy.toString());
	}
	/**
	 * @return the waitingQueueCapacity
	 */
	public List<String> getWaitingQueueCapacity() {
		return this._waitingQueueCapacity;
	}
	/**
	 * @param waitingQueueCapacity the waitingQueueCapacity to add
	 */
	public void addWaitingQueueCapacity(String _waitingQueueCapacity) {
		this._waitingQueueCapacity.add(_waitingQueueCapacity.toString());
	}
	/**
	 * @return the waitingPolicyElements
	 */
	public List<String> getWaitingPolicyElements() {
		return this._waitingPolicyElements;
	}
	/**
	 * @param waitingPolicyElements the waitingPolicyElements to add
	 */
	public void addWaitingPolicyElements(String _waitingPolicyElements) {
		this._waitingPolicyElements.add(_waitingPolicyElements.toString());
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