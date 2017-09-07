
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.VirtualActuator;
public class VirtualActuatorWrapper {

	   @SerializedName("VirtualActuator")
	   private VirtualActuator _virtualActuator;

	   public VirtualActuator getVirtualActuator() {
	      return _virtualActuator;
	   }

	   public void setVirtualActuator(VirtualActuator _virtualActuator) {
	      this._virtualActuator= _virtualActuator;
	   }
}
