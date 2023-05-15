package aut.automaton.cocos;

import aut.automaton._ast.ASTTransition;
import aut.automaton._cocos.AutomatonASTTransitionCoCo;
import de.se_rwth.commons.logging.Log;

public class TransitionsCorrect implements AutomatonASTTransitionCoCo {

  @Override
  public void check(ASTTransition node) {
    if(node.getSource().equals(node.getTarget())) {
      Log.error("No self loops allowed", node.get_SourcePositionStart());
    }
  }
}
