package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the TimedProcessing stereotype
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@5947c75e (name: Stereotype) (instanceClassName: null) (abstract: false, interface: false)
uml::Stereotype
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.tu4ume.epsilon.externaltools.SampleTool;

public class TimedProcessing {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute duration.
	*/ 
	private List<String> _duration = new ArrayList<String>();
	

		
	/*
	Variable for the attribute start.
	*/ 
	private List<String> _start = new ArrayList<String>();
	

		
	/*
	Variable for the attribute finish.
	*/ 
	private List<String> _finish = new ArrayList<String>();
	

		
	/*
	Variable for the attribute on.
	*/ 
	private List<String> _on = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("TimedProcessing");

	public TimedProcessing() {
		/*
		Variable for the attribute duration.
		*/ 
		this._duration = new ArrayList<String>();
		/*
		Variable for the attribute start.
		*/ 
		this._start = new ArrayList<String>();
		/*
		Variable for the attribute finish.
		*/ 
		this._finish = new ArrayList<String>();
		/*
		Variable for the attribute on.
		*/ 
		this._on = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the TimedProcessing POJO class
		
		TimedProcessing _stereo = new TimedProcessing();
		_stereo.toJson();
		
	}
	
	public String toJson(){
	

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        // Convert numbers array into JSON string.
        String _element = gson.toJson(this);
        
        System.out.println("element = " + _element);    
        
        return _element;   
	}

	/**
	 * @return the duration
	 */
	public List<String> getDuration() {
		return this._duration;
	}
	/**
	 * @param duration the duration to add
	 */
	public void addDuration(String _duration) {
		this._duration.add(_duration.toString());
	}
	/**
	 * @return the start
	 */
	public List<String> getStart() {
		return this._start;
	}
	/**
	 * @param start the start to add
	 */
	public void addStart(String _start) {
		this._start.add(_start.toString());
	}
	/**
	 * @return the finish
	 */
	public List<String> getFinish() {
		return this._finish;
	}
	/**
	 * @param finish the finish to add
	 */
	public void addFinish(String _finish) {
		this._finish.add(_finish.toString());
	}
	/**
	 * @return the on
	 */
	public List<String> getOn() {
		return this._on;
	}
	/**
	 * @param on the on to add
	 */
	public void addOn(String _on) {
		this._on.add(_on.toString());
	}
	/**
	 * @return the _name
	 */
	public String getName() {
		return this.__name;
	}
	/**
	 * @param end the Communication to add
	 */
	public void setName(String __name) {
		this.__name = __name;
	}
	
}