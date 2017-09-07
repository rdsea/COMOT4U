
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.ApplicationInterface;
public class ApplicationInterfaceWrapper {

	   @SerializedName("ApplicationInterface")
	   private ApplicationInterface _applicationInterface;

	   public ApplicationInterface getApplicationInterface() {
	      return _applicationInterface;
	   }

	   public void setApplicationInterface(ApplicationInterface _applicationInterface) {
	      this._applicationInterface= _applicationInterface;
	   }
}
