package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the GaLatencyObs stereotype
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

public class GaLatencyObs {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute latency.
	*/ 
	private List<String> _latency = new ArrayList<String>();
	

		
	/*
	Variable for the attribute miss.
	*/ 
	private List<String> _miss = new ArrayList<String>();
	

		
	/*
	Variable for the attribute utility.
	*/ 
	private List<String> _utility = new ArrayList<String>();
	

		
	/*
	Variable for the attribute maxJitter.
	*/ 
	private List<String> _maxJitter = new ArrayList<String>();
	

		
	/*
	Variable for the attribute laxity.
	*/ 
	private List<String> _laxity = new ArrayList<String>();
	

		
	/*
	Variable for the attribute startObs.
	*/ 
	private List<String> _startObs = new ArrayList<String>();
	

		
	/*
	Variable for the attribute endObs.
	*/ 
	private List<String> _endObs = new ArrayList<String>();
	

		
	/*
	Variable for the attribute kind.
	*/ 
	private List<String> _kind = new ArrayList<String>();
	

		
	/*
	Variable for the attribute mode.
	*/ 
	private List<String> _mode = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("GaLatencyObs");

	public GaLatencyObs() {
		/*
		Variable for the attribute latency.
		*/ 
		this._latency = new ArrayList<String>();
		/*
		Variable for the attribute miss.
		*/ 
		this._miss = new ArrayList<String>();
		/*
		Variable for the attribute utility.
		*/ 
		this._utility = new ArrayList<String>();
		/*
		Variable for the attribute maxJitter.
		*/ 
		this._maxJitter = new ArrayList<String>();
		/*
		Variable for the attribute laxity.
		*/ 
		this._laxity = new ArrayList<String>();
		/*
		Variable for the attribute startObs.
		*/ 
		this._startObs = new ArrayList<String>();
		/*
		Variable for the attribute endObs.
		*/ 
		this._endObs = new ArrayList<String>();
		/*
		Variable for the attribute kind.
		*/ 
		this._kind = new ArrayList<String>();
		/*
		Variable for the attribute mode.
		*/ 
		this._mode = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the GaLatencyObs POJO class
		
		GaLatencyObs _stereo = new GaLatencyObs();
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
	 * @return the latency
	 */
	public List<String> getLatency() {
		return this._latency;
	}
	/**
	 * @param latency the latency to add
	 */
	public void addLatency(String _latency) {
		this._latency.add(_latency.toString());
	}
	/**
	 * @return the miss
	 */
	public List<String> getMiss() {
		return this._miss;
	}
	/**
	 * @param miss the miss to add
	 */
	public void addMiss(String _miss) {
		this._miss.add(_miss.toString());
	}
	/**
	 * @return the utility
	 */
	public List<String> getUtility() {
		return this._utility;
	}
	/**
	 * @param utility the utility to add
	 */
	public void addUtility(String _utility) {
		this._utility.add(_utility.toString());
	}
	/**
	 * @return the maxJitter
	 */
	public List<String> getMaxJitter() {
		return this._maxJitter;
	}
	/**
	 * @param maxJitter the maxJitter to add
	 */
	public void addMaxJitter(String _maxJitter) {
		this._maxJitter.add(_maxJitter.toString());
	}
	/**
	 * @return the laxity
	 */
	public List<String> getLaxity() {
		return this._laxity;
	}
	/**
	 * @param laxity the laxity to add
	 */
	public void addLaxity(String _laxity) {
		this._laxity.add(_laxity.toString());
	}
	/**
	 * @return the startObs
	 */
	public List<String> getStartObs() {
		return this._startObs;
	}
	/**
	 * @param startObs the startObs to add
	 */
	public void addStartObs(String _startObs) {
		this._startObs.add(_startObs.toString());
	}
	/**
	 * @return the endObs
	 */
	public List<String> getEndObs() {
		return this._endObs;
	}
	/**
	 * @param endObs the endObs to add
	 */
	public void addEndObs(String _endObs) {
		this._endObs.add(_endObs.toString());
	}
	/**
	 * @return the kind
	 */
	public List<String> getKind() {
		return this._kind;
	}
	/**
	 * @param kind the kind to add
	 */
	public void addKind(String _kind) {
		this._kind.add(_kind.toString());
	}
	/**
	 * @return the mode
	 */
	public List<String> getMode() {
		return this._mode;
	}
	/**
	 * @param mode the mode to add
	 */
	public void addMode(String _mode) {
		this._mode.add(_mode.toString());
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