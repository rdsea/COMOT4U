package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the SchedPolicyKind enumeration
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

public class SchedPolicyKind {


		
	/*
	Static Variable for the literal EarliestDeadlineFirst.
	*/ 
	public String _EarliestDeadlineFirst = new String("EarliestDeadlineFirst");
	

		
	/*
	Static Variable for the literal FIFO.
	*/ 
	public String _FIFO = new String("FIFO");
	

		
	/*
	Static Variable for the literal FixedPriority.
	*/ 
	public String _FixedPriority = new String("FixedPriority");
	

		
	/*
	Static Variable for the literal LeastLaxityFirst.
	*/ 
	public String _LeastLaxityFirst = new String("LeastLaxityFirst");
	

		
	/*
	Static Variable for the literal RoundRobin.
	*/ 
	public String _RoundRobin = new String("RoundRobin");
	

		
	/*
	Static Variable for the literal TimeTableDriven.
	*/ 
	public String _TimeTableDriven = new String("TimeTableDriven");
	

		
	/*
	Static Variable for the literal Undef.
	*/ 
	public String _Undef = new String("Undef");
	

		
	/*
	Static Variable for the literal Other.
	*/ 
	public String _Other = new String("Other");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("SchedPolicyKind");

	public SchedPolicyKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the SchedPolicyKind POJO class
		
		SchedPolicyKind enumeration = new SchedPolicyKind();
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
	 * @return the _EarliestDeadlineFirst
	 */
	public String getEarliestDeadlineFirst() {
		return _EarliestDeadlineFirst;
	}
	/**
	 * @return the _FIFO
	 */
	public String getFIFO() {
		return _FIFO;
	}
	/**
	 * @return the _FixedPriority
	 */
	public String getFixedPriority() {
		return _FixedPriority;
	}
	/**
	 * @return the _LeastLaxityFirst
	 */
	public String getLeastLaxityFirst() {
		return _LeastLaxityFirst;
	}
	/**
	 * @return the _RoundRobin
	 */
	public String getRoundRobin() {
		return _RoundRobin;
	}
	/**
	 * @return the _TimeTableDriven
	 */
	public String getTimeTableDriven() {
		return _TimeTableDriven;
	}
	/**
	 * @return the _Undef
	 */
	public String getUndef() {
		return _Undef;
	}
	/**
	 * @return the _Other
	 */
	public String getOther() {
		return _Other;
	}
}