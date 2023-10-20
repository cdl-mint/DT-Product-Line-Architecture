package dtpl;

component DT {
  component Planner planner;
  component DTPlatform platform;

  connect planner.operation -> platform.operation;
  connect platform.data -> planner.data;
}