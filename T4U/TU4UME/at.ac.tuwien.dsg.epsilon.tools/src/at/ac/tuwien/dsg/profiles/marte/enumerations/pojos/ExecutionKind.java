package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the ExecutionKind enumeration
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

public class ExecutionKind {


		
	/*
	Static Variable for the literal deferred.
	*/ 
	public String _deferred = new String("deferred");
	

		
	/*
	Static Variable for the literal remoteImmediate.
	*/ 
	public String _remoteImmediate = new String("remoteImmediate");
	

		
	/*
	Static Variable for the literal localImmediate.
	*/ 
	public String _localImmediate = new String("localImmediate");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("ExecutionKind");

	public ExecutionKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ExecutionKind POJO class
		
		ExecutionKind enumeration = new ExecutionKind();
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
	 * @return the _deferred
	 */
	public String getDeferred() {
		return _deferred;
	}
	/**
	 * @return the _remoteImmediate
	 */
	public String getRemoteImmediate() {
		return _remoteImmediate;
	}
	/**
	 * @return the _localImmediate
	 */
	public String getLocalImmediate() {
		return _localImmediate;
	}
}