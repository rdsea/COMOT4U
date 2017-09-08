package at.ac.tuwien.dsg.uml.profiles.infrastructurecpsprofile.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the SoftwareDefinedCapability stereotype
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@5947c75e (name: Stereotype) (instanceClassName: null) (abstract: false, interface: false)
uml::Stereotype
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.tu4ume.epsilon.externaltools.SampleTool;

public class SoftwareDefinedCapability {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("name") 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute mechanism.
	*/
	@SerializedName("mechanism")
	private List<String> _mechanism = new ArrayList<String>();
	

		
	/*
	Variable for the attribute enforcementProtocol.
	*/
	@SerializedName("enforcementProtocol")
	private List<String> _enforcementProtocol = new ArrayList<String>();
	

		
	/*
	Variable for the attribute endpoint.
	*/
	@SerializedName("endpoint")
	private List<String> _endpoint = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("SoftwareDefinedCapability");

	public SoftwareDefinedCapability() {
		/*
		Variable for the attribute mechanism.
		*/
		this._mechanism = new ArrayList<String>();
		/*
		Variable for the attribute enforcementProtocol.
		*/
		this._enforcementProtocol = new ArrayList<String>();
		/*
		Variable for the attribute endpoint.
		*/
		this._endpoint = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the SoftwareDefinedCapability POJO class
		
		SoftwareDefinedCapability _stereo = new SoftwareDefinedCapability();
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
	 * @return the mechanism
	 */
	public List<String> getMechanism() {
		return this._mechanism;
	}
	/**
	 * @param mechanism the mechanism to add
	 */
	public void addMechanism(String _mechanism) {
		this._mechanism.add(_mechanism.toString());
	}
	/**
	 * @return the enforcementProtocol
	 */
	public List<String> getEnforcementProtocol() {
		return this._enforcementProtocol;
	}
	/**
	 * @param enforcementProtocol the enforcementProtocol to add
	 */
	public void addEnforcementProtocol(String _enforcementProtocol) {
		this._enforcementProtocol.add(_enforcementProtocol.toString());
	}
	/**
	 * @return the endpoint
	 */
	public List<String> getEndpoint() {
		return this._endpoint;
	}
	/**
	 * @param endpoint the endpoint to add
	 */
	public void addEndpoint(String _endpoint) {
		this._endpoint.add(_endpoint.toString());
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