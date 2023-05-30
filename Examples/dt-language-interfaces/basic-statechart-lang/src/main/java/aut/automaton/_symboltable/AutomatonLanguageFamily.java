package aut.automaton._symboltable;

import de.monticore.ModelingLanguageFamily;
import de.monticore.lang.awstm._symboltable.AWSTMLanguage;

public class AutomatonLanguageFamily extends ModelingLanguageFamily {

    public AutomatonLanguageFamily() {
        addModelingLanguage(new AutomatonLanguage());
        addModelingLanguage(new AWSTMLanguage());
    }

}
