package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the MutualExclusionResourceKind enumeration
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

public class MutualExclusionResourceKind {


		
	/*
	Static Variable for the literal BooleanSemaphore.
	*/ 
	public String _BooleanSemaphore = new String("BooleanSemaphore");
	

		
	/*
	Static Variable for the literal CountSemaphore.
	*/ 
	public String _CountSemaphore = new String("CountSemaphore");
	

		
	/*
	Static Variable for the literal Mutex.
	*/ 
	public String _Mutex = new String("Mutex");
	

		
	/*
	Static Variable for the literal Undef.
	*/ 
	public String _Undef = new String("Undef");
	

		
	/*
	Static Variable for the literal Other.
	*/ 
	public String _Other = new String("Other");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("MutualExclusionResourceKind");

	public MutualExclusionResourceKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the MutualExclusionResourceKind POJO class
		
		MutualExclusionResourceKind enumeration = new MutualExclusionResourceKind();
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
	 * @return the _BooleanSemaphore
	 */
	public String getBooleanSemaphore() {
		return _BooleanSemaphore;
	}
	/**
	 * @return the _CountSemaphore
	 */
	public String getCountSemaphore() {
		return _CountSemaphore;
	}
	/**
	 * @return the _Mutex
	 */
	public String getMutex() {
		return _Mutex;
	}
	/**
	 * @return the _Undef
	 */
	public String getUndef() {
		return _Undef;
	}
	/**
	 * @return the _Other
	 */
	public String getOther() {
		return _Other;
	}
}