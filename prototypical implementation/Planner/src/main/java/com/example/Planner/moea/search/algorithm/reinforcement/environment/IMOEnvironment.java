package com.example.Planner.moea.search.algorithm.reinforcement.environment;

import java.util.List;

import org.moeaframework.core.Solution;

public interface IMOEnvironment<S extends Solution> extends IEnvironment<S> {
   public List<String> getFunctionNames();

   double[] getRewards(final S state);

}
