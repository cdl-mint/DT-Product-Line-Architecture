package de.monticore.lang.awstm._symboltable;

import de.monticore.symboltable.*;
import de.monticore.symboltable.modifiers.AccessModifier;
import de.monticore.symboltable.names.CommonQualifiedNamesCalculator;
import de.monticore.symboltable.resolving.ResolvingInfo;
import de.se_rwth.commons.logging.Log;

import java.util.*;
import java.util.function.Predicate;

public class ComponentTypeArtifactScope extends ArtifactScope {

    private CommonQualifiedNamesCalculator qualifiedNamesCalculator = new CommonQualifiedNamesCalculator();


    public ComponentTypeArtifactScope(Optional<MutableScope> enclosingScope, String packageName, List<ImportStatement> imports) {
        super(enclosingScope, packageName, imports);
    }

    public ComponentTypeArtifactScope(String packageName, List<ImportStatement> imports) {
        super(packageName, imports);
    }


    @Override
    protected <T extends Symbol> Collection<T> continueWithEnclosingScope(ResolvingInfo resolvingInfo,
                                                                          String name, SymbolKind kind, AccessModifier modifier, Predicate<Symbol> predicate) {
        final Collection<T> result = new LinkedHashSet<>();

        if (checkIfContinueWithEnclosingScope(resolvingInfo.areSymbolsFound())
                && (getEnclosingScope().isPresent())) {
            if (!(enclosingScope instanceof GlobalScope)) {
                Log.warn("0xA1039 An artifact scope should have the global scope as enclosing scope or no "
                        + "enclosing scope at all.");
            }

            final Set<String> potentialQualifiedNames = qualifiedNamesCalculator
                    .calculateQualifiedNames(name, getPackageName(), getImports());

            for (final String potentialQualifiedName : potentialQualifiedNames) {
                final Collection<T> resolvedFromEnclosing = enclosingScope.resolveMany(resolvingInfo,
                        potentialQualifiedName, kind, modifier, predicate);

                if (!resolvedFromEnclosing.isEmpty()) {
                    return resolvedFromEnclosing;
                }

                result.addAll(resolvedFromEnclosing);
            }
        }
        return result;
    }

}
