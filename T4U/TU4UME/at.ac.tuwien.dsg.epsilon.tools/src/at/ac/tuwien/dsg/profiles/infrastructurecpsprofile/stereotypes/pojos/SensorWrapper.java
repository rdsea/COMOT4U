
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.Sensor;
public class SensorWrapper {

	   @SerializedName("Sensor")
	   private Sensor _sensor;

	   public Sensor getSensor() {
	      return _sensor;
	   }

	   public void setSensor(Sensor _sensor) {
	      this._sensor= _sensor;
	   }
}
