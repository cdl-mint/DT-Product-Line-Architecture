public class Planner{
	
	public Planner(StateMachine stateMachine){
		this.stateMachine = stateMachine);
	}
	
	
	// State of the Art (proprietary, generated)
	public void dtdlStateMachinePlanner(DTDLTwin thermostatCurrentState){
		Operation opToExecute = thermostatStateMachine.compute(thermostatCurrentState);
		Executor.execute(opToExecute);
	}
	
	// Generic, configured
	public void stateMachinePlanner(StructureDefinition structureDefinition){
		// wie kann ich den State in DTDL nun auf einen State in der SM kommen?
		List<DTDLInterface> interfaces = dtdlMonitorGetInterfaces();
		for(DTDLInterface interf : interfaces){
			List<DTDLInstance> twins = dtdlMonitorGetInstancesForInterface(interf);
			for(DTDLInstance twin : twins){
				State x = // wie kann ich den State in DTDL nun auf einen State in der SM kommen?
				List<Transformation> transformations = stateMachine.getState(x).getAvailableTransformations();
				// todo: wie kann ich Transformation auf Operation mappen?
				dtdlExecutor.execute(transformations.get(0));
			}
		}
			
	}
	
	private StateMachine stateMachine;
	
	public void stateMachinePlanner(StructureDefinition structureDefinition){
		Operation opToExecute = stateMachine.compute(structureDefinition);	// Annahme: Methode compute() muss im generierten SM-Code so vorhanden sein!
		// implementation of compute()...
		Executor.execute(opToExecute);
	}
	
	
}

public interface StateMachine implements STateMachine{
		Operation compute();	// todo: das nächstes mal generisch und proprietär implementieren
}


public class ThermostatStateMachine{
	
	public Operation compute(DTDLTwin thermostatCurrentState){
		// implement here behavior based on sm-based behavior description
	}
}



public class Monitor{
	public String dtdlMonitorGet(String entity){
		dtdlMonitor.subscribeTo(newMonitor.java)
	}
	
	public void awsMonitor(){
		while(true){
			henshinPlanner(aws.getEntity("Thermostat1"))
			Thread.sleep(5);
		}
	}
	
	public List<Entity> getEntities(){
		
	}
	
}

public class Legacy{
	// State of the Art (proprietary, configured)
	public void henshinPlanner(){
		// wie kann ich den State in DTDL nun auf einen State in der SM kommen?
		List<DTDLInterface> interfaces = dtdlMonitorGetInterfaces();
		for(DTDLInterface interf : interfaces){
			List<DTDLInstance> twins = dtdlMonitorGetInstancesForInterface(interf);
			for(DTDLInstance twin : twins){
				State x = // wie kann ich den State in DTDL nun auf einen State in der SM kommen?
				List<Transformation> transformations = stateMachine.getState(x).getAvailableTransformations();
				// todo: wie kann ich Transformation auf Operation mappen?
				dtdlExecutor.execute(transformations.get(0));
			}
			
	}
}
