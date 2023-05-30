package aut.umlsc.cocos;

import aut.umlsc._ast.ASTTransition;
import aut.umlsc._cocos.UMLSCASTTransitionCoCo;
import de.se_rwth.commons.logging.Log;

public class TransitionsCorrect implements UMLSCASTTransitionCoCo {

  @Override
  public void check(ASTTransition node) {
    if(node.getSource().equals(node.getTarget())) {
      Log.error("No self loops allowed", node.get_SourcePositionStart());
    }
  }
}
