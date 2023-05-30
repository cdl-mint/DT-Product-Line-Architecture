package parser;

import de.monticore.lang.module._ast.ASTModuleDef;
import de.monticore.lang.module._parser.ModuleParser;
import de.se_rwth.commons.logging.Log;
import org.antlr.v4.runtime.RecognitionException;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class ParserTest {
    @BeforeClass
    public static void init() {
        Log.init();
        Log.enableFailQuick(false);
    }

    @Test
    public void testParseMOMOTModule() {
        ASTModuleDef a = parseModel("src/test/resources/correct/MOMOT.mod");
        assertNotNull(a);
    }

    @Test
    public void testParseBasicStatechartModule() {
        ASTModuleDef a = parseModel("src/test/resources/correct/BasicStatechartPlanner.mod");
        assertNotNull(a);
    }

    @Test
    public void testParseTimedStatechart() {
        ASTModuleDef a = parseModel("src/test/resources/correct/TimedStatechartsPlanner.mod");
        assertNotNull(a);
    }


    protected ASTModuleDef parseModel(String modelFile) {
        Path model = Paths.get(modelFile);
        ModuleParser parser = new ModuleParser();
        Optional<ASTModuleDef> optArc;
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
