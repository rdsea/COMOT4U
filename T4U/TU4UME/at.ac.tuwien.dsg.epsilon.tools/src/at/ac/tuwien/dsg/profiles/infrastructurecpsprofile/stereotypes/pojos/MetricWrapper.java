
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.Metric;
public class MetricWrapper {

	   @SerializedName("Metric")
	   private Metric _metric;

	   public Metric getMetric() {
	      return _metric;
	   }

	   public void setMetric(Metric _metric) {
	      this._metric= _metric;
	   }
}
