package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the Shaped stereotype
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

public class Shaped {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute shape.
	*/ 
	private List<String> _shape = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("Shaped");

	public Shaped() {
		/*
		Variable for the attribute shape.
		*/ 
		this._shape = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the Shaped POJO class
		
		Shaped _stereo = new Shaped();
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
	 * @return the shape
	 */
	public List<String> getShape() {
		return this._shape;
	}
	/**
	 * @param shape the shape to add
	 */
	public void addShape(String _shape) {
		this._shape.add(_shape.toString());
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