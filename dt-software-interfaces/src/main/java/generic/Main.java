package generic;

import generic.behavior.IBehavior;
import generic.behavior.Planner;
import generic.behavior.automaton.AutomatonBehavior;
import generic.behavior.automaton.AutomatonPlanner;
import generic.structure.Executor;
import generic.structure.Monitor;
import generic.structure.azure.AzureExecutor;
import generic.structure.azure.AzureMonitor;

public class Main {// this is our framework


    public static void main(String[] args) {
        // here, the configuration of the system is picked
        // TODO: can this code be derived from a model in a language that we propose as a contribution of the paper??
        // TODO: wie repräsentieren wir die DT Module hier im Code? Ist das vermutlich eine eigene Klasse?
        Executor ex = new AzureExecutor();
        IBehavior beh = new AutomatonBehavior();
        Planner p = new AutomatonPlanner(ex, beh);
        Monitor mon = new AzureMonitor(p);
        mon.monitor();
    }
}
