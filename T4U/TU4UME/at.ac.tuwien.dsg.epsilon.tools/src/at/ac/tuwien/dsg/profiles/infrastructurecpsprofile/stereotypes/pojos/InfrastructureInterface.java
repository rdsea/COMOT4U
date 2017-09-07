package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the InfrastructureInterface stereotype
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

public class InfrastructureInterface {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("name") 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute applicationInterface.
	*/
	@SerializedName("applicationInterface")
	private List<String> _applicationInterface = new ArrayList<String>();
	

		
	/*
	Variable for the attribute integrationInterface.
	*/
	@SerializedName("integrationInterface")
	private List<String> _integrationInterface = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("InfrastructureInterface");

	public InfrastructureInterface() {
		/*
		Variable for the attribute applicationInterface.
		*/
		this._applicationInterface = new ArrayList<String>();
		/*
		Variable for the attribute integrationInterface.
		*/
		this._integrationInterface = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the InfrastructureInterface POJO class
		
		InfrastructureInterface _stereo = new InfrastructureInterface();
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
	 * @return the applicationInterface
	 */
	public List<String> getApplicationInterface() {
		return this._applicationInterface;
	}
	/**
	 * @param applicationInterface the applicationInterface to add
	 */
	public void addApplicationInterface(String _applicationInterface) {
		this._applicationInterface.add(_applicationInterface.toString());
	}
	/**
	 * @return the integrationInterface
	 */
	public List<String> getIntegrationInterface() {
		return this._integrationInterface;
	}
	/**
	 * @param integrationInterface the integrationInterface to add
	 */
	public void addIntegrationInterface(String _integrationInterface) {
		this._integrationInterface.add(_integrationInterface.toString());
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