package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the WritePolicy enumeration
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

public class WritePolicy {


		
	/*
	Static Variable for the literal writeBack.
	*/ 
	public String _writeBack = new String("writeBack");
	

		
	/*
	Static Variable for the literal writeThrough.
	*/ 
	public String _writeThrough = new String("writeThrough");
	

		
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
	private final String __type = new String ("WritePolicy");

	public WritePolicy() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the WritePolicy POJO class
		
		WritePolicy enumeration = new WritePolicy();
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
	 * @return the _writeBack
	 */
	public String getWriteBack() {
		return _writeBack;
	}
	/**
	 * @return the _writeThrough
	 */
	public String getWriteThrough() {
		return _writeThrough;
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