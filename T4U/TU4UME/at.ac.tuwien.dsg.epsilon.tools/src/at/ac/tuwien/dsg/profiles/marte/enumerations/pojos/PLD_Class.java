package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the PLD_Class enumeration
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

public class PLD_Class {


		
	/*
	Static Variable for the literal symetricalArray.
	*/ 
	public String _symetricalArray = new String("symetricalArray");
	

		
	/*
	Static Variable for the literal rowBased.
	*/ 
	public String _rowBased = new String("rowBased");
	

		
	/*
	Static Variable for the literal seaOfGates.
	*/ 
	public String _seaOfGates = new String("seaOfGates");
	

		
	/*
	Static Variable for the literal hierarchicalPLD.
	*/ 
	public String _hierarchicalPLD = new String("hierarchicalPLD");
	

		
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
	private final String __type = new String ("PLD_Class");

	public PLD_Class() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the PLD_Class POJO class
		
		PLD_Class enumeration = new PLD_Class();
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
	 * @return the _symetricalArray
	 */
	public String getSymetricalArray() {
		return _symetricalArray;
	}
	/**
	 * @return the _rowBased
	 */
	public String getRowBased() {
		return _rowBased;
	}
	/**
	 * @return the _seaOfGates
	 */
	public String getSeaOfGates() {
		return _seaOfGates;
	}
	/**
	 * @return the _hierarchicalPLD
	 */
	public String getHierarchicalPLD() {
		return _hierarchicalPLD;
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