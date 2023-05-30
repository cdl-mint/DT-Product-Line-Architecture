package behavior;

import behavior.Executor;
import behavior.Monitor;
import generic.structure.IStructure;

public abstract class PlannerImpl  {
	protected behavior.IBehavior behaviorSpec;
	protected Executor executor;
	protected Monitor monitor;

	public void plan(IStructure currentStructure) {
		IStructure.Operation opToExecute = behaviorSpec.compute(currentStructure);
		executor.executeOperation(opToExecute);
	}

	public void setMonitor(Monitor m) {
	  this.monitor = m;
	}

	public void setExecutor(Executor e) {
		this.executor = e;

	}
}
