module MOMOT implements Planner {
  software MomotPlanner {
    action extends PlannerImpl.command;
    status extends PlannerImpl.data;
  }
  language MomotDescriptionLanguage {
    MomotBehavior -> PlannerLang.IBehavior;
  }
}
