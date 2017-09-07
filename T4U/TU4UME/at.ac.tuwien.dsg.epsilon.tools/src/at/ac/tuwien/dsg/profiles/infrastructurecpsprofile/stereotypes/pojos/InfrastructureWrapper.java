
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.Infrastructure;
public class InfrastructureWrapper {

	   @SerializedName("Infrastructure")
	   private Infrastructure _infrastructure;

	   public Infrastructure getInfrastructure() {
	      return _infrastructure;
	   }

	   public void setInfrastructure(Infrastructure _infrastructure) {
	      this._infrastructure= _infrastructure;
	   }
}
