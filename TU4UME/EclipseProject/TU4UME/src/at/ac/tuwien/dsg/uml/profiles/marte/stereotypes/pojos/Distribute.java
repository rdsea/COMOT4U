package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the Distribute stereotype
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

public class Distribute {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute patternShape.
	*/ 
	private List<String> _patternShape = new ArrayList<String>();
	

		
	/*
	Variable for the attribute repetitionSpace.
	*/ 
	private List<String> _repetitionSpace = new ArrayList<String>();
	

		
	/*
	Variable for the attribute fromTiler.
	*/ 
	private List<String> _fromTiler = new ArrayList<String>();
	

		
	/*
	Variable for the attribute toTiler.
	*/ 
	private List<String> _toTiler = new ArrayList<String>();
	

		
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
	public String __type = new String ("Distribute");

	public Distribute() {
		/*
		Variable for the attribute patternShape.
		*/ 
		this._patternShape = new ArrayList<String>();
		/*
		Variable for the attribute repetitionSpace.
		*/ 
		this._repetitionSpace = new ArrayList<String>();
		/*
		Variable for the attribute fromTiler.
		*/ 
		this._fromTiler = new ArrayList<String>();
		/*
		Variable for the attribute toTiler.
		*/ 
		this._toTiler = new ArrayList<String>();
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
		// TODO Auto-generated method to test the Distribute POJO class
		
		Distribute _stereo = new Distribute();
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
	 * @return the patternShape
	 */
	public List<String> getPatternShape() {
		return this._patternShape;
	}
	/**
	 * @param patternShape the patternShape to add
	 */
	public void addPatternShape(String _patternShape) {
		this._patternShape.add(_patternShape.toString());
	}
	/**
	 * @return the repetitionSpace
	 */
	public List<String> getRepetitionSpace() {
		return this._repetitionSpace;
	}
	/**
	 * @param repetitionSpace the repetitionSpace to add
	 */
	public void addRepetitionSpace(String _repetitionSpace) {
		this._repetitionSpace.add(_repetitionSpace.toString());
	}
	/**
	 * @return the fromTiler
	 */
	public List<String> getFromTiler() {
		return this._fromTiler;
	}
	/**
	 * @param fromTiler the fromTiler to add
	 */
	public void addFromTiler(String _fromTiler) {
		this._fromTiler.add(_fromTiler.toString());
	}
	/**
	 * @return the toTiler
	 */
	public List<String> getToTiler() {
		return this._toTiler;
	}
	/**
	 * @param toTiler the toTiler to add
	 */
	public void addToTiler(String _toTiler) {
		this._toTiler.add(_toTiler.toString());
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