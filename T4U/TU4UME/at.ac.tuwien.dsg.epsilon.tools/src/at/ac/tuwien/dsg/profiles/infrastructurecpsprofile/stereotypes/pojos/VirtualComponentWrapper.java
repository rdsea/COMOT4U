
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.VirtualComponent;
public class VirtualComponentWrapper {

	   @SerializedName("VirtualComponent")
	   private VirtualComponent _virtualComponent;

	   public VirtualComponent getVirtualComponent() {
	      return _virtualComponent;
	   }

	   public void setVirtualComponent(VirtualComponent _virtualComponent) {
	      this._virtualComponent= _virtualComponent;
	   }
}
