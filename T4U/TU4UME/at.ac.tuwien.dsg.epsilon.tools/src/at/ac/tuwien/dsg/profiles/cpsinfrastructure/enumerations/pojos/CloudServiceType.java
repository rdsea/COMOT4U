package at.ac.tuwien.dsg.profiles.cpsinfrastructure.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the CloudServiceType enumeration
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@3c6dd051 (name: Enumeration) (instanceClassName: null) (abstract: false, interface: false)
uml::Enumeration
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class CloudServiceType {


		
	/*
	Static Variable for the literal VM.
	*/ 
	public String _VM = new String("VM");
	

		
	/*
	Static Variable for the literal Disk.
	*/ 
	public String _Disk = new String("Disk");
	

		
	/*
	Static Variable for the literal DataTransferIOPS.
	*/ 
	public String _DataTransferIOPS = new String("DataTransferIOPS");
	

		
	/*
	Static Variable for the literal DataCluster.
	*/ 
	public String _DataCluster = new String("DataCluster");
	

		
	/*
	Static Variable for the literal ClusterComputingEngine.
	*/ 
	public String _ClusterComputingEngine = new String("ClusterComputingEngine");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("CloudServiceType");

	public CloudServiceType() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the CloudServiceType POJO class
		
		CloudServiceType enumeration = new CloudServiceType();
		enumeration.toJson();
		
	}
	
	public String toJson(){
	

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        // Convert numbers array into JSON string.
        String elem = gson.toJson(this);
        
        System.out.println("elem = " + elem);    
        
        return elem;   
	}

	/**
	 * @return the _VM
	 */
	public String getVM() {
		return _VM;
	}
	/**
	 * @return the _Disk
	 */
	public String getDisk() {
		return _Disk;
	}
	/**
	 * @return the _DataTransferIOPS
	 */
	public String getDataTransferIOPS() {
		return _DataTransferIOPS;
	}
	/**
	 * @return the _DataCluster
	 */
	public String getDataCluster() {
		return _DataCluster;
	}
	/**
	 * @return the _ClusterComputingEngine
	 */
	public String getClusterComputingEngine() {
		return _ClusterComputingEngine;
	}
}