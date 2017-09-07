package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the GaScenario stereotype
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

public class GaScenario {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute cause.
	*/ 
	private List<String> _cause = new ArrayList<String>();
	

		
	/*
	Variable for the attribute hostDemand.
	*/ 
	private List<String> _hostDemand = new ArrayList<String>();
	

		
	/*
	Variable for the attribute hostDemandOps.
	*/ 
	private List<String> _hostDemandOps = new ArrayList<String>();
	

		
	/*
	Variable for the attribute interOccT.
	*/ 
	private List<String> _interOccT = new ArrayList<String>();
	

		
	/*
	Variable for the attribute throughput.
	*/ 
	private List<String> _throughput = new ArrayList<String>();
	

		
	/*
	Variable for the attribute respT.
	*/ 
	private List<String> _respT = new ArrayList<String>();
	

		
	/*
	Variable for the attribute utilization.
	*/ 
	private List<String> _utilization = new ArrayList<String>();
	

		
	/*
	Variable for the attribute utilizationOnHost.
	*/ 
	private List<String> _utilizationOnHost = new ArrayList<String>();
	

		
	/*
	Variable for the attribute root.
	*/ 
	private List<String> _root = new ArrayList<String>();
	

		
	/*
	Variable for the attribute timing.
	*/ 
	private List<String> _timing = new ArrayList<String>();
	

		
	/*
	Variable for the attribute steps.
	*/ 
	private List<String> _steps = new ArrayList<String>();
	

		
	/*
	Variable for the attribute parentStep.
	*/ 
	private List<String> _parentStep = new ArrayList<String>();
	

		
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
	Variable for the attribute duration.
	*/ 
	private List<String> _duration = new ArrayList<String>();
	

		
	/*
	Variable for the attribute start.
	*/ 
	private List<String> _start = new ArrayList<String>();
	

		
	/*
	Variable for the attribute finish.
	*/ 
	private List<String> _finish = new ArrayList<String>();
	

		
	/*
	Variable for the attribute on.
	*/ 
	private List<String> _on = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("GaScenario");

