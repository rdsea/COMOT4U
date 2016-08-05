package ac.at.tuwien.dsg.uml.statemachine.export.activator.transformation.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.FinalState;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.Vertex;

/**
 * Class to be used as intermediary in generating the state graph
 */

public class StateMachineState{
	
	public static final StateMachineState INITIAL_STATE = new StateMachineState(Pseudostate.class.getName());
	public static final StateMachineState FINAL_STATE = new StateMachineState(FinalState.class.getName());
	
	
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
			name = Pseudostate.class.getName();
		}else if (name == null && vertex instanceof FinalState){
			name = FinalState.class.getName();
		}
		
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
	
	
	
}