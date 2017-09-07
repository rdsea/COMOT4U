
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.Actuator;
public class ActuatorWrapper {

	   @SerializedName("Actuator")
	   private Actuator _actuator;

	   public Actuator getActuator() {
	      return _actuator;
	   }

	   public void setActuator(Actuator _actuator) {
	      this._actuator= _actuator;
	   }
}
