
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.Container;
public class ContainerWrapper {

	   @SerializedName("Container")
	   private Container _container;

	   public Container getContainer() {
	      return _container;
	   }

	   public void setContainer(Container _container) {
	      this._container= _container;
	   }
}
