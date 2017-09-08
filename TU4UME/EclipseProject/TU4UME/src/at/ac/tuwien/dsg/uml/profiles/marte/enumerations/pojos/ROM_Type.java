package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the ROM_Type enumeration
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

public class ROM_Type {


		
	/*
	Static Variable for the literal maskedROM.
	*/ 
	public String _maskedROM = new String("maskedROM");
	

		
	/*
	Static Variable for the literal EPROM.
	*/ 
	public String _EPROM = new String("EPROM");
	

		
	/*
	Static Variable for the literal OTP_EPROM.
	*/ 
	public String _OTP_EPROM = new String("OTP_EPROM");
	

		
	/*
	Static Variable for the literal EEPROM.
	*/ 
	public String _EEPROM = new String("EEPROM");
	

		
	/*
	Static Variable for the literal Flash.
	*/ 
	public String _Flash = new String("Flash");
	

		
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
	private final String __type = new String ("ROM_Type");

	public ROM_Type() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ROM_Type POJO class
		
		ROM_Type enumeration = new ROM_Type();
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
	 * @return the _maskedROM
	 */
	public String getMaskedROM() {
		return _maskedROM;
	}
	/**
	 * @return the _EPROM
	 */
	public String getEPROM() {
		return _EPROM;
	}
	/**
	 * @return the _OTP_EPROM
	 */
	public String getOTP_EPROM() {
		return _OTP_EPROM;
	}
	/**
	 * @return the _EEPROM
	 */
	public String getEEPROM() {
		return _EEPROM;
	}
	/**
	 * @return the _Flash
	 */
	public String getFlash() {
		return _Flash;
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