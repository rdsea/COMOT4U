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

public class MyTreeViewer extends ViewPart{
	public static final String ID = "ac.at.tuwien.dsg.uml.statemachine.export.transformation.gui.MyTreeView";

	private TreeViewer treeViewer; 
 
	private TreeSelection selection;

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
				String selected = selectedPaths[0].getLastSegment().toString();
				
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
