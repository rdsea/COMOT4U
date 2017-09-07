
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.Observation;
public class ObservationWrapper {

	   @SerializedName("Observation")
	   private Observation _observation;

	   public Observation getObservation() {
	      return _observation;
	   }

	   public void setObservation(Observation _observation) {
	      this._observation= _observation;
	   }
}
