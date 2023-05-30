package aut.automaton;

import aut.automaton._ast.ASTIAction;
import aut.automaton._ast.ASTIGuardExpr;
import aut.automaton._ast.ASTValue;
import aut.automaton._symboltable.PropertyReferenceSymbol;
import de.monticore.java.symboltable.Pair;
import de.monticore.lang.awstm._symboltable.PropertyDefinitionSymbolReference;

import java.util.List;

public class UMLSCTransition {
    private ASTIGuardExpr guardExpr;
    private ASTIAction astiAction;

    private List<Pair<PropertyReferenceSymbol, ASTValue>> guardAssignments;

    public ASTIGuardExpr getGuardExpr() {
        return guardExpr;
    }

    public void setGuardExpr(ASTIGuardExpr guardExpr) {
        this.guardExpr = guardExpr;
    }

    public ASTIAction getAstiAction() {
        return astiAction;
    }

    public void setAstiAction(ASTIAction astiAction) {
        this.astiAction = astiAction;
    }

    public List<Pair<PropertyReferenceSymbol, ASTValue>> getGuardAssignments() {
        return guardAssignments;
    }

    public void setGuardAssignments(List<Pair<PropertyReferenceSymbol, ASTValue>> guardAssignments) {
        this.guardAssignments = guardAssignments;
    }

    public void addGuardAssignment(PropertyReferenceSymbol propertyReferenceSymbol, ASTValue value){
        this.guardAssignments.add(new Pair<>(propertyReferenceSymbol, value));
    }

}
