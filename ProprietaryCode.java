public class Planner{
	private ThermostatDTDLStateMachine stateMachine;
	
	
	// State of the Art (proprietary, generated)
	public void dtdlStateMachinePlanner(DTDLTwin thermostatData){
		Operation opToExecute = stateMachine.compute(thermostatData);
		if(opToExecute != null){
			Executor.execute(opToExecute);
		}
	}
	
	public void plan(){
		// DTDLTwin x = monitor....
		// TODO: implement this
		// TODO: diese Klasse nochmal schön aufbereiten
	}
}

public class ThermostatDTDLStateMachine{
	State currentState;
	
	public Operation compute(DTDLTwin thermostatData){
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



public class Monitor{
	Planner planner;
	
	// TODO: hier könnten wir den Analyzer aufrufen, und der ruft dann erst den Planner an
	// Was macht der Analyzer dann?
	// - erkennt, dass sich der state ändern muss -> konkrete Änderung passiert dann auf Basis der SM im Planner
	// - muss ich überhaupt reagieren, oder kann ich normal weiterlaufen?
	public void dtdlMonitor(){
		while(true){
			planner.dtdlStateMachinePlanner(aws.getEntity("Thermostat1"));
			Thread.sleep(5);
		}
	}
	// Task 1.2: wie switchen wir hier von DTDL zu AWS (selbes bei Executor)??
	public void awsMonitor(){
		while(true){
			planner.dtdlStateMachinePlanner(aws.getEntity("Thermostat1"));
			Thread.sleep(5);
		}
	}
	
}

// TODO: implement executor
