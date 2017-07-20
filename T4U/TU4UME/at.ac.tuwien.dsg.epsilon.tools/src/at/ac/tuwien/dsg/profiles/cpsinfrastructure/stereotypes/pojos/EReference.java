package at.ac.tuwien.dsg.profiles.cpsinfrastructure.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the EReference stereotype
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

public class EReference {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute referenceName.
	*/ 
	private List<String> _referenceName = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isResolveProxies.
	*/ 
	private List<String> _isResolveProxies = new ArrayList<String>();
	

		
	/*
	Variable for the attribute keys.
	*/ 
	private List<String> _keys = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isTransient.
	*/ 
	private List<String> _isTransient = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isVolatile.
	*/ 
	private List<String> _isVolatile = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isUnsettable.
	*/ 
	private List<String> _isUnsettable = new ArrayList<String>();
	

		
	/*
	Variable for the attribute xmlNamespace.
	*/ 
	private List<String> _xmlNamespace = new ArrayList<String>();
	

		
	/*
	Variable for the attribute xmlFeatureKind.
	*/ 
	private List<String> _xmlFeatureKind = new ArrayList<String>();
	

		
	/*
	Variable for the attribute visibility.
	*/ 
	private List<String> _visibility = new ArrayList<String>();
	

		
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
	public String __type = new String ("EReference");

	public EReference() {
		/*
		Variable for the attribute referenceName.
		*/ 
		this._referenceName = new ArrayList<String>();
		/*
		Variable for the attribute isResolveProxies.
		*/ 
		this._isResolveProxies = new ArrayList<String>();
		/*
		Variable for the attribute keys.
		*/ 
		this._keys = new ArrayList<String>();
		/*
		Variable for the attribute isTransient.
		*/ 
		this._isTransient = new ArrayList<String>();
		/*
		Variable for the attribute isVolatile.
		*/ 
		this._isVolatile = new ArrayList<String>();
		/*
		Variable for the attribute isUnsettable.
		*/ 
		this._isUnsettable = new ArrayList<String>();
		/*
		Variable for the attribute xmlNamespace.
		*/ 
		this._xmlNamespace = new ArrayList<String>();
		/*
		Variable for the attribute xmlFeatureKind.
		*/ 
		this._xmlFeatureKind = new ArrayList<String>();
		/*
		Variable for the attribute visibility.
		*/ 
		this._visibility = new ArrayList<String>();
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
		// TODO Auto-generated method to test the EReference POJO class
		
		EReference _stereo = new EReference();
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
	 * @return the referenceName
	 */
	public List<String> getReferenceName() {
		return this._referenceName;
	}
	/**
	 * @param referenceName the referenceName to add
	 */
	public void addReferenceName(String _referenceName) {
		this._referenceName.add(_referenceName.toString());
	}
	/**
	 * @return the isResolveProxies
	 */
	public List<String> getIsResolveProxies() {
		return this._isResolveProxies;
	}
	/**
	 * @param isResolveProxies the isResolveProxies to add
	 */
	public void addIsResolveProxies(String _isResolveProxies) {
		this._isResolveProxies.add(_isResolveProxies.toString());
	}
	/**
	 * @return the keys
	 */
	public List<String> getKeys() {
		return this._keys;
	}
	/**
	 * @param keys the keys to add
	 */
	public void addKeys(String _keys) {
		this._keys.add(_keys.toString());
	}
	/**
	 * @return the isTransient
	 */
	public List<String> getIsTransient() {
		return this._isTransient;
	}
	/**
	 * @param isTransient the isTransient to add
	 */
	public void addIsTransient(String _isTransient) {
		this._isTransient.add(_isTransient.toString());
	}
	/**
	 * @return the isVolatile
	 */
	public List<String> getIsVolatile() {
		return this._isVolatile;
	}
	/**
	 * @param isVolatile the isVolatile to add
	 */
	public void addIsVolatile(String _isVolatile) {
		this._isVolatile.add(_isVolatile.toString());
	}
	/**
	 * @return the isUnsettable
	 */
	public List<String> getIsUnsettable() {
		return this._isUnsettable;
	}
	/**
	 * @param isUnsettable the isUnsettable to add
	 */
	public void addIsUnsettable(String _isUnsettable) {
		this._isUnsettable.add(_isUnsettable.toString());
	}
	/**
	 * @return the xmlNamespace
	 */
	public List<String> getXmlNamespace() {
		return this._xmlNamespace;
	}
	/**
	 * @param xmlNamespace the xmlNamespace to add
	 */
	public void addXmlNamespace(String _xmlNamespace) {
		this._xmlNamespace.add(_xmlNamespace.toString());
	}
	/**
	 * @return the xmlFeatureKind
	 */
	public List<String> getXmlFeatureKind() {
		return this._xmlFeatureKind;
	}
	/**
	 * @param xmlFeatureKind the xmlFeatureKind to add
	 */
	public void addXmlFeatureKind(String _xmlFeatureKind) {
		this._xmlFeatureKind.add(_xmlFeatureKind.toString());
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