
package at.ac.tuwien.dsg.epsilon.tools.json.generator.instancespecifications.wrappers;

import com.google.gson.annotations.SerializedName;


public class MQTTConfig1Wrapper {

	   @SerializedName("MQTTConfig1")
	   private Object _mQTTConfig1;

	   public Object getMQTTConfig1() {
	      return _mQTTConfig1;
	   }

	   public void setMQTTConfig1(Object _mQTTConfig1) {
	      this._mQTTConfig1= _mQTTConfig1;
	   }
}
