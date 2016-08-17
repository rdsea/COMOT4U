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
 * __license__ = "Apache LICENSE V2.0"
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 */
 

public class StateMachineState{
	
	public static final StateMachineState INITIAL_STATE = new StateMachineState("InitialState");
	public static final StateMachineState FINAL_STATE = new StateMachineState("FinalState");
	
	
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
	
}