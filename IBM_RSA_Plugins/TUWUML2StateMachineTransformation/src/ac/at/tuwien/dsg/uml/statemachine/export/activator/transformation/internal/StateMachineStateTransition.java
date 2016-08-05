package ac.at.tuwien.dsg.uml.statemachine.export.activator.transformation.internal;

import org.eclipse.uml2.uml.Transition;

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