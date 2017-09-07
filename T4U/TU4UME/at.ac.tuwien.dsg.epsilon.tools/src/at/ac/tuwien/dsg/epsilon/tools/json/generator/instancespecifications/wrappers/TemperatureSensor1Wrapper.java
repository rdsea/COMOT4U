
package at.ac.tuwien.dsg.epsilon.tools.json.generator.instancespecifications.wrappers;

import com.google.gson.annotations.SerializedName;


public class TemperatureSensor1Wrapper {

	   @SerializedName("TemperatureSensor1")
	   private Object _temperatureSensor1;

	   public Object getTemperatureSensor1() {
	      return _temperatureSensor1;
	   }

	   public void setTemperatureSensor1(Object _temperatureSensor1) {
	      this._temperatureSensor1= _temperatureSensor1;
	   }
}
