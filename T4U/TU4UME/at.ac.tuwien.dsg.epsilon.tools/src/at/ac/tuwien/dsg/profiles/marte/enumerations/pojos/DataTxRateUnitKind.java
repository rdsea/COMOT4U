package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the DataTxRateUnitKind enumeration
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

public class DataTxRateUnitKind {


		
	/*
	Static Variable for the literal b_per_s.
	*/ 
	public String _b_per_s = new String("b_per_s");
	

		
	/*
	Static Variable for the literal Kb_per_s.
	*/ 
	public String _Kb_per_s = new String("Kb_per_s");
	

		
	/*
	Static Variable for the literal Mb_per_s.
	*/ 
	public String _Mb_per_s = new String("Mb_per_s");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("DataTxRateUnitKind");

	public DataTxRateUnitKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the DataTxRateUnitKind POJO class
		
		DataTxRateUnitKind enumeration = new DataTxRateUnitKind();
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
	 * @return the _b_per_s
	 */
	public String getB_per_s() {
		return _b_per_s;
	}
	/**
	 * @return the _Kb_per_s
	 */
	public String getKb_per_s() {
		return _Kb_per_s;
	}
	/**
	 * @return the _Mb_per_s
	 */
	public String getMb_per_s() {
		return _Mb_per_s;
	}
}