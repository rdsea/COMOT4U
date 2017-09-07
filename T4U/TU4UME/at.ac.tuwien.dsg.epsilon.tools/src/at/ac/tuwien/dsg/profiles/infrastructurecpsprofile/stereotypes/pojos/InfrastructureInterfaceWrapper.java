
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.InfrastructureInterface;
public class InfrastructureInterfaceWrapper {

	   @SerializedName("InfrastructureInterface")
	   private InfrastructureInterface _infrastructureInterface;

	   public InfrastructureInterface getInfrastructureInterface() {
	      return _infrastructureInterface;
	   }

	   public void setInfrastructureInterface(InfrastructureInterface _infrastructureInterface) {
	      this._infrastructureInterface= _infrastructureInterface;
	   }
}
