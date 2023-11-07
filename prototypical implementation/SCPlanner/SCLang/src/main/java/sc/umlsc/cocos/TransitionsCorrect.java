package sc.umlsc.cocos;

import sc.umlsc._ast.ASTTransition;
import sc.umlsc._cocos.UMLSCASTTransitionCoCo;
import de.se_rwth.commons.logging.Log;

public class TransitionsCorrect implements UMLSCASTTransitionCoCo {

  @Override
  public void check(ASTTransition node) {
    if(node.getSource().equals(node.getTarget())) {
      Log.error("No self loops allowed", node.get_SourcePositionStart());
    }
  }
}
