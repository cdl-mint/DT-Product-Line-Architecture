package aut.automaton._symboltable;


import aut.automaton.UMLSCTransition;

import java.util.List;

public class UMLSCSymbol extends AutomatonSymbolTOP {
    List<UMLSCTransition> transitions;

    public UMLSCSymbol(String name) {
        super(name);
    }

    public List<UMLSCTransition> getTransitions() {
        return transitions;
    }

    public void setTransitions(List<UMLSCTransition> transitions) {
        this.transitions = transitions;
    }

    public void addTransition(UMLSCTransition transition) {
        this.transitions.add(transition);
    }

}
