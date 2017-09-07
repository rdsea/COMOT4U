
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.NetworkDevice;
public class NetworkDeviceWrapper {

	   @SerializedName("NetworkDevice")
	   private NetworkDevice _networkDevice;

	   public NetworkDevice getNetworkDevice() {
	      return _networkDevice;
	   }

	   public void setNetworkDevice(NetworkDevice _networkDevice) {
	      this._networkDevice= _networkDevice;
	   }
}
