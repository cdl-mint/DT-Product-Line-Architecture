module EventBasedChecker implements DeviationChecker {
  software EventDevService {
    input extends data;
    result extends deviation;
  }

  language EventCheckingLang{
    Guard -> Condition;
  }  
}
