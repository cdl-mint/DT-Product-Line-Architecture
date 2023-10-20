import DTPlatform;
import Planner;

refarch MPE {
  software {
    component DataAccessInterface synchronizer;
    component PlannerInterface planner;
    connect synchronizer.data -> planner.data;
    connect planner.command -> synchronizer.command;
  }
  language {
    StructureLang.TypeDef -> PlannerLang.ElemType;
    StructureLang.PropertyDef -> PlannerLang.ElemProperty;
    StructureLang.MethodDef -> PlannerLang.Capability;
    StructureLang.IMethodCall -> PlannerLang.Action;
  }
}