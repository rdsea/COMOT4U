package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the SchedulableResource stereotype
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

public class SchedulableResource {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute schedParams.
	*/ 
	private List<String> _schedParams = new ArrayList<String>();
	

		
	/*
	Variable for the attribute host.
	*/ 
	private List<String> _host = new ArrayList<String>();
	

		
	/*
	Variable for the attribute dependentScheduler.
	*/ 
	private List<String> _dependentScheduler = new ArrayList<String>();
	

		
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
	public String __type = new String ("SchedulableResource");

	public SchedulableResource() {
		/*
		Variable for the attribute schedParams.
		*/ 
		this._schedParams = new ArrayList<String>();
		/*
		Variable for the attribute host.
		*/ 
		this._host = new ArrayList<String>();
		/*
		Variable for the attribute dependentScheduler.
		*/ 
		this._dependentScheduler = new ArrayList<String>();
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
		// TODO Auto-generated method to test the SchedulableResource POJO class
		
		SchedulableResource _stereo = new SchedulableResource();
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
	 * @return the schedParams
	 */
	public List<String> getSchedParams() {
		return this._schedParams;
	}
	/**
	 * @param schedParams the schedParams to add
	 */
	public void addSchedParams(String _schedParams) {
		this._schedParams.add(_schedParams.toString());
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
	 * @return the dependentScheduler
	 */
	public List<String> getDependentScheduler() {
		return this._dependentScheduler;
	}
	/**
	 * @param dependentScheduler the dependentScheduler to add
	 */
	public void addDependentScheduler(String _dependentScheduler) {
		this._dependentScheduler.add(_dependentScheduler.toString());
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