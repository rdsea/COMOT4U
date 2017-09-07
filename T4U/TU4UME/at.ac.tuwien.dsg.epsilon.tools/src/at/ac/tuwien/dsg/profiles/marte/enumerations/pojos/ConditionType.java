package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the ConditionType enumeration
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

public class ConditionType {


		
	/*
	Static Variable for the literal temperature.
	*/ 
	public String _temperature = new String("temperature");
	

		
	/*
	Static Variable for the literal humidity.
	*/ 
	public String _humidity = new String("humidity");
	

		
	/*
	Static Variable for the literal altitude.
	*/ 
	public String _altitude = new String("altitude");
	

		
	/*
	Static Variable for the literal vibration.
	*/ 
	public String _vibration = new String("vibration");
	

		
	/*
	Static Variable for the literal shock.
	*/ 
	public String _shock = new String("shock");
	

		
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
	private final String __type = new String ("ConditionType");

	public ConditionType() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ConditionType POJO class
		
		ConditionType enumeration = new ConditionType();
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
	 * @return the _temperature
	 */
	public String getTemperature() {
		return _temperature;
	}
	/**
	 * @return the _humidity
	 */
	public String getHumidity() {
		return _humidity;
	}
	/**
	 * @return the _altitude
	 */
	public String getAltitude() {
		return _altitude;
	}
	/**
	 * @return the _vibration
	 */
	public String getVibration() {
		return _vibration;
	}
	/**
	 * @return the _shock
	 */
	public String getShock() {
		return _shock;
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