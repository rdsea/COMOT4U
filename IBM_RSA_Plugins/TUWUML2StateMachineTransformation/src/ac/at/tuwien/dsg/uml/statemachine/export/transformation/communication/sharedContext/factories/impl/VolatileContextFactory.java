package ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.factories.impl;

import ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.SharedContext;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.factories.SharedContextFactory;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.impl.VolatileSharedContext;

public class VolatileContextFactory extends SharedContextFactory{

	@Override
	public SharedContext createSharedContext() {
		return new VolatileSharedContext();
	}

}
