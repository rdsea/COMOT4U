
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.ApplicationElement;
public class ApplicationElementWrapper {

	   @SerializedName("ApplicationElement")
	   private ApplicationElement _applicationElement;

	   public ApplicationElement getApplicationElement() {
	      return _applicationElement;
	   }

	   public void setApplicationElement(ApplicationElement _applicationElement) {
	      this._applicationElement= _applicationElement;
	   }
}
