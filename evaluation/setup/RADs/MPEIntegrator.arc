import DTPlatform as pf1;
import DTPlatform as pf2;
import Integrator as integr;
import Planner;

refarch MPEIntegrator {
  software {
    component pf1.DataAccessInterface synchronizer1;
    component pf2.DataAccessInterface synchronizer2;
    component integr.DataAccessInterface integrator;
    component PlannerInterface planner;
    connect synchronizer1.data -> integrator.incomingData;
    connect synchronizer2.data -> integrator.incomingData;
    connect planner.data -> integtrator.outgoingData;
    connect planner.command -> integrator.incomingCommand;
    connect integrator.outgoingCommand -> synchronizer1.command;
    connect integrator.outgoingCommand -> synchronizer2.command;
  }
  language {
    StructureLang.TypeDef -> PlannerLang.ElemType;
    StructureLang.PropertyDef -> PlannerLang.ElemProperty;
    StructureLang.MethodDef -> PlannerLang.Capability;
    StructureLang.IMethodCall -> PlannerLang.Action;
  }
}