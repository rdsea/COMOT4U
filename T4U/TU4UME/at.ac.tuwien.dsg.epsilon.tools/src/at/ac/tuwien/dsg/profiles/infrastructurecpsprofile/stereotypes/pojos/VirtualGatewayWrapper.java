
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.VirtualGateway;
public class VirtualGatewayWrapper {

	   @SerializedName("VirtualGateway")
	   private VirtualGateway _virtualGateway;

	   public VirtualGateway getVirtualGateway() {
	      return _virtualGateway;
	   }

	   public void setVirtualGateway(VirtualGateway _virtualGateway) {
	      this._virtualGateway= _virtualGateway;
	   }
}
