
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.CloudProvider;
public class CloudProviderWrapper {

	   @SerializedName("CloudProvider")
	   private CloudProvider _cloudProvider;

	   public CloudProvider getCloudProvider() {
	      return _cloudProvider;
	   }

	   public void setCloudProvider(CloudProvider _cloudProvider) {
	      this._cloudProvider= _cloudProvider;
	   }
}
