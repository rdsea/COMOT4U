package at.ac.tuwien.dsg.profiles.cpsinfrastructure.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the EOperation stereotype
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@65a2200c (name: Stereotype) (instanceClassName: null) (abstract: false, interface: false)
uml::Stereotype
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class EOperation {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute operationName.
	*/ 
	private List<String> _operationName = new ArrayList<String>();
	

		
	/*
	Variable for the attribute annotations.
	*/ 
	private List<String> _annotations = new ArrayList<String>();
	

		
	/*
	Variable for the attribute visibility.
	*/ 
	private List<String> _visibility = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("EOperation");

	public EOperation() {
		/*
		Variable for the attribute operationName.
		*/ 
		this._operationName = new ArrayList<String>();
		/*
		Variable for the attribute annotations.
		*/ 
		this._annotations = new ArrayList<String>();
		/*
		Variable for the attribute visibility.
		*/ 
		this._visibility = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the EOperation POJO class
		
		EOperation _stereo = new EOperation();
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
	 * @return the operationName
	 */
	public List<String> getOperationName() {
		return this._operationName;
	}
	/**
	 * @param operationName the operationName to add
	 */
	public void addOperationName(String _operationName) {
		this._operationName.add(_operationName.toString());
	}
	/**
	 * @return the annotations
	 */
	public List<String> getAnnotations() {
		return this._annotations;
	}
	/**
	 * @param annotations the annotations to add
	 */
	public void addAnnotations(String _annotations) {
		this._annotations.add(_annotations.toString());
	}
	/**
	 * @return the visibility
	 */
	public List<String> getVisibility() {
		return this._visibility;
	}
	/**
	 * @param visibility the visibility to add
	 */
	public void addVisibility(String _visibility) {
		this._visibility.add(_visibility.toString());
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