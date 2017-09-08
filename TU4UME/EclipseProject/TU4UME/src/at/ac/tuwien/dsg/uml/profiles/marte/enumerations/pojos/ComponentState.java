package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the ComponentState enumeration
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

public class ComponentState {


		
	/*
	Static Variable for the literal operating.
	*/ 
	public String _operating = new String("operating");
	

		
	/*
	Static Variable for the literal storage.
	*/ 
	public String _storage = new String("storage");
	

		
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
	private final String __type = new String ("ComponentState");

	public ComponentState() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ComponentState POJO class
		
		ComponentState enumeration = new ComponentState();
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
	 * @return the _operating
	 */
	public String getOperating() {
		return _operating;
	}
	/**
	 * @return the _storage
	 */
	public String getStorage() {
		return _storage;
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