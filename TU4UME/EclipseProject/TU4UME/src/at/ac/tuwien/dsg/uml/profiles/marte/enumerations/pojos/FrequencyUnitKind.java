package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the FrequencyUnitKind enumeration
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

public class FrequencyUnitKind {


		
	/*
	Static Variable for the literal Hz.
	*/ 
	public String _Hz = new String("Hz");
	

		
	/*
	Static Variable for the literal KHz.
	*/ 
	public String _KHz = new String("KHz");
	

		
	/*
	Static Variable for the literal MHz.
	*/ 
	public String _MHz = new String("MHz");
	

		
	/*
	Static Variable for the literal GHz.
	*/ 
	public String _GHz = new String("GHz");
	

		
	/*
	Static Variable for the literal rpm.
	*/ 
	public String _rpm = new String("rpm");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("FrequencyUnitKind");

	public FrequencyUnitKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the FrequencyUnitKind POJO class
		
		FrequencyUnitKind enumeration = new FrequencyUnitKind();
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
	 * @return the _Hz
	 */
	public String getHz() {
		return _Hz;
	}
	/**
	 * @return the _KHz
	 */
	public String getKHz() {
		return _KHz;
	}
	/**
	 * @return the _MHz
	 */
	public String getMHz() {
		return _MHz;
	}
	/**
	 * @return the _GHz
	 */
	public String getGHz() {
		return _GHz;
	}
	/**
	 * @return the _rpm
	 */
	public String getRpm() {
		return _rpm;
	}
}