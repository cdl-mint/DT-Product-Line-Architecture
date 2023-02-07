package proprietary.planner;

import proprietary.executor.Executor;
import proprietary.monitor.Monitor;

public class ReversePlanner{
	private Monitor monitor;
	
	
	public void planWithDTDLMonitor(){
		// DTDLTwin x = monitor....
		// TODO: implement this
		// TODO: diese Klasse nochmal sch√∂n aufbereiten
	}
	
	class ThermostatDTDLStateMachine{
		State currentState;	// note: State ist in der StateMachineLanguage n‰her bescdhreiben
		
		public Operation compute(DTDLTwin thermostatData){	// note: Operation ist in der STructureLangauge n‰her beschrieben
			// implement here behavior based on sm-based behavior description
			if(currentState == State.IDLE){
				if(thermostatData.getAttributeValue("temp") < 20){
					this.currentState = STATE.TEMP_TOO_LOW;
					return new Operation("setTemp", 20);
				}
				// TODO: implement other transitions
			}
		}
	}


}

