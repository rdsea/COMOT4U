package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the ConcurrencyKind enumeration
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

public class ConcurrencyKind {


		
	/*
	Static Variable for the literal reader.
	*/ 
	public String _reader = new String("reader");
	

		
	/*
	Static Variable for the literal writer.
	*/ 
	public String _writer = new String("writer");
	

		
	/*
	Static Variable for the literal parallel.
	*/ 
	public String _parallel = new String("parallel");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("ConcurrencyKind");

	public ConcurrencyKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ConcurrencyKind POJO class
		
		ConcurrencyKind enumeration = new ConcurrencyKind();
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
	 * @return the _reader
	 */
	public String getReader() {
		return _reader;
	}
	/**
	 * @return the _writer
	 */
	public String getWriter() {
		return _writer;
	}
	/**
	 * @return the _parallel
	 */
	public String getParallel() {
		return _parallel;
	}
}