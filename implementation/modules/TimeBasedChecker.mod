module TimeBasedChecker implements DeviationChecker {
  software TimeDevService {
    input extends data;
    result extends deviation;
  }

  language TimeCheckingLang{
    Guard -> Condition;
  }  
}
