package ac.at.tuwien.dsg.uml.classdiagram.export.transformation.internal.entities;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Stereotype;

/**
 * A system description for run-time configuration platform (https://github.com/tuwiendsg/RuntimeVerification)
 * looks like https://github.com/tuwiendsg/RuntimeVerification/blob/master/resources/templates/default/systemDescription
 * Example:
 * {
      'name': 'LoadBalancer',
      'type': 'Composite',
      'containedUnits': [
        {
          'name': 'VM.LoadBalancer',
          'type': 'VirtualMachine'
        },
        {
          'name': 'Process.HAProxy',
          'type': 'Process',
          'hostedOn': 'VM.LoadBalancer'
        } 
 * 
 * This class represents such an entity
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

public class RunTimeTestingSystemDescriptionEntity {
	private String name;
	private String type;
	private List<RunTimeTestingSystemDescriptionEntity> containedUnits;
	private List<RunTimeTestingSystemDescriptionEntity> communicatesWith;
	private RunTimeTestingSystemDescriptionEntity hostedOn;
	
	public RunTimeTestingSystemDescriptionEntity() {
		containedUnits = new ArrayList<RunTimeTestingSystemDescriptionEntity>();
		communicatesWith = new ArrayList<RunTimeTestingSystemDescriptionEntity>();
	}
	
	public RunTimeTestingSystemDescriptionEntity(Class classImpl) {
		containedUnits = new ArrayList<RunTimeTestingSystemDescriptionEntity>();
		communicatesWith = new ArrayList<RunTimeTestingSystemDescriptionEntity>();
		name  = classImpl.getName().replaceAll("\\W", "_");
		
		//the type is obtained from the applied stereotype
		EList<Stereotype> appliedStereotypes = classImpl.getAppliedStereotypes();
		if (appliedStereotypes.isEmpty()){
			System.err.format("Class %s does not have any applied stereotype. Setting type to Composite \n", classImpl.getName());
			type = "Composite";
		}else{
			//get first stereotype
			Stereotype stereotype = appliedStereotypes.get(0);
			type = convertType(stereotype.getName());
		}
	}
	
	
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}
	
	public void addContainedUnit(RunTimeTestingSystemDescriptionEntity unit){
		containedUnits.add(unit);
	}
	
	public void addCommunicatesToUnit(RunTimeTestingSystemDescriptionEntity unit){
		communicatesWith.add(unit);
	}

	public List<RunTimeTestingSystemDescriptionEntity> getContainedUnits() {
		return containedUnits;
	}

	public List<RunTimeTestingSystemDescriptionEntity> getCommunicatesWith() {
		return communicatesWith;
	}

	public RunTimeTestingSystemDescriptionEntity getHostedOn() {
		return hostedOn;
	}
	
	public boolean hasHostedOn() {
		return hostedOn != null;
	}
	
	public void setHostedOn(RunTimeTestingSystemDescriptionEntity hostedOn) {
		this.hostedOn = hostedOn;
	}

	private String convertType(String toConvert){
		
//      supported unit types at https://github.com/tuwiendsg/RuntimeVerification/blob/master/lib/Model.py#L53
		
//		PhysicalMachine
//	    VirtualMachine
//	    VirtualContainer
//	    SoftwareContainer
//	    SoftwarePlatform
//	    SoftwareArtifact
//	    Gateway
//	    PhysicalDevice
//	    Process
//	    Service 
//	    Composite
	
	switch(toConvert){
		case "VirtualUnit":
			return "VirtualMachine";
			
		case "PhysicalUnit":
			return "PhysicalMachine";
			
		case "VirtualComponent":
			return "Process";
			
		case "VirtualCommunication":
			System.err.println("Converting VirtualCommunication to Service. \n Maybe better to add in Runtime-Testing platform support VirtualNetwork \n ");
			return "Service";
			
		default:
			System.err.format("Type %s was not recognized \n", toConvert);
			return null;
			
		}
	}
	
	
	public String toJSONString(){
		
		if (type == null){
			return null;
		}
		
		String description = String.format(JSON_REPRESENTATION, name, type);
		if (! (hostedOn == null)){
			description += String.format(",'hostedOn':'%s'\n",hostedOn.getName());
		}
		
		if (! (containedUnits.isEmpty())){
			description += ",'containedUnits': [ \n";
			
			for (RunTimeTestingSystemDescriptionEntity e : containedUnits){
				description += e.toJSONString() + ",\n";
			}
			
			description = description.substring(0, description.length()-2); // remove last ",\n"
			description += "\n ]";
		}
		
		description += "\n }";
		
		return description;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		RunTimeTestingSystemDescriptionEntity other = (RunTimeTestingSystemDescriptionEntity) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}




	private final String JSON_REPRESENTATION = "\n"
			+ "{\n"
			+ "'name': '%1$s',\n"
			+ "'type': '%2$s'\n";
    // need to add } at end, containedUnits, hostedOn, the works 
 
}
