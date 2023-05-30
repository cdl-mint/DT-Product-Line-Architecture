module BasicSCPlanner implements Planner {
  software BasicSCExecutor {
    update extends data;
    transition extends command;
  }
  language UMLSC{
    SCDef -> GoalSpec;
  }
}
