module TimedStatechartsPlanner implements Planner {
  software TimedSCExecutor {
    update extends data;
    transition extends command;
  }
  language TSC {
    TSCDef -> GoalSpec;
  }
}
