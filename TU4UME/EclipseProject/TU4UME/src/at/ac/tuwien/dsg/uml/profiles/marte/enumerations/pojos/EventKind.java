package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the EventKind enumeration
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

public class EventKind {


		
	/*
	Static Variable for the literal start.
	*/ 
	public String _start = new String("start");
	

		
	/*
	Static Variable for the literal finish.
	*/ 
	public String _finish = new String("finish");
	

		
	/*
	Static Variable for the literal send.
	*/ 
	public String _send = new String("send");
	

		
	/*
	Static Variable for the literal receive.
	*/ 
	public String _receive = new String("receive");
	

		
	/*
	Static Variable for the literal consume.
	*/ 
	public String _consume = new String("consume");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("EventKind");

	public EventKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the EventKind POJO class
		
		EventKind enumeration = new EventKind();
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
	 * @return the _start
	 */
	public String getStart() {
		return _start;
	}
	/**
	 * @return the _finish
	 */
	public String getFinish() {
		return _finish;
	}
	/**
	 * @return the _send
	 */
	public String getSend() {
		return _send;
	}
	/**
	 * @return the _receive
	 */
	public String getReceive() {
		return _receive;
	}
	/**
	 * @return the _consume
	 */
	public String getConsume() {
		return _consume;
	}
}