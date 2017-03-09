package ac.at.tuwien.dsg.uml.classdiagram.export.transformation.engines.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jface.text.Document;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;

import ac.at.tuwien.dsg.uml.classdiagram.export.transformation.engines.AbstractClassDiagramTestStrategy;
import ac.at.tuwien.dsg.uml.classdiagram.export.transformation.util.RunTimeTestingTemplates;


/**
 * Class used to generate test configurations for all class properties.
 *
 *To be extended by concrete test plan generation strategies
 * 
 * __author__ = "TU Wien, Distributed System's Group", http://www.infosys.tuwien.ac.at/
 * __copyright__ = "Copyright 2016, TU Wien, Distributed Systems Group"
* __license__ = EULA currently in development. Current terms of usage below.
* __license_body__ We grant the right to use this software and create derivative work based on it for all non-commercial non-profit education purposes. 
* __license_body__ 
* __license_body__ For any commercial-related or profit-related usage of this software please contact 
* __license_body__ Hong-Linh Truong truong@dsg.tuwien.ac.at
* __license_body__ 
* __license_body__ Warranty:
* __license_body__ The software is provided "AS IS", without warranty of any kind, express or implied,
* __license_body__ including but not limited to the warranties of merchantability, fitness for a
* __license_body__ particular purpose and noninfringement. in no event shall the authors or copyright
* __license_body__ holders be liable for any claim, damages or other liability, whether in an action of
* __license_body__ contract, tort or otherwise, arising from, out of or in connection with the software or
* __license_body__ the use or other dealings in the software.
 * __maintainer__ = "Daniel Moldovan"
 * __email__ = "d.moldovan@dsg.tuwien.ac.at"
 */


public class TestPropertiesAtRuntimeStrategy extends AbstractClassDiagramTestStrategy {
	
	public TestPropertiesAtRuntimeStrategy(){
		super("Strategy which generates files for configuring our run-time verification platform for testing each class property individually.");
	}

	@Override
	public List<Document> generateTestConfig(Class classImpl) {
		
		List<Document> documents = Collections.synchronizedList(new ArrayList<Document>());
		
		//if it has no applied stereotype, in our context means they are not physical or virtual units defined in 
        //overall Infrastructure Uncertainty Profile 
		if (classImpl.getAppliedStereotypes().isEmpty()){
			return documents;
		}
		
		List<Thread> threads = new ArrayList<>();
		
		for (Property property: classImpl.getAllAttributes()){
			
			//if property is not association, it must be a simple property
			if (property.getAssociation() == null){
				Thread t = new Thread(){

					@Override
					public void run() {
						Document doc = generateTestConfigForProperty(property,classImpl);
						if (doc != null){
							documents.add(doc);
						}
					}
					
				};
				threads.add(t);
				t.setDaemon(true);
				t.start();
			}
		}
		
		for (Thread t : threads){
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		return documents;
	}
	
	private Document generateTestConfigForProperty(Property property, Class classImpl){
		
		//if not null, means it is associated to another class, so we must test connectivity and value
		if (property.getAssociation()!=null){
			System.err.format("Property %s from class %s is not a simple property, as it has an association \n", property.getName(), classImpl.getName());
			return null;
		}
		
		//for now we generate a generic test configuration for each property, which states that periodically every 30 seconds we poll the 
		//property to check it
		//TODO: see how to also generate template for test implementation
		String content = RunTimeTestingTemplates.fillSelfTestTemplate(property.getName(), classImpl.getName());
		Document testConfig = new Document(content);
		return testConfig;
	}
	
	
}
