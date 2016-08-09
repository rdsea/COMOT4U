package ac.at.tuwien.dsg.uml.statemachine.export.transformation.gui.viewer;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

/**
 * Class used to add a Tree View displaing the workspace directory contents
 * CPS profile for which we generate testing plan
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
 * __license__ = "Apache LICENSE V2.0"
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 */

public class MyTreeViewer extends ViewPart{
	public static final String ID = "ac.at.tuwien.dsg.uml.statemachine.export.transformation.gui.MyTreeView";

	private TreeViewer treeViewer; 
	private TreeSelection selection;

	@Override
	public void createPartControl(Composite parent) {
		treeViewer = new TreeViewer(parent);
		treeViewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
		treeViewer.setContentProvider(new FileTreeContentProvider());
		treeViewer.setLabelProvider(new FileTreeLabelProvider());
		treeViewer.setInput(ResourcesPlugin.getWorkspace());
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				selection = (TreeSelection) event.getSelection();
				TreePath[] selectedPaths = selection.getPaths();
				IFile file = ((IFile)selectedPaths[0].getLastSegment());
				
				//coide below loads from aJar file all classes. be determined if we need it
//				String pathToJar = file.getFullPath().toString();
//				JarFile jarFile;
//				try {
//					jarFile = new JarFile(pathToJar);
//				
//				Enumeration<JarEntry> e = jarFile.entries();
//
//				URL[] urls = { new URL("jar:file:" + pathToJar+"!/") };
//				URLClassLoader cl = URLClassLoader.newInstance(urls);
//
//				while (e.hasMoreElements()) {
//				    JarEntry je = e.nextElement();
//				    if(je.isDirectory() || !je.getName().endsWith(".class")){
//				        continue;
//				    }
//				    // -6 because of .class
//				    String className = je.getName().substring(0,je.getName().length()-6);
//				    className = className.replace('/', '.');
//				    Class c = cl.loadClass(className);
//
//				}
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				} catch (ClassNotFoundException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
				
				System.out.println(selection.toString());
			}
		});
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	public TreeViewer getTreeViewer() {
		return treeViewer;
	}

	public ISelection getSelection() {
		return selection;
	}
	
	
}
