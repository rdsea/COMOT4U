package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the NotificationKind enumeration
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

public class NotificationKind {


		
	/*
	Static Variable for the literal Memorized.
	*/ 
	public String _Memorized = new String("Memorized");
	

		
	/*
	Static Variable for the literal Bounded.
	*/ 
	public String _Bounded = new String("Bounded");
	

		
	/*
	Static Variable for the literal Memoryless.
	*/ 
	public String _Memoryless = new String("Memoryless");
	

		
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
	private final String __type = new String ("NotificationKind");

	public NotificationKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the NotificationKind POJO class
		
		NotificationKind enumeration = new NotificationKind();
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
	 * @return the _Memorized
	 */
	public String getMemorized() {
		return _Memorized;
	}
	/**
	 * @return the _Bounded
	 */
	public String getBounded() {
		return _Bounded;
	}
	/**
	 * @return the _Memoryless
	 */
	public String getMemoryless() {
		return _Memoryless;
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