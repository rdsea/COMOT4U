package at.ac.tuwien.dsg.uml.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the OptimallityCriterionKind enumeration
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

public class OptimallityCriterionKind {


		
	/*
	Static Variable for the literal meetHardDeadlines.
	*/ 
	public String _meetHardDeadlines = new String("meetHardDeadlines");
	

		
	/*
	Static Variable for the literal minimizeMissedDeadlines.
	*/ 
	public String _minimizeMissedDeadlines = new String("minimizeMissedDeadlines");
	

		
	/*
	Static Variable for the literal minimizedMeanTardiness.
	*/ 
	public String _minimizedMeanTardiness = new String("minimizedMeanTardiness");
	

		
	/*
	Static Variable for the literal undef.
	*/ 
	public String _undef = new String("undef");
	

		
	/*
	Static Variable for the literal other.
	*/ 
	public String _other = new String("other");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("OptimallityCriterionKind");

	public OptimallityCriterionKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the OptimallityCriterionKind POJO class
		
		OptimallityCriterionKind enumeration = new OptimallityCriterionKind();
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
	 * @return the _meetHardDeadlines
	 */
	public String getMeetHardDeadlines() {
		return _meetHardDeadlines;
	}
	/**
	 * @return the _minimizeMissedDeadlines
	 */
	public String getMinimizeMissedDeadlines() {
		return _minimizeMissedDeadlines;
	}
	/**
	 * @return the _minimizedMeanTardiness
	 */
	public String getMinimizedMeanTardiness() {
		return _minimizedMeanTardiness;
	}
	/**
	 * @return the _undef
	 */
	public String getUndef() {
		return _undef;
	}
	/**
	 * @return the _other
	 */
	public String getOther() {
		return _other;
	}
}