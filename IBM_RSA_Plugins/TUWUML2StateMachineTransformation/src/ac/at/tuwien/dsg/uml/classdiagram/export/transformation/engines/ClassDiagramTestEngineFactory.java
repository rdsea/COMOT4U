package ac.at.tuwien.dsg.uml.classdiagram.export.transformation.engines;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ac.at.tuwien.dsg.uml.classdiagram.export.transformation.engines.impl.TestConnectivityAtRuntimeStrategy;
import ac.at.tuwien.dsg.uml.classdiagram.export.transformation.engines.impl.TestPropertiesAtRuntimeStrategy;
import ac.at.tuwien.dsg.uml.statemachine.export.transformation.engines.exceptions.NoSuchEngineTypeException;

public class ClassDiagramTestEngineFactory {
	
	//enables engines
	//supported strategies
	static	Map<String,Class<? extends AbstractClassDiagramTestStrategy>> supportedStrategies ;
		
	/**
	 * All supported strategies should be added here. 
	 * Then they will automatically be queried and used in everything, including the ConfigurationTab to select strategy
	 */
	static{
		 supportedStrategies = new HashMap<String,Class<? extends AbstractClassDiagramTestStrategy>>();
		 supportedStrategies.put(TestPropertiesAtRuntimeStrategy.class.getCanonicalName(),TestPropertiesAtRuntimeStrategy.class);
		 supportedStrategies.put(TestConnectivityAtRuntimeStrategy.class.getCanonicalName(),TestConnectivityAtRuntimeStrategy.class);
		}
	
	
	public static AbstractClassDiagramTestStrategy createTestEngine(String engineType) throws NoSuchEngineTypeException{
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
	
	public static AbstractClassDiagramTestStrategy createDefaultTestEngine() throws NoSuchEngineTypeException{
		if (!supportedStrategies.values().isEmpty()){
			try {
				return supportedStrategies.values().iterator().next().newInstance();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
				return null;
			} catch (InstantiationException e) {
				e.printStackTrace();
				return null;
			}
		}else{
			throw new NoSuchEngineTypeException("No supported engines found in  ClassDiagramTestEngineFactory" );
		}
	}
	
	/*
	 * returns a copy list of the supported strategy classes
	 */
	public static List<Class<? extends AbstractClassDiagramTestStrategy>> getSupportedStrategies(){
		List<Class<? extends AbstractClassDiagramTestStrategy>> list= new ArrayList<Class<? extends AbstractClassDiagramTestStrategy>>();
		for(Class<? extends AbstractClassDiagramTestStrategy> strategyClass: supportedStrategies.values()){
			list.add(strategyClass);
		}
		return list;
	}
}
