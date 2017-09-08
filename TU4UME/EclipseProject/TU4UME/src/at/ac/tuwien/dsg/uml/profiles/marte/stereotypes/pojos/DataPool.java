package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the DataPool stereotype
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

public class DataPool {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute ordering.
	*/ 
	private List<String> _ordering = new ArrayList<String>();
	

		
	/*
	Variable for the attribute insertion.
	*/ 
	private List<String> _insertion = new ArrayList<String>();
	

		
	/*
	Variable for the attribute selection.
	*/ 
	private List<String> _selection = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("DataPool");

	public DataPool() {
		/*
		Variable for the attribute ordering.
		*/ 
		this._ordering = new ArrayList<String>();
		/*
		Variable for the attribute insertion.
		*/ 
		this._insertion = new ArrayList<String>();
		/*
		Variable for the attribute selection.
		*/ 
		this._selection = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the DataPool POJO class
		
		DataPool _stereo = new DataPool();
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
	 * @return the ordering
	 */
	public List<String> getOrdering() {
		return this._ordering;
	}
	/**
	 * @param ordering the ordering to add
	 */
	public void addOrdering(String _ordering) {
		this._ordering.add(_ordering.toString());
	}
	/**
	 * @return the insertion
	 */
	public List<String> getInsertion() {
		return this._insertion;
	}
	/**
	 * @param insertion the insertion to add
	 */
	public void addInsertion(String _insertion) {
		this._insertion.add(_insertion.toString());
	}
	/**
	 * @return the selection
	 */
	public List<String> getSelection() {
		return this._selection;
	}
	/**
	 * @param selection the selection to add
	 */
	public void addSelection(String _selection) {
		this._selection.add(_selection.toString());
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