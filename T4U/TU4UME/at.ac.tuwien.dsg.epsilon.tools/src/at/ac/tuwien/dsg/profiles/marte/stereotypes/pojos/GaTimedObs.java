package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the GaTimedObs stereotype
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

public class GaTimedObs {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
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
	public String __type = new String ("GaTimedObs");

	public GaTimedObs() {
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
		// TODO Auto-generated method to test the GaTimedObs POJO class
		
		GaTimedObs _stereo = new GaTimedObs();
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