	public GaScenario() {
		/*
		Variable for the attribute cause.
		*/ 
		this._cause = new ArrayList<String>();
		/*
		Variable for the attribute hostDemand.
		*/ 
		this._hostDemand = new ArrayList<String>();
		/*
		Variable for the attribute hostDemandOps.
		*/ 
		this._hostDemandOps = new ArrayList<String>();
		/*
		Variable for the attribute interOccT.
		*/ 
		this._interOccT = new ArrayList<String>();
		/*
		Variable for the attribute throughput.
		*/ 
		this._throughput = new ArrayList<String>();
		/*
		Variable for the attribute respT.
		*/ 
		this._respT = new ArrayList<String>();
		/*
		Variable for the attribute utilization.
		*/ 
		this._utilization = new ArrayList<String>();
		/*
		Variable for the attribute utilizationOnHost.
		*/ 
		this._utilizationOnHost = new ArrayList<String>();
		/*
		Variable for the attribute root.
		*/ 
		this._root = new ArrayList<String>();
		/*
		Variable for the attribute timing.
		*/ 
		this._timing = new ArrayList<String>();
		/*
		Variable for the attribute steps.
		*/ 
		this._steps = new ArrayList<String>();
		/*
		Variable for the attribute parentStep.
		*/ 
		this._parentStep = new ArrayList<String>();
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
		/*
		Variable for the attribute duration.
		*/ 
		this._duration = new ArrayList<String>();
		/*
		Variable for the attribute start.
		*/ 
		this._start = new ArrayList<String>();
		/*
		Variable for the attribute finish.
		*/ 
		this._finish = new ArrayList<String>();
		/*
		Variable for the attribute on.
		*/ 
		this._on = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the GaScenario POJO class
		
		GaScenario _stereo = new GaScenario();
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
	 * @return the cause
	 */
	public List<String> getCause() {
		return this._cause;
	}
	/**
	 * @param cause the cause to add
	 */
	public void addCause(String _cause) {
		this._cause.add(_cause.toString());
	}
	/**
	 * @return the hostDemand
	 */
	public List<String> getHostDemand() {
		return this._hostDemand;
	}
	/**
	 * @param hostDemand the hostDemand to add
	 */
	public void addHostDemand(String _hostDemand) {
		this._hostDemand.add(_hostDemand.toString());
	}
	/**
	 * @return the hostDemandOps
	 */
	public List<String> getHostDemandOps() {
		return this._hostDemandOps;
	}
	/**
	 * @param hostDemandOps the hostDemandOps to add
	 */
	public void addHostDemandOps(String _hostDemandOps) {
		this._hostDemandOps.add(_hostDemandOps.toString());
	}
	/**
	 * @return the interOccT
	 */
	public List<String> getInterOccT() {
		return this._interOccT;
	}
	/**
	 * @param interOccT the interOccT to add
	 */
	public void addInterOccT(String _interOccT) {
		this._interOccT.add(_interOccT.toString());
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
	 * @return the respT
	 */
	public List<String> getRespT() {
		return this._respT;
	}
	/**
	 * @param respT the respT to add
	 */
	public void addRespT(String _respT) {
		this._respT.add(_respT.toString());
	}
	/**
	 * @return the utilization
	 */
	public List<String> getUtilization() {
		return this._utilization;
	}
	/**
	 * @param utilization the utilization to add
	 */
	public void addUtilization(String _utilization) {
		this._utilization.add(_utilization.toString());
	}
	/**
	 * @return the utilizationOnHost
	 */
	public List<String> getUtilizationOnHost() {
		return this._utilizationOnHost;
	}
	/**
	 * @param utilizationOnHost the utilizationOnHost to add
	 */
	public void addUtilizationOnHost(String _utilizationOnHost) {
		this._utilizationOnHost.add(_utilizationOnHost.toString());
	}
	/**
	 * @return the root
	 */
	public List<String> getRoot() {
		return this._root;
	}
	/**
	 * @param root the root to add
	 */
	public void addRoot(String _root) {
		this._root.add(_root.toString());
	}
	/**
	 * @return the timing
	 */
	public List<String> getTiming() {
		return this._timing;
	}
	/**
	 * @param timing the timing to add
	 */
	public void addTiming(String _timing) {
		this._timing.add(_timing.toString());
	}
	/**
	 * @return the steps
	 */
	public List<String> getSteps() {
		return this._steps;
	}
	/**
	 * @param steps the steps to add
	 */
	public void addSteps(String _steps) {
		this._steps.add(_steps.toString());
	}
	/**
	 * @return the parentStep
	 */
	public List<String> getParentStep() {
		return this._parentStep;
	}
	/**
	 * @param parentStep the parentStep to add
	 */
	public void addParentStep(String _parentStep) {
		this._parentStep.add(_parentStep.toString());
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
	 * @return the duration
	 */
	public List<String> getDuration() {
		return this._duration;
	}
	/**
	 * @param duration the duration to add
	 */
	public void addDuration(String _duration) {
		this._duration.add(_duration.toString());
	}
	/**
	 * @return the start
	 */
	public List<String> getStart() {
		return this._start;
	}
	/**
	 * @param start the start to add
	 */
	public void addStart(String _start) {
		this._start.add(_start.toString());
	}
	/**
	 * @return the finish
	 */
	public List<String> getFinish() {
		return this._finish;
	}
	/**
	 * @param finish the finish to add
	 */
	public void addFinish(String _finish) {
		this._finish.add(_finish.toString());
	}
	/**
	 * @return the on
	 */
	public List<String> getOn() {
		return this._on;
	}
	/**
	 * @param on the on to add
	 */
	public void addOn(String _on) {
		this._on.add(_on.toString());
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