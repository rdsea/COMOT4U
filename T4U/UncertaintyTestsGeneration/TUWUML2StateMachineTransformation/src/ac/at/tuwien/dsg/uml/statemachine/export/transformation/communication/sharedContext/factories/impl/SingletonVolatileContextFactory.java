package ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.factories.impl;

import ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.SharedContext;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext.factories.SharedContextFactory;


/**
 * Class returning the same SharedContext instance every time createSharedContext is called.
 * 
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
