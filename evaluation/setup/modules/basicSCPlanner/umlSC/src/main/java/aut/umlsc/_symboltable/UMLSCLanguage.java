package aut.umlsc._symboltable;

import aut.umlsc.adapters.PropertyReference2AWSPropertyDefinitionResolvingFilter;
import de.monticore.ast.ASTNode;
import de.monticore.modelloader.ModelingLanguageModelLoader;

public class UMLSCLanguage extends UMLSCLanguageTOP {

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
