package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the MemoryBroker stereotype
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

public class MemoryBroker {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute accessPolicy.
	*/ 
	private List<String> _accessPolicy = new ArrayList<String>();
	

		
	/*
	Variable for the attribute memories.
	*/ 
	private List<String> _memories = new ArrayList<String>();
	

		
	/*
	Variable for the attribute memoryBlockAdressElements.
	*/ 
	private List<String> _memoryBlockAdressElements = new ArrayList<String>();
	

		
	/*
	Variable for the attribute memoryBlockSizeElements.
	*/ 
	private List<String> _memoryBlockSizeElements = new ArrayList<String>();
	

		
	/*
	Variable for the attribute lockServices.
	*/ 
	private List<String> _lockServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute unlockServices.
	*/ 
	private List<String> _unlockServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute mapServices.
	*/ 
	private List<String> _mapServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute unMapServices.
	*/ 
	private List<String> _unMapServices = new ArrayList<String>();
	

		
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
	public String __type = new String ("MemoryBroker");

	public MemoryBroker() {
		/*
		Variable for the attribute accessPolicy.
		*/ 
		this._accessPolicy = new ArrayList<String>();
		/*
		Variable for the attribute memories.
		*/ 
		this._memories = new ArrayList<String>();
		/*
		Variable for the attribute memoryBlockAdressElements.
		*/ 
		this._memoryBlockAdressElements = new ArrayList<String>();
		/*
		Variable for the attribute memoryBlockSizeElements.
		*/ 
		this._memoryBlockSizeElements = new ArrayList<String>();
		/*
		Variable for the attribute lockServices.
		*/ 
		this._lockServices = new ArrayList<String>();
		/*
		Variable for the attribute unlockServices.
		*/ 
		this._unlockServices = new ArrayList<String>();
		/*
		Variable for the attribute mapServices.
		*/ 
		this._mapServices = new ArrayList<String>();
		/*
		Variable for the attribute unMapServices.
		*/ 
		this._unMapServices = new ArrayList<String>();
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
		// TODO Auto-generated method to test the MemoryBroker POJO class
		
		MemoryBroker _stereo = new MemoryBroker();
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
	 * @return the memories
	 */
	public List<String> getMemories() {
		return this._memories;
	}
	/**
	 * @param memories the memories to add
	 */
	public void addMemories(String _memories) {
		this._memories.add(_memories.toString());
	}
	/**
	 * @return the memoryBlockAdressElements
	 */
	public List<String> getMemoryBlockAdressElements() {
		return this._memoryBlockAdressElements;
	}
	/**
	 * @param memoryBlockAdressElements the memoryBlockAdressElements to add
	 */
	public void addMemoryBlockAdressElements(String _memoryBlockAdressElements) {
		this._memoryBlockAdressElements.add(_memoryBlockAdressElements.toString());
	}
	/**
	 * @return the memoryBlockSizeElements
	 */
	public List<String> getMemoryBlockSizeElements() {
		return this._memoryBlockSizeElements;
	}
	/**
	 * @param memoryBlockSizeElements the memoryBlockSizeElements to add
	 */
	public void addMemoryBlockSizeElements(String _memoryBlockSizeElements) {
		this._memoryBlockSizeElements.add(_memoryBlockSizeElements.toString());
	}
	/**
	 * @return the lockServices
	 */
	public List<String> getLockServices() {
		return this._lockServices;
	}
	/**
	 * @param lockServices the lockServices to add
	 */
	public void addLockServices(String _lockServices) {
		this._lockServices.add(_lockServices.toString());
	}
	/**
	 * @return the unlockServices
	 */
	public List<String> getUnlockServices() {
		return this._unlockServices;
	}
	/**
	 * @param unlockServices the unlockServices to add
	 */
	public void addUnlockServices(String _unlockServices) {
		this._unlockServices.add(_unlockServices.toString());
	}
	/**
	 * @return the mapServices
	 */
	public List<String> getMapServices() {
		return this._mapServices;
	}
	/**
	 * @param mapServices the mapServices to add
	 */
	public void addMapServices(String _mapServices) {
		this._mapServices.add(_mapServices.toString());
	}
	/**
	 * @return the unMapServices
	 */
	public List<String> getUnMapServices() {
		return this._unMapServices;
	}
	/**
	 * @param unMapServices the unMapServices to add
	 */
	public void addUnMapServices(String _unMapServices) {
		this._unMapServices.add(_unMapServices.toString());
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