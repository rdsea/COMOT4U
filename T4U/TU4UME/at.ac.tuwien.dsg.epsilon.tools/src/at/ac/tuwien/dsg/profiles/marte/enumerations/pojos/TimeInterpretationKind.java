package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the TimeInterpretationKind enumeration
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

public class TimeInterpretationKind {


		
	/*
	Static Variable for the literal duration.
	*/ 
	public String _duration = new String("duration");
	

		
	/*
	Static Variable for the literal instant.
	*/ 
	public String _instant = new String("instant");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("TimeInterpretationKind");

	public TimeInterpretationKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the TimeInterpretationKind POJO class
		
		TimeInterpretationKind enumeration = new TimeInterpretationKind();
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
	 * @return the _duration
	 */
	public String getDuration() {
		return _duration;
	}
	/**
	 * @return the _instant
	 */
	public String getInstant() {
		return _instant;
	}
}