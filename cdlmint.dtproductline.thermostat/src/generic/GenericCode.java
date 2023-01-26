public class Planner{
	
	public Planner(StateMachine stateMachine){
		this.stateMachine = stateMachine);
	}
	
	private StateMachine stateMachine;
	
	public void stateMachinePlanner(StructureDefinition structureDefinition){
		Operation opToExecute = stateMachine.compute(structureDefinition);	// Annahme: Methode compute() muss im generierten SM-Code so vorhanden sein!
		// implementation of compute()...
		Executor.execute(opToExecute);
	}
	
	
}

public interface StateMachine{
		Operation compute();	// todo: das nächstes mal generisch und proprietär implementieren
}



public class Monitor{
	
	public List<Entity> getEntities(){
		
	}
	
 }
