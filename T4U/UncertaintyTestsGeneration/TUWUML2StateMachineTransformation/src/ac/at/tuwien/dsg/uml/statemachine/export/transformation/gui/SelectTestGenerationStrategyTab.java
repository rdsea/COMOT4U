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
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.AbstractStateMachineTestStrategy;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.StateMachineTestEngineFactory;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.exceptions.NoSuchEngineTypeException;

import com.ibm.xtools.transform.core.ITransformContext;
import com.ibm.xtools.transform.core.ITransformationDescriptor;
import com.ibm.xtools.transform.ui.AbstractTransformConfigTab;

/**
 * Class used to add another GUI tab to the transformation configuration tab for selecting the
 * strategy used to generate testing plan
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

public class SelectTestGenerationStrategyTab extends AbstractTransformConfigTab {
	
	public static final String SELECTED_STRATEGY_PROPERTY = "SelectedStrategyProperty";
	
	private ITransformContext context;
	
	private SharedContext sharedContext;
	
	{
		sharedContext = new SingletonVolatileContextFactory().createSharedContext();
	}
	
	//supported strategies
	List<AbstractStateMachineTestStrategy> strategies ;
	
	{
		strategies = new ArrayList<AbstractStateMachineTestStrategy>();
		
		for(Class<? extends AbstractStateMachineTestStrategy> strategyClass : StateMachineTestEngineFactory.getSupportedStrategies()){
			try {
				strategies.add(StateMachineTestEngineFactory.createTestEngine(strategyClass.getCanonicalName()));
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
		
		for (AbstractStateMachineTestStrategy strategy :  strategies  ) {
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
