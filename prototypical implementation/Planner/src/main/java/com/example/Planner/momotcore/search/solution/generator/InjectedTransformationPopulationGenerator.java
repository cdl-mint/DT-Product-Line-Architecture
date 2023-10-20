package com.example.Planner.momotcore.search.solution.generator;

import at.ac.tuwien.big.moea.search.solution.generator.InjectedRandomPopulationGenerator;
import at.ac.tuwien.big.moea.search.solution.generator.solution.IRandomSolutionGenerator;
import com.example.Planner.momotcore.problem.solution.TransformationSolution;

import java.util.List;

public class InjectedTransformationPopulationGenerator
      extends InjectedRandomPopulationGenerator<TransformationSolution> {

   public InjectedTransformationPopulationGenerator(final int populationSize,
         final IRandomSolutionGenerator<TransformationSolution> solutionGenerator) {
      super(populationSize, solutionGenerator);
   }

   public InjectedTransformationPopulationGenerator(final int populationSize,
         final IRandomSolutionGenerator<TransformationSolution> solutionGenerator,
         final List<TransformationSolution> injectedSolutions) {
      super(populationSize, solutionGenerator, injectedSolutions);
   }

}
