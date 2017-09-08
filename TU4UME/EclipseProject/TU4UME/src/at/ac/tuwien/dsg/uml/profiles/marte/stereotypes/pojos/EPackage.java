package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the EPackage stereotype
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

public class EPackage {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute packageName.
	*/ 
	private List<String> _packageName = new ArrayList<String>();
	

		
	/*
	Variable for the attribute nsPrefix.
	*/ 
	private List<String> _nsPrefix = new ArrayList<String>();
	

		
	/*
	Variable for the attribute nsURI.
	*/ 
	private List<String> _nsURI = new ArrayList<String>();
	

		
	/*
	Variable for the attribute basePackage.
	*/ 
	private List<String> _basePackage = new ArrayList<String>();
	

		
	/*
	Variable for the attribute prefix.
	*/ 
	private List<String> _prefix = new ArrayList<String>();
	

		
	/*
	Variable for the attribute annotations.
	*/ 
	private List<String> _annotations = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("EPackage");

	public EPackage() {
		/*
		Variable for the attribute packageName.
		*/ 
		this._packageName = new ArrayList<String>();
		/*
		Variable for the attribute nsPrefix.
		*/ 
		this._nsPrefix = new ArrayList<String>();
		/*
		Variable for the attribute nsURI.
		*/ 
		this._nsURI = new ArrayList<String>();
		/*
		Variable for the attribute basePackage.
		*/ 
		this._basePackage = new ArrayList<String>();
		/*
		Variable for the attribute prefix.
		*/ 
		this._prefix = new ArrayList<String>();
		/*
		Variable for the attribute annotations.
		*/ 
		this._annotations = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the EPackage POJO class
		
		EPackage _stereo = new EPackage();
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
	 * @return the packageName
	 */
	public List<String> getPackageName() {
		return this._packageName;
	}
	/**
	 * @param packageName the packageName to add
	 */
	public void addPackageName(String _packageName) {
		this._packageName.add(_packageName.toString());
	}
	/**
	 * @return the nsPrefix
	 */
	public List<String> getNsPrefix() {
		return this._nsPrefix;
	}
	/**
	 * @param nsPrefix the nsPrefix to add
	 */
	public void addNsPrefix(String _nsPrefix) {
		this._nsPrefix.add(_nsPrefix.toString());
	}
	/**
	 * @return the nsURI
	 */
	public List<String> getNsURI() {
		return this._nsURI;
	}
	/**
	 * @param nsURI the nsURI to add
	 */
	public void addNsURI(String _nsURI) {
		this._nsURI.add(_nsURI.toString());
	}
	/**
	 * @return the basePackage
	 */
	public List<String> getBasePackage() {
		return this._basePackage;
	}
	/**
	 * @param basePackage the basePackage to add
	 */
	public void addBasePackage(String _basePackage) {
		this._basePackage.add(_basePackage.toString());
	}
	/**
	 * @return the prefix
	 */
	public List<String> getPrefix() {
		return this._prefix;
	}
	/**
	 * @param prefix the prefix to add
	 */
	public void addPrefix(String _prefix) {
		this._prefix.add(_prefix.toString());
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