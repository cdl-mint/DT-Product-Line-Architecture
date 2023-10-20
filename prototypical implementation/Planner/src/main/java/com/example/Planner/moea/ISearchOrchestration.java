/*******************************************************************************
 * Copyright (c) 2015 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package com.example.Planner.moea;

import com.example.Planner.moea.print.IPopulationWriter;
import com.example.Planner.moea.print.ISolutionWriter;
import com.example.Planner.moea.problem.ISearchProblem;
import com.example.Planner.moea.search.algorithm.EvolutionaryAlgorithmFactory;
import com.example.Planner.moea.search.algorithm.LocalSearchAlgorithmFactory;
import com.example.Planner.moea.search.algorithm.RLAlgorithmFactory;
import com.example.Planner.moea.search.algorithm.provider.IRegisteredAlgorithm;
import com.example.Planner.moea.search.algorithm.reinforcement.datastructures.ApplicationState;
import com.example.Planner.moea.search.algorithm.reinforcement.datastructures.ISOQTableAccessor;
import com.example.Planner.moea.search.algorithm.reinforcement.environment.IEnvironment;
import com.example.Planner.moea.search.fitness.IMultiDimensionalFitnessFunction;
import com.example.Planner.moea.search.solution.generator.IInjectedPopulationGenerator;
import com.example.Planner.moea.search.solution.generator.solution.ISolutionGenerator;

import java.util.List;
import java.util.Map;

import org.moeaframework.core.Algorithm;
import org.moeaframework.core.EpsilonBoxDominanceArchive;
import org.moeaframework.core.NondominatedPopulation;
import org.moeaframework.core.NondominatedSortingPopulation;
import org.moeaframework.core.Population;
import org.moeaframework.core.Solution;

public interface ISearchOrchestration<S extends Solution> {
   void addAlgorithm(IRegisteredAlgorithm<? extends Algorithm> algorithm);

   void addAlgorithm(String name, IRegisteredAlgorithm<? extends Algorithm> algorithm);

   EpsilonBoxDominanceArchive createEpsilonBoxArchive(double... epsilon);

   EvolutionaryAlgorithmFactory<S> createEvolutionaryAlgorithmFactory(int populationSize);

   LocalSearchAlgorithmFactory<S> createLocalSearchAlgorithmFactory();

   S createNewRandomSolution();

   S createNewRandomSolution(int solutionLength);

   S createNewSolution();

   S createNewSolution(int solutionLength);

   NondominatedPopulation createPopulation(double... epsilon);

   IInjectedPopulationGenerator<S> createPopulationGenerator(int populationSize);

   IPopulationWriter<S> createPopulationWriter();

   ISearchProblem<S> createProblem();

   RLAlgorithmFactory<S> createRLAlgorithmFactory(final Map<IEnvironment.Type, IEnvironment<S>> environmentMap,
         ISOQTableAccessor<List<ApplicationState>, List<ApplicationState>> qTableInitialized);

   ISolutionWriter<S> createSolutionWriter();

   NondominatedSortingPopulation createSortingPopulation();

   String getAlgorithmName(IRegisteredAlgorithm<? extends Algorithm> algorithm);

   List<IRegisteredAlgorithm<? extends Algorithm>> getAlgorithms();

   IMultiDimensionalFitnessFunction<S> getFitnessFunction();

   int getNumberOfConstraints();

   int getNumberOfObjectives();

   ISearchProblem<S> getProblem();

   ISolutionGenerator<S> getSolutionGenerator();

   int getSolutionLength();

   String print(Iterable<S> population);

   String print(Population population);

   String print(S solution);

   void setAlgorithms(List<IRegisteredAlgorithm<? extends Algorithm>> algorithms);

}
