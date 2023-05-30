package aut.umlsc._symboltable;

import de.monticore.ModelingLanguageFamily;
import de.monticore.lang.awstm._symboltable.AWSTMLanguage;

public class UMLSCLanguageFamily extends ModelingLanguageFamily {

    public UMLSCLanguageFamily() {
        addModelingLanguage(new UMLSCLanguage());
        addModelingLanguage(new AWSTMLanguage());
    }

}
