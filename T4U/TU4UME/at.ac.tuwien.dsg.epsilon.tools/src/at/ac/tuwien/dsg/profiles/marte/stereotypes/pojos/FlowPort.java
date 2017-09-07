package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the FlowPort stereotype
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@4c06bbf9 (name: Stereotype) (instanceClassName: null) (abstract: false, interface: false)
uml::Stereotype
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class FlowPort {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute isAtomic.
	*/ 
	private List<String> _isAtomic = new ArrayList<String>();
	

		
	/*
	Variable for the attribute direction.
	*/ 
	private List<String> _direction = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("FlowPort");

	public FlowPort() {
		/*
		Variable for the attribute isAtomic.
		*/ 
		this._isAtomic = new ArrayList<String>();
		/*
		Variable for the attribute direction.
		*/ 
		this._direction = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the FlowPort POJO class
		
		FlowPort _stereo = new FlowPort();
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
	 * @return the isAtomic
	 */
	public List<String> getIsAtomic() {
		return this._isAtomic;
	}
	/**
	 * @param isAtomic the isAtomic to add
	 */
	public void addIsAtomic(String _isAtomic) {
		this._isAtomic.add(_isAtomic.toString());
	}
	/**
	 * @return the direction
	 */
	public List<String> getDirection() {
		return this._direction;
	}
	/**
	 * @param direction the direction to add
	 */
	public void addDirection(String _direction) {
		this._direction.add(_direction.toString());
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