package at.ac.tuwien.dsg.uml.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the ParameterEffectKind enumeration
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

public class ParameterEffectKind {


		
	/*
	Static Variable for the literal create.
	*/ 
	public String _create = new String("create");
	

		
	/*
	Static Variable for the literal read.
	*/ 
	public String _read = new String("read");
	

		
	/*
	Static Variable for the literal update.
	*/ 
	public String _update = new String("update");
	

		
	/*
	Static Variable for the literal delete.
	*/ 
	public String _delete = new String("delete");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("ParameterEffectKind");

	public ParameterEffectKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ParameterEffectKind POJO class
		
		ParameterEffectKind enumeration = new ParameterEffectKind();
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
	 * @return the _create
	 */
	public String getCreate() {
		return _create;
	}
	/**
	 * @return the _read
	 */
	public String getRead() {
		return _read;
	}
	/**
	 * @return the _update
	 */
	public String getUpdate() {
		return _update;
	}
	/**
	 * @return the _delete
	 */
	public String getDelete() {
		return _delete;
	}
}