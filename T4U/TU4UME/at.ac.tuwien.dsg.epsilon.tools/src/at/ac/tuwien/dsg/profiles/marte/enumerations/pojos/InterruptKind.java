package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the InterruptKind enumeration
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

public class InterruptKind {


		
	/*
	Static Variable for the literal HardwareInterruption.
	*/ 
	public String _HardwareInterruption = new String("HardwareInterruption");
	

		
	/*
	Static Variable for the literal ProcessorDetectedException.
	*/ 
	public String _ProcessorDetectedException = new String("ProcessorDetectedException");
	

		
	/*
	Static Variable for the literal ProgrammedException.
	*/ 
	public String _ProgrammedException = new String("ProgrammedException");
	

		
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
	private final String __type = new String ("InterruptKind");

	public InterruptKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the InterruptKind POJO class
		
		InterruptKind enumeration = new InterruptKind();
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
	 * @return the _HardwareInterruption
	 */
	public String getHardwareInterruption() {
		return _HardwareInterruption;
	}
	/**
	 * @return the _ProcessorDetectedException
	 */
	public String getProcessorDetectedException() {
		return _ProcessorDetectedException;
	}
	/**
	 * @return the _ProgrammedException
	 */
	public String getProgrammedException() {
		return _ProgrammedException;
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