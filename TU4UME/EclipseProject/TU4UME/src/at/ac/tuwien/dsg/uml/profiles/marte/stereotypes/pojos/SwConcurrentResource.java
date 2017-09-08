package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the SwConcurrentResource stereotype
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

public class SwConcurrentResource {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute type.
	*/ 
	private List<String> _type = new ArrayList<String>();
	

		
	/*
	Variable for the attribute activationCapacity.
	*/ 
	private List<String> _activationCapacity = new ArrayList<String>();
	

		
	/*
	Variable for the attribute entryPoints.
	*/ 
	private List<String> _entryPoints = new ArrayList<String>();
	

		
	/*
	Variable for the attribute adressSpace.
	*/ 
	private List<String> _adressSpace = new ArrayList<String>();
	

		
	/*
	Variable for the attribute periodElements.
	*/ 
	private List<String> _periodElements = new ArrayList<String>();
	

		
	/*
	Variable for the attribute priorityElements.
	*/ 
	private List<String> _priorityElements = new ArrayList<String>();
	

		
	/*
	Variable for the attribute stackSizeElements.
	*/ 
	private List<String> _stackSizeElements = new ArrayList<String>();
	

		
	/*
	Variable for the attribute activateServices.
	*/ 
	private List<String> _activateServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute enableConcurrencyServices.
	*/ 
	private List<String> _enableConcurrencyServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute resumeServices.
	*/ 
	private List<String> _resumeServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute suspendServices.
	*/ 
	private List<String> _suspendServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute terminateServices.
	*/ 
	private List<String> _terminateServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute disableConcurrencyServices.
	*/ 
	private List<String> _disableConcurrencyServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute shareDataResources.
	*/ 
	private List<String> _shareDataResources = new ArrayList<String>();
	

		
	/*
	Variable for the attribute messageResources.
	*/ 
	private List<String> _messageResources = new ArrayList<String>();
	

		
	/*
	Variable for the attribute mutualExclusionResources.
	*/ 
	private List<String> _mutualExclusionResources = new ArrayList<String>();
	

		
	/*
	Variable for the attribute notificationResources.
	*/ 
	private List<String> _notificationResources = new ArrayList<String>();
	

		
	/*
	Variable for the attribute heapSizeElements.
	*/ 
	private List<String> _heapSizeElements = new ArrayList<String>();
	

		
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
	public String __type = new String ("SwConcurrentResource");

