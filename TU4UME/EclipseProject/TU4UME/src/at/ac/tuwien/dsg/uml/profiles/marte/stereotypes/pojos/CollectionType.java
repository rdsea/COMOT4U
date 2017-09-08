package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the CollectionType stereotype
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

public class CollectionType {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute collectionAttrib.
	*/ 
	private List<String> _collectionAttrib = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("CollectionType");

	public CollectionType() {
		/*
		Variable for the attribute collectionAttrib.
		*/ 
		this._collectionAttrib = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the CollectionType POJO class
		
		CollectionType _stereo = new CollectionType();
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
	 * @return the collectionAttrib
	 */
	public List<String> getCollectionAttrib() {
		return this._collectionAttrib;
	}
	/**
	 * @param collectionAttrib the collectionAttrib to add
	 */
	public void addCollectionAttrib(String _collectionAttrib) {
		this._collectionAttrib.add(_collectionAttrib.toString());
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