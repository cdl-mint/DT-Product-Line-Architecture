package aut.automaton._symboltable;

import aut.automaton._ast.ASTActionBase;
import de.monticore.lang.dtbehavior._ast.ASTBehaviorDefinitionCompilationUnit;
import de.monticore.lang.dtbehavior._ast.ASTImportStatementLOCAL;
import de.monticore.symboltable.ArtifactScope;
import de.monticore.symboltable.ImportStatement;
import de.monticore.symboltable.MutableScope;
import de.monticore.symboltable.ResolvingConfiguration;
import de.se_rwth.commons.Names;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UMLSCSymbolTableCreator extends UMLSCSymbolTableCreatorTOP{
    public UMLSCSymbolTableCreator(ResolvingConfiguration resolvingConfig, MutableScope enclosingScope) {
        super(resolvingConfig, enclosingScope);
    }

    @Override
    public void visit(ASTBehaviorDefinitionCompilationUnit node) {
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
        ArtifactScope artifactScope = new UMLSCArtifactScope(compilationUnitPackage, imports);
        artifactScope.setAstNode(node);
        putOnStack(artifactScope);
    }

    @Override
    public void visit(ASTActionBase node) {
//        if(node.isPresentAssignment()) {
//            String propertyReferenceName = node.getAssignment().getPropertyReference().getName();
//            PropertyReferenceSymbol propertyReferenceSymbol = new PropertyReferenceSymbol(propertyReferenceName);
//            addToScopeAndLinkWithNode(propertyReferenceSymbol, node.getAssignment().getPropertyReference());
//        }
    }
}
