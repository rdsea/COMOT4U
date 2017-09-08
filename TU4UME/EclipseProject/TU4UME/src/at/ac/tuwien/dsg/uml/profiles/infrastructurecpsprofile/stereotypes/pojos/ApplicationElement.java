package at.ac.tuwien.dsg.uml.profiles.infrastructurecpsprofile.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the ApplicationElement stereotype
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

public class ApplicationElement {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("name") 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute applicationInterfaces.
	*/
	@SerializedName("applicationInterfaces")
	private List<String> _applicationInterfaces = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("ApplicationElement");

	public ApplicationElement() {
		/*
		Variable for the attribute applicationInterfaces.
		*/
		this._applicationInterfaces = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the ApplicationElement POJO class
		
		ApplicationElement _stereo = new ApplicationElement();
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
	 * @return the applicationInterfaces
	 */
	public List<String> getApplicationInterfaces() {
		return this._applicationInterfaces;
	}
	/**
	 * @param applicationInterfaces the applicationInterfaces to add
	 */
	public void addApplicationInterfaces(String _applicationInterfaces) {
		this._applicationInterfaces.add(_applicationInterfaces.toString());
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