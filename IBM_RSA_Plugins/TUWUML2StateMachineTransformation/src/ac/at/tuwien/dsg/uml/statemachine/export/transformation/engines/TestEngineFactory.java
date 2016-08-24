package ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.exceptions.NoSuchEngineTypeException;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.impl.PathWithUncertaintyTestStrategy;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.impl.TransitionCorrectnessTestStrategy;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.impl.TransitionCorrectnessTestStrategy;

public class TestEngineFactory {
	
	//enables engines
	//supported strategies
	static	Map<String,Class<? extends AbstractTestStrategy>> supportedStrategies ;
		
	/**
	 * All supported strategies should be added here. 
	 * THen they will automatically be queried and used in everything, including the ConfigurationTab to select strategy
	 */
	static{
		 supportedStrategies = new HashMap<String,Class<? extends AbstractTestStrategy>>();
		 supportedStrategies.put(TransitionCorrectnessTestStrategy.class.getCanonicalName(),TransitionCorrectnessTestStrategy.class);
		 supportedStrategies.put(PathWithUncertaintyTestStrategy.class.getCanonicalName(),PathWithUncertaintyTestStrategy.class);
		}
	
	
	public static AbstractTestStrategy createTestEngine(String engineType) throws NoSuchEngineTypeException{
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
	public static List<Class<? extends AbstractTestStrategy>> getSupportedStrategies(){
		List<Class<? extends AbstractTestStrategy>> list= new ArrayList<Class<? extends AbstractTestStrategy>>();
		for(Class<? extends AbstractTestStrategy> strategyClass: supportedStrategies.values()){
			list.add(strategyClass);
		}
		return list;
	}
}
