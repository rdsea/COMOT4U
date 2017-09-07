
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.VirtualUnit;
public class VirtualUnitWrapper {

	   @SerializedName("VirtualUnit")
	   private VirtualUnit _virtualUnit;

	   public VirtualUnit getVirtualUnit() {
	      return _virtualUnit;
	   }

	   public void setVirtualUnit(VirtualUnit _virtualUnit) {
	      this._virtualUnit= _virtualUnit;
	   }
}
