
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.IntegrationElement;
public class IntegrationElementWrapper {

	   @SerializedName("IntegrationElement")
	   private IntegrationElement _integrationElement;

	   public IntegrationElement getIntegrationElement() {
	      return _integrationElement;
	   }

	   public void setIntegrationElement(IntegrationElement _integrationElement) {
	      this._integrationElement= _integrationElement;
	   }
}
