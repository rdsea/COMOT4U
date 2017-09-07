package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the HwISA stereotype
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

public class HwISA {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute family.
	*/ 
	private List<String> _family = new ArrayList<String>();
	

		
	/*
	Variable for the attribute inst_Width.
	*/ 
	private List<String> _inst_Width = new ArrayList<String>();
	

		
	/*
	Variable for the attribute type.
	*/ 
	private List<String> _type = new ArrayList<String>();
	

		
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
	public String __type = new String ("HwISA");

	public HwISA() {
		/*
		Variable for the attribute family.
		*/ 
		this._family = new ArrayList<String>();
		/*
		Variable for the attribute inst_Width.
		*/ 
		this._inst_Width = new ArrayList<String>();
		/*
		Variable for the attribute type.
		*/ 
		this._type = new ArrayList<String>();
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
		// TODO Auto-generated method to test the HwISA POJO class
		
		HwISA _stereo = new HwISA();
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
	 * @return the family
	 */
	public List<String> getFamily() {
		return this._family;
	}
	/**
	 * @param family the family to add
	 */
	public void addFamily(String _family) {
		this._family.add(_family.toString());
	}
	/**
	 * @return the inst_Width
	 */
	public List<String> getInst_Width() {
		return this._inst_Width;
	}
	/**
	 * @param inst_Width the inst_Width to add
	 */
	public void addInst_Width(String _inst_Width) {
		this._inst_Width.add(_inst_Width.toString());
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