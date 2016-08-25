package ac.at.tuwien.dsg.uml.statemachine.export.transformation.gui;

import java.util.ArrayList;
import java.util.List;

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
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.TestEngineFactory;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.exceptions.NoSuchEngineTypeException;

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

public class SelectTestGenerationStrategyTab extends AbstractTransformConfigTab {
	
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
		
		for(Class<? extends AbstractTestStrategy> strategyClass : TestEngineFactory.getSupportedStrategies()){
			try {
				strategies.add(TestEngineFactory.createTestEngine(strategyClass.getCanonicalName()));
			} catch (NoSuchEngineTypeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public SelectTestGenerationStrategyTab(ITransformationDescriptor transDesc,
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
