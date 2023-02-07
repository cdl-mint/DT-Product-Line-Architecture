package generic;

public abstract class Monitor {

	private Planner planner;
	private Endpoint endpoint;
	
	public void monitor() {
		IStructure current = endpoint.poll();
		planner.plan(current);
	}
}
