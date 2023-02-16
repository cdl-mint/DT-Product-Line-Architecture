package generic.behavior.automaton;

import generic.behavior.IBehavior;
import generic.behavior.Planner;
import generic.structure.Executor;
import generic.structure.IStructure;

public class AutomatonPlanner extends Planner {

    public AutomatonPlanner(Executor ex, IBehavior beh) {
        super.executor = ex;
        super.behaviorSpec = beh;
    }
}
