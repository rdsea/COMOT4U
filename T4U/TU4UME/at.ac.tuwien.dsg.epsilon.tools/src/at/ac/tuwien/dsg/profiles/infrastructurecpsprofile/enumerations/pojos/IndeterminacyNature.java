package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the IndeterminacyNature enumeration
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@21658f0b (name: Enumeration) (instanceClassName: null) (abstract: false, interface: false)
uml::Enumeration
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class IndeterminacyNature {


		
	/*
	Static Variable for the literal InsufficientResolution.
	*/ 
	public String _InsufficientResolution = new String("InsufficientResolution");
	

		
	/*
	Static Variable for the literal MissingInfo.
	*/ 
	public String _MissingInfo = new String("MissingInfo");
	

		
	/*
	Static Variable for the literal NonDeterminism.
	*/ 
	public String _NonDeterminism = new String("NonDeterminism");
	

		
	/*
	Static Variable for the literal Composite.
	*/ 
	public String _Composite = new String("Composite");
	

		
	/*
	Static Variable for the literal Unclassified.
	*/ 
	public String _Unclassified = new String("Unclassified");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("IndeterminacyNature");

	public IndeterminacyNature() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the IndeterminacyNature POJO class
		
		IndeterminacyNature enumeration = new IndeterminacyNature();
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
	 * @return the _InsufficientResolution
	 */
	public String getInsufficientResolution() {
		return _InsufficientResolution;
	}
	/**
	 * @return the _MissingInfo
	 */
	public String getMissingInfo() {
		return _MissingInfo;
	}
	/**
	 * @return the _NonDeterminism
	 */
	public String getNonDeterminism() {
		return _NonDeterminism;
	}
	/**
	 * @return the _Composite
	 */
	public String getComposite() {
		return _Composite;
	}
	/**
	 * @return the _Unclassified
	 */
	public String getUnclassified() {
		return _Unclassified;
	}
}