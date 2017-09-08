package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the SaSharedResource stereotype
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

public class SaSharedResource {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute capacity.
	*/ 
	private List<String> _capacity = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isPreemp.
	*/ 
	private List<String> _isPreemp = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isConsum.
	*/ 
	private List<String> _isConsum = new ArrayList<String>();
	

		
	/*
	Variable for the attribute acquisT.
	*/ 
	private List<String> _acquisT = new ArrayList<String>();
	

		
	/*
	Variable for the attribute releaseT.
	*/ 
	private List<String> _releaseT = new ArrayList<String>();
	

		
	/*
	Variable for the attribute protectKind.
	*/ 
	private List<String> _protectKind = new ArrayList<String>();
	

		
	/*
	Variable for the attribute ceiling.
	*/ 
	private List<String> _ceiling = new ArrayList<String>();
	

		
	/*
	Variable for the attribute otherProtectProtocol.
	*/ 
	private List<String> _otherProtectProtocol = new ArrayList<String>();
	

		
	/*
	Variable for the attribute scheduler.
	*/ 
	private List<String> _scheduler = new ArrayList<String>();
	

		
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
	public String __type = new String ("SaSharedResource");

	public SaSharedResource() {
		/*
		Variable for the attribute capacity.
		*/ 
		this._capacity = new ArrayList<String>();
		/*
		Variable for the attribute isPreemp.
		*/ 
		this._isPreemp = new ArrayList<String>();
		/*
		Variable for the attribute isConsum.
		*/ 
		this._isConsum = new ArrayList<String>();
		/*
		Variable for the attribute acquisT.
		*/ 
		this._acquisT = new ArrayList<String>();
		/*
		Variable for the attribute releaseT.
		*/ 
		this._releaseT = new ArrayList<String>();
		/*
		Variable for the attribute protectKind.
		*/ 
		this._protectKind = new ArrayList<String>();
		/*
		Variable for the attribute ceiling.
		*/ 
		this._ceiling = new ArrayList<String>();
		/*
		Variable for the attribute otherProtectProtocol.
		*/ 
		this._otherProtectProtocol = new ArrayList<String>();
		/*
		Variable for the attribute scheduler.
		*/ 
		this._scheduler = new ArrayList<String>();
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
		// TODO Auto-generated method to test the SaSharedResource POJO class
		
		SaSharedResource _stereo = new SaSharedResource();
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
	 * @return the capacity
	 */
	public List<String> getCapacity() {
		return this._capacity;
	}
	/**
	 * @param capacity the capacity to add
	 */
	public void addCapacity(String _capacity) {
		this._capacity.add(_capacity.toString());
	}
	/**
	 * @return the isPreemp
	 */
	public List<String> getIsPreemp() {
		return this._isPreemp;
	}
	/**
	 * @param isPreemp the isPreemp to add
	 */
	public void addIsPreemp(String _isPreemp) {
		this._isPreemp.add(_isPreemp.toString());
	}
	/**
	 * @return the isConsum
	 */
	public List<String> getIsConsum() {
		return this._isConsum;
	}
	/**
	 * @param isConsum the isConsum to add
	 */
	public void addIsConsum(String _isConsum) {
		this._isConsum.add(_isConsum.toString());
	}
	/**
	 * @return the acquisT
	 */
	public List<String> getAcquisT() {
		return this._acquisT;
	}
	/**
	 * @param acquisT the acquisT to add
	 */
	public void addAcquisT(String _acquisT) {
		this._acquisT.add(_acquisT.toString());
	}
	/**
	 * @return the releaseT
	 */
	public List<String> getReleaseT() {
		return this._releaseT;
	}
	/**
	 * @param releaseT the releaseT to add
	 */
	public void addReleaseT(String _releaseT) {
		this._releaseT.add(_releaseT.toString());
	}
	/**
	 * @return the protectKind
	 */
	public List<String> getProtectKind() {
		return this._protectKind;
	}
	/**
	 * @param protectKind the protectKind to add
	 */
	public void addProtectKind(String _protectKind) {
		this._protectKind.add(_protectKind.toString());
	}
	/**
	 * @return the ceiling
	 */
	public List<String> getCeiling() {
		return this._ceiling;
	}
	/**
	 * @param ceiling the ceiling to add
	 */
	public void addCeiling(String _ceiling) {
		this._ceiling.add(_ceiling.toString());
	}
	/**
	 * @return the otherProtectProtocol
	 */
	public List<String> getOtherProtectProtocol() {
		return this._otherProtectProtocol;
	}
	/**
	 * @param otherProtectProtocol the otherProtectProtocol to add
	 */
	public void addOtherProtectProtocol(String _otherProtectProtocol) {
		this._otherProtectProtocol.add(_otherProtectProtocol.toString());
	}
	/**
	 * @return the scheduler
	 */
	public List<String> getScheduler() {
		return this._scheduler;
	}
	/**
	 * @param scheduler the scheduler to add
	 */
	public void addScheduler(String _scheduler) {
		this._scheduler.add(_scheduler.toString());
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