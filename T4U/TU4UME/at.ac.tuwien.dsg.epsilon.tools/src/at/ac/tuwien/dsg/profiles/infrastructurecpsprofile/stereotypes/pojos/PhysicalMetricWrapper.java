
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.PhysicalMetric;
public class PhysicalMetricWrapper {

	   @SerializedName("PhysicalMetric")
	   private PhysicalMetric _physicalMetric;

	   public PhysicalMetric getPhysicalMetric() {
	      return _physicalMetric;
	   }

	   public void setPhysicalMetric(PhysicalMetric _physicalMetric) {
	      this._physicalMetric= _physicalMetric;
	   }
}
