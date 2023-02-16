package generic.structure;

import generic.behavior.Planner;

public abstract class Monitor {

	protected Planner planner;
	
	public void monitor() {
		while(true) {
			IStructure current = getCurrent();
			planner.plan(current);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public abstract IStructure getCurrent();
}
