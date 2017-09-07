
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.CommunicationConfiguration;
public class CommunicationConfigurationWrapper {

	   @SerializedName("CommunicationConfiguration")
	   private CommunicationConfiguration _communicationConfiguration;

	   public CommunicationConfiguration getCommunicationConfiguration() {
	      return _communicationConfiguration;
	   }

	   public void setCommunicationConfiguration(CommunicationConfiguration _communicationConfiguration) {
	      this._communicationConfiguration= _communicationConfiguration;
	   }
}
