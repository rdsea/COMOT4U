package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the PpUnit stereotype
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

public class PpUnit {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute concPolicy.
	*/ 
	private List<String> _concPolicy = new ArrayList<String>();
	

		
	/*
	Variable for the attribute memorySize.
	*/ 
	private List<String> _memorySize = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("PpUnit");

	public PpUnit() {
		/*
		Variable for the attribute concPolicy.
		*/ 
		this._concPolicy = new ArrayList<String>();
		/*
		Variable for the attribute memorySize.
		*/ 
		this._memorySize = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the PpUnit POJO class
		
		PpUnit _stereo = new PpUnit();
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
	 * @return the concPolicy
	 */
	public List<String> getConcPolicy() {
		return this._concPolicy;
	}
	/**
	 * @param concPolicy the concPolicy to add
	 */
	public void addConcPolicy(String _concPolicy) {
		this._concPolicy.add(_concPolicy.toString());
	}
	/**
	 * @return the memorySize
	 */
	public List<String> getMemorySize() {
		return this._memorySize;
	}
	/**
	 * @param memorySize the memorySize to add
	 */
	public void addMemorySize(String _memorySize) {
		this._memorySize.add(_memorySize.toString());
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