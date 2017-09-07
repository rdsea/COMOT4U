
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.SoftwareDefinedCapability;
public class SoftwareDefinedCapabilityWrapper {

	   @SerializedName("SoftwareDefinedCapability")
	   private SoftwareDefinedCapability _softwareDefinedCapability;

	   public SoftwareDefinedCapability getSoftwareDefinedCapability() {
	      return _softwareDefinedCapability;
	   }

	   public void setSoftwareDefinedCapability(SoftwareDefinedCapability _softwareDefinedCapability) {
	      this._softwareDefinedCapability= _softwareDefinedCapability;
	   }
}
