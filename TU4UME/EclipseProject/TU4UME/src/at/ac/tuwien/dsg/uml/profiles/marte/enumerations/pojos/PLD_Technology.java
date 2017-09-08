package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the PLD_Technology enumeration
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

public class PLD_Technology {


		
	/*
	Static Variable for the literal SRAM.
	*/ 
	public String _SRAM = new String("SRAM");
	

		
	/*
	Static Variable for the literal antifuse.
	*/ 
	public String _antifuse = new String("antifuse");
	

		
	/*
	Static Variable for the literal flash.
	*/ 
	public String _flash = new String("flash");
	

		
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
	private final String __type = new String ("PLD_Technology");

	public PLD_Technology() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the PLD_Technology POJO class
		
		PLD_Technology enumeration = new PLD_Technology();
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
	 * @return the _SRAM
	 */
	public String getSRAM() {
		return _SRAM;
	}
	/**
	 * @return the _antifuse
	 */
	public String getAntifuse() {
		return _antifuse;
	}
	/**
	 * @return the _flash
	 */
	public String getFlash() {
		return _flash;
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