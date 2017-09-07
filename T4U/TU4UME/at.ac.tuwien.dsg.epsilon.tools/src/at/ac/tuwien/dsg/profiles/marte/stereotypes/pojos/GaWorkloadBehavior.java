package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the GaWorkloadBehavior stereotype
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

public class GaWorkloadBehavior {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute behavior.
	*/ 
	private List<String> _behavior = new ArrayList<String>();
	

		
	/*
	Variable for the attribute demand.
	*/ 
	private List<String> _demand = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("GaWorkloadBehavior");

	public GaWorkloadBehavior() {
		/*
		Variable for the attribute behavior.
		*/ 
		this._behavior = new ArrayList<String>();
		/*
		Variable for the attribute demand.
		*/ 
		this._demand = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the GaWorkloadBehavior POJO class
		
		GaWorkloadBehavior _stereo = new GaWorkloadBehavior();
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
	 * @return the behavior
	 */
	public List<String> getBehavior() {
		return this._behavior;
	}
	/**
	 * @param behavior the behavior to add
	 */
	public void addBehavior(String _behavior) {
		this._behavior.add(_behavior.toString());
	}
	/**
	 * @return the demand
	 */
	public List<String> getDemand() {
		return this._demand;
	}
	/**
	 * @param demand the demand to add
	 */
	public void addDemand(String _demand) {
		this._demand.add(_demand.toString());
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