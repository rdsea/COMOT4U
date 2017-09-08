package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the ConcurrentAccessProtocolKind enumeration
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

public class ConcurrentAccessProtocolKind {


		
	/*
	Static Variable for the literal PIP.
	*/ 
	public String _PIP = new String("PIP");
	

		
	/*
	Static Variable for the literal PCP.
	*/ 
	public String _PCP = new String("PCP");
	

		
	/*
	Static Variable for the literal NoPreemption.
	*/ 
	public String _NoPreemption = new String("NoPreemption");
	

		
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
	private final String __type = new String ("ConcurrentAccessProtocolKind");

	public ConcurrentAccessProtocolKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ConcurrentAccessProtocolKind POJO class
		
		ConcurrentAccessProtocolKind enumeration = new ConcurrentAccessProtocolKind();
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
	 * @return the _PIP
	 */
	public String getPIP() {
		return _PIP;
	}
	/**
	 * @return the _PCP
	 */
	public String getPCP() {
		return _PCP;
	}
	/**
	 * @return the _NoPreemption
	 */
	public String getNoPreemption() {
		return _NoPreemption;
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