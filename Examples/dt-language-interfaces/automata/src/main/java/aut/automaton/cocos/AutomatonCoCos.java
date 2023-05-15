package aut.automaton.cocos;


import java.util.Optional;

import aut.automaton._cocos.AutomatonCoCoChecker;

public class AutomatonCoCos {

  private Optional<Integer> maxNumberOfStates = Optional.of(1);
  public void setMaxNumberOfStates(Optional<Integer> maxNumberOfStates) {
    this.maxNumberOfStates = maxNumberOfStates;
  }

  /**
   * Creates a CoCo-Checker for the "InitialStateCoCos" CoCo-Set.
   * @return
   */
  public AutomatonCoCoChecker createInitialStateCoCosChecker() {
    AutomatonCoCoChecker checker = new AutomatonCoCoChecker();


    final NumberOfInitialStatesCorrect numberOfInitialStatesCorrect = new NumberOfInitialStatesCorrect();
    maxNumberOfStates.ifPresent(numberOfInitialStatesCorrect::setMaxNumberOfStates);
    checker.addCoCo(numberOfInitialStatesCorrect);

    return checker;
  }

  /**
   * Creates a CoCo-Checker for the "TransitionsCorrect" CoCo-Set.
   * @return
   */
  public AutomatonCoCoChecker createTransitionsCorrectChecker() {
    AutomatonCoCoChecker checker = new AutomatonCoCoChecker();

    checker.addCoCo(new TransitionsCorrect());

    return checker;
  }
}
