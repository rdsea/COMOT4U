package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the NfpType stereotype
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

public class NfpType {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute valueAttrib.
	*/ 
	private List<String> _valueAttrib = new ArrayList<String>();
	

		
	/*
	Variable for the attribute unitAttrib.
	*/ 
	private List<String> _unitAttrib = new ArrayList<String>();
	

		
	/*
	Variable for the attribute exprAttrib.
	*/ 
	private List<String> _exprAttrib = new ArrayList<String>();
	

		
	/*
	Variable for the attribute tupleAttrib.
	*/ 
	private List<String> _tupleAttrib = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("NfpType");

	public NfpType() {
		/*
		Variable for the attribute valueAttrib.
		*/ 
		this._valueAttrib = new ArrayList<String>();
		/*
		Variable for the attribute unitAttrib.
		*/ 
		this._unitAttrib = new ArrayList<String>();
		/*
		Variable for the attribute exprAttrib.
		*/ 
		this._exprAttrib = new ArrayList<String>();
		/*
		Variable for the attribute tupleAttrib.
		*/ 
		this._tupleAttrib = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the NfpType POJO class
		
		NfpType _stereo = new NfpType();
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
	 * @return the valueAttrib
	 */
	public List<String> getValueAttrib() {
		return this._valueAttrib;
	}
	/**
	 * @param valueAttrib the valueAttrib to add
	 */
	public void addValueAttrib(String _valueAttrib) {
		this._valueAttrib.add(_valueAttrib.toString());
	}
	/**
	 * @return the unitAttrib
	 */
	public List<String> getUnitAttrib() {
		return this._unitAttrib;
	}
	/**
	 * @param unitAttrib the unitAttrib to add
	 */
	public void addUnitAttrib(String _unitAttrib) {
		this._unitAttrib.add(_unitAttrib.toString());
	}
	/**
	 * @return the exprAttrib
	 */
	public List<String> getExprAttrib() {
		return this._exprAttrib;
	}
	/**
	 * @param exprAttrib the exprAttrib to add
	 */
	public void addExprAttrib(String _exprAttrib) {
		this._exprAttrib.add(_exprAttrib.toString());
	}
	/**
	 * @return the tupleAttrib
	 */
	public List<String> getTupleAttrib() {
		return this._tupleAttrib;
	}
	/**
	 * @param tupleAttrib the tupleAttrib to add
	 */
	public void addTupleAttrib(String _tupleAttrib) {
		this._tupleAttrib.add(_tupleAttrib.toString());
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