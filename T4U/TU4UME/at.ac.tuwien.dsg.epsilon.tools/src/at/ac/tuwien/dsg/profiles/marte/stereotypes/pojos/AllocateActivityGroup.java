package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the AllocateActivityGroup stereotype
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

public class AllocateActivityGroup {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute isUnique.
	*/ 
	private List<String> _isUnique = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("AllocateActivityGroup");

	public AllocateActivityGroup() {
		/*
		Variable for the attribute isUnique.
		*/ 
		this._isUnique = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the AllocateActivityGroup POJO class
		
		AllocateActivityGroup _stereo = new AllocateActivityGroup();
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
	 * @return the isUnique
	 */
	public List<String> getIsUnique() {
		return this._isUnique;
	}
	/**
	 * @param isUnique the isUnique to add
	 */
	public void addIsUnique(String _isUnique) {
		this._isUnique.add(_isUnique.toString());
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