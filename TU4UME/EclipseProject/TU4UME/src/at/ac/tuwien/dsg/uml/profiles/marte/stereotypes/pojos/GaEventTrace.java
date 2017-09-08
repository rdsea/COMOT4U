package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the GaEventTrace stereotype
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

public class GaEventTrace {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute content.
	*/ 
	private List<String> _content = new ArrayList<String>();
	

		
	/*
	Variable for the attribute format.
	*/ 
	private List<String> _format = new ArrayList<String>();
	

		
	/*
	Variable for the attribute location.
	*/ 
	private List<String> _location = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("GaEventTrace");

	public GaEventTrace() {
		/*
		Variable for the attribute content.
		*/ 
		this._content = new ArrayList<String>();
		/*
		Variable for the attribute format.
		*/ 
		this._format = new ArrayList<String>();
		/*
		Variable for the attribute location.
		*/ 
		this._location = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the GaEventTrace POJO class
		
		GaEventTrace _stereo = new GaEventTrace();
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
	 * @return the content
	 */
	public List<String> getContent() {
		return this._content;
	}
	/**
	 * @param content the content to add
	 */
	public void addContent(String _content) {
		this._content.add(_content.toString());
	}
	/**
	 * @return the format
	 */
	public List<String> getFormat() {
		return this._format;
	}
	/**
	 * @param format the format to add
	 */
	public void addFormat(String _format) {
		this._format.add(_format.toString());
	}
	/**
	 * @return the location
	 */
	public List<String> getLocation() {
		return this._location;
	}
	/**
	 * @param location the location to add
	 */
	public void addLocation(String _location) {
		this._location.add(_location.toString());
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