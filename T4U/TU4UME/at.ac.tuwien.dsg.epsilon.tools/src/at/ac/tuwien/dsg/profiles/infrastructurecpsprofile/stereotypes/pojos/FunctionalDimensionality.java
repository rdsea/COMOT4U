package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the FunctionalDimensionality stereotype
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@46c49f49 (name: Stereotype) (instanceClassName: null) (abstract: false, interface: false)
uml::Stereotype
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class FunctionalDimensionality {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("name") 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute dimensionalty.
	*/
	@SerializedName("dimensionalty")
	private List<String> _dimensionalty = new ArrayList<String>();
	

		
	/*
	Variable for the attribute functional_attributes.
	*/
	@SerializedName("functional_attributes")
	private List<String> _functional_attributes = new ArrayList<String>();
	

		
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
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("FunctionalDimensionality");

	public FunctionalDimensionality() {
		/*
		Variable for the attribute dimensionalty.
		*/
		this._dimensionalty = new ArrayList<String>();
		/*
		Variable for the attribute functional_attributes.
		*/
		this._functional_attributes = new ArrayList<String>();
		/*
		Variable for the attribute configuration.
		*/
		this._configuration = new ArrayList<String>();
		/*
		Variable for the attribute description.
		*/
		this._description = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the FunctionalDimensionality POJO class
		
		FunctionalDimensionality _stereo = new FunctionalDimensionality();
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
	 * @return the dimensionalty
	 */
	public List<String> getDimensionalty() {
		return this._dimensionalty;
	}
	/**
	 * @param dimensionalty the dimensionalty to add
	 */
	public void addDimensionalty(String _dimensionalty) {
		this._dimensionalty.add(_dimensionalty.toString());
	}
	/**
	 * @return the functional_attributes
	 */
	public List<String> getFunctional_attributes() {
		return this._functional_attributes;
	}
	/**
	 * @param functional_attributes the functional_attributes to add
	 */
	public void addFunctional_attributes(String _functional_attributes) {
		this._functional_attributes.add(_functional_attributes.toString());
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