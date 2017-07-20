package at.ac.tuwien.dsg.epsilon.tools;

import org.eclipse.uml2.uml.internal.impl.UMLPackageImpl;
import org.eclipse.uml2.uml.util.UMLUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SampleTool {
	  
	protected String name;
  
	public void setName(String name) {
		this.name = name;
	}
  
	public String getName() {
		return name;
	}
  
	public String sayHello() {
		return "Hello " + name;
	}

	
    public UMLUtil getUMLUtil() {
        return new UMLUtil();
    }
    
    public Gson getGson() {
        return new Gson();
    }
    
    public GsonBuilder getGsonBuilder() {
        return new GsonBuilder();
    }

    
}
