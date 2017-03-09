package ac.at.tuwien.dsg.uml.stereotype.export.transformation.util;

/**
 * Class used to write content of DOMNode to file. Actually used to persist on disc Java classes generated from stereotypes
 * 
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
* __license__ = EULA currently in development. Current terms of usage below.
* __license_body__ We grant the right to use this software and create derivative work based on it for all non-commercial non-profit education purposes. 
* __license_body__ 
* __license_body__ For any commercial-related or profit-related usage of this software please contact 
* __license_body__ Hong-Linh Truong truong@dsg.tuwien.ac.at
* __license_body__ 
* __license_body__ Warranty:
* __license_body__ The software is provided "AS IS", without warranty of any kind, express or implied,
* __license_body__ including but not limited to the warranties of merchantability, fitness for a
* __license_body__ particular purpose and noninfringement. in no event shall the authors or copyright
* __license_body__ holders be liable for any claim, damages or other liability, whether in an action of
* __license_body__ contract, tort or otherwise, arising from, out of or in connection with the software or
* __license_body__ the use or other dealings in the software.
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 */


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jdt.core.jdom.IDOMNode;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.TextEdit;

import com.ibm.xtools.transform.core.ITransformContext;

public class JavaClassOutputter {
	
	private static final List<String> defaultImports;
	
	static{
		defaultImports = new ArrayList<String>();
		defaultImports.add("org.eclipse.uml2.uml.*");
		defaultImports.add("org.eclipse.uml2.uml.Package"); // added because some profiles might use it and it might be confused with java.lang.Package
		defaultImports.add("org.eclipse.uml2.uml.Class"); // added because some profiles might use it and it might be confused with java Class type
	}
	
	public static void outputFile(ITransformContext context, IDOMNode content){
		//generate CLass output file
		 IResource res = (IResource) context.getTargetContainer(); 
		 IPath targetPath = res.getLocation();
		 String filename = targetPath.toOSString() + File.separatorChar + content.getName() + ".java";
		 
		//format Code
		 
		String code = content.getContents(); 
		CodeFormatter codeFormatter = ToolFactory.createCodeFormatter(null);

	    TextEdit textEdit = codeFormatter.format(CodeFormatter.K_UNKNOWN, code, 0,code.length(),0,null);
	    IDocument doc = new Document(code);
	    try {
	    	//unsure why but sometimes formatted is nu
	    	if (textEdit != null){
	    		textEdit.apply(doc);
	    	}else{
	    		//usually errors appear due to spaces or illegal characters in property names
	    		IOException exception = new IOException("Generated document has formatting errors: \n" + code);
	    		throw new UncheckedIOException("Generated document has formatting errors: \n" + code, exception);
	    	}
	        
	        File myFile = new File(filename);
			 PrintWriter fw;
			 try {
				 fw = new PrintWriter(myFile);
				 
				 for(String importString: defaultImports){
					 fw.write("import " + importString +";");
					 fw.write("\n");
				 }
				 
				 fw.write(doc.get());
				 fw.flush();
				 fw.close();
			 } catch (IOException e) {
				 // TODO Auto-generated catch block
				 e.printStackTrace();
			 }
			 
	    } catch (MalformedTreeException e) {
	        e.printStackTrace();
	    } catch (BadLocationException e) {
	        e.printStackTrace();
	    }   
		
	}
}
