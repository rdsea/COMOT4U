package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the AreaUnitKind enumeration
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

public class AreaUnitKind {


		
	/*
	Static Variable for the literal mm2.
	*/ 
	public String _mm2 = new String("mm2");
	

		
	/*
	Static Variable for the literal um2.
	*/ 
	public String _um2 = new String("um2");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("AreaUnitKind");

	public AreaUnitKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the AreaUnitKind POJO class
		
		AreaUnitKind enumeration = new AreaUnitKind();
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
	 * @return the _mm2
	 */
	public String getMm2() {
		return _mm2;
	}
	/**
	 * @return the _um2
	 */
	public String getUm2() {
		return _um2;
	}
}