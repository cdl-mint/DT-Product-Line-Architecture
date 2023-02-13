package aut.automaton._symboltable;

import aut.automaton.adapters.PropertyReference2AWSPropertyDefinitionResolvingFilter;
import de.monticore.antlr4.MCConcreteParser;
import de.monticore.ast.ASTNode;
import de.monticore.modelloader.ModelingLanguageModelLoader;

public class AutomatonLanguage extends AutomatonLanguageTOP {

    public static final String FILE_ENDING = "aut";

    public AutomatonLanguage() {
        super("Automaton Language", FILE_ENDING);
    }

    @Override
    protected ModelingLanguageModelLoader<? extends ASTNode> provideModelLoader() {
        return new AutomatonModelLoader(this);
    }

    @Override
    protected void initResolvingFilters() {
        super.initResolvingFilters();
        addResolvingFilter(new PropertyReference2AWSPropertyDefinitionResolvingFilter());
    }
}
