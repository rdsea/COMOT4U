package ac.at.tuwien.dsg.uml.stereotype.export.transformation.util;

/**
 * Class used to write content of DOMNode to file. Actually used to persist on disc Java classes generated from stereotypes
 * 
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
 * __license__ = "Apache LICENSE V2.0"
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
