
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.Unit;
public class UnitWrapper {

	   @SerializedName("Unit")
	   private Unit _unit;

	   public Unit getUnit() {
	      return _unit;
	   }

	   public void setUnit(Unit _unit) {
	      this._unit= _unit;
	   }
}
