package ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.SharedContext;

/**
 * Class using a Concurrent HashMap to store context, so it does not persist it anywhere
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
 * __license__ = "Apache LICENSE V2.0"
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 */

public class VolatileSharedContext implements SharedContext{
	private Map<Object,Object> map;

	public VolatileSharedContext() {
		map = new ConcurrentHashMap<>();
	}

	@Override
	public Object getProperty(Object key) {
		return map.get(key);
	}

	@Override
	public boolean hasProperty(Object key) {
		return map.containsKey(key);
	}

	@Override
	public void setProperty(Object key, Object value) {
		map.put(key, value);
	}
	
	
}
