package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the GCMInvocatingBehavior stereotype
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

public class GCMInvocatingBehavior {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute onPorts.
	*/ 
	private List<String> _onPorts = new ArrayList<String>();
	

		
	/*
	Variable for the attribute onFeatures.
	*/ 
	private List<String> _onFeatures = new ArrayList<String>();
	

		
	/*
	Variable for the attribute invocations.
	*/ 
	private List<String> _invocations = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("GCMInvocatingBehavior");

	public GCMInvocatingBehavior() {
		/*
		Variable for the attribute onPorts.
		*/ 
		this._onPorts = new ArrayList<String>();
		/*
		Variable for the attribute onFeatures.
		*/ 
		this._onFeatures = new ArrayList<String>();
		/*
		Variable for the attribute invocations.
		*/ 
		this._invocations = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the GCMInvocatingBehavior POJO class
		
		GCMInvocatingBehavior _stereo = new GCMInvocatingBehavior();
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
	 * @return the onPorts
	 */
	public List<String> getOnPorts() {
		return this._onPorts;
	}
	/**
	 * @param onPorts the onPorts to add
	 */
	public void addOnPorts(String _onPorts) {
		this._onPorts.add(_onPorts.toString());
	}
	/**
	 * @return the onFeatures
	 */
	public List<String> getOnFeatures() {
		return this._onFeatures;
	}
	/**
	 * @param onFeatures the onFeatures to add
	 */
	public void addOnFeatures(String _onFeatures) {
		this._onFeatures.add(_onFeatures.toString());
	}
	/**
	 * @return the invocations
	 */
	public List<String> getInvocations() {
		return this._invocations;
	}
	/**
	 * @param invocations the invocations to add
	 */
	public void addInvocations(String _invocations) {
		this._invocations.add(_invocations.toString());
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