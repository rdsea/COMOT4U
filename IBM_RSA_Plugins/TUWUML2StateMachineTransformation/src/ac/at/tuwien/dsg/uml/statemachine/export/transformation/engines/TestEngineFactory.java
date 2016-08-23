package ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.exceptions.NoSuchEngineTypeException;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.impl.PathWithUncertaintyTestStrategy;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.impl.TransitionCorrectnessTestStrategy;

public class TestEngineFactory {
	
	//enables engines
	//supported strategies
	static	Map<String,AbstractTestStrategy> strategies ;
		
	static{
		 strategies = new HashMap<String,AbstractTestStrategy>();
		 
		 {
			 AbstractTestStrategy strategy = new TransitionCorrectnessTestStrategy();
			 strategies.put(strategy.getClass().getCanonicalName(),strategy);
		 }
		 
		 {
			 AbstractTestStrategy strategy = new PathWithUncertaintyTestStrategy();
			 strategies.put(strategy.getClass().getCanonicalName(),strategy);
		 }
			 
		}
	
	
	public static AbstractTestStrategy createTestEngine(String engineType) throws NoSuchEngineTypeException{
		if (strategies.containsKey(engineType)){
			return strategies.get(engineType);
		}else{
			throw new NoSuchEngineTypeException("Engine type \"" +engineType + "\" not recognized");
		}
	}
	
	/*
	 * returns a copy list of the supported strategy classes
	 */
	public static List<Class> getSupportedStrategies(){
		List<Class> list= new ArrayList<Class>();
		for(AbstractTestStrategy strategy: strategies.values()){
			list.add(strategy.getClass());
		}
		return list;
	}
}
