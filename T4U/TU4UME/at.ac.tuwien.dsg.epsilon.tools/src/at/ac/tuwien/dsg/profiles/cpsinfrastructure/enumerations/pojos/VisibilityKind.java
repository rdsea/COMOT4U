package at.ac.tuwien.dsg.profiles.cpsinfrastructure.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the VisibilityKind enumeration
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@3c6dd051 (name: Enumeration) (instanceClassName: null) (abstract: false, interface: false)
uml::Enumeration
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class VisibilityKind {


		
	/*
	Static Variable for the literal Unspecified.
	*/ 
	public String _Unspecified = new String("Unspecified");
	

		
	/*
	Static Variable for the literal None.
	*/ 
	public String _None = new String("None");
	

		
	/*
	Static Variable for the literal ReadOnly.
	*/ 
	public String _ReadOnly = new String("ReadOnly");
	

		
	/*
	Static Variable for the literal ReadWrite.
	*/ 
	public String _ReadWrite = new String("ReadWrite");
	

		
	/*
	Static Variable for the literal ReadOnlyUnsettable.
	*/ 
	public String _ReadOnlyUnsettable = new String("ReadOnlyUnsettable");
	

		
	/*
	Static Variable for the literal ReadWriteUnsettable.
	*/ 
	public String _ReadWriteUnsettable = new String("ReadWriteUnsettable");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("VisibilityKind");

	public VisibilityKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the VisibilityKind POJO class
		
		VisibilityKind enumeration = new VisibilityKind();
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
	 * @return the _None
	 */
	public String getNone() {
		return _None;
	}
	/**
	 * @return the _ReadOnly
	 */
	public String getReadOnly() {
		return _ReadOnly;
	}
	/**
	 * @return the _ReadWrite
	 */
	public String getReadWrite() {
		return _ReadWrite;
	}
	/**
	 * @return the _ReadOnlyUnsettable
	 */
	public String getReadOnlyUnsettable() {
		return _ReadOnlyUnsettable;
	}
	/**
	 * @return the _ReadWriteUnsettable
	 */
	public String getReadWriteUnsettable() {
		return _ReadWriteUnsettable;
	}
}