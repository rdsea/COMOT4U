
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.InfrastructureElement;
public class InfrastructureElementWrapper {

	   @SerializedName("InfrastructureElement")
	   private InfrastructureElement _infrastructureElement;

	   public InfrastructureElement getInfrastructureElement() {
	      return _infrastructureElement;
	   }

	   public void setInfrastructureElement(InfrastructureElement _infrastructureElement) {
	      this._infrastructureElement= _infrastructureElement;
	   }
}
