package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the GaAnalysisContext stereotype
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@4c06bbf9 (name: Stereotype) (instanceClassName: null) (abstract: false, interface: false)
uml::Stereotype
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class GaAnalysisContext {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute context.
	*/ 
	private List<String> _context = new ArrayList<String>();
	

		
	/*
	Variable for the attribute workload.
	*/ 
	private List<String> _workload = new ArrayList<String>();
	

		
	/*
	Variable for the attribute platform.
	*/ 
	private List<String> _platform = new ArrayList<String>();
	

		
	/*
	Variable for the attribute mode.
	*/ 
	private List<String> _mode = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("GaAnalysisContext");

	public GaAnalysisContext() {
		/*
		Variable for the attribute context.
		*/ 
		this._context = new ArrayList<String>();
		/*
		Variable for the attribute workload.
		*/ 
		this._workload = new ArrayList<String>();
		/*
		Variable for the attribute platform.
		*/ 
		this._platform = new ArrayList<String>();
		/*
		Variable for the attribute mode.
		*/ 
		this._mode = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the GaAnalysisContext POJO class
		
		GaAnalysisContext _stereo = new GaAnalysisContext();
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
	 * @return the context
	 */
	public List<String> getContext() {
		return this._context;
	}
	/**
	 * @param context the context to add
	 */
	public void addContext(String _context) {
		this._context.add(_context.toString());
	}
	/**
	 * @return the workload
	 */
	public List<String> getWorkload() {
		return this._workload;
	}
	/**
	 * @param workload the workload to add
	 */
	public void addWorkload(String _workload) {
		this._workload.add(_workload.toString());
	}
	/**
	 * @return the platform
	 */
	public List<String> getPlatform() {
		return this._platform;
	}
	/**
	 * @param platform the platform to add
	 */
	public void addPlatform(String _platform) {
		this._platform.add(_platform.toString());
	}
	/**
	 * @return the mode
	 */
	public List<String> getMode() {
		return this._mode;
	}
	/**
	 * @param mode the mode to add
	 */
	public void addMode(String _mode) {
		this._mode.add(_mode.toString());
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