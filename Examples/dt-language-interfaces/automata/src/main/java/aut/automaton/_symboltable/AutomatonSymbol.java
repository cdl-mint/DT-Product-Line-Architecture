package aut.automaton._symboltable;


import aut.automaton.AutomatonTransition;

import java.util.List;

public class AutomatonSymbol extends AutomatonSymbolTOP {
    List<AutomatonTransition> transitions;

    public AutomatonSymbol(String name) {
        super(name);
    }

    public List<AutomatonTransition> getTransitions() {
        return transitions;
    }

    public void setTransitions(List<AutomatonTransition> transitions) {
        this.transitions = transitions;
    }

    public void addTransition(AutomatonTransition transition) {
        this.transitions.add(transition);
    }

}
