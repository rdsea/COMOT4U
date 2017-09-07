package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the QueuePolicyKind enumeration
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

public class QueuePolicyKind {


		
	/*
	Static Variable for the literal FIFO.
	*/ 
	public String _FIFO = new String("FIFO");
	

		
	/*
	Static Variable for the literal LIFO.
	*/ 
	public String _LIFO = new String("LIFO");
	

		
	/*
	Static Variable for the literal Priority.
	*/ 
	public String _Priority = new String("Priority");
	

		
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
	private final String __type = new String ("QueuePolicyKind");

	public QueuePolicyKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the QueuePolicyKind POJO class
		
		QueuePolicyKind enumeration = new QueuePolicyKind();
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
	 * @return the _FIFO
	 */
	public String getFIFO() {
		return _FIFO;
	}
	/**
	 * @return the _LIFO
	 */
	public String getLIFO() {
		return _LIFO;
	}
	/**
	 * @return the _Priority
	 */
	public String getPriority() {
		return _Priority;
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