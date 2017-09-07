package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the HwProcessor stereotype
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

public class HwProcessor {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute architecture.
	*/ 
	private List<String> _architecture = new ArrayList<String>();
	

		
	/*
	Variable for the attribute mips.
	*/ 
	private List<String> _mips = new ArrayList<String>();
	

		
	/*
	Variable for the attribute ipc.
	*/ 
	private List<String> _ipc = new ArrayList<String>();
	

		
	/*
	Variable for the attribute nbCores.
	*/ 
	private List<String> _nbCores = new ArrayList<String>();
	

		
	/*
	Variable for the attribute nbPipelines.
	*/ 
	private List<String> _nbPipelines = new ArrayList<String>();
	

		
	/*
	Variable for the attribute nbStages.
	*/ 
	private List<String> _nbStages = new ArrayList<String>();
	

		
	/*
	Variable for the attribute nbALUs.
	*/ 
	private List<String> _nbALUs = new ArrayList<String>();
	

		
	/*
	Variable for the attribute nbFPUs.
	*/ 
	private List<String> _nbFPUs = new ArrayList<String>();
	

		
	/*
	Variable for the attribute ownedISAs.
	*/ 
	private List<String> _ownedISAs = new ArrayList<String>();
	

		
	/*
	Variable for the attribute predictors.
	*/ 
	private List<String> _predictors = new ArrayList<String>();
	

		
	/*
	Variable for the attribute caches.
	*/ 
	private List<String> _caches = new ArrayList<String>();
	

		
	/*
	Variable for the attribute ownedMMUs.
	*/ 
	private List<String> _ownedMMUs = new ArrayList<String>();
	

		
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
	public String __type = new String ("HwProcessor");

	public HwProcessor() {
		/*
		Variable for the attribute architecture.
		*/ 
		this._architecture = new ArrayList<String>();
		/*
		Variable for the attribute mips.
		*/ 
		this._mips = new ArrayList<String>();
		/*
		Variable for the attribute ipc.
		*/ 
		this._ipc = new ArrayList<String>();
		/*
		Variable for the attribute nbCores.
		*/ 
		this._nbCores = new ArrayList<String>();
		/*
		Variable for the attribute nbPipelines.
		*/ 
		this._nbPipelines = new ArrayList<String>();
		/*
		Variable for the attribute nbStages.
		*/ 
		this._nbStages = new ArrayList<String>();
		/*
		Variable for the attribute nbALUs.
		*/ 
		this._nbALUs = new ArrayList<String>();
		/*
		Variable for the attribute nbFPUs.
		*/ 
		this._nbFPUs = new ArrayList<String>();
		/*
		Variable for the attribute ownedISAs.
		*/ 
		this._ownedISAs = new ArrayList<String>();
		/*
		Variable for the attribute predictors.
		*/ 
		this._predictors = new ArrayList<String>();
		/*
		Variable for the attribute caches.
		*/ 
		this._caches = new ArrayList<String>();
		/*
		Variable for the attribute ownedMMUs.
		*/ 
		this._ownedMMUs = new ArrayList<String>();
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
		// TODO Auto-generated method to test the HwProcessor POJO class
		
		HwProcessor _stereo = new HwProcessor();
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
	 * @return the architecture
	 */
	public List<String> getArchitecture() {
		return this._architecture;
	}
	/**
	 * @param architecture the architecture to add
	 */
	public void addArchitecture(String _architecture) {
		this._architecture.add(_architecture.toString());
	}
	/**
	 * @return the mips
	 */
	public List<String> getMips() {
		return this._mips;
	}
	/**
	 * @param mips the mips to add
	 */
	public void addMips(String _mips) {
		this._mips.add(_mips.toString());
	}
	/**
	 * @return the ipc
	 */
	public List<String> getIpc() {
		return this._ipc;
	}
	/**
	 * @param ipc the ipc to add
	 */
	public void addIpc(String _ipc) {
		this._ipc.add(_ipc.toString());
	}
	/**
	 * @return the nbCores
	 */
	public List<String> getNbCores() {
		return this._nbCores;
	}
	/**
	 * @param nbCores the nbCores to add
	 */
	public void addNbCores(String _nbCores) {
		this._nbCores.add(_nbCores.toString());
	}
	/**
	 * @return the nbPipelines
	 */
	public List<String> getNbPipelines() {
		return this._nbPipelines;
	}
	/**
	 * @param nbPipelines the nbPipelines to add
	 */
	public void addNbPipelines(String _nbPipelines) {
		this._nbPipelines.add(_nbPipelines.toString());
	}
	/**
	 * @return the nbStages
	 */
	public List<String> getNbStages() {
		return this._nbStages;
	}
	/**
	 * @param nbStages the nbStages to add
	 */
	public void addNbStages(String _nbStages) {
		this._nbStages.add(_nbStages.toString());
	}
	/**
	 * @return the nbALUs
	 */
	public List<String> getNbALUs() {
		return this._nbALUs;
	}
	/**
	 * @param nbALUs the nbALUs to add
	 */
	public void addNbALUs(String _nbALUs) {
		this._nbALUs.add(_nbALUs.toString());
	}
	/**
	 * @return the nbFPUs
	 */
	public List<String> getNbFPUs() {
		return this._nbFPUs;
	}
	/**
	 * @param nbFPUs the nbFPUs to add
	 */
	public void addNbFPUs(String _nbFPUs) {
		this._nbFPUs.add(_nbFPUs.toString());
	}
	/**
	 * @return the ownedISAs
	 */
	public List<String> getOwnedISAs() {
		return this._ownedISAs;
	}
	/**
	 * @param ownedISAs the ownedISAs to add
	 */
	public void addOwnedISAs(String _ownedISAs) {
		this._ownedISAs.add(_ownedISAs.toString());
	}
	/**
	 * @return the predictors
	 */
	public List<String> getPredictors() {
		return this._predictors;
	}
	/**
	 * @param predictors the predictors to add
	 */
	public void addPredictors(String _predictors) {
		this._predictors.add(_predictors.toString());
	}
	/**
	 * @return the caches
	 */
	public List<String> getCaches() {
		return this._caches;
	}
	/**
	 * @param caches the caches to add
	 */
	public void addCaches(String _caches) {
		this._caches.add(_caches.toString());
	}
	/**
	 * @return the ownedMMUs
	 */
	public List<String> getOwnedMMUs() {
		return this._ownedMMUs;
	}
	/**
	 * @param ownedMMUs the ownedMMUs to add
	 */
	public void addOwnedMMUs(String _ownedMMUs) {
		this._ownedMMUs.add(_ownedMMUs.toString());
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