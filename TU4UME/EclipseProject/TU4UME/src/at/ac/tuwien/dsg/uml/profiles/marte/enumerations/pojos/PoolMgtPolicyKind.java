package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the PoolMgtPolicyKind enumeration
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

public class PoolMgtPolicyKind {


		
	/*
	Static Variable for the literal infiniteWait.
	*/ 
	public String _infiniteWait = new String("infiniteWait");
	

		
	/*
	Static Variable for the literal timedWait.
	*/ 
	public String _timedWait = new String("timedWait");
	

		
	/*
	Static Variable for the literal dynamic.
	*/ 
	public String _dynamic = new String("dynamic");
	

		
	/*
	Static Variable for the literal exception.
	*/ 
	public String _exception = new String("exception");
	

		
	/*
	Static Variable for the literal other.
	*/ 
	public String _other = new String("other");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("PoolMgtPolicyKind");

	public PoolMgtPolicyKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the PoolMgtPolicyKind POJO class
		
		PoolMgtPolicyKind enumeration = new PoolMgtPolicyKind();
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
	 * @return the _infiniteWait
	 */
	public String getInfiniteWait() {
		return _infiniteWait;
	}
	/**
	 * @return the _timedWait
	 */
	public String getTimedWait() {
		return _timedWait;
	}
	/**
	 * @return the _dynamic
	 */
	public String getDynamic() {
		return _dynamic;
	}
	/**
	 * @return the _exception
	 */
	public String getException() {
		return _exception;
	}
	/**
	 * @return the _other
	 */
	public String getOther() {
		return _other;
	}
}