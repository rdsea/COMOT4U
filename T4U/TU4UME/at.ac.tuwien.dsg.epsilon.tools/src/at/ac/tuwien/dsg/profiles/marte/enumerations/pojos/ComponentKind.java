package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the ComponentKind enumeration
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

public class ComponentKind {


		
	/*
	Static Variable for the literal card.
	*/ 
	public String _card = new String("card");
	

		
	/*
	Static Variable for the literal channel.
	*/ 
	public String _channel = new String("channel");
	

		
	/*
	Static Variable for the literal chip.
	*/ 
	public String _chip = new String("chip");
	

		
	/*
	Static Variable for the literal port.
	*/ 
	public String _port = new String("port");
	

		
	/*
	Static Variable for the literal unit.
	*/ 
	public String _unit = new String("unit");
	

		
	/*
	Static Variable for the literal other.
	*/ 
	public String _other = new String("other");
	

		
	/*
	Static Variable for the literal undef.
	*/ 
	public String _undef = new String("undef");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("ComponentKind");

	public ComponentKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ComponentKind POJO class
		
		ComponentKind enumeration = new ComponentKind();
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
	 * @return the _card
	 */
	public String getCard() {
		return _card;
	}
	/**
	 * @return the _channel
	 */
	public String getChannel() {
		return _channel;
	}
	/**
	 * @return the _chip
	 */
	public String getChip() {
		return _chip;
	}
	/**
	 * @return the _port
	 */
	public String getPort() {
		return _port;
	}
	/**
	 * @return the _unit
	 */
	public String getUnit() {
		return _unit;
	}
	/**
	 * @return the _other
	 */
	public String getOther() {
		return _other;
	}
	/**
	 * @return the _undef
	 */
	public String getUndef() {
		return _undef;
	}
}