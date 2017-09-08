package at.ac.tuwien.dsg.uml.profiles.infrastructurecpsprofile.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the CommunicationConfiguration stereotype
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

public class CommunicationConfiguration {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("name") 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute protocolType.
	*/
	@SerializedName("protocolType")
	private List<String> _protocolType = new ArrayList<String>();
	

		
	/*
	Variable for the attribute clientID.
	*/
	@SerializedName("clientID")
	private List<String> _clientID = new ArrayList<String>();
	

		
	/*
	Variable for the attribute serverIP.
	*/
	@SerializedName("serverIP")
	private List<String> _serverIP = new ArrayList<String>();
	

		
	/*
	Variable for the attribute portNumber.
	*/
	@SerializedName("portNumber")
	private List<String> _portNumber = new ArrayList<String>();
	

		
	/*
	Variable for the attribute topics.
	*/
	@SerializedName("topics")
	private List<String> _topics = new ArrayList<String>();
	

		
	/*
	Variable for the attribute qosLevel.
	*/
	@SerializedName("qosLevel")
	private List<String> _qosLevel = new ArrayList<String>();
	

		
	/*
	Variable for the attribute keepAlive.
	*/
	@SerializedName("keepAlive")
	private List<String> _keepAlive = new ArrayList<String>();
	

		
	/*
	Variable for the attribute description.
	*/
	@SerializedName("description")
	private List<String> _description = new ArrayList<String>();
	

		
	/*
	Variable for the attribute id.
	*/
	@SerializedName("id")
	private List<String> _id = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("CommunicationConfiguration");

	public CommunicationConfiguration() {
		/*
		Variable for the attribute protocolType.
		*/
		this._protocolType = new ArrayList<String>();
		/*
		Variable for the attribute clientID.
		*/
		this._clientID = new ArrayList<String>();
		/*
		Variable for the attribute serverIP.
		*/
		this._serverIP = new ArrayList<String>();
		/*
		Variable for the attribute portNumber.
		*/
		this._portNumber = new ArrayList<String>();
		/*
		Variable for the attribute topics.
		*/
		this._topics = new ArrayList<String>();
		/*
		Variable for the attribute qosLevel.
		*/
		this._qosLevel = new ArrayList<String>();
		/*
		Variable for the attribute keepAlive.
		*/
		this._keepAlive = new ArrayList<String>();
		/*
		Variable for the attribute description.
		*/
		this._description = new ArrayList<String>();
		/*
		Variable for the attribute id.
		*/
		this._id = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the CommunicationConfiguration POJO class
		
		CommunicationConfiguration _stereo = new CommunicationConfiguration();
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
	 * @return the protocolType
	 */
	public List<String> getProtocolType() {
		return this._protocolType;
	}
	/**
	 * @param protocolType the protocolType to add
	 */
	public void addProtocolType(String _protocolType) {
		this._protocolType.add(_protocolType.toString());
	}
	/**
	 * @return the clientID
	 */
	public List<String> getClientID() {
		return this._clientID;
	}
	/**
	 * @param clientID the clientID to add
	 */
	public void addClientID(String _clientID) {
		this._clientID.add(_clientID.toString());
	}
	/**
	 * @return the serverIP
	 */
	public List<String> getServerIP() {
		return this._serverIP;
	}
	/**
	 * @param serverIP the serverIP to add
	 */
	public void addServerIP(String _serverIP) {
		this._serverIP.add(_serverIP.toString());
	}
	/**
	 * @return the portNumber
	 */
	public List<String> getPortNumber() {
		return this._portNumber;
	}
	/**
	 * @param portNumber the portNumber to add
	 */
	public void addPortNumber(String _portNumber) {
		this._portNumber.add(_portNumber.toString());
	}
	/**
	 * @return the topics
	 */
	public List<String> getTopics() {
		return this._topics;
	}
	/**
	 * @param topics the topics to add
	 */
	public void addTopics(String _topics) {
		this._topics.add(_topics.toString());
	}
	/**
	 * @return the qosLevel
	 */
	public List<String> getQosLevel() {
		return this._qosLevel;
	}
	/**
	 * @param qosLevel the qosLevel to add
	 */
	public void addQosLevel(String _qosLevel) {
		this._qosLevel.add(_qosLevel.toString());
	}
	/**
	 * @return the keepAlive
	 */
	public List<String> getKeepAlive() {
		return this._keepAlive;
	}
	/**
	 * @param keepAlive the keepAlive to add
	 */
	public void addKeepAlive(String _keepAlive) {
		this._keepAlive.add(_keepAlive.toString());
	}
	/**
	 * @return the description
	 */
	public List<String> getDescription() {
		return this._description;
	}
	/**
	 * @param description the description to add
	 */
	public void addDescription(String _description) {
		this._description.add(_description.toString());
	}
	/**
	 * @return the id
	 */
	public List<String> getId() {
		return this._id;
	}
	/**
	 * @param id the id to add
	 */
	public void addId(String _id) {
		this._id.add(_id.toString());
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