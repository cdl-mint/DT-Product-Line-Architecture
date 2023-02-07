package generic.Behavior.UMLSM;

import generic.IBehavior;
import proprietary.planner.DTDLOperation;
import proprietary.planner.DTDLTwin;

public class SMBehavior implements IBehavior{
	private State state;
	
	public DTDLOperation compute(IStructure currentState){
		// TODO: untenstehender Code wurde aktuell mal von proprietary Lösung so kopiert
		if(currentState == State.IDLE){
			if(thermostatData.getDTDLAttributeValue("temp") < 19.5){
				this.currentState = State.TEMP_TOO_LOW;
				return new DTDLOperation("setTemp", 20);
			}else if(thermostatData.getDTDLAttributeValue("temp") > 20.5) {
				this.currentState = State.TEMP_TOO_HIGH;
				return new DTDLOperation("setTemp", 20);
			}
		}
	}
	
	public class State{
		
	}
}
