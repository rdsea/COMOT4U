package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the PaRunTInstance stereotype
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

public class PaRunTInstance {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute poolSize.
	*/ 
	private List<String> _poolSize = new ArrayList<String>();
	

		
	/*
	Variable for the attribute unbddPool.
	*/ 
	private List<String> _unbddPool = new ArrayList<String>();
	

		
	/*
	Variable for the attribute instance.
	*/ 
	private List<String> _instance = new ArrayList<String>();
	

		
	/*
	Variable for the attribute host.
	*/ 
	private List<String> _host = new ArrayList<String>();
	

		
	/*
	Variable for the attribute utilization.
	*/ 
	private List<String> _utilization = new ArrayList<String>();
	

		
	/*
	Variable for the attribute throughput.
	*/ 
	private List<String> _throughput = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("PaRunTInstance");

	public PaRunTInstance() {
		/*
		Variable for the attribute poolSize.
		*/ 
		this._poolSize = new ArrayList<String>();
		/*
		Variable for the attribute unbddPool.
		*/ 
		this._unbddPool = new ArrayList<String>();
		/*
		Variable for the attribute instance.
		*/ 
		this._instance = new ArrayList<String>();
		/*
		Variable for the attribute host.
		*/ 
		this._host = new ArrayList<String>();
		/*
		Variable for the attribute utilization.
		*/ 
		this._utilization = new ArrayList<String>();
		/*
		Variable for the attribute throughput.
		*/ 
		this._throughput = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the PaRunTInstance POJO class
		
		PaRunTInstance _stereo = new PaRunTInstance();
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
	 * @return the poolSize
	 */
	public List<String> getPoolSize() {
		return this._poolSize;
	}
	/**
	 * @param poolSize the poolSize to add
	 */
	public void addPoolSize(String _poolSize) {
		this._poolSize.add(_poolSize.toString());
	}
	/**
	 * @return the unbddPool
	 */
	public List<String> getUnbddPool() {
		return this._unbddPool;
	}
	/**
	 * @param unbddPool the unbddPool to add
	 */
	public void addUnbddPool(String _unbddPool) {
		this._unbddPool.add(_unbddPool.toString());
	}
	/**
	 * @return the instance
	 */
	public List<String> getInstance() {
		return this._instance;
	}
	/**
	 * @param instance the instance to add
	 */
	public void addInstance(String _instance) {
		this._instance.add(_instance.toString());
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