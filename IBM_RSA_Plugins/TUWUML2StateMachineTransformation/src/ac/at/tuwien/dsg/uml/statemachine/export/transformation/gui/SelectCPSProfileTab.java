package ac.at.tuwien.dsg.uml.statemachine.export.transformation.gui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.AbstractTestStrategy;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.PathWithUncertaintyTestStrategy;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.TransitionCorrectnessTestStrategy;

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
	
	public static final String SELECTED_STRATEGY_PROPERTY = "SelectedStrategyProperty";
	
	private ITransformContext context;
	
	//supported strategies
	List<AbstractTestStrategy> strategies ;
	
	{
		 strategies = new ArrayList<AbstractTestStrategy>();
		 strategies.add(new TransitionCorrectnessTestStrategy());
		 strategies.add(new PathWithUncertaintyTestStrategy());
	}

	public SelectCPSProfileTab(ITransformationDescriptor transDesc,
			String tabId, String label) {
		super(transDesc, tabId, label);
		// TODO Auto-generated constructor stub
	}

	private Text text;
	private CheckboxTableViewer viewer;

	
	@Override
	public Control createContents(Composite parent) {
		Composite contents = new Composite(parent, SWT.None);
		contents.setLayout(new GridLayout());
		viewer = CheckboxTableViewer.newCheckList(contents, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		
		viewer.getTable().addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//TODO: change mechanism. Each tab has its own context, can't send property to StateMachine rule
				context.setPropertyValue(SELECTED_STRATEGY_PROPERTY, ((TableItem)e.item).getText());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		for (AbstractTestStrategy strategy :  strategies  ) {
	      TableItem item = new TableItem(viewer.getTable(), SWT.NONE);
	      item.setText(strategy.getClass().getCanonicalName());
	    }
		 
		return contents;
	}
	
	public void populateContext(ITransformContext context) {
		this.context = context;
	}
	
	
	

}
