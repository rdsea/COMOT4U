package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the StatisticalQualifierKind enumeration
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

public class StatisticalQualifierKind {


		
	/*
	Static Variable for the literal max.
	*/ 
	public String _max = new String("max");
	

		
	/*
	Static Variable for the literal min.
	*/ 
	public String _min = new String("min");
	

		
	/*
	Static Variable for the literal mean.
	*/ 
	public String _mean = new String("mean");
	

		
	/*
	Static Variable for the literal range.
	*/ 
	public String _range = new String("range");
	

		
	/*
	Static Variable for the literal percent.
	*/ 
	public String _percent = new String("percent");
	

		
	/*
	Static Variable for the literal distrib.
	*/ 
	public String _distrib = new String("distrib");
	

		
	/*
	Static Variable for the literal determ.
	*/ 
	public String _determ = new String("determ");
	

		
	/*
	Static Variable for the literal other.
	*/ 
	public String _other = new String("other");
	

		
	/*
	Static Variable for the literal variance.
	*/ 
	public String _variance = new String("variance");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("StatisticalQualifierKind");

	public StatisticalQualifierKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the StatisticalQualifierKind POJO class
		
		StatisticalQualifierKind enumeration = new StatisticalQualifierKind();
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
	 * @return the _max
	 */
	public String getMax() {
		return _max;
	}
	/**
	 * @return the _min
	 */
	public String getMin() {
		return _min;
	}
	/**
	 * @return the _mean
	 */
	public String getMean() {
		return _mean;
	}
	/**
	 * @return the _range
	 */
	public String getRange() {
		return _range;
	}
	/**
	 * @return the _percent
	 */
	public String getPercent() {
		return _percent;
	}
	/**
	 * @return the _distrib
	 */
	public String getDistrib() {
		return _distrib;
	}
	/**
	 * @return the _determ
	 */
	public String getDeterm() {
		return _determ;
	}
	/**
	 * @return the _other
	 */
	public String getOther() {
		return _other;
	}
	/**
	 * @return the _variance
	 */
	public String getVariance() {
		return _variance;
	}
}