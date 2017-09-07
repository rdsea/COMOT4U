
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.CloudService;
public class CloudServiceWrapper {

	   @SerializedName("CloudService")
	   private CloudService _cloudService;

	   public CloudService getCloudService() {
	      return _cloudService;
	   }

	   public void setCloudService(CloudService _cloudService) {
	      this._cloudService= _cloudService;
	   }
}
