package ac.at.tuwien.dsg.uml.classdiagram.export.transformation.gui;

import com.ibm.xtools.transform.core.ITransformationDescriptor;
import com.ibm.xtools.transform.ui.AbstractTransformConfigTab;
import com.ibm.xtools.transform.ui.AbstractTransformGUI;

/**
 * Class providing custom GUI, i.e., custom lists of configuration tabs to show
 * 
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
 * __license__ = "Apache LICENSE V2.0"
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 */

public class ClassDiagramTransformationGUI extends AbstractTransformGUI {

	 
	@Override
	public AbstractTransformConfigTab[] getConfigurationTabs(
			ITransformationDescriptor descriptor) {
		AbstractTransformConfigTab[] superTabs =
			super.getConfigurationTabs(descriptor);
		
		AbstractTransformConfigTab[] myTabs =
			new AbstractTransformConfigTab[superTabs.length + 1];
		
		for (int i = 0; i < superTabs.length; i++) {
			myTabs[i] = superTabs[i];
		}
		myTabs[myTabs.length - 1] = new SelectClassDiagramTestGenerationStrategyTab(descriptor, "SelectClassDiagramTestGenerationStrategyTab", "Select Test Generation Strategy");
		return myTabs;
	}
	

}
