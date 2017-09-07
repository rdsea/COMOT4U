
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.IntegrationInterface;
public class IntegrationInterfaceWrapper {

	   @SerializedName("IntegrationInterface")
	   private IntegrationInterface _integrationInterface;

	   public IntegrationInterface getIntegrationInterface() {
	      return _integrationInterface;
	   }

	   public void setIntegrationInterface(IntegrationInterface _integrationInterface) {
	      this._integrationInterface= _integrationInterface;
	   }
}
