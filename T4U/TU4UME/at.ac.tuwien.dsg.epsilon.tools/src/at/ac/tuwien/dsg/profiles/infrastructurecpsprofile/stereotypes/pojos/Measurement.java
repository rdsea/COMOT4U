package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the Measurement stereotype
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@46c49f49 (name: Stereotype) (instanceClassName: null) (abstract: false, interface: false)
uml::Stereotype
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class Measurement {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("name") 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute evidence.
	*/
	@SerializedName("evidence")
	private List<String> _evidence = new ArrayList<String>();
	

		
	/*
	Variable for the attribute measure.
	*/
	@SerializedName("measure")
	private List<String> _measure = new ArrayList<String>();
	

		
	/*
	Variable for the attribute measureInDT.
	*/
	@SerializedName("measureInDT")
	private List<String> _measureInDT = new ArrayList<String>();
	

		
	/*
	Variable for the attribute measureInDTViaClass.
	*/
	@SerializedName("measureInDTViaClass")
	private List<String> _measureInDTViaClass = new ArrayList<String>();
	

		
	/*
	Variable for the attribute measurement.
	*/
	@SerializedName("measurement")
	private List<String> _measurement = new ArrayList<String>();
	

		
	/*
	Variable for the attribute measurementInVS.
	*/
	@SerializedName("measurementInVS")
	private List<String> _measurementInVS = new ArrayList<String>();
	

		
	/*
	Variable for the attribute referredEvidence.
	*/
	@SerializedName("referredEvidence")
	private List<String> _referredEvidence = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("Measurement");

	public Measurement() {
		/*
		Variable for the attribute evidence.
		*/
		this._evidence = new ArrayList<String>();
		/*
		Variable for the attribute measure.
		*/
		this._measure = new ArrayList<String>();
		/*
		Variable for the attribute measureInDT.
		*/
		this._measureInDT = new ArrayList<String>();
		/*
		Variable for the attribute measureInDTViaClass.
		*/
		this._measureInDTViaClass = new ArrayList<String>();
		/*
		Variable for the attribute measurement.
		*/
		this._measurement = new ArrayList<String>();
		/*
		Variable for the attribute measurementInVS.
		*/
		this._measurementInVS = new ArrayList<String>();
		/*
		Variable for the attribute referredEvidence.
		*/
		this._referredEvidence = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the Measurement POJO class
		
		Measurement _stereo = new Measurement();
		_stereo.toJson();
		
	}
	
	public String toJson(){
	

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        // Convert numbers array into JSON string.
        String _element = gson.toJson(this);
        
        System.out.println("element = " + _element);    
        
        return _element;   
	}

	/**
	 * @return the evidence
	 */
	public List<String> getEvidence() {
		return this._evidence;
	}
	/**
	 * @param evidence the evidence to add
	 */
	public void addEvidence(String _evidence) {
		this._evidence.add(_evidence.toString());
	}
	/**
	 * @return the measure
	 */
	public List<String> getMeasure() {
		return this._measure;
	}
	/**
	 * @param measure the measure to add
	 */
	public void addMeasure(String _measure) {
		this._measure.add(_measure.toString());
	}
	/**
	 * @return the measureInDT
	 */
	public List<String> getMeasureInDT() {
		return this._measureInDT;
	}
	/**
	 * @param measureInDT the measureInDT to add
	 */
	public void addMeasureInDT(String _measureInDT) {
		this._measureInDT.add(_measureInDT.toString());
	}
	/**
	 * @return the measureInDTViaClass
	 */
	public List<String> getMeasureInDTViaClass() {
		return this._measureInDTViaClass;
	}
	/**
	 * @param measureInDTViaClass the measureInDTViaClass to add
	 */
	public void addMeasureInDTViaClass(String _measureInDTViaClass) {
		this._measureInDTViaClass.add(_measureInDTViaClass.toString());
	}
	/**
	 * @return the measurement
	 */
	public List<String> getMeasurement() {
		return this._measurement;
	}
	/**
	 * @param measurement the measurement to add
	 */
	public void addMeasurement(String _measurement) {
		this._measurement.add(_measurement.toString());
	}
	/**
	 * @return the measurementInVS
	 */
	public List<String> getMeasurementInVS() {
		return this._measurementInVS;
	}
	/**
	 * @param measurementInVS the measurementInVS to add
	 */
	public void addMeasurementInVS(String _measurementInVS) {
		this._measurementInVS.add(_measurementInVS.toString());
	}
	/**
	 * @return the referredEvidence
	 */
	public List<String> getReferredEvidence() {
		return this._referredEvidence;
	}
	/**
	 * @param referredEvidence the referredEvidence to add
	 */
	public void addReferredEvidence(String _referredEvidence) {
		this._referredEvidence.add(_referredEvidence.toString());
	}
	/**
	 * @return the _name
	 */
	public String getName() {
		return this.__name;
	}
	/**
	 * @param end the Communication to add
	 */
	public void setName(String __name) {
		this.__name = __name;
	}
	
}