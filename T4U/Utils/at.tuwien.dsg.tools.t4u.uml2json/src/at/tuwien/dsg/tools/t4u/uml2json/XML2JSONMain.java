package at.tuwien.dsg.tools.t4u.uml2json;

import java.io.FileWriter;
import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.json.JSONObject;
import org.json.XML;
//import struct.StructModel;

public class XML2JSONMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		EMFModelLoad modelres = new EMFModelLoad();	
//		StructModel model = modelres.structModelLoad();	
//		String result = model.toString();
//		System.out.println(result);
		
//		result = modelres.structModelResourceToString();
//		System.out.println(result);
		
//		JSONObject jsonobj = XML.toJSONObject(result);
//		String json_string = jsonobj.toString();
//		String pretty_json_string = modelres.toPrettyFormat(json_string);
		
		// try-with-resources statement based on post comment below :)
//		try (FileWriter file = new FileWriter("/Users/Luca/Desktop/file1.txt")) {
//			file.write(json_string);
//			System.out.println("Successfully Copied JSON Object to File...");
//			System.out.println("\nJSON Object: " + json_string);
//		}
//		try (FileWriter file = new FileWriter("/Users/Luca/Desktop/file2.txt")) {
//			file.write(pretty_json_string);
//			System.out.println("Successfully Copied JSON Object to File...");
//			System.out.println("\nJSON Object: " + pretty_json_string);
//		}
		
		EMFModelLoad umlmodelres = new EMFModelLoad();	
		EObject umlmodel = umlmodelres.umlModelLoad("C:/Users/Luca/Desktop/workspaces/uTestCompatible2/UTestModels_Papyrus_Model_Tests/models/simpleinputmodel.uml");	
		String umlresult = umlmodel.toString();
		System.out.println(umlresult);
		
		umlresult = umlmodelres.umlModelResourceToString("C:/Users/Luca/Desktop/workspaces/uTestCompatible2/UTestModels_Papyrus_Model_Tests/models/simpleinputmodel.uml");
		System.out.println(umlresult);
		JSONObject jsonumlobj = XML.toJSONObject(umlresult);
		String jsonuml_string = jsonumlobj.toString();
		String pretty_jsonuml_string = umlmodelres.toPrettyFormat(jsonuml_string);		
	
		try (FileWriter file = new FileWriter("C:/Users/Luca/Desktop/workspaces/uTestCompatible2/UTestModels_Papyrus_Model_Tests/models/simpleoutputmodel.txt")) {
			file.write(pretty_jsonuml_string);
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + pretty_jsonuml_string);
		}
	}

}
