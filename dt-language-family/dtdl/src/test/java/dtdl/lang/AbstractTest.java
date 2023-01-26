/* (c) https://github.com/MontiCore/monticore */
package dtdl.lang;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

import de.monticore.lang.dtdl._ast.ASTDTDLDefinition;
import de.monticore.lang.dtdl._parser.DTDLParser;
import org.antlr.v4.runtime.RecognitionException;


/**
 * Provides some helpers for tests.
 *
 */
abstract public class AbstractTest {
  
  /**
   * Parses a model and ensures that the root node is present.
   * 
   * @param modelFile the full file name of the model.
   * @return the root of the parsed model.
   */
  protected ASTDTDLDefinition parseModel(String modelFile) {
    Path model = Paths.get(modelFile);
    DTDLParser parser = new DTDLParser();
    Optional<ASTDTDLDefinition> optAutomaton;
    try {
      optAutomaton = parser.parse(model.toString());

      assertFalse(parser.hasErrors());

      assertTrue(optAutomaton.isPresent());
      return optAutomaton.get();
    }
    catch (RecognitionException | IOException e) {
      e.printStackTrace();
      fail("There was an exception when parsing the model " + modelFile + ": "
          + e.getMessage());
    }
    return null;
  }
}
