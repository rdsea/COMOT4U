package at.ac.tuwien.dsg.profiles.cpsinfrastructure.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the BeliefAgent stereotype
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@65a2200c (name: Stereotype) (instanceClassName: null) (abstract: false, interface: false)
uml::Stereotype
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class BeliefAgent {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute beliefStatement.
	*/ 
	private List<String> _beliefStatement = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("BeliefAgent");

	public BeliefAgent() {
		/*
		Variable for the attribute beliefStatement.
		*/ 
		this._beliefStatement = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the BeliefAgent POJO class
		
		BeliefAgent _stereo = new BeliefAgent();
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
	 * @return the beliefStatement
	 */
	public List<String> getBeliefStatement() {
		return this._beliefStatement;
	}
	/**
	 * @param beliefStatement the beliefStatement to add
	 */
	public void addBeliefStatement(String _beliefStatement) {
		this._beliefStatement.add(_beliefStatement.toString());
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