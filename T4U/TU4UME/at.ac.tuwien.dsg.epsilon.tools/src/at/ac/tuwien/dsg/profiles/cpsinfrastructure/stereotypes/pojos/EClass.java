package at.ac.tuwien.dsg.profiles.cpsinfrastructure.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the EClass stereotype
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

public class EClass {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute className.
	*/ 
	private List<String> _className = new ArrayList<String>();
	

		
	/*
	Variable for the attribute xmlContentKind.
	*/ 
	private List<String> _xmlContentKind = new ArrayList<String>();
	

		
	/*
	Variable for the attribute instanceClassName.
	*/ 
	private List<String> _instanceClassName = new ArrayList<String>();
	

		
	/*
	Variable for the attribute xmlName.
	*/ 
	private List<String> _xmlName = new ArrayList<String>();
	

		
	/*
	Variable for the attribute annotations.
	*/ 
	private List<String> _annotations = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("EClass");

	public EClass() {
		/*
		Variable for the attribute className.
		*/ 
		this._className = new ArrayList<String>();
		/*
		Variable for the attribute xmlContentKind.
		*/ 
		this._xmlContentKind = new ArrayList<String>();
		/*
		Variable for the attribute instanceClassName.
		*/ 
		this._instanceClassName = new ArrayList<String>();
		/*
		Variable for the attribute xmlName.
		*/ 
		this._xmlName = new ArrayList<String>();
		/*
		Variable for the attribute annotations.
		*/ 
		this._annotations = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the EClass POJO class
		
		EClass _stereo = new EClass();
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
	 * @return the className
	 */
	public List<String> getClassName() {
		return this._className;
	}
	/**
	 * @param className the className to add
	 */
	public void addClassName(String _className) {
		this._className.add(_className.toString());
	}
	/**
	 * @return the xmlContentKind
	 */
	public List<String> getXmlContentKind() {
		return this._xmlContentKind;
	}
	/**
	 * @param xmlContentKind the xmlContentKind to add
	 */
	public void addXmlContentKind(String _xmlContentKind) {
		this._xmlContentKind.add(_xmlContentKind.toString());
	}
	/**
	 * @return the instanceClassName
	 */
	public List<String> getInstanceClassName() {
		return this._instanceClassName;
	}
	/**
	 * @param instanceClassName the instanceClassName to add
	 */
	public void addInstanceClassName(String _instanceClassName) {
		this._instanceClassName.add(_instanceClassName.toString());
	}
	/**
	 * @return the xmlName
	 */
	public List<String> getXmlName() {
		return this._xmlName;
	}
	/**
	 * @param xmlName the xmlName to add
	 */
	public void addXmlName(String _xmlName) {
		this._xmlName.add(_xmlName.toString());
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