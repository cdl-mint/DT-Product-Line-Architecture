package proprietary.planner;

import proprietary.executor.Executor;

public class Planner{
	private ThermostatDTDLStateMachine stateMachine;
	private DTDLExecutor executor;
	
	// State of the Art (proprietary, generated)
	public void planWithAzure(DTDLTwin thermostatData){
		DTDLOperation opToExecute = stateMachine.compute(thermostatData);
		if(opToExecute != null){
			Executor.execute(opToExecute);
		}
	}
	
	public void planWithAWS(TwinMakerTwin thermostatData){
		AWSOperation opToExecute = stateMachine.compute(thermostatData);
		if(opToExecute != null){
			Executor.execute(opToExecute);
		}
	}
	
	class ThermostatDTDLStateMachine{	// TODO: können wir die state machine als unsere knowledge base ansehen???
		State currentState;	// note: State ist in der StateMachineLanguage näher bescdhreiben
		
		public DTDLOperation compute(DTDLTwin thermostatData){	// note: Operation ist in der STructureLangauge näher beschrieben
			// implement here behavior based on sm-based behavior description
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
	}
	
	class ThermostatAWSStateMachine{
		private State currentState;
	
		public AWSOperation compute(AWS thermostatData){	// note: Operation ist in der STructureLangauge näher beschrieben
			// implement here behavior based on sm-based behavior description
			if(currentState == State.IDLE){
				if(thermostatData.getAWSAttributeValue("temp") < 20){
					this.currentState = STATE.TEMP_TOO_LOW;
					return new AWSOperation("setTemp", 20);
				}
				// TODO: implement other transitions
			}
		}
	}


}

