
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.Test;
public class TestWrapper {

	   @SerializedName("Test")
	   private Test _test;

	   public Test getTest() {
	      return _test;
	   }

	   public void setTest(Test _test) {
	      this._test= _test;
	   }
}
