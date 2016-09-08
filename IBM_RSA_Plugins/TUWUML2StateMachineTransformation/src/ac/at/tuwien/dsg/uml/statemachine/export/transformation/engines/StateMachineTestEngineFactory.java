package ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.exceptions.NoSuchEngineTypeException;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.impl.PathWithUncertaintyTestStrategy;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.impl.TransitionCorrectnessTestStrategy;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.impl.TransitionCorrectnessTestStrategy;

public class StateMachineTestEngineFactory {
	
	//enables engines
	//supported strategies
	static	Map<String,Class<? extends AbstractStateMachineTestStrategy>> supportedStrategies ;
		
	/**
	 * All supported strategies should be added here. 
	 * Then they will automatically be queried and used in everything, including the ConfigurationTab to select strategy
	 */
	static{
		 supportedStrategies = new HashMap<String,Class<? extends AbstractStateMachineTestStrategy>>();
		 supportedStrategies.put(TransitionCorrectnessTestStrategy.class.getCanonicalName(),TransitionCorrectnessTestStrategy.class);
		 supportedStrategies.put(PathWithUncertaintyTestStrategy.class.getCanonicalName(),PathWithUncertaintyTestStrategy.class);
		}
	
	
	public static AbstractStateMachineTestStrategy createTestEngine(String engineType) throws NoSuchEngineTypeException{
		if (supportedStrategies.containsKey(engineType)){
			try {
				return supportedStrategies.get(engineType).newInstance();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
				return null;
			} catch (InstantiationException e) {
				e.printStackTrace();
				return null;
			}
		}else{
			throw new NoSuchEngineTypeException("Engine type \"" +engineType + "\" not recognized");
		}
	}
	
	/*
	 * returns a copy list of the supported strategy classes
	 */
	public static List<Class<? extends AbstractStateMachineTestStrategy>> getSupportedStrategies(){
		List<Class<? extends AbstractStateMachineTestStrategy>> list= new ArrayList<Class<? extends AbstractStateMachineTestStrategy>>();
		for(Class<? extends AbstractStateMachineTestStrategy> strategyClass: supportedStrategies.values()){
			list.add(strategyClass);
		}
		return list;
	}
}
