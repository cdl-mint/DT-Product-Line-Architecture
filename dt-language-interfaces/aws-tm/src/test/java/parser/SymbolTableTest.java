package parser;

import de.monticore.io.paths.ModelPath;
import de.monticore.lang.awstm._symboltable.AWSTMLanguage;
import de.monticore.lang.awstm._symboltable.ComponentTypeSymbol;
import de.monticore.symboltable.GlobalScope;
import org.junit.Test;

import java.nio.file.Paths;
import java.util.Optional;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class SymbolTableTest {

    private static final ModelPath MODEL_PATH =
            new ModelPath(Paths.get("src/test/resources/"));

    @Test
    public void testSymbolTableModelLoading() {
        final GlobalScope symTab =
                new GlobalScope(MODEL_PATH, new AWSTMLanguage());
        final Optional<ComponentTypeSymbol> resolvedCTS =
                symTab.resolve("correct.Thermostat", ComponentTypeSymbol.KIND);

        assertTrue(resolvedCTS.isPresent());

    }
}
