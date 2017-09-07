
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.TestTrigger;
public class TestTriggerWrapper {

	   @SerializedName("TestTrigger")
	   private TestTrigger _testTrigger;

	   public TestTrigger getTestTrigger() {
	      return _testTrigger;
	   }

	   public void setTestTrigger(TestTrigger _testTrigger) {
	      this._testTrigger= _testTrigger;
	   }
}
