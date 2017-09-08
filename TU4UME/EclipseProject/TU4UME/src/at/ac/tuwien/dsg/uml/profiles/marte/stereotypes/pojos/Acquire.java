package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the Acquire stereotype
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

public class Acquire {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute isBlocking.
	*/ 
	private List<String> _isBlocking = new ArrayList<String>();
	

		
	/*
	Variable for the attribute owner.
	*/ 
	private List<String> _owner = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("Acquire");

	public Acquire() {
		/*
		Variable for the attribute isBlocking.
		*/ 
		this._isBlocking = new ArrayList<String>();
		/*
		Variable for the attribute owner.
		*/ 
		this._owner = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the Acquire POJO class
		
		Acquire _stereo = new Acquire();
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
	 * @return the isBlocking
	 */
	public List<String> getIsBlocking() {
		return this._isBlocking;
	}
	/**
	 * @param isBlocking the isBlocking to add
	 */
	public void addIsBlocking(String _isBlocking) {
		this._isBlocking.add(_isBlocking.toString());
	}
	/**
	 * @return the owner
	 */
	public List<String> getOwner() {
		return this._owner;
	}
	/**
	 * @param owner the owner to add
	 */
	public void addOwner(String _owner) {
		this._owner.add(_owner.toString());
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