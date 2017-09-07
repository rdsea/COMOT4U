
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.IoTProvider;
public class IoTProviderWrapper {

	   @SerializedName("IoTProvider")
	   private IoTProvider _ioTProvider;

	   public IoTProvider getIoTProvider() {
	      return _ioTProvider;
	   }

	   public void setIoTProvider(IoTProvider _ioTProvider) {
	      this._ioTProvider= _ioTProvider;
	   }
}
