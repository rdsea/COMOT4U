package at.ac.tuwien.dsg.profiles.cpsinfrastructure.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the TestConfiguration stereotype
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

public class TestConfiguration {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute description.
	*/ 
	private List<String> _description = new ArrayList<String>();
	

		
	/*
	Variable for the attribute timeout.
	*/ 
	private List<String> _timeout = new ArrayList<String>();
	

		
	/*
	Variable for the attribute testExecutors.
	*/ 
	private List<String> _testExecutors = new ArrayList<String>();
	

		
	/*
	Variable for the attribute configurations.
	*/ 
	private List<String> _configurations = new ArrayList<String>();
	

		
	/*
	Variable for the attribute metrics.
	*/ 
	private List<String> _metrics = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("TestConfiguration");

	public TestConfiguration() {
		/*
		Variable for the attribute description.
		*/ 
		this._description = new ArrayList<String>();
		/*
		Variable for the attribute timeout.
		*/ 
		this._timeout = new ArrayList<String>();
		/*
		Variable for the attribute testExecutors.
		*/ 
		this._testExecutors = new ArrayList<String>();
		/*
		Variable for the attribute configurations.
		*/ 
		this._configurations = new ArrayList<String>();
		/*
		Variable for the attribute metrics.
		*/ 
		this._metrics = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the TestConfiguration POJO class
		
		TestConfiguration _stereo = new TestConfiguration();
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
	 * @return the timeout
	 */
	public List<String> getTimeout() {
		return this._timeout;
	}
	/**
	 * @param timeout the timeout to add
	 */
	public void addTimeout(String _timeout) {
		this._timeout.add(_timeout.toString());
	}
	/**
	 * @return the testExecutors
	 */
	public List<String> getTestExecutors() {
		return this._testExecutors;
	}
	/**
	 * @param testExecutors the testExecutors to add
	 */
	public void addTestExecutors(String _testExecutors) {
		this._testExecutors.add(_testExecutors.toString());
	}
	/**
	 * @return the configurations
	 */
	public List<String> getConfigurations() {
		return this._configurations;
	}
	/**
	 * @param configurations the configurations to add
	 */
	public void addConfigurations(String _configurations) {
		this._configurations.add(_configurations.toString());
	}
	/**
	 * @return the metrics
	 */
	public List<String> getMetrics() {
		return this._metrics;
	}
	/**
	 * @param metrics the metrics to add
	 */
	public void addMetrics(String _metrics) {
		this._metrics.add(_metrics.toString());
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