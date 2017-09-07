package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the TimeStandardKind enumeration
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

public class TimeStandardKind {


		
	/*
	Static Variable for the literal TAI.
	*/ 
	public String _TAI = new String("TAI");
	

		
	/*
	Static Variable for the literal UT0.
	*/ 
	public String _UT0 = new String("UT0");
	

		
	/*
	Static Variable for the literal UT1.
	*/ 
	public String _UT1 = new String("UT1");
	

		
	/*
	Static Variable for the literal UTC.
	*/ 
	public String _UTC = new String("UTC");
	

		
	/*
	Static Variable for the literal Local.
	*/ 
	public String _Local = new String("Local");
	

		
	/*
	Static Variable for the literal TT.
	*/ 
	public String _TT = new String("TT");
	

		
	/*
	Static Variable for the literal TBD.
	*/ 
	public String _TBD = new String("TBD");
	

		
	/*
	Static Variable for the literal TCG.
	*/ 
	public String _TCG = new String("TCG");
	

		
	/*
	Static Variable for the literal TCB.
	*/ 
	public String _TCB = new String("TCB");
	

		
	/*
	Static Variable for the literal Sidereal.
	*/ 
	public String _Sidereal = new String("Sidereal");
	

		
	/*
	Static Variable for the literal GPS.
	*/ 
	public String _GPS = new String("GPS");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("TimeStandardKind");

	public TimeStandardKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the TimeStandardKind POJO class
		
		TimeStandardKind enumeration = new TimeStandardKind();
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
	 * @return the _TAI
	 */
	public String getTAI() {
		return _TAI;
	}
	/**
	 * @return the _UT0
	 */
	public String getUT0() {
		return _UT0;
	}
	/**
	 * @return the _UT1
	 */
	public String getUT1() {
		return _UT1;
	}
	/**
	 * @return the _UTC
	 */
	public String getUTC() {
		return _UTC;
	}
	/**
	 * @return the _Local
	 */
	public String getLocal() {
		return _Local;
	}
	/**
	 * @return the _TT
	 */
	public String getTT() {
		return _TT;
	}
	/**
	 * @return the _TBD
	 */
	public String getTBD() {
		return _TBD;
	}
	/**
	 * @return the _TCG
	 */
	public String getTCG() {
		return _TCG;
	}
	/**
	 * @return the _TCB
	 */
	public String getTCB() {
		return _TCB;
	}
	/**
	 * @return the _Sidereal
	 */
	public String getSidereal() {
		return _Sidereal;
	}
	/**
	 * @return the _GPS
	 */
	public String getGPS() {
		return _GPS;
	}
}