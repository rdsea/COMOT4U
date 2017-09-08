package at.ac.tuwien.dsg.uml.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the DataManagementMechanism enumeration
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@30d4287c (name: Enumeration) (instanceClassName: null) (abstract: false, interface: false)
uml::Enumeration
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.tu4ume.epsilon.externaltools.SampleTool;

public class DataManagementMechanism {


		
	/*
	Static Variable for the literal None.
	*/ 
	public String _None = new String("None");
	

		
	/*
	Static Variable for the literal Buffering.
	*/ 
	public String _Buffering = new String("Buffering");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("DataManagementMechanism");

	public DataManagementMechanism() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the DataManagementMechanism POJO class
		
		DataManagementMechanism enumeration = new DataManagementMechanism();
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
	 * @return the _None
	 */
	public String getNone() {
		return _None;
	}
	/**
	 * @return the _Buffering
	 */
	public String getBuffering() {
		return _Buffering;
	}
}