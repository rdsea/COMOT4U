package ac.at.tuwien.dsg.uml.statemachine.export.transformation.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.uml2.uml.CallEvent;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Trigger;
import org.eclipse.uml2.uml.Type;

import ac.at.tuwien.dsg.uml.statemachine.export.transformation.internal.exceptions.NoSuchStateException;

/**
 * Class used to capture a State Machine diagram as a state transition graph
 * 
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
 * __license__ = "Apache LICENSE V2.0"
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 */

public class StateMachineStateGraph {
	private String stateMachineName;
    private Map<StateMachineState, StateMachineState> statesMap = new LinkedHashMap<StateMachineState, StateMachineState>();

	public Map<StateMachineState, StateMachineState> getStatesMap() {
		return statesMap;
	}
    
    public StateMachineState getInitialState() throws NoSuchStateException{
    	//if we started from a no-name initial state
    	if (statesMap.containsKey(StateMachineState.INITIAL_STATE)){
    		return statesMap.get(StateMachineState.INITIAL_STATE);
    	}else{
    		
    		//find out first state has no inward transitions,i.e. no transitions lead to it
    		//this assumes we have one initial state per state machine
    		for (StateMachineState state: statesMap.values()){
    			if (state.getInTransitions().isEmpty()){
    				return state;
    			}
    		}
    		
    	}
    	
    	//if we reach this point we have no such state exception
    	throw new NoSuchStateException("State machine diagram \"" + stateMachineName + "\" has no  initial state");
    }
    
//    public StateMachineState getFinalState(){
//    	return statesMap.get(StateMachineState.FINAL_STATE);
//    }
    
    public String getStateMachineName() {
		return stateMachineName;
	}

	public void setStateMachineName(String stateMachineName) {
		//ensure we do not add names with spaces or weird symbols
		this.stateMachineName = stateMachineName.replaceAll("\\W", "");
	}

	/**
     * Method also good example on how one can iterate and extract information from the state graph
     */
    public String toString(){
    	
    	String description = "";
    	
    	StateMachineState initialS = statesMap.keySet().iterator().next();

		List<StateMachineState> statesQueue = new ArrayList<>();
		statesQueue.add(initialS); // start from first state

		// BFS to process the state graph
		while (!statesQueue.isEmpty()) {
			//get state name
			StateMachineState state = statesQueue.remove(0);
			description += "\n State " + state.getName() + "->";
			
			//for all state transitions, iterate
			for (StateMachineStateTransition transition : state.getOutTransitions()) {
				//get target state from transition
				StateMachineState targetState = transition.getTargetState();
				statesQueue.add(targetState);
				description += "\n	goes to " + targetState.getName();

				//get all transition triggers
				List<Trigger> triggers  =  transition.getTransition().getTriggers();
				if (!triggers.isEmpty()){
					description += "\n	with triggers:";
				}
				
				//for each trigger
				for (Trigger trigger :triggers) {
					
					//get trigger event
					Event event = trigger.getEvent();
					//if UML operation triggers event (so CLass method)
					if (event instanceof CallEvent){
						CallEvent callEvent = (CallEvent) event;
						Operation operation = callEvent.getOperation();
						Class operationClass = (Class) operation.eContainer();
						description += "\n		= Trigger Operation: " + operationClass.getName() +"."+ operation.getName();
					}
					
				}

				//get transition condition (could also be Rule, currently we get only Guard transitions)
				Constraint guard = transition.getTransition().getGuard();
				if (guard != null) {
					description += "\n	under Guard conditions ";
					
					for (Element element : guard.allOwnedElements()) {
						//currently condition retrieved as plain text that will need to be parsed and evaluated
						OpaqueExpression expression = (OpaqueExpression) element;
						for (String body : expression.getBodies()) {
							description += "\n		Condition: " + body;
						}
					}
				}

			}
		}
		return description;
    }
    
