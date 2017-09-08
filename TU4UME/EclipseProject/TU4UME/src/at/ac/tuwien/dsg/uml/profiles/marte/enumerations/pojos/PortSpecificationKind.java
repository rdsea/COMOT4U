package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the PortSpecificationKind enumeration
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

public class PortSpecificationKind {


		
	/*
	Static Variable for the literal atomic.
	*/ 
	public String _atomic = new String("atomic");
	

		
	/*
	Static Variable for the literal interfaceBased.
	*/ 
	public String _interfaceBased = new String("interfaceBased");
	

		
	/*
	Static Variable for the literal featureBased.
	*/ 
	public String _featureBased = new String("featureBased");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("PortSpecificationKind");

	public PortSpecificationKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the PortSpecificationKind POJO class
		
		PortSpecificationKind enumeration = new PortSpecificationKind();
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
	 * @return the _atomic
	 */
	public String getAtomic() {
		return _atomic;
	}
	/**
	 * @return the _interfaceBased
	 */
	public String getInterfaceBased() {
		return _interfaceBased;
	}
	/**
	 * @return the _featureBased
	 */
	public String getFeatureBased() {
		return _featureBased;
	}
}