package generic;

import generic.behavior.Analyzer;
import generic.behavior.IBehavior;
import generic.behavior.Planner;
import generic.behavior.automaton.AutomatonBehavior;
import generic.behavior.automaton.AutomatonPlanner;
import generic.extensions.IDTExtension;
import generic.structure.Executor;
import generic.structure.Monitor;
import generic.structure.azure.AzureExecutor;
import generic.structure.azure.AzureMonitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainDT {// this is our framework
    private static Map<String, IDTExtension> extensions = new HashMap<>();
    public static void main(String[] args) {
        // here, the configuration of the system is picked
        // TODO: can this code be derived from a model in a language that we propose as a contribution of the paper??
        // TODO: wie repräsentieren wir die DT Module hier im Code? Ist das vermutlich eine eigene Klasse?
        Executor ex = new AzureExecutor();
        Monitor mon = new AzureMonitor();

        // create and add Planner Extension
        IBehavior beh = new AutomatonBehavior();
        Planner p = new AutomatonPlanner(ex, beh);
        p.setExecutor(ex);
        p.setMonitor(mon);
        extensions.put("planner", p);
        // create and add Analyzer Extension
        Analyzer an = new Analyzer(mon, beh);
        an.addDependency(p);
        extensions.put("analyzer", an);

        // TODO: zus. Fall: es gibt eine Abhängigkeit zwischen zwei Komponenten auf Software- und Sprach-Ebene. Gibt es hier ein Beispiel?

    }

    public static IDTExtension getExtension(String name){
        return extensions.get(name);
    }
}
