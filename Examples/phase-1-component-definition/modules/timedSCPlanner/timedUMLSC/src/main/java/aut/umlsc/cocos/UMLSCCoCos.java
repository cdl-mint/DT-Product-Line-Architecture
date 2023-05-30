package aut.umlsc.cocos;


import java.util.Optional;
import aut.umlsc._cocos.UMLSCCoCoChecker;

public class UMLSCCoCos {

  private Optional<Integer> maxNumberOfStates = Optional.of(1);
  public void setMaxNumberOfStates(Optional<Integer> maxNumberOfStates) {
    this.maxNumberOfStates = maxNumberOfStates;
  }

  /**
   * Creates a CoCo-Checker for the "InitialStateCoCos" CoCo-Set.
   * @return
   */
  public UMLSCCoCoChecker createInitialStateCoCosChecker() {
    UMLSCCoCoChecker checker = new UMLSCCoCoChecker();


    final NumberOfInitialStatesCorrect numberOfInitialStatesCorrect = new NumberOfInitialStatesCorrect();
    maxNumberOfStates.ifPresent(numberOfInitialStatesCorrect::setMaxNumberOfStates);
    checker.addCoCo(numberOfInitialStatesCorrect);

    return checker;
  }

  /**
   * Creates a CoCo-Checker for the "TransitionsCorrect" CoCo-Set.
   * @return
   */
  public UMLSCCoCoChecker createTransitionsCorrectChecker() {
    UMLSCCoCoChecker checker = new UMLSCCoCoChecker();

    checker.addCoCo(new TransitionsCorrect());

    return checker;
  }
}
