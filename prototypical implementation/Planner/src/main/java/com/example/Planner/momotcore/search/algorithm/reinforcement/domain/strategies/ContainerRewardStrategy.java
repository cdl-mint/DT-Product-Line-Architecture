package com.example.Planner.momotcore.search.algorithm.reinforcement.domain.strategies;

import at.ac.tuwien.big.moea.search.algorithm.reinforcement.domain.IRewardStrategy;
import com.example.Planner.momotcore.problem.solution.TransformationSolution;
import com.example.Planner.momotcore.util.MomotUtil;

import java.util.HashMap;
import java.util.Map;

import com.example.Planner.momotcore.models.container.ContainerModel;
import org.moeaframework.core.Solution;

public class ContainerRewardStrategy<S extends Solution> implements IRewardStrategy<S> {

   @Override
   public double determineAdditionalReward(final S s) {
      final ContainerModel model = MomotUtil.getRoot(((TransformationSolution) s).getResultGraph(),
            ContainerModel.class);
      final int retrievedContainers = (int) model.getContainer().stream().filter(c -> c.getOn() == null).count();

      return retrievedContainers - model.getContainer().size() == 0 ? 50 : 0;
   }

   @Override
   public Map<String, Double> getRewardMap() {
      final Map<String, Double> rewardMap = new HashMap<>();
      rewardMap.put("retrieveNonLastFromStack", 10.0);
      rewardMap.put("retrieveLastFromStack", 10.0);
      rewardMap.put("retrieveOnTopOfSuccessorFromStack", 10.0);
      rewardMap.put("retrieveLastOverallFromStack", 10.0);
      rewardMap.put("relocateNonLastOnStackToEmptyStack", -6.0);
      rewardMap.put("relocateNonLastOnStackToNonEmptyStack", -6.0);
      rewardMap.put("relocateLastOnStackToNonEmptyStack", -6.0);

      return rewardMap;
   }

}
