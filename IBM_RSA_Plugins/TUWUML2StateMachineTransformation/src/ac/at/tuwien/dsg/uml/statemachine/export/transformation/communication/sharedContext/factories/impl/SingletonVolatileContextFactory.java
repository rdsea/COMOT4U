package ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.factories.impl;

import ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.SharedContext;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.factories.SharedContextFactory;


/**
 * Class returning the same SharedContext instance every time createSharedContext is called.
 * 
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
 * __license__ = "Apache LICENSE V2.0"
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 */


public class SingletonVolatileContextFactory extends SharedContextFactory{
	
	private static SharedContext sharedContext;
 
	static {
		sharedContext = new VolatileContextFactory().createSharedContext();
	}

	@Override
	public SharedContext createSharedContext() {
		return sharedContext;
	}

}
