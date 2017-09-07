package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the ObjectNodeOrderingKind enumeration
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

public class ObjectNodeOrderingKind {


		
	/*
	Static Variable for the literal unordered.
	*/ 
	public String _unordered = new String("unordered");
	

		
	/*
	Static Variable for the literal ordered.
	*/ 
	public String _ordered = new String("ordered");
	

		
	/*
	Static Variable for the literal LIFO.
	*/ 
	public String _LIFO = new String("LIFO");
	

		
	/*
	Static Variable for the literal FIFO.
	*/ 
	public String _FIFO = new String("FIFO");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("ObjectNodeOrderingKind");

	public ObjectNodeOrderingKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ObjectNodeOrderingKind POJO class
		
		ObjectNodeOrderingKind enumeration = new ObjectNodeOrderingKind();
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
	 * @return the _unordered
	 */
	public String getUnordered() {
		return _unordered;
	}
	/**
	 * @return the _ordered
	 */
	public String getOrdered() {
		return _ordered;
	}
	/**
	 * @return the _LIFO
	 */
	public String getLIFO() {
		return _LIFO;
	}
	/**
	 * @return the _FIFO
	 */
	public String getFIFO() {
		return _FIFO;
	}
}