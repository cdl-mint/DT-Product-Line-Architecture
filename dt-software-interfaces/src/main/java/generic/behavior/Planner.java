package generic.behavior;

import generic.structure.Executor;
import generic.structure.IStructure;

public abstract class Planner {
	protected IBehavior behaviorSpec;
	protected Executor executor;
	
	public void plan(IStructure currentStructure) {
		IStructure.Operation opToExecute = behaviorSpec.compute(currentStructure);
		executor.executeOperation(opToExecute);
	}
}
