package at.ac.tuwien.dsg.uml.profiles.infrastructurecpsprofile.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the InfrastructureLevelEffect stereotype
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

public class InfrastructureLevelEffect {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("name") 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute configuration.
	*/
	@SerializedName("configuration")
	private List<String> _configuration = new ArrayList<String>();
	

		
	/*
	Variable for the attribute description.
	*/
	@SerializedName("description")
	private List<String> _description = new ArrayList<String>();
	

		
	/*
	Variable for the attribute CopyOf_configuration_1.
	*/
	@SerializedName("CopyOf_configuration_1")
	private List<String> _CopyOf_configuration_1 = new ArrayList<String>();
	

		
	/*
	Variable for the attribute CopyOf_description_1.
	*/
	@SerializedName("CopyOf_description_1")
	private List<String> _CopyOf_description_1 = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("InfrastructureLevelEffect");

	public InfrastructureLevelEffect() {
		/*
		Variable for the attribute configuration.
		*/
		this._configuration = new ArrayList<String>();
		/*
		Variable for the attribute description.
		*/
		this._description = new ArrayList<String>();
		/*
		Variable for the attribute CopyOf_configuration_1.
		*/
		this._CopyOf_configuration_1 = new ArrayList<String>();
		/*
		Variable for the attribute CopyOf_description_1.
		*/
		this._CopyOf_description_1 = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the InfrastructureLevelEffect POJO class
		
		InfrastructureLevelEffect _stereo = new InfrastructureLevelEffect();
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
	 * @return the CopyOf_configuration_1
	 */
	public List<String> getCopyOf_configuration_1() {
		return this._CopyOf_configuration_1;
	}
	/**
	 * @param CopyOf_configuration_1 the CopyOf_configuration_1 to add
	 */
	public void addCopyOf_configuration_1(String _CopyOf_configuration_1) {
		this._CopyOf_configuration_1.add(_CopyOf_configuration_1.toString());
	}
	/**
	 * @return the CopyOf_description_1
	 */
	public List<String> getCopyOf_description_1() {
		return this._CopyOf_description_1;
	}
	/**
	 * @param CopyOf_description_1 the CopyOf_description_1 to add
	 */
	public void addCopyOf_description_1(String _CopyOf_description_1) {
		this._CopyOf_description_1.add(_CopyOf_description_1.toString());
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