package de.monticore.lang.awstm._symboltable;

import de.monticore.ast.ASTNode;
import de.monticore.modelloader.ModelingLanguageModelLoader;

public class AWSTMLanguage extends AWSTMLanguageTOP {

    public static final String FILE_ENDING = "aws";

    public AWSTMLanguage() {
        super("AWS TwinMaker Language", FILE_ENDING);
    }

    @Override
    protected void initResolvingFilters() {
        super.initResolvingFilters();

        setModelNameCalculator(new AWSTMModelNameCalculator());
    }

    @Override
    protected ModelingLanguageModelLoader<? extends ASTNode> provideModelLoader() {
        return new AWSTMModelLoader(this);
    }
}
