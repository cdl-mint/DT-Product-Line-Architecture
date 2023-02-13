package parser;

import aut.automaton._ast.ASTAutomatonDefinitionCompilationUnit;
import aut.automaton._parser.AutomatonParser;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertTrue;

public class ParserTest {
    private static final String MODELPATH =
            "src"
                    + File.separator + "test"
                    + File.separator + "resources"
                    + File.separator + "correct"
                    + File.separator;

    @Test
    public void testLanguageFamily() {
        AutomatonParser automatonParser = new AutomatonParser();
        try {
            Optional<ASTAutomatonDefinitionCompilationUnit> compilationUnit = automatonParser.parse(MODELPATH + "TemperatureControl.aut");
            assertTrue(compilationUnit.isPresent());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
