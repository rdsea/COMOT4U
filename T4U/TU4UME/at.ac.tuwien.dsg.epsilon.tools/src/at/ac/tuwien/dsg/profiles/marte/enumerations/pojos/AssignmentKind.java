package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the AssignmentKind enumeration
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

public class AssignmentKind {


		
	/*
	Static Variable for the literal structural.
	*/ 
	public String _structural = new String("structural");
	

		
	/*
	Static Variable for the literal behavioral.
	*/ 
	public String _behavioral = new String("behavioral");
	

		
	/*
	Static Variable for the literal hybrid.
	*/ 
	public String _hybrid = new String("hybrid");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("AssignmentKind");

	public AssignmentKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the AssignmentKind POJO class
		
		AssignmentKind enumeration = new AssignmentKind();
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
	 * @return the _structural
	 */
	public String getStructural() {
		return _structural;
	}
	/**
	 * @return the _behavioral
	 */
	public String getBehavioral() {
		return _behavioral;
	}
	/**
	 * @return the _hybrid
	 */
	public String getHybrid() {
		return _hybrid;
	}
}