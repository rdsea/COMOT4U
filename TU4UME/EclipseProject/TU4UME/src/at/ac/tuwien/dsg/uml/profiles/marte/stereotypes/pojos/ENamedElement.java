package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the ENamedElement stereotype
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

public class ENamedElement {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
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
	public String __type = new String ("ENamedElement");

	public ENamedElement() {
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
		// TODO Auto-generated method to test the ENamedElement POJO class
		
		ENamedElement _stereo = new ENamedElement();
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