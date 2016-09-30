package ac.at.tuwien.dsg.uml.statemachine.export.transformation.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.FinalState;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.Vertex;

/**
 *  Class capturing information about a state in a State Machine diagram, including the current state vertex and transitions to and from it 
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
 

public class StateMachineState{
	
	public static final StateMachineState INITIAL_STATE = new StateMachineState("InitialState");
	private static final StateMachineState FINAL_STATE = new StateMachineState("FinalState");
	
	
	private String name;
	private Vertex vertex;
	private List<StateMachineStateTransition> outTransitions;
	private List<StateMachineStateTransition> inTransitions;
	public StateMachineState(Vertex vertex) {
		super();
		this.vertex = vertex;
		name = vertex.getName();
		//initial and last states can have no name
		if (name == null && vertex instanceof Pseudostate){
			name = INITIAL_STATE.name;
		}else if (name == null && vertex instanceof FinalState){
			name = FINAL_STATE.name;
		}
		name = name.replaceAll("\\W", "_"); // remove all weird non-alphanumeric chars
		
		outTransitions = new ArrayList<StateMachineStateTransition>();
		inTransitions = new ArrayList<StateMachineStateTransition>();
	}
	
	private StateMachineState(String name){
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StateMachineState other = (StateMachineState) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public Vertex getVertex() {
		return vertex;
	}
	public List<StateMachineStateTransition> getOutTransitions() {
		return outTransitions;
	}
	public List<StateMachineStateTransition> getInTransitions() {
		return inTransitions;
	}
	
	public boolean isInitialState(){
		return this.equals(INITIAL_STATE);
	}
	public boolean isFinalState(){
		return this.equals(FINAL_STATE);
	}

	@Override
	public String toString() {
		return "State [name= " + name + "]";
	}
	
	
	
}
