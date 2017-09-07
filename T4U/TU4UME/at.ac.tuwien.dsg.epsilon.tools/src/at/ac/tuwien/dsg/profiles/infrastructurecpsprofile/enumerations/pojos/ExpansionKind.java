package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the ExpansionKind enumeration
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

public class ExpansionKind {


		
	/*
	Static Variable for the literal parallel.
	*/ 
	public String _parallel = new String("parallel");
	

		
	/*
	Static Variable for the literal iterative.
	*/ 
	public String _iterative = new String("iterative");
	

		
	/*
	Static Variable for the literal stream.
	*/ 
	public String _stream = new String("stream");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("ExpansionKind");

	public ExpansionKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ExpansionKind POJO class
		
		ExpansionKind enumeration = new ExpansionKind();
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
	 * @return the _parallel
	 */
	public String getParallel() {
		return _parallel;
	}
	/**
	 * @return the _iterative
	 */
	public String getIterative() {
		return _iterative;
	}
	/**
	 * @return the _stream
	 */
	public String getStream() {
		return _stream;
	}
}