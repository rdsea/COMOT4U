package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the AccessPolicyKind enumeration
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

public class AccessPolicyKind {


		
	/*
	Static Variable for the literal Read.
	*/ 
	public String _Read = new String("Read");
	

		
	/*
	Static Variable for the literal Write.
	*/ 
	public String _Write = new String("Write");
	

		
	/*
	Static Variable for the literal ReadWrite.
	*/ 
	public String _ReadWrite = new String("ReadWrite");
	

		
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
	private final String __type = new String ("AccessPolicyKind");

	public AccessPolicyKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the AccessPolicyKind POJO class
		
		AccessPolicyKind enumeration = new AccessPolicyKind();
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
	 * @return the _Read
	 */
	public String getRead() {
		return _Read;
	}
	/**
	 * @return the _Write
	 */
	public String getWrite() {
		return _Write;
	}
	/**
	 * @return the _ReadWrite
	 */
	public String getReadWrite() {
		return _ReadWrite;
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