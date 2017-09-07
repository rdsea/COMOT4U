package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the PeriodicServerKind enumeration
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

public class PeriodicServerKind {


		
	/*
	Static Variable for the literal Sporadic.
	*/ 
	public String _Sporadic = new String("Sporadic");
	

		
	/*
	Static Variable for the literal Deferrable.
	*/ 
	public String _Deferrable = new String("Deferrable");
	

		
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
	private final String __type = new String ("PeriodicServerKind");

	public PeriodicServerKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the PeriodicServerKind POJO class
		
		PeriodicServerKind enumeration = new PeriodicServerKind();
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
	 * @return the _Sporadic
	 */
	public String getSporadic() {
		return _Sporadic;
	}
	/**
	 * @return the _Deferrable
	 */
	public String getDeferrable() {
		return _Deferrable;
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