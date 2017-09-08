package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the Operator stereotype
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

public class Operator {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute symbol.
	*/ 
	private List<String> _symbol = new ArrayList<String>();
	

		
	/*
	Variable for the attribute arity.
	*/ 
	private List<String> _arity = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("Operator");

	public Operator() {
		/*
		Variable for the attribute symbol.
		*/ 
		this._symbol = new ArrayList<String>();
		/*
		Variable for the attribute arity.
		*/ 
		this._arity = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the Operator POJO class
		
		Operator _stereo = new Operator();
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
	 * @return the symbol
	 */
	public List<String> getSymbol() {
		return this._symbol;
	}
	/**
	 * @param symbol the symbol to add
	 */
	public void addSymbol(String _symbol) {
		this._symbol.add(_symbol.toString());
	}
	/**
	 * @return the arity
	 */
	public List<String> getArity() {
		return this._arity;
	}
	/**
	 * @param arity the arity to add
	 */
	public void addArity(String _arity) {
		this._arity.add(_arity.toString());
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