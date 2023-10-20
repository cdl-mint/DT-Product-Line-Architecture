package parser;

import de.monticore.lang.productline._ast.ASTFeatureModel;
import de.monticore.lang.productline._parser.ProductLineParser;
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
        ASTFeatureModel a = parseModel("src/test/resources/correct/MAPE.pl");
        assertNotNull(a);
    }

    @Test
    public void testParseBasicStatechartModule() {
        ASTFeatureModel a = parseModel("src/test/resources/correct/MPE.pl");
        assertNotNull(a);
    }



    protected ASTFeatureModel parseModel(String modelFile) {
        Path model = Paths.get(modelFile);
        ProductLineParser parser = new ProductLineParser();
        Optional<ASTFeatureModel> optArc;
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
