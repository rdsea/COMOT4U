package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the WeightUnitKind enumeration
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@113b5546 (name: Enumeration) (instanceClassName: null) (abstract: false, interface: false)
uml::Enumeration
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class WeightUnitKind {


		
	/*
	Static Variable for the literal g.
	*/ 
	public String _g = new String("g");
	

		
	/*
	Static Variable for the literal mg.
	*/ 
	public String _mg = new String("mg");
	

		
	/*
	Static Variable for the literal kg.
	*/ 
	public String _kg = new String("kg");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("WeightUnitKind");

	public WeightUnitKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the WeightUnitKind POJO class
		
		WeightUnitKind enumeration = new WeightUnitKind();
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
	 * @return the _g
	 */
	public String getG() {
		return _g;
	}
	/**
	 * @return the _mg
	 */
	public String getMg() {
		return _mg;
	}
	/**
	 * @return the _kg
	 */
	public String getKg() {
		return _kg;
	}
}