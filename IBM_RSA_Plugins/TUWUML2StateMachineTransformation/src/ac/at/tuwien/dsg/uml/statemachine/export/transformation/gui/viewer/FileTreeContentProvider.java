package ac.at.tuwien.dsg.uml.statemachine.export.transformation.gui.viewer;


import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * Class used to add a Tree View displaing the workspace directory contents
 * CPS profile for which we generate testing plan
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
 * __license__ = "Apache LICENSE V2.0"
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 */

public class FileTreeContentProvider implements ITreeContentProvider {

    public void dispose() {

    }

    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

    }

    public Object[] getElements(Object inputElement) {
        return ResourcesPlugin.getWorkspace().getRoot().getProjects();
    }
    
    /**
     * Filters and returns only .jar files as selected
     */
    public Object[] getChildren(Object parentElement) {
        if (parentElement instanceof IProject) {
            IProject projects = (IProject) parentElement;
            try {
            	ArrayList<Object> members = new ArrayList();
            	for (IResource res : projects.members()){
            		if (res instanceof IFile){
            			if (res.getFileExtension().equals("jar")){
            				members.add(res);
            			}
            		}else{
            			members.add(res);
            		}
            	}
                return members.toArray();
            } catch (CoreException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if (parentElement instanceof IFolder) {
            IFolder ifolder = (IFolder) parentElement;
            try {
            	ArrayList<Object> members = new ArrayList();
            	for (IResource res : ifolder.members()){
            		if (res instanceof IFile){
            			if (res.getFileExtension().equals("jar")){
            				members.add(res);
            			}
            		}else{
            			members.add(res);
            		}
            	}
                return members.toArray();
            } catch (CoreException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return null;
    }

    public Object getParent(Object element) {
        if (element instanceof IProject) {
            IProject projects = (IProject) element;
            return projects.getParent();
        }
        if (element instanceof IFolder) {
            IFolder folder = (IFolder) element;
            return folder.getParent();
        }
        if (element instanceof IFile) {
            IFile file = (IFile) element;
            return file.getParent();
        }
        return null;
    }

    public boolean hasChildren(Object element) {
        if (element instanceof IProject) {
            IProject projects = (IProject) element;
            try {
                return projects.members().length > 0;
            } catch (CoreException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if (element instanceof IFolder) {
            IFolder folder = (IFolder) element;
            try {
                return folder.members().length > 0;
            } catch (CoreException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return false;
    }

}