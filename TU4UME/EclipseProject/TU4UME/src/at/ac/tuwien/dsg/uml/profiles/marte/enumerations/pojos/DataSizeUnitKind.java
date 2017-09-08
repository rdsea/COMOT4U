package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the DataSizeUnitKind enumeration
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

public class DataSizeUnitKind {


		
	/*
	Static Variable for the literal bit.
	*/ 
	public String _bit = new String("bit");
	

		
	/*
	Static Variable for the literal Byte.
	*/ 
	public String _Byte = new String("Byte");
	

		
	/*
	Static Variable for the literal KB.
	*/ 
	public String _KB = new String("KB");
	

		
	/*
	Static Variable for the literal MB.
	*/ 
	public String _MB = new String("MB");
	

		
	/*
	Static Variable for the literal GB.
	*/ 
	public String _GB = new String("GB");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("DataSizeUnitKind");

	public DataSizeUnitKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the DataSizeUnitKind POJO class
		
		DataSizeUnitKind enumeration = new DataSizeUnitKind();
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
	 * @return the _bit
	 */
	public String getBit() {
		return _bit;
	}
	/**
	 * @return the _Byte
	 */
	public String getByte() {
		return _Byte;
	}
	/**
	 * @return the _KB
	 */
	public String getKB() {
		return _KB;
	}
	/**
	 * @return the _MB
	 */
	public String getMB() {
		return _MB;
	}
	/**
	 * @return the _GB
	 */
	public String getGB() {
		return _GB;
	}
}