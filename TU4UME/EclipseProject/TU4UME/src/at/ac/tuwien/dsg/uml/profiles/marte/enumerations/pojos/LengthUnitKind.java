package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the LengthUnitKind enumeration
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

public class LengthUnitKind {


		
	/*
	Static Variable for the literal m.
	*/ 
	public String _m = new String("m");
	

		
	/*
	Static Variable for the literal cm.
	*/ 
	public String _cm = new String("cm");
	

		
	/*
	Static Variable for the literal mm.
	*/ 
	public String _mm = new String("mm");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("LengthUnitKind");

	public LengthUnitKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the LengthUnitKind POJO class
		
		LengthUnitKind enumeration = new LengthUnitKind();
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
	 * @return the _m
	 */
	public String getM() {
		return _m;
	}
	/**
	 * @return the _cm
	 */
	public String getCm() {
		return _cm;
	}
	/**
	 * @return the _mm
	 */
	public String getMm() {
		return _mm;
	}
}