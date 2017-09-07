
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.IoTService;
public class IoTServiceWrapper {

	   @SerializedName("IoTService")
	   private IoTService _ioTService;

	   public IoTService getIoTService() {
	      return _ioTService;
	   }

	   public void setIoTService(IoTService _ioTService) {
	      this._ioTService= _ioTService;
	   }
}
