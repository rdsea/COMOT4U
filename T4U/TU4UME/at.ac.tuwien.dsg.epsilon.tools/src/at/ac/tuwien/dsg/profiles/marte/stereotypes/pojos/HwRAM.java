package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the HwRAM stereotype
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

public class HwRAM {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute organization.
	*/ 
	private List<String> _organization = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isSynchronous.
	*/ 
	private List<String> _isSynchronous = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isStatic.
	*/ 
	private List<String> _isStatic = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isNonVolatile.
	*/ 
	private List<String> _isNonVolatile = new ArrayList<String>();
	

		
	/*
	Variable for the attribute repl_Policy.
	*/ 
	private List<String> _repl_Policy = new ArrayList<String>();
	

		
	/*
	Variable for the attribute writePolicy.
	*/ 
	private List<String> _writePolicy = new ArrayList<String>();
	

		
	/*
	Variable for the attribute memorySize.
	*/ 
	private List<String> _memorySize = new ArrayList<String>();
	

		
	/*
	Variable for the attribute adressSize.
	*/ 
	private List<String> _adressSize = new ArrayList<String>();
	

		
	/*
	Variable for the attribute timings.
	*/ 
	private List<String> _timings = new ArrayList<String>();
	

		
	/*
	Variable for the attribute throughput.
	*/ 
	private List<String> _throughput = new ArrayList<String>();
	

		
	/*
	Variable for the attribute elementSize.
	*/ 
	private List<String> _elementSize = new ArrayList<String>();
	

		
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
	Variable for the attribute description.
	*/ 
	private List<String> _description = new ArrayList<String>();
	

		
	/*
	Variable for the attribute frequency.
	*/ 
	private List<String> _frequency = new ArrayList<String>();
	

		
	/*
	Variable for the attribute endPoints.
	*/ 
	private List<String> _endPoints = new ArrayList<String>();
	

		
	/*
	Variable for the attribute p_HW_Services.
	*/ 
	private List<String> _p_HW_Services = new ArrayList<String>();
	

		
	/*
	Variable for the attribute r_HW_Services.
	*/ 
	private List<String> _r_HW_Services = new ArrayList<String>();
	

		
	/*
	Variable for the attribute ownedHW.
	*/ 
	private List<String> _ownedHW = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("HwRAM");

