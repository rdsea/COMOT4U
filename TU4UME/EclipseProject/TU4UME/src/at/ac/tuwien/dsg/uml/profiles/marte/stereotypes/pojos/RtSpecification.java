package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the RtSpecification stereotype
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

public class RtSpecification {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute utility.
	*/ 
	private List<String> _utility = new ArrayList<String>();
	

		
	/*
	Variable for the attribute occKind.
	*/ 
	private List<String> _occKind = new ArrayList<String>();
	

		
	/*
	Variable for the attribute tRef.
	*/ 
	private List<String> _tRef = new ArrayList<String>();
	

		
	/*
	Variable for the attribute relDl.
	*/ 
	private List<String> _relDl = new ArrayList<String>();
	

		
	/*
	Variable for the attribute absDl.
	*/ 
	private List<String> _absDl = new ArrayList<String>();
	

		
	/*
	Variable for the attribute boundDl.
	*/ 
	private List<String> _boundDl = new ArrayList<String>();
	

		
	/*
	Variable for the attribute rdTime.
	*/ 
	private List<String> _rdTime = new ArrayList<String>();
	

		
	/*
	Variable for the attribute miss.
	*/ 
	private List<String> _miss = new ArrayList<String>();
	

		
	/*
	Variable for the attribute priority.
	*/ 
	private List<String> _priority = new ArrayList<String>();
	

		
	/*
	Variable for the attribute context.
	*/ 
	private List<String> _context = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("RtSpecification");

	public RtSpecification() {
		/*
		Variable for the attribute utility.
		*/ 
		this._utility = new ArrayList<String>();
		/*
		Variable for the attribute occKind.
		*/ 
		this._occKind = new ArrayList<String>();
		/*
		Variable for the attribute tRef.
		*/ 
		this._tRef = new ArrayList<String>();
		/*
		Variable for the attribute relDl.
		*/ 
		this._relDl = new ArrayList<String>();
		/*
		Variable for the attribute absDl.
		*/ 
		this._absDl = new ArrayList<String>();
		/*
		Variable for the attribute boundDl.
		*/ 
		this._boundDl = new ArrayList<String>();
		/*
		Variable for the attribute rdTime.
		*/ 
		this._rdTime = new ArrayList<String>();
		/*
		Variable for the attribute miss.
		*/ 
		this._miss = new ArrayList<String>();
		/*
		Variable for the attribute priority.
		*/ 
		this._priority = new ArrayList<String>();
		/*
		Variable for the attribute context.
		*/ 
		this._context = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the RtSpecification POJO class
		
		RtSpecification _stereo = new RtSpecification();
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
	 * @return the utility
	 */
	public List<String> getUtility() {
		return this._utility;
	}
	/**
	 * @param utility the utility to add
	 */
	public void addUtility(String _utility) {
		this._utility.add(_utility.toString());
	}
	/**
	 * @return the occKind
	 */
	public List<String> getOccKind() {
		return this._occKind;
	}
	/**
	 * @param occKind the occKind to add
	 */
	public void addOccKind(String _occKind) {
		this._occKind.add(_occKind.toString());
	}
	/**
	 * @return the tRef
	 */
	public List<String> getTRef() {
		return this._tRef;
	}
	/**
	 * @param tRef the tRef to add
	 */
	public void addTRef(String _tRef) {
		this._tRef.add(_tRef.toString());
	}
	/**
	 * @return the relDl
	 */
	public List<String> getRelDl() {
		return this._relDl;
	}
	/**
	 * @param relDl the relDl to add
	 */
	public void addRelDl(String _relDl) {
		this._relDl.add(_relDl.toString());
	}
	/**
	 * @return the absDl
	 */
	public List<String> getAbsDl() {
		return this._absDl;
	}
	/**
	 * @param absDl the absDl to add
	 */
	public void addAbsDl(String _absDl) {
		this._absDl.add(_absDl.toString());
	}
	/**
	 * @return the boundDl
	 */
	public List<String> getBoundDl() {
		return this._boundDl;
	}
	/**
	 * @param boundDl the boundDl to add
	 */
	public void addBoundDl(String _boundDl) {
		this._boundDl.add(_boundDl.toString());
	}
	/**
	 * @return the rdTime
	 */
	public List<String> getRdTime() {
		return this._rdTime;
	}
	/**
	 * @param rdTime the rdTime to add
	 */
	public void addRdTime(String _rdTime) {
		this._rdTime.add(_rdTime.toString());
	}
	/**
	 * @return the miss
	 */
	public List<String> getMiss() {
		return this._miss;
	}
	/**
	 * @param miss the miss to add
	 */
	public void addMiss(String _miss) {
		this._miss.add(_miss.toString());
	}
	/**
	 * @return the priority
	 */
	public List<String> getPriority() {
		return this._priority;
	}
	/**
	 * @param priority the priority to add
	 */
	public void addPriority(String _priority) {
		this._priority.add(_priority.toString());
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