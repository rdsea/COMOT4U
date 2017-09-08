package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the Allocated stereotype
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

public class Allocated {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute allocatedTo.
	*/ 
	private List<String> _allocatedTo = new ArrayList<String>();
	

		
	/*
	Variable for the attribute allocatedFrom.
	*/ 
	private List<String> _allocatedFrom = new ArrayList<String>();
	

		
	/*
	Variable for the attribute kind.
	*/ 
	private List<String> _kind = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("Allocated");

	public Allocated() {
		/*
		Variable for the attribute allocatedTo.
		*/ 
		this._allocatedTo = new ArrayList<String>();
		/*
		Variable for the attribute allocatedFrom.
		*/ 
		this._allocatedFrom = new ArrayList<String>();
		/*
		Variable for the attribute kind.
		*/ 
		this._kind = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the Allocated POJO class
		
		Allocated _stereo = new Allocated();
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
	 * @return the allocatedTo
	 */
	public List<String> getAllocatedTo() {
		return this._allocatedTo;
	}
	/**
	 * @param allocatedTo the allocatedTo to add
	 */
	public void addAllocatedTo(String _allocatedTo) {
		this._allocatedTo.add(_allocatedTo.toString());
	}
	/**
	 * @return the allocatedFrom
	 */
	public List<String> getAllocatedFrom() {
		return this._allocatedFrom;
	}
	/**
	 * @param allocatedFrom the allocatedFrom to add
	 */
	public void addAllocatedFrom(String _allocatedFrom) {
		this._allocatedFrom.add(_allocatedFrom.toString());
	}
	/**
	 * @return the kind
	 */
	public List<String> getKind() {
		return this._kind;
	}
	/**
	 * @param kind the kind to add
	 */
	public void addKind(String _kind) {
		this._kind.add(_kind.toString());
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