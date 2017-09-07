package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the TimeUnitKind enumeration
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

public class TimeUnitKind {


		
	/*
	Static Variable for the literal s.
	*/ 
	public String _s = new String("s");
	

		
	/*
	Static Variable for the literal ms.
	*/ 
	public String _ms = new String("ms");
	

		
	/*
	Static Variable for the literal us.
	*/ 
	public String _us = new String("us");
	

		
	/*
	Static Variable for the literal ns.
	*/ 
	public String _ns = new String("ns");
	

		
	/*
	Static Variable for the literal min.
	*/ 
	public String _min = new String("min");
	

		
	/*
	Static Variable for the literal hrs.
	*/ 
	public String _hrs = new String("hrs");
	

		
	/*
	Static Variable for the literal day.
	*/ 
	public String _day = new String("day");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("TimeUnitKind");

	public TimeUnitKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the TimeUnitKind POJO class
		
		TimeUnitKind enumeration = new TimeUnitKind();
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
	 * @return the _s
	 */
	public String getS() {
		return _s;
	}
	/**
	 * @return the _ms
	 */
	public String getMs() {
		return _ms;
	}
	/**
	 * @return the _us
	 */
	public String getUs() {
		return _us;
	}
	/**
	 * @return the _ns
	 */
	public String getNs() {
		return _ns;
	}
	/**
	 * @return the _min
	 */
	public String getMin() {
		return _min;
	}
	/**
	 * @return the _hrs
	 */
	public String getHrs() {
		return _hrs;
	}
	/**
	 * @return the _day
	 */
	public String getDay() {
		return _day;
	}
}