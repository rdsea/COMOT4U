package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the ISA_Type enumeration
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

public class ISA_Type {


		
	/*
	Static Variable for the literal RISC.
	*/ 
	public String _RISC = new String("RISC");
	

		
	/*
	Static Variable for the literal CISC.
	*/ 
	public String _CISC = new String("CISC");
	

		
	/*
	Static Variable for the literal VLIW.
	*/ 
	public String _VLIW = new String("VLIW");
	

		
	/*
	Static Variable for the literal SIMD.
	*/ 
	public String _SIMD = new String("SIMD");
	

		
	/*
	Static Variable for the literal other.
	*/ 
	public String _other = new String("other");
	

		
	/*
	Static Variable for the literal undef.
	*/ 
	public String _undef = new String("undef");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("ISA_Type");

	public ISA_Type() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ISA_Type POJO class
		
		ISA_Type enumeration = new ISA_Type();
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
	 * @return the _RISC
	 */
	public String getRISC() {
		return _RISC;
	}
	/**
	 * @return the _CISC
	 */
	public String getCISC() {
		return _CISC;
	}
	/**
	 * @return the _VLIW
	 */
	public String getVLIW() {
		return _VLIW;
	}
	/**
	 * @return the _SIMD
	 */
	public String getSIMD() {
		return _SIMD;
	}
	/**
	 * @return the _other
	 */
	public String getOther() {
		return _other;
	}
	/**
	 * @return the _undef
	 */
	public String getUndef() {
		return _undef;
	}
}