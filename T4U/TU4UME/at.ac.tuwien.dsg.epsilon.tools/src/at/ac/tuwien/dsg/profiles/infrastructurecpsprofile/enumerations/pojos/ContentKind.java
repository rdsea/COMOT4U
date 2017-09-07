package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the ContentKind enumeration
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@21658f0b (name: Enumeration) (instanceClassName: null) (abstract: false, interface: false)
uml::Enumeration
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class ContentKind {


		
	/*
	Static Variable for the literal Unspecified.
	*/ 
	public String _Unspecified = new String("Unspecified");
	

		
	/*
	Static Variable for the literal Empty.
	*/ 
	public String _Empty = new String("Empty");
	

		
	/*
	Static Variable for the literal Simple.
	*/ 
	public String _Simple = new String("Simple");
	

		
	/*
	Static Variable for the literal Mixed.
	*/ 
	public String _Mixed = new String("Mixed");
	

		
	/*
	Static Variable for the literal ElementOnly.
	*/ 
	public String _ElementOnly = new String("ElementOnly");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("ContentKind");

	public ContentKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ContentKind POJO class
		
		ContentKind enumeration = new ContentKind();
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
	 * @return the _Unspecified
	 */
	public String getUnspecified() {
		return _Unspecified;
	}
	/**
	 * @return the _Empty
	 */
	public String getEmpty() {
		return _Empty;
	}
	/**
	 * @return the _Simple
	 */
	public String getSimple() {
		return _Simple;
	}
	/**
	 * @return the _Mixed
	 */
	public String getMixed() {
		return _Mixed;
	}
	/**
	 * @return the _ElementOnly
	 */
	public String getElementOnly() {
		return _ElementOnly;
	}
}