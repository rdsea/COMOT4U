package at.ac.tuwien.dsg.tu4ume.epsilon.externaltools;

import org.eclipse.uml2.uml.util.UMLUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SampleTool {
	  
    public UMLUtil getUMLUtil() {
        return new UMLUtil();
    }
    
    public Gson getGson() {
        return new Gson();
    }
    
    public GsonBuilder getGsonBuilder() {
        return new GsonBuilder();
    }
    
    public ModelerAgent getModelerAgent() {
    	return new ModelerAgent();
    }
}
