package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the Reshape stereotype
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

public class Reshape {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute patternShape.
	*/ 
	private List<String> _patternShape = new ArrayList<String>();
	

		
	/*
	Variable for the attribute repetitonShape.
	*/ 
	private List<String> _repetitonShape = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("Reshape");

	public Reshape() {
		/*
		Variable for the attribute patternShape.
		*/ 
		this._patternShape = new ArrayList<String>();
		/*
		Variable for the attribute repetitonShape.
		*/ 
		this._repetitonShape = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the Reshape POJO class
		
		Reshape _stereo = new Reshape();
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
	 * @return the repetitonShape
	 */
	public List<String> getRepetitonShape() {
		return this._repetitonShape;
	}
	/**
	 * @param repetitonShape the repetitonShape to add
	 */
	public void addRepetitonShape(String _repetitonShape) {
		this._repetitonShape.add(_repetitonShape.toString());
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