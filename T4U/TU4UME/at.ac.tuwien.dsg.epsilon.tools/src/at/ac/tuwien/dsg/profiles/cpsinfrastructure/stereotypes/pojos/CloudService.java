package at.ac.tuwien.dsg.profiles.cpsinfrastructure.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the CloudService stereotype
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

public class CloudService {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute cloudProvider.
	*/ 
	private List<String> _cloudProvider = new ArrayList<String>();
	

		
	/*
	Variable for the attribute serviceType.
	*/ 
	private List<String> _serviceType = new ArrayList<String>();
	

		
	/*
	Variable for the attribute dataProvider.
	*/ 
	private List<String> _dataProvider = new ArrayList<String>();
	

		
	/*
	Variable for the attribute computingConfigs.
	*/ 
	private List<String> _computingConfigs = new ArrayList<String>();
	

		
	/*
	Variable for the attribute storageConfigs.
	*/ 
	private List<String> _storageConfigs = new ArrayList<String>();
	

		
	/*
	Variable for the attribute communicationConfigs.
	*/ 
	private List<String> _communicationConfigs = new ArrayList<String>();
	

		
	/*
	Variable for the attribute id.
	*/ 
	private List<String> _id = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("CloudService");

	public CloudService() {
		/*
		Variable for the attribute cloudProvider.
		*/ 
		this._cloudProvider = new ArrayList<String>();
		/*
		Variable for the attribute serviceType.
		*/ 
		this._serviceType = new ArrayList<String>();
		/*
		Variable for the attribute dataProvider.
		*/ 
		this._dataProvider = new ArrayList<String>();
		/*
		Variable for the attribute computingConfigs.
		*/ 
		this._computingConfigs = new ArrayList<String>();
		/*
		Variable for the attribute storageConfigs.
		*/ 
		this._storageConfigs = new ArrayList<String>();
		/*
		Variable for the attribute communicationConfigs.
		*/ 
		this._communicationConfigs = new ArrayList<String>();
		/*
		Variable for the attribute id.
		*/ 
		this._id = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the CloudService POJO class
		
		CloudService _stereo = new CloudService();
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
	 * @return the cloudProvider
	 */
	public List<String> getCloudProvider() {
		return this._cloudProvider;
	}
	/**
	 * @param cloudProvider the cloudProvider to add
	 */
	public void addCloudProvider(String _cloudProvider) {
		this._cloudProvider.add(_cloudProvider.toString());
	}
	/**
	 * @return the serviceType
	 */
	public List<String> getServiceType() {
		return this._serviceType;
	}
	/**
	 * @param serviceType the serviceType to add
	 */
	public void addServiceType(String _serviceType) {
		this._serviceType.add(_serviceType.toString());
	}
	/**
	 * @return the dataProvider
	 */
	public List<String> getDataProvider() {
		return this._dataProvider;
	}
	/**
	 * @param dataProvider the dataProvider to add
	 */
	public void addDataProvider(String _dataProvider) {
		this._dataProvider.add(_dataProvider.toString());
	}
	/**
	 * @return the computingConfigs
	 */
	public List<String> getComputingConfigs() {
		return this._computingConfigs;
	}
	/**
	 * @param computingConfigs the computingConfigs to add
	 */
	public void addComputingConfigs(String _computingConfigs) {
		this._computingConfigs.add(_computingConfigs.toString());
	}
	/**
	 * @return the storageConfigs
	 */
	public List<String> getStorageConfigs() {
		return this._storageConfigs;
	}
	/**
	 * @param storageConfigs the storageConfigs to add
	 */
	public void addStorageConfigs(String _storageConfigs) {
		this._storageConfigs.add(_storageConfigs.toString());
	}
	/**
	 * @return the communicationConfigs
	 */
	public List<String> getCommunicationConfigs() {
		return this._communicationConfigs;
	}
	/**
	 * @param communicationConfigs the communicationConfigs to add
	 */
	public void addCommunicationConfigs(String _communicationConfigs) {
		this._communicationConfigs.add(_communicationConfigs.toString());
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