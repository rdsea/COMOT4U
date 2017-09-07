package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the PseudostateKind enumeration
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

public class PseudostateKind {


		
	/*
	Static Variable for the literal initial.
	*/ 
	public String _initial = new String("initial");
	

		
	/*
	Static Variable for the literal deepHistory.
	*/ 
	public String _deepHistory = new String("deepHistory");
	

		
	/*
	Static Variable for the literal shallowHistory.
	*/ 
	public String _shallowHistory = new String("shallowHistory");
	

		
	/*
	Static Variable for the literal join.
	*/ 
	public String _join = new String("join");
	

		
	/*
	Static Variable for the literal fork.
	*/ 
	public String _fork = new String("fork");
	

		
	/*
	Static Variable for the literal junction.
	*/ 
	public String _junction = new String("junction");
	

		
	/*
	Static Variable for the literal choice.
	*/ 
	public String _choice = new String("choice");
	

		
	/*
	Static Variable for the literal entryPoint.
	*/ 
	public String _entryPoint = new String("entryPoint");
	

		
	/*
	Static Variable for the literal exitPoint.
	*/ 
	public String _exitPoint = new String("exitPoint");
	

		
	/*
	Static Variable for the literal terminate.
	*/ 
	public String _terminate = new String("terminate");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("PseudostateKind");

	public PseudostateKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the PseudostateKind POJO class
		
		PseudostateKind enumeration = new PseudostateKind();
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
	 * @return the _initial
	 */
	public String getInitial() {
		return _initial;
	}
	/**
	 * @return the _deepHistory
	 */
	public String getDeepHistory() {
		return _deepHistory;
	}
	/**
	 * @return the _shallowHistory
	 */
	public String getShallowHistory() {
		return _shallowHistory;
	}
	/**
	 * @return the _join
	 */
	public String getJoin() {
		return _join;
	}
	/**
	 * @return the _fork
	 */
	public String getFork() {
		return _fork;
	}
	/**
	 * @return the _junction
	 */
	public String getJunction() {
		return _junction;
	}
	/**
	 * @return the _choice
	 */
	public String getChoice() {
		return _choice;
	}
	/**
	 * @return the _entryPoint
	 */
	public String getEntryPoint() {
		return _entryPoint;
	}
	/**
	 * @return the _exitPoint
	 */
	public String getExitPoint() {
		return _exitPoint;
	}
	/**
	 * @return the _terminate
	 */
	public String getTerminate() {
		return _terminate;
	}
}