	public HwRAM() {
		/*
		Variable for the attribute organization.
		*/ 
		this._organization = new ArrayList<String>();
		/*
		Variable for the attribute isSynchronous.
		*/ 
		this._isSynchronous = new ArrayList<String>();
		/*
		Variable for the attribute isStatic.
		*/ 
		this._isStatic = new ArrayList<String>();
		/*
		Variable for the attribute isNonVolatile.
		*/ 
		this._isNonVolatile = new ArrayList<String>();
		/*
		Variable for the attribute repl_Policy.
		*/ 
		this._repl_Policy = new ArrayList<String>();
		/*
		Variable for the attribute writePolicy.
		*/ 
		this._writePolicy = new ArrayList<String>();
		/*
		Variable for the attribute memorySize.
		*/ 
		this._memorySize = new ArrayList<String>();
		/*
		Variable for the attribute adressSize.
		*/ 
		this._adressSize = new ArrayList<String>();
		/*
		Variable for the attribute timings.
		*/ 
		this._timings = new ArrayList<String>();
		/*
		Variable for the attribute throughput.
		*/ 
		this._throughput = new ArrayList<String>();
		/*
		Variable for the attribute elementSize.
		*/ 
		this._elementSize = new ArrayList<String>();
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
		/*
		Variable for the attribute description.
		*/ 
		this._description = new ArrayList<String>();
		/*
		Variable for the attribute frequency.
		*/ 
		this._frequency = new ArrayList<String>();
		/*
		Variable for the attribute endPoints.
		*/ 
		this._endPoints = new ArrayList<String>();
		/*
		Variable for the attribute p_HW_Services.
		*/ 
		this._p_HW_Services = new ArrayList<String>();
		/*
		Variable for the attribute r_HW_Services.
		*/ 
		this._r_HW_Services = new ArrayList<String>();
		/*
		Variable for the attribute ownedHW.
		*/ 
		this._ownedHW = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the HwRAM POJO class
		
		HwRAM _stereo = new HwRAM();
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
	 * @return the organization
	 */
	public List<String> getOrganization() {
		return this._organization;
	}
	/**
	 * @param organization the organization to add
	 */
	public void addOrganization(String _organization) {
		this._organization.add(_organization.toString());
	}
	/**
	 * @return the isSynchronous
	 */
	public List<String> getIsSynchronous() {
		return this._isSynchronous;
	}
	/**
	 * @param isSynchronous the isSynchronous to add
	 */
	public void addIsSynchronous(String _isSynchronous) {
		this._isSynchronous.add(_isSynchronous.toString());
	}
	/**
	 * @return the isStatic
	 */
	public List<String> getIsStatic() {
		return this._isStatic;
	}
	/**
	 * @param isStatic the isStatic to add
	 */
	public void addIsStatic(String _isStatic) {
		this._isStatic.add(_isStatic.toString());
	}
	/**
	 * @return the isNonVolatile
	 */
	public List<String> getIsNonVolatile() {
		return this._isNonVolatile;
	}
	/**
	 * @param isNonVolatile the isNonVolatile to add
	 */
	public void addIsNonVolatile(String _isNonVolatile) {
		this._isNonVolatile.add(_isNonVolatile.toString());
	}
	/**
	 * @return the repl_Policy
	 */
	public List<String> getRepl_Policy() {
		return this._repl_Policy;
	}
	/**
	 * @param repl_Policy the repl_Policy to add
	 */
	public void addRepl_Policy(String _repl_Policy) {
		this._repl_Policy.add(_repl_Policy.toString());
	}
	/**
	 * @return the writePolicy
	 */
	public List<String> getWritePolicy() {
		return this._writePolicy;
	}
	/**
	 * @param writePolicy the writePolicy to add
	 */
	public void addWritePolicy(String _writePolicy) {
		this._writePolicy.add(_writePolicy.toString());
	}
	/**
	 * @return the memorySize
	 */
	public List<String> getMemorySize() {
		return this._memorySize;
	}
	/**
	 * @param memorySize the memorySize to add
	 */
	public void addMemorySize(String _memorySize) {
		this._memorySize.add(_memorySize.toString());
	}
	/**
	 * @return the adressSize
	 */
	public List<String> getAdressSize() {
		return this._adressSize;
	}
	/**
	 * @param adressSize the adressSize to add
	 */
	public void addAdressSize(String _adressSize) {
		this._adressSize.add(_adressSize.toString());
	}
	/**
	 * @return the timings
	 */
	public List<String> getTimings() {
		return this._timings;
	}
	/**
	 * @param timings the timings to add
	 */
	public void addTimings(String _timings) {
		this._timings.add(_timings.toString());
	}
	/**
	 * @return the throughput
	 */
	public List<String> getThroughput() {
		return this._throughput;
	}
	/**
	 * @param throughput the throughput to add
	 */
	public void addThroughput(String _throughput) {
		this._throughput.add(_throughput.toString());
	}
	/**
	 * @return the elementSize
	 */
	public List<String> getElementSize() {
		return this._elementSize;
	}
	/**
	 * @param elementSize the elementSize to add
	 */
	public void addElementSize(String _elementSize) {
		this._elementSize.add(_elementSize.toString());
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
	 * @return the frequency
	 */
	public List<String> getFrequency() {
		return this._frequency;
	}
	/**
	 * @param frequency the frequency to add
	 */
	public void addFrequency(String _frequency) {
		this._frequency.add(_frequency.toString());
	}
	/**
	 * @return the endPoints
	 */
	public List<String> getEndPoints() {
		return this._endPoints;
	}
	/**
	 * @param endPoints the endPoints to add
	 */
	public void addEndPoints(String _endPoints) {
		this._endPoints.add(_endPoints.toString());
	}
	/**
	 * @return the p_HW_Services
	 */
	public List<String> getP_HW_Services() {
		return this._p_HW_Services;
	}
	/**
	 * @param p_HW_Services the p_HW_Services to add
	 */
	public void addP_HW_Services(String _p_HW_Services) {
		this._p_HW_Services.add(_p_HW_Services.toString());
	}
	/**
	 * @return the r_HW_Services
	 */
	public List<String> getR_HW_Services() {
		return this._r_HW_Services;
	}
	/**
	 * @param r_HW_Services the r_HW_Services to add
	 */
	public void addR_HW_Services(String _r_HW_Services) {
		this._r_HW_Services.add(_r_HW_Services.toString());
	}
	/**
	 * @return the ownedHW
	 */
	public List<String> getOwnedHW() {
		return this._ownedHW;
	}
	/**
	 * @param ownedHW the ownedHW to add
	 */
	public void addOwnedHW(String _ownedHW) {
		this._ownedHW.add(_ownedHW.toString());
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