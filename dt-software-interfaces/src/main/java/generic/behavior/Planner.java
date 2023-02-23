package generic.behavior;

import generic.extensions.IDTExtension;
import generic.structure.Executor;
import generic.structure.IStructure;
import generic.structure.Monitor;

public abstract class Planner implements IDTExtension {
	protected IBehavior behaviorSpec;
	protected Executor executor;

	protected Monitor monitor;


	
	public void plan(IStructure currentStructure) {
		IStructure.Operation opToExecute = behaviorSpec.compute(currentStructure);
		executor.executeOperation(opToExecute);
	}

	@Override
	public void setMonitor(Monitor m) {
	  this.monitor = m;
	}

	@Override
	public void setExecutor(Executor e) {
		this.executor = e;

	}
}
