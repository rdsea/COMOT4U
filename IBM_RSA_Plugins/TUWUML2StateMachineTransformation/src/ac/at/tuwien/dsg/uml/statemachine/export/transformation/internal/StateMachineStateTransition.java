package ac.at.tuwien.dsg.uml.statemachine.export.transformation.internal;

import org.eclipse.uml2.uml.Transition;

/**
 *  Class capturing information about a transition in a state machine diagram
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
 * __license__ = "Apache LICENSE V2.0"
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 */

public class StateMachineStateTransition {
		private StateMachineState sourceState;
		private StateMachineState targetState;
		private Transition transition;
		public StateMachineStateTransition(StateMachineState sState, StateMachineState tState,Transition transition) {
			super();
			this.sourceState = sState;
			this.targetState = tState;
			this.transition = transition;
		}
		public StateMachineState getSourceState() {
			return sourceState;
		}
		public StateMachineState getTargetState() {
			return targetState;
		}
		public Transition getTransition() {
			return transition;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((sourceState == null) ? 0 : sourceState.hashCode());
			result = prime * result
					+ ((targetState == null) ? 0 : targetState.hashCode());
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
			StateMachineStateTransition other = (StateMachineStateTransition) obj;
			if (sourceState == null) {
				if (other.sourceState != null)
					return false;
			} else if (!sourceState.equals(other.sourceState))
				return false;
			if (targetState == null) {
				if (other.targetState != null)
					return false;
			} else if (!targetState.equals(other.targetState))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Transition [transition= "
					+ transition.getName() 
					+ "sourceState= " + sourceState
					+ ", targetState= " + targetState + "]";
		}
		
		
		
		
	}