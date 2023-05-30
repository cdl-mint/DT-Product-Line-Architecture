package aut.automaton._symboltable;

import de.monticore.symboltable.ArtifactScope;
import de.monticore.symboltable.ImportStatement;
import de.monticore.symboltable.MutableScope;

import java.util.List;
import java.util.Optional;

public class UMLSCArtifactScope extends ArtifactScope {

    public UMLSCArtifactScope(String packageName, List<ImportStatement> imports) {
        super(packageName, imports);
    }

    public UMLSCArtifactScope(Optional<MutableScope> enclosingScope, String packageName, List<ImportStatement> imports) {
        super(enclosingScope, packageName, imports);
    }


}
