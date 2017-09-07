
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.ComputingConfiguration;
public class ComputingConfigurationWrapper {

	   @SerializedName("ComputingConfiguration")
	   private ComputingConfiguration _computingConfiguration;

	   public ComputingConfiguration getComputingConfiguration() {
	      return _computingConfiguration;
	   }

	   public void setComputingConfiguration(ComputingConfiguration _computingConfiguration) {
	      this._computingConfiguration= _computingConfiguration;
	   }
}
