package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the ClockConstraint stereotype
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

public class ClockConstraint {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute isCoincidenceBased.
	*/ 
	private List<String> _isCoincidenceBased = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isPrecedenceBased.
	*/ 
	private List<String> _isPrecedenceBased = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isChronometricBased.
	*/ 
	private List<String> _isChronometricBased = new ArrayList<String>();
	

		
	/*
	Variable for the attribute on.
	*/ 
	private List<String> _on = new ArrayList<String>();
	

		
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
	public String __type = new String ("ClockConstraint");

	public ClockConstraint() {
		/*
		Variable for the attribute isCoincidenceBased.
		*/ 
		this._isCoincidenceBased = new ArrayList<String>();
		/*
		Variable for the attribute isPrecedenceBased.
		*/ 
		this._isPrecedenceBased = new ArrayList<String>();
		/*
		Variable for the attribute isChronometricBased.
		*/ 
		this._isChronometricBased = new ArrayList<String>();
		/*
		Variable for the attribute on.
		*/ 
		this._on = new ArrayList<String>();
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
		// TODO Auto-generated method to test the ClockConstraint POJO class
		
		ClockConstraint _stereo = new ClockConstraint();
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
	 * @return the isCoincidenceBased
	 */
	public List<String> getIsCoincidenceBased() {
		return this._isCoincidenceBased;
	}
	/**
	 * @param isCoincidenceBased the isCoincidenceBased to add
	 */
	public void addIsCoincidenceBased(String _isCoincidenceBased) {
		this._isCoincidenceBased.add(_isCoincidenceBased.toString());
	}
	/**
	 * @return the isPrecedenceBased
	 */
	public List<String> getIsPrecedenceBased() {
		return this._isPrecedenceBased;
	}
	/**
	 * @param isPrecedenceBased the isPrecedenceBased to add
	 */
	public void addIsPrecedenceBased(String _isPrecedenceBased) {
		this._isPrecedenceBased.add(_isPrecedenceBased.toString());
	}
	/**
	 * @return the isChronometricBased
	 */
	public List<String> getIsChronometricBased() {
		return this._isChronometricBased;
	}
	/**
	 * @param isChronometricBased the isChronometricBased to add
	 */
	public void addIsChronometricBased(String _isChronometricBased) {
		this._isChronometricBased.add(_isChronometricBased.toString());
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