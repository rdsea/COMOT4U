package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the IODeviceType enumeration
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@21658f0b (name: Enumeration) (instanceClassName: null) (abstract: false, interface: false)
uml::Enumeration
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class IODeviceType {


		
	/*
	Static Variable for the literal TouchScreen.
	*/ 
	public String _TouchScreen = new String("TouchScreen");
	

		
	/*
	Static Variable for the literal Camera.
	*/ 
	public String _Camera = new String("Camera");
	

		
	/*
	Static Variable for the literal GPSchip.
	*/ 
	public String _GPSchip = new String("GPSchip");
	

		
	/*
	Static Variable for the literal Speaker.
	*/ 
	public String _Speaker = new String("Speaker");
	

		
	/*
	Static Variable for the literal Microphone.
	*/ 
	public String _Microphone = new String("Microphone");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("IODeviceType");

	public IODeviceType() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the IODeviceType POJO class
		
		IODeviceType enumeration = new IODeviceType();
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
	 * @return the _TouchScreen
	 */
	public String getTouchScreen() {
		return _TouchScreen;
	}
	/**
	 * @return the _Camera
	 */
	public String getCamera() {
		return _Camera;
	}
	/**
	 * @return the _GPSchip
	 */
	public String getGPSchip() {
		return _GPSchip;
	}
	/**
	 * @return the _Speaker
	 */
	public String getSpeaker() {
		return _Speaker;
	}
	/**
	 * @return the _Microphone
	 */
	public String getMicrophone() {
		return _Microphone;
	}
}