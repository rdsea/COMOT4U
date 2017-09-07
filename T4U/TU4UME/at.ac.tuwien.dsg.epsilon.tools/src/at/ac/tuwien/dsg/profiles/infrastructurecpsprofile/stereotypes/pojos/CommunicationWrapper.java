
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.Communication;
public class CommunicationWrapper {

	   @SerializedName("Communication")
	   private Communication _communication;

	   public Communication getCommunication() {
	      return _communication;
	   }

	   public void setCommunication(Communication _communication) {
	      this._communication= _communication;
	   }
}
