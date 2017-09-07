package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the HwCoolingSupply stereotype
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

public class HwCoolingSupply {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute coolingPower.
	*/ 
	private List<String> _coolingPower = new ArrayList<String>();
	

		
	/*
	Variable for the attribute kind.
	*/ 
	private List<String> _kind = new ArrayList<String>();
	

		
	/*
	Variable for the attribute dimensions.
	*/ 
	private List<String> _dimensions = new ArrayList<String>();
	

		
	/*
	Variable for the attribute area.
	*/ 
	private List<String> _area = new ArrayList<String>();
	

		
	/*
	Variable for the attribute position.
	*/ 
	private List<String> _position = new ArrayList<String>();
	

		
	/*
	Variable for the attribute grid.
	*/ 
	private List<String> _grid = new ArrayList<String>();
	

		
	/*
	Variable for the attribute nbPins.
	*/ 
	private List<String> _nbPins = new ArrayList<String>();
	

		
	/*
	Variable for the attribute weight.
	*/ 
	private List<String> _weight = new ArrayList<String>();
	

		
	/*
	Variable for the attribute price.
	*/ 
	private List<String> _price = new ArrayList<String>();
	

		
	/*
	Variable for the attribute r_Conditions.
	*/ 
	private List<String> _r_Conditions = new ArrayList<String>();
	

		
	/*
	Variable for the attribute poweredServices.
	*/ 
	private List<String> _poweredServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute staticConsumption.
	*/ 
	private List<String> _staticConsumption = new ArrayList<String>();
	

		
	/*
	Variable for the attribute staticDissipation.
	*/ 
	private List<String> _staticDissipation = new ArrayList<String>();
	

		
	/*
	Variable for the attribute subComponents.
	*/ 
	private List<String> _subComponents = new ArrayList<String>();
	

		
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
	public String __type = new String ("HwCoolingSupply");

	public HwCoolingSupply() {
		/*
		Variable for the attribute coolingPower.
		*/ 
		this._coolingPower = new ArrayList<String>();
		/*
		Variable for the attribute kind.
		*/ 
		this._kind = new ArrayList<String>();
		/*
		Variable for the attribute dimensions.
		*/ 
		this._dimensions = new ArrayList<String>();
		/*
		Variable for the attribute area.
		*/ 
		this._area = new ArrayList<String>();
		/*
		Variable for the attribute position.
		*/ 
		this._position = new ArrayList<String>();
		/*
		Variable for the attribute grid.
		*/ 
		this._grid = new ArrayList<String>();
		/*
		Variable for the attribute nbPins.
		*/ 
		this._nbPins = new ArrayList<String>();
		/*
		Variable for the attribute weight.
		*/ 
		this._weight = new ArrayList<String>();
		/*
		Variable for the attribute price.
		*/ 
		this._price = new ArrayList<String>();
		/*
		Variable for the attribute r_Conditions.
		*/ 
		this._r_Conditions = new ArrayList<String>();
		/*
		Variable for the attribute poweredServices.
		*/ 
		this._poweredServices = new ArrayList<String>();
		/*
		Variable for the attribute staticConsumption.
		*/ 
		this._staticConsumption = new ArrayList<String>();
		/*
		Variable for the attribute staticDissipation.
		*/ 
		this._staticDissipation = new ArrayList<String>();
		/*
		Variable for the attribute subComponents.
		*/ 
		this._subComponents = new ArrayList<String>();
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
		// TODO Auto-generated method to test the HwCoolingSupply POJO class
		
		HwCoolingSupply _stereo = new HwCoolingSupply();
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
	 * @return the coolingPower
	 */
	public List<String> getCoolingPower() {
		return this._coolingPower;
	}
	/**
	 * @param coolingPower the coolingPower to add
	 */
	public void addCoolingPower(String _coolingPower) {
		this._coolingPower.add(_coolingPower.toString());
	}
	/**
	 * @return the kind
	 */
	public List<String> getKind() {
		return this._kind;
	}
	/**
	 * @param kind the kind to add
	 */
	public void addKind(String _kind) {
		this._kind.add(_kind.toString());
	}
	/**
	 * @return the dimensions
	 */
	public List<String> getDimensions() {
		return this._dimensions;
	}
	/**
	 * @param dimensions the dimensions to add
	 */
	public void addDimensions(String _dimensions) {
		this._dimensions.add(_dimensions.toString());
	}
	/**
	 * @return the area
	 */
	public List<String> getArea() {
		return this._area;
	}
	/**
	 * @param area the area to add
	 */
	public void addArea(String _area) {
		this._area.add(_area.toString());
	}
	/**
	 * @return the position
	 */
	public List<String> getPosition() {
		return this._position;
	}
	/**
	 * @param position the position to add
	 */
	public void addPosition(String _position) {
		this._position.add(_position.toString());
	}
	/**
	 * @return the grid
	 */
	public List<String> getGrid() {
		return this._grid;
	}
	/**
	 * @param grid the grid to add
	 */
	public void addGrid(String _grid) {
		this._grid.add(_grid.toString());
	}
	/**
	 * @return the nbPins
	 */
	public List<String> getNbPins() {
		return this._nbPins;
	}
	/**
	 * @param nbPins the nbPins to add
	 */
	public void addNbPins(String _nbPins) {
		this._nbPins.add(_nbPins.toString());
	}
	/**
	 * @return the weight
	 */
	public List<String> getWeight() {
		return this._weight;
	}
	/**
	 * @param weight the weight to add
	 */
	public void addWeight(String _weight) {
		this._weight.add(_weight.toString());
	}
	/**
	 * @return the price
	 */
	public List<String> getPrice() {
		return this._price;
	}
	/**
	 * @param price the price to add
	 */
	public void addPrice(String _price) {
		this._price.add(_price.toString());
	}
	/**
	 * @return the r_Conditions
	 */
	public List<String> getR_Conditions() {
		return this._r_Conditions;
	}
	/**
	 * @param r_Conditions the r_Conditions to add
	 */
	public void addR_Conditions(String _r_Conditions) {
		this._r_Conditions.add(_r_Conditions.toString());
	}
	/**
	 * @return the poweredServices
	 */
	public List<String> getPoweredServices() {
		return this._poweredServices;
	}
	/**
	 * @param poweredServices the poweredServices to add
	 */
	public void addPoweredServices(String _poweredServices) {
		this._poweredServices.add(_poweredServices.toString());
	}
	/**
	 * @return the staticConsumption
	 */
	public List<String> getStaticConsumption() {
		return this._staticConsumption;
	}
	/**
	 * @param staticConsumption the staticConsumption to add
	 */
	public void addStaticConsumption(String _staticConsumption) {
		this._staticConsumption.add(_staticConsumption.toString());
	}
	/**
	 * @return the staticDissipation
	 */
	public List<String> getStaticDissipation() {
		return this._staticDissipation;
	}
	/**
	 * @param staticDissipation the staticDissipation to add
	 */
	public void addStaticDissipation(String _staticDissipation) {
		this._staticDissipation.add(_staticDissipation.toString());
	}
	/**
	 * @return the subComponents
	 */
	public List<String> getSubComponents() {
		return this._subComponents;
	}
	/**
	 * @param subComponents the subComponents to add
	 */
	public void addSubComponents(String _subComponents) {
		this._subComponents.add(_subComponents.toString());
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