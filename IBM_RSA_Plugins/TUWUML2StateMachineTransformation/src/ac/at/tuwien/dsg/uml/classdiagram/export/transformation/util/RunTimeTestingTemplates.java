package ac.at.tuwien.dsg.uml.classdiagram.export.transformation.util;


/**
 * Class used to retrieve the templates used to configure our run-time testing platform https://github.com/tuwiendsg/RuntimeVerification
 * 
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
 * __license__ = "Apache LICENSE V2.0"
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 */


public class RunTimeTestingTemplates {
	
	
// below is the supported language for describing the tests	
//	#Description
//	#name: "TestName"
//	#description: "human readable description"
//	#timeout: 10
//
//	#Triggers
//	#every:  30 s
//	#event:  "E1" , "E2" on UnitType.VirtualMachine
//	#event:  "E1FFF" , "E2" on UnitType.Process
//
//
//	#Execution
//	#executor: UnitType.VirtualMachine for UnitType.VirtualMachine, UnitType.VirtualContainer, UnitType.Process
//	#executor: UnitType.VirtualContainer for UnitType.Process
//	#executor: UnitType.SoftwareContainer for UnitType.SoftwareContainer
//	#executor: UnitType.SoftwareContainer for UnitID."A-Za-z0-9_", UnitID."Process.ProcessNAME", UnitUUID."A-Za-z0-9_."
//	#executor: UnitID."A-Za-z0-9_" for UnitID."Process.ProcessNAME", UnitUUID."A-Za-z0-9_."
//	#supported types are Service | Process | SoftwarePlatform | PhysicalDevice | SoftwareContainer   | VirtualContainer | Gateway |  VirtualMachine | PhysicalMachine
	

	private static final String SELF_TEST_TEMPLATE="#tests property value"
			+ "Description \n"
			+ "name: \"%1$s\" \n"
			+ "description: \"testing property %1$s on class %2$s\" \n"
			+ "#default. can be increased/decreased as desired \n"
			+ "timeout: 60\n"
			+ "\n"
			+ "Triggers \n"
			+ "#default. can be increased/decreased as desired \n"
			+ "every:  30 s\n"
			+ "#event:  \"E1\" , \"E2\" on UnitType.VirtualMachine -- events are also supported \n"
			+ "\n"
			+ "Execution \n"
			+ "executor UnitID.\"%2$s\" for UnitID.\"%2$s\" \n"  // this line means the class will execute it by itself
			;
	
	private static final String REMOTE_TEST_TEMPLATE="#tests connectivity"
			+ "Description \n"
			+ "name: \"%1$s\" \n"
			+ "description: \"testing property %1$s on class %2$s\" \n"
			+ "#default. can be increased/decreased as desired \n"
			+ "timeout: 60\n"
			+ "\n"
			+ "Triggers \n"
			+ "#default. can be increased/decreased as desired \n"
			+ "every:  30 s\n"
			+ "#event:  \"E1\" , \"E2\" on UnitType.VirtualMachine -- events are also supported \n"
			+ "\n"
			+ "Execution \n"
			+ "executor UnitID.\"%3$s\" for UnitID.\"%2$s\" \n"  // this line means the class will execute it by itself
			;
	
	public static String fillSelfTestTemplate(String testName, String unitID){
		return String.format(SELF_TEST_TEMPLATE, new Object[]{testName,unitID});
	}
	
	public static String fillRemoteTestTemplate(String testName, String targetUnitID, String executingUnitID){
		return String.format(REMOTE_TEST_TEMPLATE, new Object[]{testName,targetUnitID, executingUnitID });
	}
	
}
