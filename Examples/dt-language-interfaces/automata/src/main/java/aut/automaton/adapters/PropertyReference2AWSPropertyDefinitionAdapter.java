package aut.automaton.adapters;

import aut.automaton._symboltable.PropertyReferenceSymbol;
import de.monticore.ast.ASTNode;
import de.monticore.lang.awstm._symboltable.PropertyDefinitionSymbol;
import de.monticore.symboltable.MutableScope;
import de.monticore.symboltable.resolving.SymbolAdapter;

public class PropertyReference2AWSPropertyDefinitionAdapter extends PropertyDefinitionSymbol implements SymbolAdapter<PropertyReferenceSymbol> {

    PropertyReferenceSymbol adaptee;

    public PropertyReference2AWSPropertyDefinitionAdapter(PropertyReferenceSymbol adaptee) {
        super(adaptee.getName());
        this.adaptee = adaptee;
    }


    @Override
    public PropertyReferenceSymbol getAdaptee() {
        return this.adaptee;
    }

    @Override
    public void setAstNode(ASTNode node) {
        super.setAstNode(node);
        adaptee.setAstNode(node);
    }

    @Override
    public void setEnclosingScope(MutableScope scope) {
        adaptee.setEnclosingScope(scope);
        super.setEnclosingScope(scope);
    }

    @Override
    public void setFullName(String fullName) {
        adaptee.setFullName(fullName);
        super.setFullName(fullName);
    }

    @Override
    public void setPackageName(String packageName) {
        adaptee.setPackageName(packageName);
        super.setPackageName(packageName);
    }
}
