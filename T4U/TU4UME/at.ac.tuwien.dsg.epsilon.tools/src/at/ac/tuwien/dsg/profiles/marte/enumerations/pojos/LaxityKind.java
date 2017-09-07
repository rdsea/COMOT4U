package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the LaxityKind enumeration
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

public class LaxityKind {


		
	/*
	Static Variable for the literal hard.
	*/ 
	public String _hard = new String("hard");
	

		
	/*
	Static Variable for the literal soft.
	*/ 
	public String _soft = new String("soft");
	

		
	/*
	Static Variable for the literal other.
	*/ 
	public String _other = new String("other");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("LaxityKind");

	public LaxityKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the LaxityKind POJO class
		
		LaxityKind enumeration = new LaxityKind();
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
	 * @return the _hard
	 */
	public String getHard() {
		return _hard;
	}
	/**
	 * @return the _soft
	 */
	public String getSoft() {
		return _soft;
	}
	/**
	 * @return the _other
	 */
	public String getOther() {
		return _other;
	}
}