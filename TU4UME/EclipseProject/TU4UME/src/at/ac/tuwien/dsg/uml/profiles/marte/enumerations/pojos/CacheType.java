package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the CacheType enumeration
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

public class CacheType {


		
	/*
	Static Variable for the literal data.
	*/ 
	public String _data = new String("data");
	

		
	/*
	Static Variable for the literal instruction.
	*/ 
	public String _instruction = new String("instruction");
	

		
	/*
	Static Variable for the literal unified.
	*/ 
	public String _unified = new String("unified");
	

		
	/*
	Static Variable for the literal other.
	*/ 
	public String _other = new String("other");
	

		
	/*
	Static Variable for the literal undef.
	*/ 
	public String _undef = new String("undef");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("CacheType");

	public CacheType() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the CacheType POJO class
		
		CacheType enumeration = new CacheType();
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
	 * @return the _data
	 */
	public String getData() {
		return _data;
	}
	/**
	 * @return the _instruction
	 */
	public String getInstruction() {
		return _instruction;
	}
	/**
	 * @return the _unified
	 */
	public String getUnified() {
		return _unified;
	}
	/**
	 * @return the _other
	 */
	public String getOther() {
		return _other;
	}
	/**
	 * @return the _undef
	 */
	public String getUndef() {
		return _undef;
	}
}