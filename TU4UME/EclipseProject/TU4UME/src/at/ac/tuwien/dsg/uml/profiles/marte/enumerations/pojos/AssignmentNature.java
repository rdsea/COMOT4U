package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the AssignmentNature enumeration
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@30d4287c (name: Enumeration) (instanceClassName: null) (abstract: false, interface: false)
uml::Enumeration
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.tu4ume.epsilon.externaltools.SampleTool;

public class AssignmentNature {


		
	/*
	Static Variable for the literal spatialDistribution.
	*/ 
	public String _spatialDistribution = new String("spatialDistribution");
	

		
	/*
	Static Variable for the literal timeScheduling.
	*/ 
	public String _timeScheduling = new String("timeScheduling");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("AssignmentNature");

	public AssignmentNature() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the AssignmentNature POJO class
		
		AssignmentNature enumeration = new AssignmentNature();
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
	 * @return the _spatialDistribution
	 */
	public String getSpatialDistribution() {
		return _spatialDistribution;
	}
	/**
	 * @return the _timeScheduling
	 */
	public String getTimeScheduling() {
		return _timeScheduling;
	}
}