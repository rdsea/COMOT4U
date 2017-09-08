package at.ac.tuwien.dsg.uml.profiles.infrastructurecpsprofile.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the Locality stereotype
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@5947c75e (name: Stereotype) (instanceClassName: null) (abstract: false, interface: false)
uml::Stereotype
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.tu4ume.epsilon.externaltools.SampleTool;

public class Locality {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("name") 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute location.
	*/
	@SerializedName("location")
	private List<String> _location = new ArrayList<String>();
	

		
	/*
	Variable for the attribute type.
	*/
	@SerializedName("type")
	private List<String> _type = new ArrayList<String>();
	

		
	/*
	Variable for the attribute description.
	*/
	@SerializedName("description")
	private List<String> _description = new ArrayList<String>();
	

		
	/*
	Variable for the attribute configuration.
	*/
	@SerializedName("configuration")
	private List<String> _configuration = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("Locality");

	public Locality() {
		/*
		Variable for the attribute location.
		*/
		this._location = new ArrayList<String>();
		/*
		Variable for the attribute type.
		*/
		this._type = new ArrayList<String>();
		/*
		Variable for the attribute description.
		*/
		this._description = new ArrayList<String>();
		/*
		Variable for the attribute configuration.
		*/
		this._configuration = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the Locality POJO class
		
		Locality _stereo = new Locality();
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
	 * @return the location
	 */
	public List<String> getLocation() {
		return this._location;
	}
	/**
	 * @param location the location to add
	 */
	public void addLocation(String _location) {
		this._location.add(_location.toString());
	}
	/**
	 * @return the type
	 */
	public List<String> getType() {
		return this._type;
	}
	/**
	 * @param type the type to add
	 */
	public void addType(String _type) {
		this._type.add(_type.toString());
	}
	/**
	 * @return the description
	 */
	public List<String> getDescription() {
		return this._description;
	}
	/**
	 * @param description the description to add
	 */
	public void addDescription(String _description) {
		this._description.add(_description.toString());
	}
	/**
	 * @return the configuration
	 */
	public List<String> getConfiguration() {
		return this._configuration;
	}
	/**
	 * @param configuration the configuration to add
	 */
	public void addConfiguration(String _configuration) {
		this._configuration.add(_configuration.toString());
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