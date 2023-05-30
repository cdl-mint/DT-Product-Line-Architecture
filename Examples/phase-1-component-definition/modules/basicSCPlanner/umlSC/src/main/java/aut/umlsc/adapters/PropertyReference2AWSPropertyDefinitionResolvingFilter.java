package aut.umlsc.adapters;

import aut.umlsc._symboltable.PropertyReferenceSymbol;
import de.monticore.lang.awstm._symboltable.PropertyDefinitionSymbol;
import de.monticore.symboltable.Symbol;
import de.monticore.symboltable.resolving.TransitiveAdaptedResolvingFilter;

public class PropertyReference2AWSPropertyDefinitionResolvingFilter extends TransitiveAdaptedResolvingFilter<PropertyDefinitionSymbol> {


    public PropertyReference2AWSPropertyDefinitionResolvingFilter() {
        super(PropertyReferenceSymbol.KIND, PropertyDefinitionSymbol.class, PropertyDefinitionSymbol.KIND);
    }

    @Override
    public Symbol translate(Symbol symbol) {
        return new PropertyReference2AWSPropertyDefinitionAdapter((PropertyReferenceSymbol) symbol);
    }
}
