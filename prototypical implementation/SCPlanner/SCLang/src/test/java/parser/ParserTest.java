package parser;

import sc.umlsc._ast.ASTSC;
import sc.umlsc._ast.ASTSCCompilationUnit;
import sc.umlsc._parser.UMLSCParser;
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
        UMLSCParser automatonParser = new UMLSCParser();
        try {
            Optional<ASTSCCompilationUnit> compilationUnit = automatonParser.parse(MODELPATH + "TemperatureControl.aut");
            assertTrue(compilationUnit.isPresent());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
