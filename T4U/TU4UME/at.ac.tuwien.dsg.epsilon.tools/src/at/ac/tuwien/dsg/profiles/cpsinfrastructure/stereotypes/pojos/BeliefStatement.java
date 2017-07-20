package at.ac.tuwien.dsg.profiles.cpsinfrastructure.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the BeliefStatement stereotype
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

public class BeliefStatement {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute uncertainty.
	*/ 
	private List<String> _uncertainty = new ArrayList<String>();
	

		
	/*
	Variable for the attribute agent.
	*/ 
	private List<String> _agent = new ArrayList<String>();
	

		
	/*
	Variable for the attribute from.
	*/ 
	private List<String> _from = new ArrayList<String>();
	

		
	/*
	Variable for the attribute duration.
	*/ 
	private List<String> _duration = new ArrayList<String>();
	

		
	/*
	Variable for the attribute beliefDegree.
	*/ 
	private List<String> _beliefDegree = new ArrayList<String>();
	

		
	/*
	Variable for the attribute prerequisites.
	*/ 
	private List<String> _prerequisites = new ArrayList<String>();
	

		
	/*
	Variable for the attribute substatements.
	*/ 
	private List<String> _substatements = new ArrayList<String>();
	

		
	/*
	Variable for the attribute beliefAgent.
	*/ 
	private List<String> _beliefAgent = new ArrayList<String>();
	

		
	/*
	Variable for the attribute uncertainties.
	*/ 
	private List<String> _uncertainties = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("BeliefStatement");

	public BeliefStatement() {
		/*
		Variable for the attribute uncertainty.
		*/ 
		this._uncertainty = new ArrayList<String>();
		/*
		Variable for the attribute agent.
		*/ 
		this._agent = new ArrayList<String>();
		/*
		Variable for the attribute from.
		*/ 
		this._from = new ArrayList<String>();
		/*
		Variable for the attribute duration.
		*/ 
		this._duration = new ArrayList<String>();
		/*
		Variable for the attribute beliefDegree.
		*/ 
		this._beliefDegree = new ArrayList<String>();
		/*
		Variable for the attribute prerequisites.
		*/ 
		this._prerequisites = new ArrayList<String>();
		/*
		Variable for the attribute substatements.
		*/ 
		this._substatements = new ArrayList<String>();
		/*
		Variable for the attribute beliefAgent.
		*/ 
		this._beliefAgent = new ArrayList<String>();
		/*
		Variable for the attribute uncertainties.
		*/ 
		this._uncertainties = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the BeliefStatement POJO class
		
		BeliefStatement _stereo = new BeliefStatement();
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
	 * @return the uncertainty
	 */
	public List<String> getUncertainty() {
		return this._uncertainty;
	}
	/**
	 * @param uncertainty the uncertainty to add
	 */
	public void addUncertainty(String _uncertainty) {
		this._uncertainty.add(_uncertainty.toString());
	}
	/**
	 * @return the agent
	 */
	public List<String> getAgent() {
		return this._agent;
	}
	/**
	 * @param agent the agent to add
	 */
	public void addAgent(String _agent) {
		this._agent.add(_agent.toString());
	}
	/**
	 * @return the from
	 */
	public List<String> getFrom() {
		return this._from;
	}
	/**
	 * @param from the from to add
	 */
	public void addFrom(String _from) {
		this._from.add(_from.toString());
	}
	/**
	 * @return the duration
	 */
	public List<String> getDuration() {
		return this._duration;
	}
	/**
	 * @param duration the duration to add
	 */
	public void addDuration(String _duration) {
		this._duration.add(_duration.toString());
	}
	/**
	 * @return the beliefDegree
	 */
	public List<String> getBeliefDegree() {
		return this._beliefDegree;
	}
	/**
	 * @param beliefDegree the beliefDegree to add
	 */
	public void addBeliefDegree(String _beliefDegree) {
		this._beliefDegree.add(_beliefDegree.toString());
	}
	/**
	 * @return the prerequisites
	 */
	public List<String> getPrerequisites() {
		return this._prerequisites;
	}
	/**
	 * @param prerequisites the prerequisites to add
	 */
	public void addPrerequisites(String _prerequisites) {
		this._prerequisites.add(_prerequisites.toString());
	}
	/**
	 * @return the substatements
	 */
	public List<String> getSubstatements() {
		return this._substatements;
	}
	/**
	 * @param substatements the substatements to add
	 */
	public void addSubstatements(String _substatements) {
		this._substatements.add(_substatements.toString());
	}
	/**
	 * @return the beliefAgent
	 */
	public List<String> getBeliefAgent() {
		return this._beliefAgent;
	}
	/**
	 * @param beliefAgent the beliefAgent to add
	 */
	public void addBeliefAgent(String _beliefAgent) {
		this._beliefAgent.add(_beliefAgent.toString());
	}
	/**
	 * @return the uncertainties
	 */
	public List<String> getUncertainties() {
		return this._uncertainties;
	}
	/**
	 * @param uncertainties the uncertainties to add
	 */
	public void addUncertainties(String _uncertainties) {
		this._uncertainties.add(_uncertainties.toString());
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