package parser;

import de.monticore.lang.extension._ast.ASTExtensionDef;
import de.monticore.lang.extension._parser.ExtensionParser;
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
    public void testParsePlannerExt() {
        ASTExtensionDef a = parseModel("src/test/resources/correct/Planner.ext");
        assertNotNull(a);
    }

    protected ASTExtensionDef parseModel(String modelFile) {
        Path model = Paths.get(modelFile);
        ExtensionParser parser = new ExtensionParser();
        Optional<ASTExtensionDef> optArc;
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
