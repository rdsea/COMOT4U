package ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.factories;

import ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.SharedContext;
/**
 * Class used to share properties between different transformation tabs in the UI
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
 * __license__ = "Apache LICENSE V2.0"
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 */

public abstract class SharedContextFactory {
	public abstract SharedContext createSharedContext();
}
