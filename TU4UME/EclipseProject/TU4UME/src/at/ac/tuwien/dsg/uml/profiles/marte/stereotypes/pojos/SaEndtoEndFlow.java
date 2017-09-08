package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the SaEndtoEndFlow stereotype
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

public class SaEndtoEndFlow {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute isSched.
	*/ 
	private List<String> _isSched = new ArrayList<String>();
	

		
	/*
	Variable for the attribute schSlack.
	*/ 
	private List<String> _schSlack = new ArrayList<String>();
	

		
	/*
	Variable for the attribute end2EndT.
	*/ 
	private List<String> _end2EndT = new ArrayList<String>();
	

		
	/*
	Variable for the attribute end2EndD.
	*/ 
	private List<String> _end2EndD = new ArrayList<String>();
	

		
	/*
	Variable for the attribute timing.
	*/ 
	private List<String> _timing = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("SaEndtoEndFlow");

	public SaEndtoEndFlow() {
		/*
		Variable for the attribute isSched.
		*/ 
		this._isSched = new ArrayList<String>();
		/*
		Variable for the attribute schSlack.
		*/ 
		this._schSlack = new ArrayList<String>();
		/*
		Variable for the attribute end2EndT.
		*/ 
		this._end2EndT = new ArrayList<String>();
		/*
		Variable for the attribute end2EndD.
		*/ 
		this._end2EndD = new ArrayList<String>();
		/*
		Variable for the attribute timing.
		*/ 
		this._timing = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the SaEndtoEndFlow POJO class
		
		SaEndtoEndFlow _stereo = new SaEndtoEndFlow();
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
	 * @return the isSched
	 */
	public List<String> getIsSched() {
		return this._isSched;
	}
	/**
	 * @param isSched the isSched to add
	 */
	public void addIsSched(String _isSched) {
		this._isSched.add(_isSched.toString());
	}
	/**
	 * @return the schSlack
	 */
	public List<String> getSchSlack() {
		return this._schSlack;
	}
	/**
	 * @param schSlack the schSlack to add
	 */
	public void addSchSlack(String _schSlack) {
		this._schSlack.add(_schSlack.toString());
	}
	/**
	 * @return the end2EndT
	 */
	public List<String> getEnd2EndT() {
		return this._end2EndT;
	}
	/**
	 * @param end2EndT the end2EndT to add
	 */
	public void addEnd2EndT(String _end2EndT) {
		this._end2EndT.add(_end2EndT.toString());
	}
	/**
	 * @return the end2EndD
	 */
	public List<String> getEnd2EndD() {
		return this._end2EndD;
	}
	/**
	 * @param end2EndD the end2EndD to add
	 */
	public void addEnd2EndD(String _end2EndD) {
		this._end2EndD.add(_end2EndD.toString());
	}
	/**
	 * @return the timing
	 */
	public List<String> getTiming() {
		return this._timing;
	}
	/**
	 * @param timing the timing to add
	 */
	public void addTiming(String _timing) {
		this._timing.add(_timing.toString());
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