
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.PeriodicTrigger;
public class PeriodicTriggerWrapper {

	   @SerializedName("PeriodicTrigger")
	   private PeriodicTrigger _periodicTrigger;

	   public PeriodicTrigger getPeriodicTrigger() {
	      return _periodicTrigger;
	   }

	   public void setPeriodicTrigger(PeriodicTrigger _periodicTrigger) {
	      this._periodicTrigger= _periodicTrigger;
	   }
}
