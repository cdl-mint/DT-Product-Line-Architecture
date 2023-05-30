package aut.automaton._symboltable;

import aut.automaton.adapters.PropertyReference2AWSPropertyDefinitionResolvingFilter;
import de.monticore.antlr4.MCConcreteParser;
import de.monticore.ast.ASTNode;
import de.monticore.modelloader.ModelingLanguageModelLoader;

public class UMLSCLanguage extends AutomatonLanguageTOP {

    public static final String FILE_ENDING = "sc";

    public UMLSCLanguage() {
        super("UMLSC Language", FILE_ENDING);
    }

    @Override
    protected ModelingLanguageModelLoader<? extends ASTNode> provideModelLoader() {
        return new UMLSCModelLoader(this);
    }

    @Override
    protected void initResolvingFilters() {
        super.initResolvingFilters();
        addResolvingFilter(new PropertyReference2AWSPropertyDefinitionResolvingFilter());
    }
}
