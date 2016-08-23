package ac.at.tuwien.dsg.uml.statemachine.export.transformation.gui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.SharedContext;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.factories.impl.SingletonVolatileContextFactory;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.AbstractTestStrategy;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.impl.PathWithUncertaintyTestStrategy;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.impl.TransitionCorrectnessTestStrategy;

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
	
	private SharedContext sharedContext;
	
	{
		sharedContext = new SingletonVolatileContextFactory().createSharedContext();
	}
	
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
	private Table viewer;

	
	@Override
	public Control createContents(Composite parent) {
		Composite contents = new Composite(parent, SWT.None);
		contents.setLayout(new GridLayout());
		
		viewer = new Table(contents, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION);
		
		final Text textViewer = new Text(contents,  SWT.V_SCROLL | 
				SWT.H_SCROLL | SWT.WRAP | SWT.MULTI );
		{
			GridData data =  new GridData();
			data.horizontalAlignment = SWT.FILL;
			data.grabExcessHorizontalSpace = true;
			textViewer.setLayoutData(data);
		}
		
		viewer.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				sharedContext.setProperty(SELECTED_STRATEGY_PROPERTY, ((TableItem)e.item).getText());
				textViewer.setText(((TableItem)e.item).getData().toString());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		for (AbstractTestStrategy strategy :  strategies  ) {
	      TableItem item = new TableItem(viewer, SWT.NONE);
	      item.setText(strategy.getClass().getCanonicalName());
	      item.setData(strategy.getDescription());
	      
	    }
		
		return contents;
	}
	
	public void populateContext(ITransformContext context) {
		this.context = context;
	}
	
	
	

}
