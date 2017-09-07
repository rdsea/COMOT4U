package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the ClientServerPort stereotype
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

public class ClientServerPort {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute specificationKind.
	*/ 
	private List<String> _specificationKind = new ArrayList<String>();
	

		
	/*
	Variable for the attribute kind.
	*/ 
	private List<String> _kind = new ArrayList<String>();
	

		
	/*
	Variable for the attribute provInterface.
	*/ 
	private List<String> _provInterface = new ArrayList<String>();
	

		
	/*
	Variable for the attribute reqInterface.
	*/ 
	private List<String> _reqInterface = new ArrayList<String>();
	

		
	/*
	Variable for the attribute featuresSpec.
	*/ 
	private List<String> _featuresSpec = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("ClientServerPort");

	public ClientServerPort() {
		/*
		Variable for the attribute specificationKind.
		*/ 
		this._specificationKind = new ArrayList<String>();
		/*
		Variable for the attribute kind.
		*/ 
		this._kind = new ArrayList<String>();
		/*
		Variable for the attribute provInterface.
		*/ 
		this._provInterface = new ArrayList<String>();
		/*
		Variable for the attribute reqInterface.
		*/ 
		this._reqInterface = new ArrayList<String>();
		/*
		Variable for the attribute featuresSpec.
		*/ 
		this._featuresSpec = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ClientServerPort POJO class
		
		ClientServerPort _stereo = new ClientServerPort();
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
	 * @return the specificationKind
	 */
	public List<String> getSpecificationKind() {
		return this._specificationKind;
	}
	/**
	 * @param specificationKind the specificationKind to add
	 */
	public void addSpecificationKind(String _specificationKind) {
		this._specificationKind.add(_specificationKind.toString());
	}
	/**
	 * @return the kind
	 */
	public List<String> getKind() {
		return this._kind;
	}
	/**
	 * @param kind the kind to add
	 */
	public void addKind(String _kind) {
		this._kind.add(_kind.toString());
	}
	/**
	 * @return the provInterface
	 */
	public List<String> getProvInterface() {
		return this._provInterface;
	}
	/**
	 * @param provInterface the provInterface to add
	 */
	public void addProvInterface(String _provInterface) {
		this._provInterface.add(_provInterface.toString());
	}
	/**
	 * @return the reqInterface
	 */
	public List<String> getReqInterface() {
		return this._reqInterface;
	}
	/**
	 * @param reqInterface the reqInterface to add
	 */
	public void addReqInterface(String _reqInterface) {
		this._reqInterface.add(_reqInterface.toString());
	}
	/**
	 * @return the featuresSpec
	 */
	public List<String> getFeaturesSpec() {
		return this._featuresSpec;
	}
	/**
	 * @param featuresSpec the featuresSpec to add
	 */
	public void addFeaturesSpec(String _featuresSpec) {
		this._featuresSpec.add(_featuresSpec.toString());
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