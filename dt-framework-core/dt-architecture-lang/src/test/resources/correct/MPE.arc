import CoreDT;
import Planner;

architecture MPE {
software {
    component DataAccessInterface synchronizer;
    component PlannerInterface  planner;

    connect synchronizer.data -> planner.data;
    connect planner.command   -> synchronizer.command;
  }
  language {
    StructureLanguage.Struct -> PlannerLanguage.IType;
    StructureLanguage.Method -> PlannerLanguage.IAction;
  }
}