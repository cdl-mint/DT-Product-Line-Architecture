import DTPlatform as pf1;
import DTPlatform as pf2;
import Integrator as integr;
import Planner;

refarch MAPEIntegrator {
  software {
    component pf1.DataAccessInterface synchronizer1;
    component pf2.DataAccessInterface synchronizer2;
    component integr.DataAccessInterface integrator;
    component PlannerInterface planner;
    component CheckerInterface deviation;
    connect synchronizer1.data -> integrator.incomingData;
    connect synchronizer2.data -> integrator.incomingData;
    connect integrator.outgoingData -> deviation.data;
    connect deviation.deviation -> planner.data;
    connect planner.command -> integrator.incomingCommand;
    connect integrator.outgoingCommand -> synchronizer1.command;
    connect integrator.outgoingCommand -> synchronizer2.command;
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