
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.TestExecutor;
public class TestExecutorWrapper {

	   @SerializedName("TestExecutor")
	   private TestExecutor _testExecutor;

	   public TestExecutor getTestExecutor() {
	      return _testExecutor;
	   }

	   public void setTestExecutor(TestExecutor _testExecutor) {
	      this._testExecutor= _testExecutor;
	   }
}
