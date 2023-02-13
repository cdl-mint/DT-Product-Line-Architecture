package aut.automaton._symboltable;

import de.monticore.symboltable.ArtifactScope;
import de.monticore.symboltable.ImportStatement;
import de.monticore.symboltable.MutableScope;

import java.util.List;
import java.util.Optional;

public class AutomatonArtifactScope extends ArtifactScope {

    public AutomatonArtifactScope(String packageName, List<ImportStatement> imports) {
        super(packageName, imports);
    }

    public AutomatonArtifactScope(Optional<MutableScope> enclosingScope, String packageName, List<ImportStatement> imports) {
        super(enclosingScope, packageName, imports);
    }


}
