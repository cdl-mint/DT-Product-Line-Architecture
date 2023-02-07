package generic.Behavior.UMLSM;

import generic.*;
import generic.Behavior.UMLSM.SMBehavior.State;

public class SMPlanner extends Planner {

	public State getCurrentState() {
		// TODO: dafür muss Planner jetzt wissen, dass this.behavior ein SMBehavior ist (Dependency Injection)
		return null;
	}
	
}
