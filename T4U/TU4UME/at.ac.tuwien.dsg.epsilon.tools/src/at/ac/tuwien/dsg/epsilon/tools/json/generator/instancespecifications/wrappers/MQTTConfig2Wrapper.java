
package at.ac.tuwien.dsg.epsilon.tools.json.generator.instancespecifications.wrappers;

import com.google.gson.annotations.SerializedName;


public class MQTTConfig2Wrapper {

	   @SerializedName("MQTTConfig2")
	   private Object _mQTTConfig2;

	   public Object getMQTTConfig2() {
	      return _mQTTConfig2;
	   }

	   public void setMQTTConfig2(Object _mQTTConfig2) {
	      this._mQTTConfig2= _mQTTConfig2;
	   }
}
