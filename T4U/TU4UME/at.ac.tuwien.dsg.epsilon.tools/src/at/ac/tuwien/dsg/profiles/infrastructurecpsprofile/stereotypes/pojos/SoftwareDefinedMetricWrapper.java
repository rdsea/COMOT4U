
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.SoftwareDefinedMetric;
public class SoftwareDefinedMetricWrapper {

	   @SerializedName("SoftwareDefinedMetric")
	   private SoftwareDefinedMetric _softwareDefinedMetric;

	   public SoftwareDefinedMetric getSoftwareDefinedMetric() {
	      return _softwareDefinedMetric;
	   }

	   public void setSoftwareDefinedMetric(SoftwareDefinedMetric _softwareDefinedMetric) {
	      this._softwareDefinedMetric= _softwareDefinedMetric;
	   }
}
