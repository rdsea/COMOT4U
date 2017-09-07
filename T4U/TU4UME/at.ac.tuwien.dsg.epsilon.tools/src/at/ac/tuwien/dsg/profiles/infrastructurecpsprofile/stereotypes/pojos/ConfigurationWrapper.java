
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.Configuration;
public class ConfigurationWrapper {

	   @SerializedName("Configuration")
	   private Configuration _configuration;

	   public Configuration getConfiguration() {
	      return _configuration;
	   }

	   public void setConfiguration(Configuration _configuration) {
	      this._configuration= _configuration;
	   }
}
