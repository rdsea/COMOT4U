package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the NotificationResourceKind enumeration
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

public class NotificationResourceKind {


		
	/*
	Static Variable for the literal Event.
	*/ 
	public String _Event = new String("Event");
	

		
	/*
	Static Variable for the literal Barrier.
	*/ 
	public String _Barrier = new String("Barrier");
	

		
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
	private final String __type = new String ("NotificationResourceKind");

	public NotificationResourceKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the NotificationResourceKind POJO class
		
		NotificationResourceKind enumeration = new NotificationResourceKind();
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
	 * @return the _Event
	 */
	public String getEvent() {
		return _Event;
	}
	/**
	 * @return the _Barrier
	 */
	public String getBarrier() {
		return _Barrier;
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