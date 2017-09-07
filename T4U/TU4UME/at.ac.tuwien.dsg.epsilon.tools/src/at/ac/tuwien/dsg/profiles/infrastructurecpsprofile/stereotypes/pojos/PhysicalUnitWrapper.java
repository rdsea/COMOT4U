
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.PhysicalUnit;
public class PhysicalUnitWrapper {

	   @SerializedName("PhysicalUnit")
	   private PhysicalUnit _physicalUnit;

	   public PhysicalUnit getPhysicalUnit() {
	      return _physicalUnit;
	   }

	   public void setPhysicalUnit(PhysicalUnit _physicalUnit) {
	      this._physicalUnit= _physicalUnit;
	   }
}
