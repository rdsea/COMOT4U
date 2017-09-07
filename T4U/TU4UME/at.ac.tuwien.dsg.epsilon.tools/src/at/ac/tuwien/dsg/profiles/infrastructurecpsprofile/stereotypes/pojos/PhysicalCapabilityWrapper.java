
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.PhysicalCapability;
public class PhysicalCapabilityWrapper {

	   @SerializedName("PhysicalCapability")
	   private PhysicalCapability _physicalCapability;

	   public PhysicalCapability getPhysicalCapability() {
	      return _physicalCapability;
	   }

	   public void setPhysicalCapability(PhysicalCapability _physicalCapability) {
	      this._physicalCapability= _physicalCapability;
	   }
}
