import DTPlatform;
import Planner;
import DeviationChecker;

refarch MAPE{
  software {
    component DataAccessInterface synchronizer;
    component PlannerInterface planner;
    component CheckerInterface deviation;
    connect synchronizer.data -> deviation.data;
    connect deviation.deviation -> planner.data;
    connect planner.command -> synchronizer.command;
  }
  language {
    StructureLang.TypeDef -> CheckingLang.ConditionElem;
    StructureLang.PropertyDef -> CheckingLang.ConditinProp;
    StructureLang.TypeDef -> PlannerLang.ElemType;
    StructureLang.PropertyDef -> PlannerLang.ElemProperty;
    StructureLang.MethodDef -> PlannerLang.Capability;
    StructureLang.IMethodCall -> PlannerLang.Action;
  }
}