    //TODO: to generate tests, we need to determine what metric to test. And for metrics we have or not (in CPS) a test configuration. If we have, can test, if not, we test related or something else
    
    
    /**
     * Method which iterates and returns the states which have uncertainty
     * Method also important example on how to navigate an get from a State the associated information from the
     * applied uncertainty stereotypes
     * @return
     */
    public List<StateMachineState> getStatesWithUncertainties(){
    	List<StateMachineState> states = new ArrayList<>();
    	for (StateMachineState state: statesMap.keySet()){
    		for(Stereotype stereotype : state.getVertex().getAppliedStereotypes()){
    		   //check if the applied stereotype is InfrastructureLevelUncertainty
    	    	if (stereotype.getName().equals("InfrastructureLevelUncertainty")){
    				states.add(state);
    				
    				//get stereotype name and state name
    				System.out.println(state.getName() + " has uncertainty " + stereotype.getName());
    				
    				//iterate through all stereotype attributes
    				for (Property property :  stereotype.getAllAttributes()) {
    					
    					String propertyName = property.getName();
    					Type type = property.getType();
    					
    					//property can be primitive, or can be another Class instance
    					//we are more interested in Class instance properties: for example, InfrastructureLevelUncertainty "observationTime" of type "ObservationTime"
    					if (type instanceof PrimitiveType){
    						System.out.println(state.getName() + " has uncertainty primitive property" + propertyName + " of type " + type.getName());
    						
    					//if we ask for element, we get the current StateImpl, not the ECoreList of properties. 
    					//so we check and do not retrieve it. maybe in future a better solution is found	
    					}else if (!type.getName().equals("Element")){
    						
    						if (state.getVertex().hasValue(stereotype, property.getName())){
    						
    							//only way I found out how to get the Object instance used as attribute value
    						    EcoreEList<EObject> valuesList = (EcoreEList<EObject>) state.getVertex().getValue(stereotype, propertyName);
    						    
    						    //properties can be objects in turn, so also process them, currently as system out, but in future as decisions based on them
    						    List<EObject> objectsToProcess = new ArrayList<>();
    						    
    						    for( EObject eObject : valuesList){
    						    	objectsToProcess.add(eObject);
    						    }
    						    
    						   while (!objectsToProcess.isEmpty()){
    						    	//if multiplicity of properties is expected to be > 1, then we should iterate through all
    						    	//currently I assume multiplicity is 1
    						    	EObject value = objectsToProcess.remove(0);
    						    	System.out.println(state.getName() + " has uncertainty object property " + value.eClass().getName());

    						    	//now, from the value Object property we go and iterate through their attributes to extract their values
    						    	//feature is more or less same as attribute, but for feature I can get value
    							    for (EStructuralFeature feature: value.eClass().getEAllStructuralFeatures()){
    							    	//skip the base_element feature which actually gives you the org.eclipse.uml2.uml.internal.impl.ClassImpl@id info
    							    	if(feature.getName().contains("base_Element")){
    							    		continue;
    							    	}
    							    	//get attribute/feature value
    							    	Object featureValue = value.eGet(feature);
    							    	
    							    	//attributes can be also classes, so handle them differently
    							    	if(featureValue instanceof EcoreEList){
    							    		EcoreEList list = (EcoreEList) featureValue;
    							    		for (Object eObj : list){
    							    			if(eObj instanceof EObject){
    							    				objectsToProcess.add((EObject) eObj);
    							    				System.out.println(value.eClass().getName() + " has feature " + feature.getName() + " with object of class : " + eObj);
    							    			}else{
    							    				System.out.println(value.eClass().getName() + " has feature " + feature.getName() + " has a value : " + eObj);
    							    			}
    							    		}
    							    	}else{
    							    		System.out.println(value.eClass().getName() + " has feature " + feature.getName() + " with value : " + featureValue);
    							    	}
    							    	
    							    	
    							    }
    						    }
    						}
    					}
    				}
    			}
    		}
    		
    	}
    	return states;
    }
   
    
}
