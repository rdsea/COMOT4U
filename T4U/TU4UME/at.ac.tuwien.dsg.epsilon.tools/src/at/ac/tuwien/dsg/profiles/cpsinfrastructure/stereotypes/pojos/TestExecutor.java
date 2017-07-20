package at.ac.tuwien.dsg.profiles.cpsinfrastructure.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the TestExecutor stereotype
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@65a2200c (name: Stereotype) (instanceClassName: null) (abstract: false, interface: false)
uml::Stereotype
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class TestExecutor {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute description.
	*/ 
	private List<String> _description = new ArrayList<String>();
	

		
	/*
	Variable for the attribute distinctFromTarget.
	*/ 
	private List<String> _distinctFromTarget = new ArrayList<String>();
	

		
	/*
	Variable for the attribute target.
	*/ 
	private List<String> _target = new ArrayList<String>();
	

		
	/*
	Variable for the attribute phyCapabilities.
	*/ 
	private List<String> _phyCapabilities = new ArrayList<String>();
	

		
	/*
	Variable for the attribute swCapabilities.
	*/ 
	private List<String> _swCapabilities = new ArrayList<String>();
	

		
	/*
	Variable for the attribute testTriggers.
	*/ 
	private List<String> _testTriggers = new ArrayList<String>();
	

		
	/*
	Variable for the attribute strategy.
	*/ 
	private List<String> _strategy = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("TestExecutor");

	public TestExecutor() {
		/*
		Variable for the attribute description.
		*/ 
		this._description = new ArrayList<String>();
		/*
		Variable for the attribute distinctFromTarget.
		*/ 
		this._distinctFromTarget = new ArrayList<String>();
		/*
		Variable for the attribute target.
		*/ 
		this._target = new ArrayList<String>();
		/*
		Variable for the attribute phyCapabilities.
		*/ 
		this._phyCapabilities = new ArrayList<String>();
		/*
		Variable for the attribute swCapabilities.
		*/ 
		this._swCapabilities = new ArrayList<String>();
		/*
		Variable for the attribute testTriggers.
		*/ 
		this._testTriggers = new ArrayList<String>();
		/*
		Variable for the attribute strategy.
		*/ 
		this._strategy = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the TestExecutor POJO class
		
		TestExecutor _stereo = new TestExecutor();
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
	 * @return the distinctFromTarget
	 */
	public List<String> getDistinctFromTarget() {
		return this._distinctFromTarget;
	}
	/**
	 * @param distinctFromTarget the distinctFromTarget to add
	 */
	public void addDistinctFromTarget(String _distinctFromTarget) {
		this._distinctFromTarget.add(_distinctFromTarget.toString());
	}
	/**
	 * @return the target
	 */
	public List<String> getTarget() {
		return this._target;
	}
	/**
	 * @param target the target to add
	 */
	public void addTarget(String _target) {
		this._target.add(_target.toString());
	}
	/**
	 * @return the phyCapabilities
	 */
	public List<String> getPhyCapabilities() {
		return this._phyCapabilities;
	}
	/**
	 * @param phyCapabilities the phyCapabilities to add
	 */
	public void addPhyCapabilities(String _phyCapabilities) {
		this._phyCapabilities.add(_phyCapabilities.toString());
	}
	/**
	 * @return the swCapabilities
	 */
	public List<String> getSwCapabilities() {
		return this._swCapabilities;
	}
	/**
	 * @param swCapabilities the swCapabilities to add
	 */
	public void addSwCapabilities(String _swCapabilities) {
		this._swCapabilities.add(_swCapabilities.toString());
	}
	/**
	 * @return the testTriggers
	 */
	public List<String> getTestTriggers() {
		return this._testTriggers;
	}
	/**
	 * @param testTriggers the testTriggers to add
	 */
	public void addTestTriggers(String _testTriggers) {
		this._testTriggers.add(_testTriggers.toString());
	}
	/**
	 * @return the strategy
	 */
	public List<String> getStrategy() {
		return this._strategy;
	}
	/**
	 * @param strategy the strategy to add
	 */
	public void addStrategy(String _strategy) {
		this._strategy.add(_strategy.toString());
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