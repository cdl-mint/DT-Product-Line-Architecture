package com.example.Planner;


import com.example.Planner.moea.util.MathUtil;
import com.example.Planner.momotcore.ModuleManager;
import com.example.Planner.momotcore.TransformationSearchOrchestration;
import com.example.Planner.momotcore.models.at.ac.tuwien.big.momot.examples.stack.stack.Stack;
import com.example.Planner.momotcore.models.at.ac.tuwien.big.momot.examples.stack.stack.StackModel;
import com.example.Planner.momotcore.problem.solution.TransformationSolution;
import com.example.Planner.momotcore.problem.unit.parameter.random.RandomIntegerValue;
import com.example.Planner.momotcore.search.fitness.IEGraphMultiDimensionalFitnessFunction;
import com.example.Planner.momotcore.search.fitness.dimension.AbstractEGraphFitnessDimension;
import com.example.Planner.momotcore.search.fitness.dimension.TransformationLengthDimension;
import com.example.Planner.momotcore.search.solution.repair.TransformationPlaceholderRepairer;
import com.example.Planner.momotcore.util.MomotUtil;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.henshin.interpreter.EGraph;

public class StackOrchestration extends TransformationSearchOrchestration {

   private int maxShift = 50;

   public StackOrchestration(final EGraph initialGraph, final int nrVariables) {
      super(new ModuleManager(".", Paths.get("model", "stack.henshin").toString()), initialGraph, nrVariables);

      this.initOrchestration();

   }

   public StackOrchestration(final String initialGraphPath, final int nrVariables) {
      super(new ModuleManager(".", Paths.get("model", "stack.henshin").toString()), initialGraphPath, nrVariables);

      this.initOrchestration();
   }

   public int getMaxShift() {
      return maxShift;
   }

   private void initOrchestration() {
      final IEGraphMultiDimensionalFitnessFunction fitnessFunction = getFitnessFunction();
      fitnessFunction.setSolutionRepairer(new TransformationPlaceholderRepairer()); // replace not executed rules with
                                                                                    // empty rules

      fitnessFunction.addObjective(new AbstractEGraphFitnessDimension("Standard Deviation") {
         @Override
         protected double internalEvaluate(final TransformationSolution solution) {
            final StackModel stacks = MomotUtil.getRoot(solution.execute(), StackModel.class);
            final List<Integer> loads = new ArrayList<>();
            for(final Stack stack : stacks.getStacks()) {
               final int load = stack.getLoad();
               loads.add(load);
            }

            return MathUtil.getStandardDeviation(loads);
         }
      });

      fitnessFunction.addObjective(new TransformationLengthDimension());

      setSolutionWriter(new StackSolutionWriter(getFitnessFunction()));

      getModuleManager().removeUnits(StackModule.CreateStack.NAME, StackModule.ConnectStacks.NAME); // defined in same
                                                                                                    // file, but not
                                                                                                    // applicable

      final ModuleManager moduleManager = getModuleManager();
      moduleManager.addNonSolutionParameters(StackModule.ShiftLeft.Parameter.FROM_LOAD,
            StackModule.ShiftLeft.Parameter.TO_LOAD, StackModule.ShiftRight.Parameter.FROM_LOAD,
            StackModule.ShiftRight.Parameter.TO_LOAD);
      moduleManager.setParameterValue(StackModule.ShiftLeft.Parameter.AMOUNT, new RandomIntegerValue(1, getMaxShift()));
      moduleManager.setParameterValue(StackModule.ShiftRight.Parameter.AMOUNT,
            new RandomIntegerValue(1, getMaxShift()));
   }

   public void setMaxShift(final int maxShift) {
      this.maxShift = maxShift;
      getModuleManager().setParameterValue(StackModule.ShiftLeft.Parameter.AMOUNT,
            new RandomIntegerValue(1, getMaxShift()));
      getModuleManager().setParameterValue(StackModule.ShiftRight.Parameter.AMOUNT,
            new RandomIntegerValue(1, getMaxShift()));
   }
}
