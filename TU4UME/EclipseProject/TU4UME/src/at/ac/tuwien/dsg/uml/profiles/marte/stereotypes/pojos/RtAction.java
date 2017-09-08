package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the RtAction stereotype
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

public class RtAction {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute isAtomic.
	*/ 
	private List<String> _isAtomic = new ArrayList<String>();
	

		
	/*
	Variable for the attribute synchKind.
	*/ 
	private List<String> _synchKind = new ArrayList<String>();
	

		
	/*
	Variable for the attribute msgSize.
	*/ 
	private List<String> _msgSize = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("RtAction");

	public RtAction() {
		/*
		Variable for the attribute isAtomic.
		*/ 
		this._isAtomic = new ArrayList<String>();
		/*
		Variable for the attribute synchKind.
		*/ 
		this._synchKind = new ArrayList<String>();
		/*
		Variable for the attribute msgSize.
		*/ 
		this._msgSize = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the RtAction POJO class
		
		RtAction _stereo = new RtAction();
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
	 * @return the isAtomic
	 */
	public List<String> getIsAtomic() {
		return this._isAtomic;
	}
	/**
	 * @param isAtomic the isAtomic to add
	 */
	public void addIsAtomic(String _isAtomic) {
		this._isAtomic.add(_isAtomic.toString());
	}
	/**
	 * @return the synchKind
	 */
	public List<String> getSynchKind() {
		return this._synchKind;
	}
	/**
	 * @param synchKind the synchKind to add
	 */
	public void addSynchKind(String _synchKind) {
		this._synchKind.add(_synchKind.toString());
	}
	/**
	 * @return the msgSize
	 */
	public List<String> getMsgSize() {
		return this._msgSize;
	}
	/**
	 * @param msgSize the msgSize to add
	 */
	public void addMsgSize(String _msgSize) {
		this._msgSize.add(_msgSize.toString());
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