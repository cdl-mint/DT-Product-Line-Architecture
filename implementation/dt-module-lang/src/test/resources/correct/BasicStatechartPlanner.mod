module BasicStatechartPlanner implements Planner {
  software BSPlanner {
    effect extends PlannerImpl.command;
    data   extends PlannerImpl.data;
  }
  language MomotDescriptionLanguage {
    StatechartDef -> PlannerLang.IBehavior;
  }
}
