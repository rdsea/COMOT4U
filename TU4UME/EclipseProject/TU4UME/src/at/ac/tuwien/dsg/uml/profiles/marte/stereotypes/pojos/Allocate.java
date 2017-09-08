package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the Allocate stereotype
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

public class Allocate {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute kind.
	*/ 
	private List<String> _kind = new ArrayList<String>();
	

		
	/*
	Variable for the attribute nature.
	*/ 
	private List<String> _nature = new ArrayList<String>();
	

		
	/*
	Variable for the attribute impliedConstraint.
	*/ 
	private List<String> _impliedConstraint = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("Allocate");

	public Allocate() {
		/*
		Variable for the attribute kind.
		*/ 
		this._kind = new ArrayList<String>();
		/*
		Variable for the attribute nature.
		*/ 
		this._nature = new ArrayList<String>();
		/*
		Variable for the attribute impliedConstraint.
		*/ 
		this._impliedConstraint = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the Allocate POJO class
		
		Allocate _stereo = new Allocate();
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
	 * @return the impliedConstraint
	 */
	public List<String> getImpliedConstraint() {
		return this._impliedConstraint;
	}
	/**
	 * @param impliedConstraint the impliedConstraint to add
	 */
	public void addImpliedConstraint(String _impliedConstraint) {
		this._impliedConstraint.add(_impliedConstraint.toString());
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