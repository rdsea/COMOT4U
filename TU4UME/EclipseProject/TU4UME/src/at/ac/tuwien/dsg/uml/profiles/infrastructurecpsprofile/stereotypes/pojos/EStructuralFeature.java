package at.ac.tuwien.dsg.uml.profiles.infrastructurecpsprofile.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the EStructuralFeature stereotype
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@5947c75e (name: Stereotype) (instanceClassName: null) (abstract: false, interface: false)
uml::Stereotype
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.tu4ume.epsilon.externaltools.SampleTool;

public class EStructuralFeature {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("name") 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute isTransient.
	*/
	@SerializedName("isTransient")
	private List<String> _isTransient = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isVolatile.
	*/
	@SerializedName("isVolatile")
	private List<String> _isVolatile = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isUnsettable.
	*/
	@SerializedName("isUnsettable")
	private List<String> _isUnsettable = new ArrayList<String>();
	

		
	/*
	Variable for the attribute xmlNamespace.
	*/
	@SerializedName("xmlNamespace")
	private List<String> _xmlNamespace = new ArrayList<String>();
	

		
	/*
	Variable for the attribute xmlFeatureKind.
	*/
	@SerializedName("xmlFeatureKind")
	private List<String> _xmlFeatureKind = new ArrayList<String>();
	

		
	/*
	Variable for the attribute visibility.
	*/
	@SerializedName("visibility")
	private List<String> _visibility = new ArrayList<String>();
	

		
	/*
	Variable for the attribute xmlName.
	*/
	@SerializedName("xmlName")
	private List<String> _xmlName = new ArrayList<String>();
	

		
	/*
	Variable for the attribute annotations.
	*/
	@SerializedName("annotations")
	private List<String> _annotations = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("EStructuralFeature");

	public EStructuralFeature() {
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
		// Auto-generated method to test the EStructuralFeature POJO class
		
		EStructuralFeature _stereo = new EStructuralFeature();
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