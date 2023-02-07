package generic;

public abstract class Planner {
	IBehavior behaviorSpec;
	Executor executor;
	
	public void plan(IStructure currentStructure) {
		IStructure.Operation opToExecute = behaviorSpec.compute(currentStructure);
		executor.executeOperation(opToExecute);
	}
}
