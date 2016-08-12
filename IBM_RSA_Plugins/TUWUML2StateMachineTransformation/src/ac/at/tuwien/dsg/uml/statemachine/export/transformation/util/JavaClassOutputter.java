package ac.at.tuwien.dsg.uml.statemachine.export.transformation.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.jdom.IDOMNode;

import com.ibm.xtools.transform.core.ITransformContext;

public class JavaClassOutputter {
	public static void outputFile(ITransformContext context, IDOMNode content){
		//generate CLass output file
		 IResource res = (IResource) context.getTargetContainer(); 
		 IPath targetPath = res.getLocation();
		 String filename = targetPath.toOSString() + File.separatorChar + content.getName() + ".java";
		 File myFile = new File(filename);
		 FileWriter fw;
		 try {
			 fw = new FileWriter(myFile,true);
			 fw.write(content.getContents());
			 fw.flush();
			 fw.close();
		 } catch (IOException e) {
			 // TODO Auto-generated catch block
			 e.printStackTrace();
		 }

		
	}
}
