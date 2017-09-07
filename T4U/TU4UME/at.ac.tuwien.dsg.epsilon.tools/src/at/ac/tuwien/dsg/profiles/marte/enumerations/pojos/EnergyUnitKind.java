package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the EnergyUnitKind enumeration
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

public class EnergyUnitKind {


		
	/*
	Static Variable for the literal J.
	*/ 
	public String _J = new String("J");
	

		
	/*
	Static Variable for the literal KJ.
	*/ 
	public String _KJ = new String("KJ");
	

		
	/*
	Static Variable for the literal Wh.
	*/ 
	public String _Wh = new String("Wh");
	

		
	/*
	Static Variable for the literal KWh.
	*/ 
	public String _KWh = new String("KWh");
	

		
	/*
	Static Variable for the literal mWh.
	*/ 
	public String _mWh = new String("mWh");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("EnergyUnitKind");

	public EnergyUnitKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the EnergyUnitKind POJO class
		
		EnergyUnitKind enumeration = new EnergyUnitKind();
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
	 * @return the _J
	 */
	public String getJ() {
		return _J;
	}
	/**
	 * @return the _KJ
	 */
	public String getKJ() {
		return _KJ;
	}
	/**
	 * @return the _Wh
	 */
	public String getWh() {
		return _Wh;
	}
	/**
	 * @return the _KWh
	 */
	public String getKWh() {
		return _KWh;
	}
	/**
	 * @return the _mWh
	 */
	public String getMWh() {
		return _mWh;
	}
}