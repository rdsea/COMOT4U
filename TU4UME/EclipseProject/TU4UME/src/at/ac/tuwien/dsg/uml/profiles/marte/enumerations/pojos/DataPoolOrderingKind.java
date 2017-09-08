package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the DataPoolOrderingKind enumeration
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

public class DataPoolOrderingKind {


		
	/*
	Static Variable for the literal FIFO.
	*/ 
	public String _FIFO = new String("FIFO");
	

		
	/*
	Static Variable for the literal LIFO.
	*/ 
	public String _LIFO = new String("LIFO");
	

		
	/*
	Static Variable for the literal UserDefined.
	*/ 
	public String _UserDefined = new String("UserDefined");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("DataPoolOrderingKind");

	public DataPoolOrderingKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the DataPoolOrderingKind POJO class
		
		DataPoolOrderingKind enumeration = new DataPoolOrderingKind();
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
	 * @return the _FIFO
	 */
	public String getFIFO() {
		return _FIFO;
	}
	/**
	 * @return the _LIFO
	 */
	public String getLIFO() {
		return _LIFO;
	}
	/**
	 * @return the _UserDefined
	 */
	public String getUserDefined() {
		return _UserDefined;
	}
}