package ac.at.tuwien.dsg.uml.stereotype.export.transformation.util;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

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
	        textEdit.apply(doc);
	        
	        File myFile = new File(filename);
			 PrintWriter fw;
			 try {
				 fw = new PrintWriter(myFile);
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
