package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the HwResourceService stereotype
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

public class HwResourceService {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute consumption.
	*/ 
	private List<String> _consumption = new ArrayList<String>();
	

		
	/*
	Variable for the attribute dissipation.
	*/ 
	private List<String> _dissipation = new ArrayList<String>();
	

		
	/*
	Variable for the attribute owner.
	*/ 
	private List<String> _owner = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("HwResourceService");

	public HwResourceService() {
		/*
		Variable for the attribute consumption.
		*/ 
		this._consumption = new ArrayList<String>();
		/*
		Variable for the attribute dissipation.
		*/ 
		this._dissipation = new ArrayList<String>();
		/*
		Variable for the attribute owner.
		*/ 
		this._owner = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the HwResourceService POJO class
		
		HwResourceService _stereo = new HwResourceService();
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
	 * @return the consumption
	 */
	public List<String> getConsumption() {
		return this._consumption;
	}
	/**
	 * @param consumption the consumption to add
	 */
	public void addConsumption(String _consumption) {
		this._consumption.add(_consumption.toString());
	}
	/**
	 * @return the dissipation
	 */
	public List<String> getDissipation() {
		return this._dissipation;
	}
	/**
	 * @param dissipation the dissipation to add
	 */
	public void addDissipation(String _dissipation) {
		this._dissipation.add(_dissipation.toString());
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