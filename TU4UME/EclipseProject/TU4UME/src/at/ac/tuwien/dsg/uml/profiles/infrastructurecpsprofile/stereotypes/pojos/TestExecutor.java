package at.ac.tuwien.dsg.uml.profiles.infrastructurecpsprofile.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the TestExecutor stereotype
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@5947c75e (name: Stereotype) (instanceClassName: null) (abstract: false, interface: false)
uml::Stereotype
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.tu4ume.epsilon.externaltools.SampleTool;

public class TestExecutor {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("name") 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute description.
	*/
	@SerializedName("description")
	private List<String> _description = new ArrayList<String>();
	

		
	/*
	Variable for the attribute distinctFromTarget.
	*/
	@SerializedName("distinctFromTarget")
	private List<String> _distinctFromTarget = new ArrayList<String>();
	

		
	/*
	Variable for the attribute targets.
	*/
	@SerializedName("targets")
	private List<String> _targets = new ArrayList<String>();
	

		
	/*
	Variable for the attribute swCapabilities.
	*/
	@SerializedName("swCapabilities")
	private List<String> _swCapabilities = new ArrayList<String>();
	

		
	/*
	Variable for the attribute testTriggers.
	*/
	@SerializedName("testTriggers")
	private List<String> _testTriggers = new ArrayList<String>();
	

		
	/*
	Variable for the attribute strategy.
	*/
	@SerializedName("strategy")
	private List<String> _strategy = new ArrayList<String>();
	

		
	/*
	Variable for the attribute testUtilities.
	*/
	@SerializedName("testUtilities")
	private List<String> _testUtilities = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("TestExecutor");

	public TestExecutor() {
		/*
		Variable for the attribute description.
		*/
		this._description = new ArrayList<String>();
		/*
		Variable for the attribute distinctFromTarget.
		*/
		this._distinctFromTarget = new ArrayList<String>();
		/*
		Variable for the attribute targets.
		*/
		this._targets = new ArrayList<String>();
		/*
		Variable for the attribute swCapabilities.
		*/
		this._swCapabilities = new ArrayList<String>();
		/*
		Variable for the attribute testTriggers.
		*/
		this._testTriggers = new ArrayList<String>();
		/*
		Variable for the attribute strategy.
		*/
		this._strategy = new ArrayList<String>();
		/*
		Variable for the attribute testUtilities.
		*/
		this._testUtilities = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the TestExecutor POJO class
		
		TestExecutor _stereo = new TestExecutor();
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
	 * @return the description
	 */
	public List<String> getDescription() {
		return this._description;
	}
	/**
	 * @param description the description to add
	 */
	public void addDescription(String _description) {
		this._description.add(_description.toString());
	}
	/**
	 * @return the distinctFromTarget
	 */
	public List<String> getDistinctFromTarget() {
		return this._distinctFromTarget;
	}
	/**
	 * @param distinctFromTarget the distinctFromTarget to add
	 */
	public void addDistinctFromTarget(String _distinctFromTarget) {
		this._distinctFromTarget.add(_distinctFromTarget.toString());
	}
	/**
	 * @return the targets
	 */
	public List<String> getTargets() {
		return this._targets;
	}
	/**
	 * @param targets the targets to add
	 */
	public void addTargets(String _targets) {
		this._targets.add(_targets.toString());
	}
	/**
	 * @return the swCapabilities
	 */
	public List<String> getSwCapabilities() {
		return this._swCapabilities;
	}
	/**
	 * @param swCapabilities the swCapabilities to add
	 */
	public void addSwCapabilities(String _swCapabilities) {
		this._swCapabilities.add(_swCapabilities.toString());
	}
	/**
	 * @return the testTriggers
	 */
	public List<String> getTestTriggers() {
		return this._testTriggers;
	}
	/**
	 * @param testTriggers the testTriggers to add
	 */
	public void addTestTriggers(String _testTriggers) {
		this._testTriggers.add(_testTriggers.toString());
	}
	/**
	 * @return the strategy
	 */
	public List<String> getStrategy() {
		return this._strategy;
	}
	/**
	 * @param strategy the strategy to add
	 */
	public void addStrategy(String _strategy) {
		this._strategy.add(_strategy.toString());
	}
	/**
	 * @return the testUtilities
	 */
	public List<String> getTestUtilities() {
		return this._testUtilities;
	}
	/**
	 * @param testUtilities the testUtilities to add
	 */
	public void addTestUtilities(String _testUtilities) {
		this._testUtilities.add(_testUtilities.toString());
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