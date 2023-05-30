package parser;

import de.monticore.lang.dtarchitecture._ast.ASTDTArchitectureDef;
import de.monticore.lang.dtarchitecture._parser.DTArchitectureParser;
import de.monticore.lang.dtstructure._ast.ASTIStructureDefinition;
import de.se_rwth.commons.logging.Log;
import org.antlr.v4.runtime.RecognitionException;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

import static org.junit.Assert.*;

public class ParserTest {

    @BeforeClass
    public static void init() {
        Log.init();
        Log.enableFailQuick(false);
    }

    @Test
    public void testParseMAPE() {
        ASTDTArchitectureDef a = parseModel("src/test/resources/correct/MAPE.arc");
        assertNotNull(a);
    }

    @Test
    public void testParseMPE() {
        ASTDTArchitectureDef a = parseModel("src/test/resources/correct/MPE.arc");
        assertNotNull(a);
    }
    protected ASTDTArchitectureDef parseModel(String modelFile) {
        Path model = Paths.get(modelFile);
        DTArchitectureParser parser = new DTArchitectureParser();
        Optional<ASTDTArchitectureDef> optArc;
        try {
            optArc = parser.parse(model.toString());

            assertFalse(parser.hasErrors());

            assertTrue(optArc.isPresent());
            return optArc.get();
        }
        catch (RecognitionException | IOException e) {
            e.printStackTrace();
            fail("There was an exception when parsing the model " + modelFile + ": "
                    + e.getMessage());
        }
        return null;
    }
}
