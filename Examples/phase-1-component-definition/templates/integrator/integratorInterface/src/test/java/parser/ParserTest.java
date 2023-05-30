package parser;

import de.monticore.lang.dtstructure._ast.ASTIStructureDefinition;
import de.se_rwth.commons.logging.Log;
import lang.AbstractTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ParserTest extends AbstractTest {

    @BeforeClass
    public static void init() {
        Log.init();
        Log.enableFailQuick(false);
    }

    @Test
    public void testParser() {
        ASTIStructureDefinition a = parseModel("src/test/resources/correct/Thermostat.aws");


        System.out.println(Log.getFindings());
        assertNotNull(a);
    }

}
