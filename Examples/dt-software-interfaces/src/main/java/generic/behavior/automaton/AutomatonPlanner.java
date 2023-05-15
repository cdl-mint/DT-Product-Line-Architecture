package generic.behavior.automaton;

import generic.behavior.IBehavior;
import generic.behavior.Planner;
import generic.extensions.IDTExtension;
import generic.structure.Executor;
import generic.structure.IStructure;
import generic.structure.Monitor;

public class AutomatonPlanner extends Planner {

    public AutomatonPlanner(Executor ex, IBehavior beh) {
        super.executor = ex;
        super.behaviorSpec = beh;
    }


    @Override
    public void execute() {

    }

    @Override
    public void addDependency(IDTExtension ex) {

    }
}