	public SwConcurrentResource() {
		/*
		Variable for the attribute type.
		*/ 
		this._type = new ArrayList<String>();
		/*
		Variable for the attribute activationCapacity.
		*/ 
		this._activationCapacity = new ArrayList<String>();
		/*
		Variable for the attribute entryPoints.
		*/ 
		this._entryPoints = new ArrayList<String>();
		/*
		Variable for the attribute adressSpace.
		*/ 
		this._adressSpace = new ArrayList<String>();
		/*
		Variable for the attribute periodElements.
		*/ 
		this._periodElements = new ArrayList<String>();
		/*
		Variable for the attribute priorityElements.
		*/ 
		this._priorityElements = new ArrayList<String>();
		/*
		Variable for the attribute stackSizeElements.
		*/ 
		this._stackSizeElements = new ArrayList<String>();
		/*
		Variable for the attribute activateServices.
		*/ 
		this._activateServices = new ArrayList<String>();
		/*
		Variable for the attribute enableConcurrencyServices.
		*/ 
		this._enableConcurrencyServices = new ArrayList<String>();
		/*
		Variable for the attribute resumeServices.
		*/ 
		this._resumeServices = new ArrayList<String>();
		/*
		Variable for the attribute suspendServices.
		*/ 
		this._suspendServices = new ArrayList<String>();
		/*
		Variable for the attribute terminateServices.
		*/ 
		this._terminateServices = new ArrayList<String>();
		/*
		Variable for the attribute disableConcurrencyServices.
		*/ 
		this._disableConcurrencyServices = new ArrayList<String>();
		/*
		Variable for the attribute shareDataResources.
		*/ 
		this._shareDataResources = new ArrayList<String>();
		/*
		Variable for the attribute messageResources.
		*/ 
		this._messageResources = new ArrayList<String>();
		/*
		Variable for the attribute mutualExclusionResources.
		*/ 
		this._mutualExclusionResources = new ArrayList<String>();
		/*
		Variable for the attribute notificationResources.
		*/ 
		this._notificationResources = new ArrayList<String>();
		/*
		Variable for the attribute heapSizeElements.
		*/ 
		this._heapSizeElements = new ArrayList<String>();
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
		// TODO Auto-generated method to test the SwConcurrentResource POJO class
		
		SwConcurrentResource _stereo = new SwConcurrentResource();
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
	 * @return the activationCapacity
	 */
	public List<String> getActivationCapacity() {
		return this._activationCapacity;
	}
	/**
	 * @param activationCapacity the activationCapacity to add
	 */
	public void addActivationCapacity(String _activationCapacity) {
		this._activationCapacity.add(_activationCapacity.toString());
	}
	/**
	 * @return the entryPoints
	 */
	public List<String> getEntryPoints() {
		return this._entryPoints;
	}
	/**
	 * @param entryPoints the entryPoints to add
	 */
	public void addEntryPoints(String _entryPoints) {
		this._entryPoints.add(_entryPoints.toString());
	}
	/**
	 * @return the adressSpace
	 */
	public List<String> getAdressSpace() {
		return this._adressSpace;
	}
	/**
	 * @param adressSpace the adressSpace to add
	 */
	public void addAdressSpace(String _adressSpace) {
		this._adressSpace.add(_adressSpace.toString());
	}
	/**
	 * @return the periodElements
	 */
	public List<String> getPeriodElements() {
		return this._periodElements;
	}
	/**
	 * @param periodElements the periodElements to add
	 */
	public void addPeriodElements(String _periodElements) {
		this._periodElements.add(_periodElements.toString());
	}
	/**
	 * @return the priorityElements
	 */
	public List<String> getPriorityElements() {
		return this._priorityElements;
	}
	/**
	 * @param priorityElements the priorityElements to add
	 */
	public void addPriorityElements(String _priorityElements) {
		this._priorityElements.add(_priorityElements.toString());
	}
	/**
	 * @return the stackSizeElements
	 */
	public List<String> getStackSizeElements() {
		return this._stackSizeElements;
	}
	/**
	 * @param stackSizeElements the stackSizeElements to add
	 */
	public void addStackSizeElements(String _stackSizeElements) {
		this._stackSizeElements.add(_stackSizeElements.toString());
	}
	/**
	 * @return the activateServices
	 */
	public List<String> getActivateServices() {
		return this._activateServices;
	}
	/**
	 * @param activateServices the activateServices to add
	 */
	public void addActivateServices(String _activateServices) {
		this._activateServices.add(_activateServices.toString());
	}
	/**
	 * @return the enableConcurrencyServices
	 */
	public List<String> getEnableConcurrencyServices() {
		return this._enableConcurrencyServices;
	}
	/**
	 * @param enableConcurrencyServices the enableConcurrencyServices to add
	 */
	public void addEnableConcurrencyServices(String _enableConcurrencyServices) {
		this._enableConcurrencyServices.add(_enableConcurrencyServices.toString());
	}
	/**
	 * @return the resumeServices
	 */
	public List<String> getResumeServices() {
		return this._resumeServices;
	}
	/**
	 * @param resumeServices the resumeServices to add
	 */
	public void addResumeServices(String _resumeServices) {
		this._resumeServices.add(_resumeServices.toString());
	}
	/**
	 * @return the suspendServices
	 */
	public List<String> getSuspendServices() {
		return this._suspendServices;
	}
	/**
	 * @param suspendServices the suspendServices to add
	 */
	public void addSuspendServices(String _suspendServices) {
		this._suspendServices.add(_suspendServices.toString());
	}
	/**
	 * @return the terminateServices
	 */
	public List<String> getTerminateServices() {
		return this._terminateServices;
	}
	/**
	 * @param terminateServices the terminateServices to add
	 */
	public void addTerminateServices(String _terminateServices) {
		this._terminateServices.add(_terminateServices.toString());
	}
	/**
	 * @return the disableConcurrencyServices
	 */
	public List<String> getDisableConcurrencyServices() {
		return this._disableConcurrencyServices;
	}
	/**
	 * @param disableConcurrencyServices the disableConcurrencyServices to add
	 */
	public void addDisableConcurrencyServices(String _disableConcurrencyServices) {
		this._disableConcurrencyServices.add(_disableConcurrencyServices.toString());
	}
	/**
	 * @return the shareDataResources
	 */
	public List<String> getShareDataResources() {
		return this._shareDataResources;
	}
	/**
	 * @param shareDataResources the shareDataResources to add
	 */
	public void addShareDataResources(String _shareDataResources) {
		this._shareDataResources.add(_shareDataResources.toString());
	}
	/**
	 * @return the messageResources
	 */
	public List<String> getMessageResources() {
		return this._messageResources;
	}
	/**
	 * @param messageResources the messageResources to add
	 */
	public void addMessageResources(String _messageResources) {
		this._messageResources.add(_messageResources.toString());
	}
	/**
	 * @return the mutualExclusionResources
	 */
	public List<String> getMutualExclusionResources() {
		return this._mutualExclusionResources;
	}
	/**
	 * @param mutualExclusionResources the mutualExclusionResources to add
	 */
	public void addMutualExclusionResources(String _mutualExclusionResources) {
		this._mutualExclusionResources.add(_mutualExclusionResources.toString());
	}
	/**
	 * @return the notificationResources
	 */
	public List<String> getNotificationResources() {
		return this._notificationResources;
	}
	/**
	 * @param notificationResources the notificationResources to add
	 */
	public void addNotificationResources(String _notificationResources) {
		this._notificationResources.add(_notificationResources.toString());
	}
	/**
	 * @return the heapSizeElements
	 */
	public List<String> getHeapSizeElements() {
		return this._heapSizeElements;
	}
	/**
	 * @param heapSizeElements the heapSizeElements to add
	 */
	public void addHeapSizeElements(String _heapSizeElements) {
		this._heapSizeElements.add(_heapSizeElements.toString());
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