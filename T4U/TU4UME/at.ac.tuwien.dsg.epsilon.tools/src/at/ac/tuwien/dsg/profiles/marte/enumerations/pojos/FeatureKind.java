package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the FeatureKind enumeration
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@113b5546 (name: Enumeration) (instanceClassName: null) (abstract: false, interface: false)
uml::Enumeration
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class FeatureKind {


		
	/*
	Static Variable for the literal Unspecified.
	*/ 
	public String _Unspecified = new String("Unspecified");
	

		
	/*
	Static Variable for the literal Simple.
	*/ 
	public String _Simple = new String("Simple");
	

		
	/*
	Static Variable for the literal Attribute.
	*/ 
	public String _Attribute = new String("Attribute");
	

		
	/*
	Static Variable for the literal Element.
	*/ 
	public String _Element = new String("Element");
	

		
	/*
	Static Variable for the literal AttributeWildcard.
	*/ 
	public String _AttributeWildcard = new String("AttributeWildcard");
	

		
	/*
	Static Variable for the literal ElementWildcard.
	*/ 
	public String _ElementWildcard = new String("ElementWildcard");
	

		
	/*
	Static Variable for the literal Group.
	*/ 
	public String _Group = new String("Group");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("FeatureKind");

	public FeatureKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the FeatureKind POJO class
		
		FeatureKind enumeration = new FeatureKind();
		enumeration.toJson();
		
	}
	
	public String toJson(){
	

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        // Convert numbers array into JSON string.
        String elem = gson.toJson(this);
        
        System.out.println("elem = " + elem);    
        
        return elem;   
	}

	/**
	 * @return the _Unspecified
	 */
	public String getUnspecified() {
		return _Unspecified;
	}
	/**
	 * @return the _Simple
	 */
	public String getSimple() {
		return _Simple;
	}
	/**
	 * @return the _Attribute
	 */
	public String getAttribute() {
		return _Attribute;
	}
	/**
	 * @return the _Element
	 */
	public String getElement() {
		return _Element;
	}
	/**
	 * @return the _AttributeWildcard
	 */
	public String getAttributeWildcard() {
		return _AttributeWildcard;
	}
	/**
	 * @return the _ElementWildcard
	 */
	public String getElementWildcard() {
		return _ElementWildcard;
	}
	/**
	 * @return the _Group
	 */
	public String getGroup() {
		return _Group;
	}
}