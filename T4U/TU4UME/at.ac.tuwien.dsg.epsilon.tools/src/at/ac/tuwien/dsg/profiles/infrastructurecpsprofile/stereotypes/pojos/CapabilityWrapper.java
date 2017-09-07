
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.Capability;
public class CapabilityWrapper {

	   @SerializedName("Capability")
	   private Capability _capability;

	   public Capability getCapability() {
	      return _capability;
	   }

	   public void setCapability(Capability _capability) {
	      this._capability= _capability;
	   }
}
