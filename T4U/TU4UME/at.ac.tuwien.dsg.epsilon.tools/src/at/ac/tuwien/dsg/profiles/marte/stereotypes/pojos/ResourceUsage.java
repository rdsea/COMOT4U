package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the ResourceUsage stereotype
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

public class ResourceUsage {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute execTime.
	*/ 
	private List<String> _execTime = new ArrayList<String>();
	

		
	/*
	Variable for the attribute allocatedMemory.
	*/ 
	private List<String> _allocatedMemory = new ArrayList<String>();
	

		
	/*
	Variable for the attribute usedMemory.
	*/ 
	private List<String> _usedMemory = new ArrayList<String>();
	

		
	/*
	Variable for the attribute powerPeak.
	*/ 
	private List<String> _powerPeak = new ArrayList<String>();
	

		
	/*
	Variable for the attribute energy.
	*/ 
	private List<String> _energy = new ArrayList<String>();
	

		
	/*
	Variable for the attribute subUsage.
	*/ 
	private List<String> _subUsage = new ArrayList<String>();
	

		
	/*
	Variable for the attribute usedResources.
	*/ 
	private List<String> _usedResources = new ArrayList<String>();
	

		
	/*
	Variable for the attribute msgSize.
	*/ 
	private List<String> _msgSize = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("ResourceUsage");

	public ResourceUsage() {
		/*
		Variable for the attribute execTime.
		*/ 
		this._execTime = new ArrayList<String>();
		/*
		Variable for the attribute allocatedMemory.
		*/ 
		this._allocatedMemory = new ArrayList<String>();
		/*
		Variable for the attribute usedMemory.
		*/ 
		this._usedMemory = new ArrayList<String>();
		/*
		Variable for the attribute powerPeak.
		*/ 
		this._powerPeak = new ArrayList<String>();
		/*
		Variable for the attribute energy.
		*/ 
		this._energy = new ArrayList<String>();
		/*
		Variable for the attribute subUsage.
		*/ 
		this._subUsage = new ArrayList<String>();
		/*
		Variable for the attribute usedResources.
		*/ 
		this._usedResources = new ArrayList<String>();
		/*
		Variable for the attribute msgSize.
		*/ 
		this._msgSize = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ResourceUsage POJO class
		
		ResourceUsage _stereo = new ResourceUsage();
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
	 * @return the execTime
	 */
	public List<String> getExecTime() {
		return this._execTime;
	}
	/**
	 * @param execTime the execTime to add
	 */
	public void addExecTime(String _execTime) {
		this._execTime.add(_execTime.toString());
	}
	/**
	 * @return the allocatedMemory
	 */
	public List<String> getAllocatedMemory() {
		return this._allocatedMemory;
	}
	/**
	 * @param allocatedMemory the allocatedMemory to add
	 */
	public void addAllocatedMemory(String _allocatedMemory) {
		this._allocatedMemory.add(_allocatedMemory.toString());
	}
	/**
	 * @return the usedMemory
	 */
	public List<String> getUsedMemory() {
		return this._usedMemory;
	}
	/**
	 * @param usedMemory the usedMemory to add
	 */
	public void addUsedMemory(String _usedMemory) {
		this._usedMemory.add(_usedMemory.toString());
	}
	/**
	 * @return the powerPeak
	 */
	public List<String> getPowerPeak() {
		return this._powerPeak;
	}
	/**
	 * @param powerPeak the powerPeak to add
	 */
	public void addPowerPeak(String _powerPeak) {
		this._powerPeak.add(_powerPeak.toString());
	}
	/**
	 * @return the energy
	 */
	public List<String> getEnergy() {
		return this._energy;
	}
	/**
	 * @param energy the energy to add
	 */
	public void addEnergy(String _energy) {
		this._energy.add(_energy.toString());
	}
	/**
	 * @return the subUsage
	 */
	public List<String> getSubUsage() {
		return this._subUsage;
	}
	/**
	 * @param subUsage the subUsage to add
	 */
	public void addSubUsage(String _subUsage) {
		this._subUsage.add(_subUsage.toString());
	}
	/**
	 * @return the usedResources
	 */
	public List<String> getUsedResources() {
		return this._usedResources;
	}
	/**
	 * @param usedResources the usedResources to add
	 */
	public void addUsedResources(String _usedResources) {
		this._usedResources.add(_usedResources.toString());
	}
	/**
	 * @return the msgSize
	 */
	public List<String> getMsgSize() {
		return this._msgSize;
	}
	/**
	 * @param msgSize the msgSize to add
	 */
	public void addMsgSize(String _msgSize) {
		this._msgSize.add(_msgSize.toString());
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