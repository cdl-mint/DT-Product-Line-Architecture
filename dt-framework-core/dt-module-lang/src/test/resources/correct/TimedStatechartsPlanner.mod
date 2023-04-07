module TimedStatechartsPlanner implements Planner {
  software TSPlanner {
    effect extends PlannerImpl.command;
    data   extends PlannerImpl.data;
  }
  language TSDefinitionLanguage {
    TSBehavior -> PlannerLanguageInterface.IBehavior;
  }
}
