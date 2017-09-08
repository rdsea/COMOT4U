package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the GaWorkloadEvent stereotype
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

public class GaWorkloadEvent {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute pattern.
	*/ 
	private List<String> _pattern = new ArrayList<String>();
	

		
	/*
	Variable for the attribute generator.
	*/ 
	private List<String> _generator = new ArrayList<String>();
	

		
	/*
	Variable for the attribute trace.
	*/ 
	private List<String> _trace = new ArrayList<String>();
	

		
	/*
	Variable for the attribute effect.
	*/ 
	private List<String> _effect = new ArrayList<String>();
	

		
	/*
	Variable for the attribute timedEvent.
	*/ 
	private List<String> _timedEvent = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("GaWorkloadEvent");

	public GaWorkloadEvent() {
		/*
		Variable for the attribute pattern.
		*/ 
		this._pattern = new ArrayList<String>();
		/*
		Variable for the attribute generator.
		*/ 
		this._generator = new ArrayList<String>();
		/*
		Variable for the attribute trace.
		*/ 
		this._trace = new ArrayList<String>();
		/*
		Variable for the attribute effect.
		*/ 
		this._effect = new ArrayList<String>();
		/*
		Variable for the attribute timedEvent.
		*/ 
		this._timedEvent = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the GaWorkloadEvent POJO class
		
		GaWorkloadEvent _stereo = new GaWorkloadEvent();
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
	 * @return the pattern
	 */
	public List<String> getPattern() {
		return this._pattern;
	}
	/**
	 * @param pattern the pattern to add
	 */
	public void addPattern(String _pattern) {
		this._pattern.add(_pattern.toString());
	}
	/**
	 * @return the generator
	 */
	public List<String> getGenerator() {
		return this._generator;
	}
	/**
	 * @param generator the generator to add
	 */
	public void addGenerator(String _generator) {
		this._generator.add(_generator.toString());
	}
	/**
	 * @return the trace
	 */
	public List<String> getTrace() {
		return this._trace;
	}
	/**
	 * @param trace the trace to add
	 */
	public void addTrace(String _trace) {
		this._trace.add(_trace.toString());
	}
	/**
	 * @return the effect
	 */
	public List<String> getEffect() {
		return this._effect;
	}
	/**
	 * @param effect the effect to add
	 */
	public void addEffect(String _effect) {
		this._effect.add(_effect.toString());
	}
	/**
	 * @return the timedEvent
	 */
	public List<String> getTimedEvent() {
		return this._timedEvent;
	}
	/**
	 * @param timedEvent the timedEvent to add
	 */
	public void addTimedEvent(String _timedEvent) {
		this._timedEvent.add(_timedEvent.toString());
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