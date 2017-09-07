package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the Scheduler stereotype
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

public class Scheduler {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute isPreemptible.
	*/ 
	private List<String> _isPreemptible = new ArrayList<String>();
	

		
	/*
	Variable for the attribute schedPolicy.
	*/ 
	private List<String> _schedPolicy = new ArrayList<String>();
	

		
	/*
	Variable for the attribute otherSchedPolicy.
	*/ 
	private List<String> _otherSchedPolicy = new ArrayList<String>();
	

		
	/*
	Variable for the attribute schedule.
	*/ 
	private List<String> _schedule = new ArrayList<String>();
	

		
	/*
	Variable for the attribute processingUnits.
	*/ 
	private List<String> _processingUnits = new ArrayList<String>();
	

		
	/*
	Variable for the attribute host.
	*/ 
	private List<String> _host = new ArrayList<String>();
	

		
	/*
	Variable for the attribute protectedSharedResources.
	*/ 
	private List<String> _protectedSharedResources = new ArrayList<String>();
	

		
	/*
	Variable for the attribute schedulableResources.
	*/ 
	private List<String> _schedulableResources = new ArrayList<String>();
	

		
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
	public String __type = new String ("Scheduler");

	public Scheduler() {
		/*
		Variable for the attribute isPreemptible.
		*/ 
		this._isPreemptible = new ArrayList<String>();
		/*
		Variable for the attribute schedPolicy.
		*/ 
		this._schedPolicy = new ArrayList<String>();
		/*
		Variable for the attribute otherSchedPolicy.
		*/ 
		this._otherSchedPolicy = new ArrayList<String>();
		/*
		Variable for the attribute schedule.
		*/ 
		this._schedule = new ArrayList<String>();
		/*
		Variable for the attribute processingUnits.
		*/ 
		this._processingUnits = new ArrayList<String>();
		/*
		Variable for the attribute host.
		*/ 
		this._host = new ArrayList<String>();
		/*
		Variable for the attribute protectedSharedResources.
		*/ 
		this._protectedSharedResources = new ArrayList<String>();
		/*
		Variable for the attribute schedulableResources.
		*/ 
		this._schedulableResources = new ArrayList<String>();
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
		// TODO Auto-generated method to test the Scheduler POJO class
		
		Scheduler _stereo = new Scheduler();
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
	 * @return the isPreemptible
	 */
	public List<String> getIsPreemptible() {
		return this._isPreemptible;
	}
	/**
	 * @param isPreemptible the isPreemptible to add
	 */
	public void addIsPreemptible(String _isPreemptible) {
		this._isPreemptible.add(_isPreemptible.toString());
	}
	/**
	 * @return the schedPolicy
	 */
	public List<String> getSchedPolicy() {
		return this._schedPolicy;
	}
	/**
	 * @param schedPolicy the schedPolicy to add
	 */
	public void addSchedPolicy(String _schedPolicy) {
		this._schedPolicy.add(_schedPolicy.toString());
	}
	/**
	 * @return the otherSchedPolicy
	 */
	public List<String> getOtherSchedPolicy() {
		return this._otherSchedPolicy;
	}
	/**
	 * @param otherSchedPolicy the otherSchedPolicy to add
	 */
	public void addOtherSchedPolicy(String _otherSchedPolicy) {
		this._otherSchedPolicy.add(_otherSchedPolicy.toString());
	}
	/**
	 * @return the schedule
	 */
	public List<String> getSchedule() {
		return this._schedule;
	}
	/**
	 * @param schedule the schedule to add
	 */
	public void addSchedule(String _schedule) {
		this._schedule.add(_schedule.toString());
	}
	/**
	 * @return the processingUnits
	 */
	public List<String> getProcessingUnits() {
		return this._processingUnits;
	}
	/**
	 * @param processingUnits the processingUnits to add
	 */
	public void addProcessingUnits(String _processingUnits) {
		this._processingUnits.add(_processingUnits.toString());
	}
	/**
	 * @return the host
	 */
	public List<String> getHost() {
		return this._host;
	}
	/**
	 * @param host the host to add
	 */
	public void addHost(String _host) {
		this._host.add(_host.toString());
	}
	/**
	 * @return the protectedSharedResources
	 */
	public List<String> getProtectedSharedResources() {
		return this._protectedSharedResources;
	}
	/**
	 * @param protectedSharedResources the protectedSharedResources to add
	 */
	public void addProtectedSharedResources(String _protectedSharedResources) {
		this._protectedSharedResources.add(_protectedSharedResources.toString());
	}
	/**
	 * @return the schedulableResources
	 */
	public List<String> getSchedulableResources() {
		return this._schedulableResources;
	}
	/**
	 * @param schedulableResources the schedulableResources to add
	 */
	public void addSchedulableResources(String _schedulableResources) {
		this._schedulableResources.add(_schedulableResources.toString());
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