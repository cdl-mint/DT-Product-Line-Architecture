package parser;

import org.junit.Test;
import sc.umlsc._ast.ASTSC;
import sc.umlsc._ast.ASTSCCompilationUnit;
import sc.umlsc._gen.SC2JavaGenerator;
import sc.umlsc._parser.UMLSCParser;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratorTest {

    private static final String MODELPATH =
            "src"
                    + File.separator + "test"
                    + File.separator + "resources"
                    + File.separator + "correct"
                    + File.separator;
    @Test
    public void testGenerator() {
        UMLSCParser automatonParser = new UMLSCParser();
        try {
            Optional<ASTSCCompilationUnit> node = automatonParser.parse(MODELPATH + "TemperatureControl.aut");
            assertTrue(node.isPresent());

            SC2JavaGenerator generator = new SC2JavaGenerator();
            String generatedCode = generator.generateSC2Java(node.get());
            System.out.print(generatedCode);
            assertFalse(generatedCode.isEmpty());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
