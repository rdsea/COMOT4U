
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.IODevice;
public class IODeviceWrapper {

	   @SerializedName("IODevice")
	   private IODevice _iODevice;

	   public IODevice getIODevice() {
	      return _iODevice;
	   }

	   public void setIODevice(IODevice _iODevice) {
	      this._iODevice= _iODevice;
	   }
}
