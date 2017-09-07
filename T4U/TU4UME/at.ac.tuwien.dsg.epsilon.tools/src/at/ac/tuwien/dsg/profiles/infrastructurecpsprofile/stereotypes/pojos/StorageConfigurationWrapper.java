
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.StorageConfiguration;
public class StorageConfigurationWrapper {

	   @SerializedName("StorageConfiguration")
	   private StorageConfiguration _storageConfiguration;

	   public StorageConfiguration getStorageConfiguration() {
	      return _storageConfiguration;
	   }

	   public void setStorageConfiguration(StorageConfiguration _storageConfiguration) {
	      this._storageConfiguration= _storageConfiguration;
	   }
}
