package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the RtUnit stereotype
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

public class RtUnit {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute isDynamic.
	*/ 
	private List<String> _isDynamic = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isMain.
	*/ 
	private List<String> _isMain = new ArrayList<String>();
	

		
	/*
	Variable for the attribute srPoolSize.
	*/ 
	private List<String> _srPoolSize = new ArrayList<String>();
	

		
	/*
	Variable for the attribute srPoolPolicy.
	*/ 
	private List<String> _srPoolPolicy = new ArrayList<String>();
	

		
	/*
	Variable for the attribute srPoolWaitingTime.
	*/ 
	private List<String> _srPoolWaitingTime = new ArrayList<String>();
	

		
	/*
	Variable for the attribute operationalMode.
	*/ 
	private List<String> _operationalMode = new ArrayList<String>();
	

		
	/*
	Variable for the attribute main.
	*/ 
	private List<String> _main = new ArrayList<String>();
	

		
	/*
	Variable for the attribute memorySize.
	*/ 
	private List<String> _memorySize = new ArrayList<String>();
	

		
	/*
	Variable for the attribute queueSchedPolicy.
	*/ 
	private List<String> _queueSchedPolicy = new ArrayList<String>();
	

		
	/*
	Variable for the attribute queueSize.
	*/ 
	private List<String> _queueSize = new ArrayList<String>();
	

		
	/*
	Variable for the attribute msgMaxSize.
	*/ 
	private List<String> _msgMaxSize = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("RtUnit");

	public RtUnit() {
		/*
		Variable for the attribute isDynamic.
		*/ 
		this._isDynamic = new ArrayList<String>();
		/*
		Variable for the attribute isMain.
		*/ 
		this._isMain = new ArrayList<String>();
		/*
		Variable for the attribute srPoolSize.
		*/ 
		this._srPoolSize = new ArrayList<String>();
		/*
		Variable for the attribute srPoolPolicy.
		*/ 
		this._srPoolPolicy = new ArrayList<String>();
		/*
		Variable for the attribute srPoolWaitingTime.
		*/ 
		this._srPoolWaitingTime = new ArrayList<String>();
		/*
		Variable for the attribute operationalMode.
		*/ 
		this._operationalMode = new ArrayList<String>();
		/*
		Variable for the attribute main.
		*/ 
		this._main = new ArrayList<String>();
		/*
		Variable for the attribute memorySize.
		*/ 
		this._memorySize = new ArrayList<String>();
		/*
		Variable for the attribute queueSchedPolicy.
		*/ 
		this._queueSchedPolicy = new ArrayList<String>();
		/*
		Variable for the attribute queueSize.
		*/ 
		this._queueSize = new ArrayList<String>();
		/*
		Variable for the attribute msgMaxSize.
		*/ 
		this._msgMaxSize = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the RtUnit POJO class
		
		RtUnit _stereo = new RtUnit();
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
	 * @return the isDynamic
	 */
	public List<String> getIsDynamic() {
		return this._isDynamic;
	}
	/**
	 * @param isDynamic the isDynamic to add
	 */
	public void addIsDynamic(String _isDynamic) {
		this._isDynamic.add(_isDynamic.toString());
	}
	/**
	 * @return the isMain
	 */
	public List<String> getIsMain() {
		return this._isMain;
	}
	/**
	 * @param isMain the isMain to add
	 */
	public void addIsMain(String _isMain) {
		this._isMain.add(_isMain.toString());
	}
	/**
	 * @return the srPoolSize
	 */
	public List<String> getSrPoolSize() {
		return this._srPoolSize;
	}
	/**
	 * @param srPoolSize the srPoolSize to add
	 */
	public void addSrPoolSize(String _srPoolSize) {
		this._srPoolSize.add(_srPoolSize.toString());
	}
	/**
	 * @return the srPoolPolicy
	 */
	public List<String> getSrPoolPolicy() {
		return this._srPoolPolicy;
	}
	/**
	 * @param srPoolPolicy the srPoolPolicy to add
	 */
	public void addSrPoolPolicy(String _srPoolPolicy) {
		this._srPoolPolicy.add(_srPoolPolicy.toString());
	}
	/**
	 * @return the srPoolWaitingTime
	 */
	public List<String> getSrPoolWaitingTime() {
		return this._srPoolWaitingTime;
	}
	/**
	 * @param srPoolWaitingTime the srPoolWaitingTime to add
	 */
	public void addSrPoolWaitingTime(String _srPoolWaitingTime) {
		this._srPoolWaitingTime.add(_srPoolWaitingTime.toString());
	}
	/**
	 * @return the operationalMode
	 */
	public List<String> getOperationalMode() {
		return this._operationalMode;
	}
	/**
	 * @param operationalMode the operationalMode to add
	 */
	public void addOperationalMode(String _operationalMode) {
		this._operationalMode.add(_operationalMode.toString());
	}
	/**
	 * @return the main
	 */
	public List<String> getMain() {
		return this._main;
	}
	/**
	 * @param main the main to add
	 */
	public void addMain(String _main) {
		this._main.add(_main.toString());
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
	 * @return the queueSchedPolicy
	 */
	public List<String> getQueueSchedPolicy() {
		return this._queueSchedPolicy;
	}
	/**
	 * @param queueSchedPolicy the queueSchedPolicy to add
	 */
	public void addQueueSchedPolicy(String _queueSchedPolicy) {
		this._queueSchedPolicy.add(_queueSchedPolicy.toString());
	}
	/**
	 * @return the queueSize
	 */
	public List<String> getQueueSize() {
		return this._queueSize;
	}
	/**
	 * @param queueSize the queueSize to add
	 */
	public void addQueueSize(String _queueSize) {
		this._queueSize.add(_queueSize.toString());
	}
	/**
	 * @return the msgMaxSize
	 */
	public List<String> getMsgMaxSize() {
		return this._msgMaxSize;
	}
	/**
	 * @param msgMaxSize the msgMaxSize to add
	 */
	public void addMsgMaxSize(String _msgMaxSize) {
		this._msgMaxSize.add(_msgMaxSize.toString());
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