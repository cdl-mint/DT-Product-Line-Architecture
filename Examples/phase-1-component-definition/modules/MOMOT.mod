module MOMOT implements Planner {
  software MomotPlanner {
    action extends command;
    status extends data;
  }
  language MomotDescriptionLanguage {
    MomotDef -> GoalSpec;
  }
}
