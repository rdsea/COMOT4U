package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the BeliefElement stereotype
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@46c49f49 (name: Stereotype) (instanceClassName: null) (abstract: false, interface: false)
uml::Stereotype
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class BeliefElement {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("name") 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute agent.
	*/
	@SerializedName("agent")
	private List<String> _agent = new ArrayList<String>();
	

		
	/*
	Variable for the attribute from.
	*/
	@SerializedName("from")
	private List<String> _from = new ArrayList<String>();
	

		
	/*
	Variable for the attribute duration.
	*/
	@SerializedName("duration")
	private List<String> _duration = new ArrayList<String>();
	

		
	/*
	Variable for the attribute beliefDegree.
	*/
	@SerializedName("beliefDegree")
	private List<String> _beliefDegree = new ArrayList<String>();
	

		
	/*
	Variable for the attribute prerequisites.
	*/
	@SerializedName("prerequisites")
	private List<String> _prerequisites = new ArrayList<String>();
	

		
	/*
	Variable for the attribute substatements.
	*/
	@SerializedName("substatements")
	private List<String> _substatements = new ArrayList<String>();
	

		
	/*
	Variable for the attribute beliefAgent.
	*/
	@SerializedName("beliefAgent")
	private List<String> _beliefAgent = new ArrayList<String>();
	

		
	/*
	Variable for the attribute uncertainties.
	*/
	@SerializedName("uncertainties")
	private List<String> _uncertainties = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("BeliefElement");

	public BeliefElement() {
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
		// Auto-generated method to test the BeliefElement POJO class
		
		BeliefElement _stereo = new BeliefElement();
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