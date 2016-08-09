package ac.at.tuwien.dsg.uml.statemachine.export.transformation.gui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

import ac.at.tuwien.dsg.uml.statemachine.export.transformation.gui.viewer.MyTreeViewer;

import com.ibm.xtools.transform.core.ITransformContext;
import com.ibm.xtools.transform.core.ITransformationDescriptor;
import com.ibm.xtools.transform.ui.AbstractTransformConfigTab;

/**
 * Class used to add another GUI tab to the transformation configuration tab for selecting the
 * CPS profile for which we generate testing plan
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
 * __license__ = "Apache LICENSE V2.0"
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 */

public class SelectCPSProfileTab extends AbstractTransformConfigTab {

	public SelectCPSProfileTab(ITransformationDescriptor transDesc,
			String tabId, String label) {
		super(transDesc, tabId, label);
		// TODO Auto-generated constructor stub
	}

	private Text text;
	private MyTreeViewer viewer;
	 
	@Override
	public Control createContents(Composite parent) {
		Composite contents = new Composite(parent, SWT.None);
		contents.setLayout(new GridLayout());
		viewer = new MyTreeViewer();
		viewer.createPartControl(contents); 
//		text = new Text(contents, SWT.None);
//		text.addModifyListener(new ModifyListener() {
//			public void modifyText(ModifyEvent e) {
//				setDirty();
//			}
//		});
		
		return contents;
	}
	
	public void populateContext(ITransformContext context) {
		context.setPropertyValue("SelectedPathForCPS", viewer.getTreeViewer().getSelection().toString());
	}

	public void populateTab(ITransformContext context) {
//		String newText = (String) context.getPropertyValue("MyPropertyId");
//		if (newText == null) {
//			newText = "";
//		}
//
//		text.setText(newText);
	}

}
