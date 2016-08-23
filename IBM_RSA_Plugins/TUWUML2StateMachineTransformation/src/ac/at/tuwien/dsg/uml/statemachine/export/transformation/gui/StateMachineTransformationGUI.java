package ac.at.tuwien.dsg.uml.statemachine.export.transformation.gui;

import com.ibm.xtools.transform.core.ITransformationDescriptor;
import com.ibm.xtools.transform.ui.AbstractTransformConfigTab;
import com.ibm.xtools.transform.ui.AbstractTransformGUI;

public class StateMachineTransformationGUI extends AbstractTransformGUI {

	 
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
		myTabs[myTabs.length - 1] = new SelectTestGenerationStrategyTab(descriptor, "SelectTestGenerationStrategyTab", "Select Test Generation Strategy");
		return myTabs;
	}
	

}
