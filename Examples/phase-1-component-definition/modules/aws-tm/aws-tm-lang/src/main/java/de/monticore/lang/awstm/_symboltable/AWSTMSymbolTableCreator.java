package de.monticore.lang.awstm._symboltable;

import de.monticore.lang.dtstructure._ast.ASTImportStatementLOCAL;
import de.monticore.lang.dtstructure._ast.ASTStructureDefinitionCompilationUnit;
import de.monticore.symboltable.ArtifactScope;
import de.monticore.symboltable.ImportStatement;
import de.monticore.symboltable.MutableScope;
import de.monticore.symboltable.ResolvingConfiguration;
import de.se_rwth.commons.Names;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AWSTMSymbolTableCreator extends AWSTMSymbolTableCreatorTOP {
    public AWSTMSymbolTableCreator(ResolvingConfiguration resolvingConfig, MutableScope enclosingScope) {
        super(resolvingConfig, enclosingScope);
    }

    @Override
    public void visit(ASTStructureDefinitionCompilationUnit node) {
        String compilationUnitPackage = Names.getQualifiedName(node.getPackageList());
        List<ImportStatement> imports = new ArrayList<>();

        for (ASTImportStatementLOCAL astImportStatementLOCAL :
                node.getImportStatementLOCALList()) {
            String qualifiedImport =
                    Names.getQualifiedName(astImportStatementLOCAL.getImportList());
            ImportStatement importStatement =
                    new ImportStatement(qualifiedImport, astImportStatementLOCAL.isStar());

            imports.add(importStatement);
        }
        ArtifactScope artifactScope = new ComponentTypeArtifactScope(compilationUnitPackage, Collections.emptyList());
        artifactScope.setAstNode(node);
        putOnStack(artifactScope);
    }


}
