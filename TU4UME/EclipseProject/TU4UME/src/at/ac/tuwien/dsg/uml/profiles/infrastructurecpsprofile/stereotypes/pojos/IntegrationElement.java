package at.ac.tuwien.dsg.uml.profiles.infrastructurecpsprofile.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the IntegrationElement stereotype
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

public class IntegrationElement {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("name") 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute integrationInterfaces.
	*/
	@SerializedName("integrationInterfaces")
	private List<String> _integrationInterfaces = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("IntegrationElement");

	public IntegrationElement() {
		/*
		Variable for the attribute integrationInterfaces.
		*/
		this._integrationInterfaces = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the IntegrationElement POJO class
		
		IntegrationElement _stereo = new IntegrationElement();
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
	 * @return the integrationInterfaces
	 */
	public List<String> getIntegrationInterfaces() {
		return this._integrationInterfaces;
	}
	/**
	 * @param integrationInterfaces the integrationInterfaces to add
	 */
	public void addIntegrationInterfaces(String _integrationInterfaces) {
		this._integrationInterfaces.add(_integrationInterfaces.toString());
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