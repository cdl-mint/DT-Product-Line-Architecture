import CoreDT;
import Planner;
import DeviationChecker;

architecture MAPE {
  software {
    component DataAccessInterface synchronizer;
    component PlannerInterface  planner;
    component AnalyzerInterface analyzer;

    connect synchronizer.data  -> analyzer.data;
    connect analyzer.deviation -> planner.data;
    connect planner.command    -> synchronizer.command;
  }
  language {
    StructureLanguage.Struct -> PlannerLanguage.IType;
    StructureLanguage.Method -> PlannerLanguage.IAction;
    StructureLanguage.Struct -> AnalyzerLanguage.ITypeDef;
    StructureLanguage.Method -> AnalyzerLanguage.IActionDef;
  }
}
