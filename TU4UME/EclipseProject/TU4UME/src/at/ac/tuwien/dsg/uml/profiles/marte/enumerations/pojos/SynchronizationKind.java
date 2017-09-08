package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the SynchronizationKind enumeration
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

public class SynchronizationKind {


		
	/*
	Static Variable for the literal synchronous.
	*/ 
	public String _synchronous = new String("synchronous");
	

		
	/*
	Static Variable for the literal asynchronous.
	*/ 
	public String _asynchronous = new String("asynchronous");
	

		
	/*
	Static Variable for the literal delayedSynchronous.
	*/ 
	public String _delayedSynchronous = new String("delayedSynchronous");
	

		
	/*
	Static Variable for the literal rendezVous.
	*/ 
	public String _rendezVous = new String("rendezVous");
	

		
	/*
	Static Variable for the literal other.
	*/ 
	public String _other = new String("other");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("SynchronizationKind");

	public SynchronizationKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the SynchronizationKind POJO class
		
		SynchronizationKind enumeration = new SynchronizationKind();
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
	 * @return the _synchronous
	 */
	public String getSynchronous() {
		return _synchronous;
	}
	/**
	 * @return the _asynchronous
	 */
	public String getAsynchronous() {
		return _asynchronous;
	}
	/**
	 * @return the _delayedSynchronous
	 */
	public String getDelayedSynchronous() {
		return _delayedSynchronous;
	}
	/**
	 * @return the _rendezVous
	 */
	public String getRendezVous() {
		return _rendezVous;
	}
	/**
	 * @return the _other
	 */
	public String getOther() {
		return _other;
	}
}