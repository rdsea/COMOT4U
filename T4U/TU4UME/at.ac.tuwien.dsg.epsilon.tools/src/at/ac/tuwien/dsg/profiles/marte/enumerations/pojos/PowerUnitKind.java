package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the PowerUnitKind enumeration
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

public class PowerUnitKind {


		
	/*
	Static Variable for the literal W.
	*/ 
	public String _W = new String("W");
	

		
	/*
	Static Variable for the literal mW.
	*/ 
	public String _mW = new String("mW");
	

		
	/*
	Static Variable for the literal KW.
	*/ 
	public String _KW = new String("KW");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("PowerUnitKind");

	public PowerUnitKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the PowerUnitKind POJO class
		
		PowerUnitKind enumeration = new PowerUnitKind();
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
	 * @return the _W
	 */
	public String getW() {
		return _W;
	}
	/**
	 * @return the _mW
	 */
	public String getMW() {
		return _mW;
	}
	/**
	 * @return the _KW
	 */
	public String getKW() {
		return _KW;
	}
}