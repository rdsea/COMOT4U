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
		
	}