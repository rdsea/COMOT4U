package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the SourceKind enumeration
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

public class SourceKind {


		
	/*
	Static Variable for the literal est.
	*/ 
	public String _est = new String("est");
	

		
	/*
	Static Variable for the literal meas.
	*/ 
	public String _meas = new String("meas");
	

		
	/*
	Static Variable for the literal calc.
	*/ 
	public String _calc = new String("calc");
	

		
	/*
	Static Variable for the literal req.
	*/ 
	public String _req = new String("req");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("SourceKind");

	public SourceKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the SourceKind POJO class
		
		SourceKind enumeration = new SourceKind();
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
	 * @return the _est
	 */
	public String getEst() {
		return _est;
	}
	/**
	 * @return the _meas
	 */
	public String getMeas() {
		return _meas;
	}
	/**
	 * @return the _calc
	 */
	public String getCalc() {
		return _calc;
	}
	/**
	 * @return the _req
	 */
	public String getReq() {
		return _req;
	}
}