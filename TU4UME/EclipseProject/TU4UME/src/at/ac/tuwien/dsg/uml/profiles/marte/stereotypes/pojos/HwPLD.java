package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the HwPLD stereotype
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

public class HwPLD {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute technology.
	*/ 
	private List<String> _technology = new ArrayList<String>();
	

		
	/*
	Variable for the attribute organization.
	*/ 
	private List<String> _organization = new ArrayList<String>();
	

		
	/*
	Variable for the attribute nbLUTs.
	*/ 
	private List<String> _nbLUTs = new ArrayList<String>();
	

		
	/*
	Variable for the attribute ndLUT_Inputs.
	*/ 
	private List<String> _ndLUT_Inputs = new ArrayList<String>();
	

		
	/*
	Variable for the attribute nbFlipFlops.
	*/ 
	private List<String> _nbFlipFlops = new ArrayList<String>();
	

		
	/*
	Variable for the attribute blocksRAM.
	*/ 
	private List<String> _blocksRAM = new ArrayList<String>();
	

		
	/*
	Variable for the attribute blocksComputing.
	*/ 
	private List<String> _blocksComputing = new ArrayList<String>();
	

		
	/*
	Variable for the attribute op_Frequencies.
	*/ 
	private List<String> _op_Frequencies = new ArrayList<String>();
	

		
	/*
	Variable for the attribute speedFactor.
	*/ 
	private List<String> _speedFactor = new ArrayList<String>();
	

		
	/*
	Variable for the attribute mainScheduler.
	*/ 
	private List<String> _mainScheduler = new ArrayList<String>();
	

		
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
	public String __type = new String ("HwPLD");

	public HwPLD() {
		/*
		Variable for the attribute technology.
		*/ 
		this._technology = new ArrayList<String>();
		/*
		Variable for the attribute organization.
		*/ 
		this._organization = new ArrayList<String>();
		/*
		Variable for the attribute nbLUTs.
		*/ 
		this._nbLUTs = new ArrayList<String>();
		/*
		Variable for the attribute ndLUT_Inputs.
		*/ 
		this._ndLUT_Inputs = new ArrayList<String>();
		/*
		Variable for the attribute nbFlipFlops.
		*/ 
		this._nbFlipFlops = new ArrayList<String>();
		/*
		Variable for the attribute blocksRAM.
		*/ 
		this._blocksRAM = new ArrayList<String>();
		/*
		Variable for the attribute blocksComputing.
		*/ 
		this._blocksComputing = new ArrayList<String>();
		/*
		Variable for the attribute op_Frequencies.
		*/ 
		this._op_Frequencies = new ArrayList<String>();
		/*
		Variable for the attribute speedFactor.
		*/ 
		this._speedFactor = new ArrayList<String>();
		/*
		Variable for the attribute mainScheduler.
		*/ 
		this._mainScheduler = new ArrayList<String>();
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
		// TODO Auto-generated method to test the HwPLD POJO class
		
		HwPLD _stereo = new HwPLD();
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
	 * @return the technology
	 */
	public List<String> getTechnology() {
		return this._technology;
	}
	/**
	 * @param technology the technology to add
	 */
	public void addTechnology(String _technology) {
		this._technology.add(_technology.toString());
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
	 * @return the nbLUTs
	 */
	public List<String> getNbLUTs() {
		return this._nbLUTs;
	}
	/**
	 * @param nbLUTs the nbLUTs to add
	 */
	public void addNbLUTs(String _nbLUTs) {
		this._nbLUTs.add(_nbLUTs.toString());
	}
	/**
	 * @return the ndLUT_Inputs
	 */
	public List<String> getNdLUT_Inputs() {
		return this._ndLUT_Inputs;
	}
	/**
	 * @param ndLUT_Inputs the ndLUT_Inputs to add
	 */
	public void addNdLUT_Inputs(String _ndLUT_Inputs) {
		this._ndLUT_Inputs.add(_ndLUT_Inputs.toString());
	}
	/**
	 * @return the nbFlipFlops
	 */
	public List<String> getNbFlipFlops() {
		return this._nbFlipFlops;
	}
	/**
	 * @param nbFlipFlops the nbFlipFlops to add
	 */
	public void addNbFlipFlops(String _nbFlipFlops) {
		this._nbFlipFlops.add(_nbFlipFlops.toString());
	}
	/**
	 * @return the blocksRAM
	 */
	public List<String> getBlocksRAM() {
		return this._blocksRAM;
	}
	/**
	 * @param blocksRAM the blocksRAM to add
	 */
	public void addBlocksRAM(String _blocksRAM) {
		this._blocksRAM.add(_blocksRAM.toString());
	}
	/**
	 * @return the blocksComputing
	 */
	public List<String> getBlocksComputing() {
		return this._blocksComputing;
	}
	/**
	 * @param blocksComputing the blocksComputing to add
	 */
	public void addBlocksComputing(String _blocksComputing) {
		this._blocksComputing.add(_blocksComputing.toString());
	}
	/**
	 * @return the op_Frequencies
	 */
	public List<String> getOp_Frequencies() {
		return this._op_Frequencies;
	}
	/**
	 * @param op_Frequencies the op_Frequencies to add
	 */
	public void addOp_Frequencies(String _op_Frequencies) {
		this._op_Frequencies.add(_op_Frequencies.toString());
	}
	/**
	 * @return the speedFactor
	 */
	public List<String> getSpeedFactor() {
		return this._speedFactor;
	}
	/**
	 * @param speedFactor the speedFactor to add
	 */
	public void addSpeedFactor(String _speedFactor) {
		this._speedFactor.add(_speedFactor.toString());
	}
	/**
	 * @return the mainScheduler
	 */
	public List<String> getMainScheduler() {
		return this._mainScheduler;
	}
	/**
	 * @param mainScheduler the mainScheduler to add
	 */
	public void addMainScheduler(String _mainScheduler) {
		this._mainScheduler.add(_mainScheduler.toString());
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