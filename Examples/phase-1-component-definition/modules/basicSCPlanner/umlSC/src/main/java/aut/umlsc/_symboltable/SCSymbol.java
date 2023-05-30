package aut.umlsc._symboltable;


import aut.umlsc.UMLSCTransition;

import java.util.List;

public class SCSymbol extends SCSymbolTOP {
    List<UMLSCTransition> transitions;

    public SCSymbol(String name) {
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
