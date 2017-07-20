package at.ac.tuwien.dsg.profiles.cpsinfrastructure.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the InteractionOperatorKind enumeration
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@3c6dd051 (name: Enumeration) (instanceClassName: null) (abstract: false, interface: false)
uml::Enumeration
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class InteractionOperatorKind {


		
	/*
	Static Variable for the literal seq.
	*/ 
	public String _seq = new String("seq");
	

		
	/*
	Static Variable for the literal alt.
	*/ 
	public String _alt = new String("alt");
	

		
	/*
	Static Variable for the literal opt.
	*/ 
	public String _opt = new String("opt");
	

		
	/*
	Static Variable for the literal break.
	*/ 
	public String _break = new String("break");
	

		
	/*
	Static Variable for the literal par.
	*/ 
	public String _par = new String("par");
	

		
	/*
	Static Variable for the literal strict.
	*/ 
	public String _strict = new String("strict");
	

		
	/*
	Static Variable for the literal loop.
	*/ 
	public String _loop = new String("loop");
	

		
	/*
	Static Variable for the literal critical.
	*/ 
	public String _critical = new String("critical");
	

		
	/*
	Static Variable for the literal neg.
	*/ 
	public String _neg = new String("neg");
	

		
	/*
	Static Variable for the literal assert.
	*/ 
	public String _assert = new String("assert");
	

		
	/*
	Static Variable for the literal ignore.
	*/ 
	public String _ignore = new String("ignore");
	

		
	/*
	Static Variable for the literal consider.
	*/ 
	public String _consider = new String("consider");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("InteractionOperatorKind");

	public InteractionOperatorKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the InteractionOperatorKind POJO class
		
		InteractionOperatorKind enumeration = new InteractionOperatorKind();
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
	 * @return the _seq
	 */
	public String getSeq() {
		return _seq;
	}
	/**
	 * @return the _alt
	 */
	public String getAlt() {
		return _alt;
	}
	/**
	 * @return the _opt
	 */
	public String getOpt() {
		return _opt;
	}
	/**
	 * @return the _break
	 */
	public String getBreak() {
		return _break;
	}
	/**
	 * @return the _par
	 */
	public String getPar() {
		return _par;
	}
	/**
	 * @return the _strict
	 */
	public String getStrict() {
		return _strict;
	}
	/**
	 * @return the _loop
	 */
	public String getLoop() {
		return _loop;
	}
	/**
	 * @return the _critical
	 */
	public String getCritical() {
		return _critical;
	}
	/**
	 * @return the _neg
	 */
	public String getNeg() {
		return _neg;
	}
	/**
	 * @return the _assert
	 */
	public String getAssert() {
		return _assert;
	}
	/**
	 * @return the _ignore
	 */
	public String getIgnore() {
		return _ignore;
	}
	/**
	 * @return the _consider
	 */
	public String getConsider() {
		return _consider;
	}
}