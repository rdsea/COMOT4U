
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.TestConfiguration;
public class TestConfigurationWrapper {

	   @SerializedName("TestConfiguration")
	   private TestConfiguration _testConfiguration;

	   public TestConfiguration getTestConfiguration() {
	      return _testConfiguration;
	   }

	   public void setTestConfiguration(TestConfiguration _testConfiguration) {
	      this._testConfiguration= _testConfiguration;
	   }
}
