package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the TransmModeKind enumeration
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

public class TransmModeKind {


		
	/*
	Static Variable for the literal simplex.
	*/ 
	public String _simplex = new String("simplex");
	

		
	/*
	Static Variable for the literal halfDuplex.
	*/ 
	public String _halfDuplex = new String("halfDuplex");
	

		
	/*
	Static Variable for the literal fullDuplex.
	*/ 
	public String _fullDuplex = new String("fullDuplex");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("TransmModeKind");

	public TransmModeKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the TransmModeKind POJO class
		
		TransmModeKind enumeration = new TransmModeKind();
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
	 * @return the _simplex
	 */
	public String getSimplex() {
		return _simplex;
	}
	/**
	 * @return the _halfDuplex
	 */
	public String getHalfDuplex() {
		return _halfDuplex;
	}
	/**
	 * @return the _fullDuplex
	 */
	public String getFullDuplex() {
		return _fullDuplex;
	}
}