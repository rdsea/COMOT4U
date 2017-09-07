package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the Repl_Policy enumeration
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

public class Repl_Policy {


		
	/*
	Static Variable for the literal LRU.
	*/ 
	public String _LRU = new String("LRU");
	

		
	/*
	Static Variable for the literal NFU.
	*/ 
	public String _NFU = new String("NFU");
	

		
	/*
	Static Variable for the literal FIFO.
	*/ 
	public String _FIFO = new String("FIFO");
	

		
	/*
	Static Variable for the literal random.
	*/ 
	public String _random = new String("random");
	

		
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
	private final String __type = new String ("Repl_Policy");

	public Repl_Policy() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the Repl_Policy POJO class
		
		Repl_Policy enumeration = new Repl_Policy();
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
	 * @return the _LRU
	 */
	public String getLRU() {
		return _LRU;
	}
	/**
	 * @return the _NFU
	 */
	public String getNFU() {
		return _NFU;
	}
	/**
	 * @return the _FIFO
	 */
	public String getFIFO() {
		return _FIFO;
	}
	/**
	 * @return the _random
	 */
	public String getRandom() {
		return _random;
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