package at.ac.tuwien.dsg.uml.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the Impact enumeration
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

public class Impact {


		
	/*
	Static Variable for the literal Strong.
	*/ 
	public String _Strong = new String("Strong");
	

		
	/*
	Static Variable for the literal Average.
	*/ 
	public String _Average = new String("Average");
	

		
	/*
	Static Variable for the literal Weak.
	*/ 
	public String _Weak = new String("Weak");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("Impact");

	public Impact() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the Impact POJO class
		
		Impact enumeration = new Impact();
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
	 * @return the _Strong
	 */
	public String getStrong() {
		return _Strong;
	}
	/**
	 * @return the _Average
	 */
	public String getAverage() {
		return _Average;
	}
	/**
	 * @return the _Weak
	 */
	public String getWeak() {
		return _Weak;
	}
}