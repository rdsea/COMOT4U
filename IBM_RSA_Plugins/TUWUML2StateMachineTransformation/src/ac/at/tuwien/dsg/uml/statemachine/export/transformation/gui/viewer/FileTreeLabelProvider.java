package ac.at.tuwien.dsg.uml.statemachine.export.transformation.gui.viewer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;


/**
 * Class used to add a Tree View displaing the workspace directory contents
 * CPS profile for which we generate testing plan
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
 * __license__ = "Apache LICENSE V2.0"
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 */

public class FileTreeLabelProvider implements ILabelProvider {

    public void addListener(ILabelProviderListener listener) {

    }

    public void dispose() {

    }

    public boolean isLabelProperty(Object element, String property) {

        return false;
    }

    public void removeListener(ILabelProviderListener listener) {

    }

    public Image getImage(Object element) {

        return null;
    }

    public String getText(Object element) {
        if (element instanceof IProject) {
            String text = ((IProject) element).getName();
            return text;
        }
        if (element instanceof IFolder) {
            String text = ((IFolder) element).getName();
            return text;
        }
        if (element instanceof IFile) {
            String text = ((IFile) element).getName();
            return text;
        }

        return null;
    }
}
