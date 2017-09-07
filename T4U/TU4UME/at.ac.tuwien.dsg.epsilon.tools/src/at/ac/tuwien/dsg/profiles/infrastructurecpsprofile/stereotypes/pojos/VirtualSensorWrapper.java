
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.VirtualSensor;
public class VirtualSensorWrapper {

	   @SerializedName("VirtualSensor")
	   private VirtualSensor _virtualSensor;

	   public VirtualSensor getVirtualSensor() {
	      return _virtualSensor;
	   }

	   public void setVirtualSensor(VirtualSensor _virtualSensor) {
	      this._virtualSensor= _virtualSensor;
	   }
}
