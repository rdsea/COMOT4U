package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the IntervalType stereotype
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

public class IntervalType {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute intervalAttrib.
	*/ 
	private List<String> _intervalAttrib = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("IntervalType");

	public IntervalType() {
		/*
		Variable for the attribute intervalAttrib.
		*/ 
		this._intervalAttrib = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the IntervalType POJO class
		
		IntervalType _stereo = new IntervalType();
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
	 * @return the intervalAttrib
	 */
	public List<String> getIntervalAttrib() {
		return this._intervalAttrib;
	}
	/**
	 * @param intervalAttrib the intervalAttrib to add
	 */
	public void addIntervalAttrib(String _intervalAttrib) {
		this._intervalAttrib.add(_intervalAttrib.toString());
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