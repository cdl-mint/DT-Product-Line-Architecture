package generic.behavior;

import generic.structure.Executor;
import generic.structure.IStructure;

public abstract class Planner {
	IBehavior behaviorSpec;
	Executor executor;
	
	public void plan(IStructure currentStructure) {
		IStructure.Operation opToExecute = behaviorSpec.compute(currentStructure);
		executor.executeOperation(opToExecute);
	}
}
