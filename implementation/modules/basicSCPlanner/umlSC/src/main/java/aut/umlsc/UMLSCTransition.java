package aut.umlsc;

import aut.umlsc._ast.ASTIAction;
import aut.umlsc._ast.ASTIGuardExpr;
import aut.umlsc._ast.ASTValue;
import aut.umlsc._symboltable.PropertyReferenceSymbol;
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
