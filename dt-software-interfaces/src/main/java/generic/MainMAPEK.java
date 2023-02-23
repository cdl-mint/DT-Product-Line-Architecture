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
import java.util.List;

public class MainMAPEK {// this is our framework

    public static void main(String[] args) {
        IDTExtension an =  MainDT.getExtension("analyzer");

        while (true) {
            an.execute();
        }

    }
}
