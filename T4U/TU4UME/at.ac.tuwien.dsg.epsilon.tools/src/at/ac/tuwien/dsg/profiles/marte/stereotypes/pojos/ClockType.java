package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the ClockType stereotype
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

public class ClockType {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute nature.
	*/ 
	private List<String> _nature = new ArrayList<String>();
	

		
	/*
	Variable for the attribute unitType.
	*/ 
	private List<String> _unitType = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isLogical.
	*/ 
	private List<String> _isLogical = new ArrayList<String>();
	

		
	/*
	Variable for the attribute resolAttr.
	*/ 
	private List<String> _resolAttr = new ArrayList<String>();
	

		
	/*
	Variable for the attribute maxValAttr.
	*/ 
	private List<String> _maxValAttr = new ArrayList<String>();
	

		
	/*
	Variable for the attribute offsetAttr.
	*/ 
	private List<String> _offsetAttr = new ArrayList<String>();
	

		
	/*
	Variable for the attribute getTime.
	*/ 
	private List<String> _getTime = new ArrayList<String>();
	

		
	/*
	Variable for the attribute setTime.
	*/ 
	private List<String> _setTime = new ArrayList<String>();
	

		
	/*
	Variable for the attribute indexToValue.
	*/ 
	private List<String> _indexToValue = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("ClockType");

	public ClockType() {
		/*
		Variable for the attribute nature.
		*/ 
		this._nature = new ArrayList<String>();
		/*
		Variable for the attribute unitType.
		*/ 
		this._unitType = new ArrayList<String>();
		/*
		Variable for the attribute isLogical.
		*/ 
		this._isLogical = new ArrayList<String>();
		/*
		Variable for the attribute resolAttr.
		*/ 
		this._resolAttr = new ArrayList<String>();
		/*
		Variable for the attribute maxValAttr.
		*/ 
		this._maxValAttr = new ArrayList<String>();
		/*
		Variable for the attribute offsetAttr.
		*/ 
		this._offsetAttr = new ArrayList<String>();
		/*
		Variable for the attribute getTime.
		*/ 
		this._getTime = new ArrayList<String>();
		/*
		Variable for the attribute setTime.
		*/ 
		this._setTime = new ArrayList<String>();
		/*
		Variable for the attribute indexToValue.
		*/ 
		this._indexToValue = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ClockType POJO class
		
		ClockType _stereo = new ClockType();
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
	 * @return the nature
	 */
	public List<String> getNature() {
		return this._nature;
	}
	/**
	 * @param nature the nature to add
	 */
	public void addNature(String _nature) {
		this._nature.add(_nature.toString());
	}
	/**
	 * @return the unitType
	 */
	public List<String> getUnitType() {
		return this._unitType;
	}
	/**
	 * @param unitType the unitType to add
	 */
	public void addUnitType(String _unitType) {
		this._unitType.add(_unitType.toString());
	}
	/**
	 * @return the isLogical
	 */
	public List<String> getIsLogical() {
		return this._isLogical;
	}
	/**
	 * @param isLogical the isLogical to add
	 */
	public void addIsLogical(String _isLogical) {
		this._isLogical.add(_isLogical.toString());
	}
	/**
	 * @return the resolAttr
	 */
	public List<String> getResolAttr() {
		return this._resolAttr;
	}
	/**
	 * @param resolAttr the resolAttr to add
	 */
	public void addResolAttr(String _resolAttr) {
		this._resolAttr.add(_resolAttr.toString());
	}
	/**
	 * @return the maxValAttr
	 */
	public List<String> getMaxValAttr() {
		return this._maxValAttr;
	}
	/**
	 * @param maxValAttr the maxValAttr to add
	 */
	public void addMaxValAttr(String _maxValAttr) {
		this._maxValAttr.add(_maxValAttr.toString());
	}
	/**
	 * @return the offsetAttr
	 */
	public List<String> getOffsetAttr() {
		return this._offsetAttr;
	}
	/**
	 * @param offsetAttr the offsetAttr to add
	 */
	public void addOffsetAttr(String _offsetAttr) {
		this._offsetAttr.add(_offsetAttr.toString());
	}
	/**
	 * @return the getTime
	 */
	public List<String> getGetTime() {
		return this._getTime;
	}
	/**
	 * @param getTime the getTime to add
	 */
	public void addGetTime(String _getTime) {
		this._getTime.add(_getTime.toString());
	}
	/**
	 * @return the setTime
	 */
	public List<String> getSetTime() {
		return this._setTime;
	}
	/**
	 * @param setTime the setTime to add
	 */
	public void addSetTime(String _setTime) {
		this._setTime.add(_setTime.toString());
	}
	/**
	 * @return the indexToValue
	 */
	public List<String> getIndexToValue() {
		return this._indexToValue;
	}
	/**
	 * @param indexToValue the indexToValue to add
	 */
	public void addIndexToValue(String _indexToValue) {
		this._indexToValue.add(_indexToValue.toString());
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