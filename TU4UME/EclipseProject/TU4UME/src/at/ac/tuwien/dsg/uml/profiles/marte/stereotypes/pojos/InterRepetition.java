package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the InterRepetition stereotype
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

public class InterRepetition {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute repetitionShapeDependence.
	*/ 
	private List<String> _repetitionShapeDependence = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isModulo.
	*/ 
	private List<String> _isModulo = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("InterRepetition");

	public InterRepetition() {
		/*
		Variable for the attribute repetitionShapeDependence.
		*/ 
		this._repetitionShapeDependence = new ArrayList<String>();
		/*
		Variable for the attribute isModulo.
		*/ 
		this._isModulo = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the InterRepetition POJO class
		
		InterRepetition _stereo = new InterRepetition();
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
	 * @return the repetitionShapeDependence
	 */
	public List<String> getRepetitionShapeDependence() {
		return this._repetitionShapeDependence;
	}
	/**
	 * @param repetitionShapeDependence the repetitionShapeDependence to add
	 */
	public void addRepetitionShapeDependence(String _repetitionShapeDependence) {
		this._repetitionShapeDependence.add(_repetitionShapeDependence.toString());
	}
	/**
	 * @return the isModulo
	 */
	public List<String> getIsModulo() {
		return this._isModulo;
	}
	/**
	 * @param isModulo the isModulo to add
	 */
	public void addIsModulo(String _isModulo) {
		this._isModulo.add(_isModulo.toString());
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