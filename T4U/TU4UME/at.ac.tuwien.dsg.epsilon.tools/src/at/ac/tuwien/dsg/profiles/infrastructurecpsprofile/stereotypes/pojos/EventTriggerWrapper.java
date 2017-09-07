
package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos;

import com.google.gson.annotations.SerializedName;
import at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.stereotypes.pojos.EventTrigger;
public class EventTriggerWrapper {

	   @SerializedName("EventTrigger")
	   private EventTrigger _eventTrigger;

	   public EventTrigger getEventTrigger() {
	      return _eventTrigger;
	   }

	   public void setEventTrigger(EventTrigger _eventTrigger) {
	      this._eventTrigger= _eventTrigger;
	   }
}
