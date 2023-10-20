package com.example.Planner.momotcore.domain;

import com.example.Planner.momotcore.problem.solution.variable.ITransformationVariable;
import com.example.Planner.momotcore.reactive.Executor;

import java.util.List;

import org.eclipse.emf.henshin.interpreter.EGraph;

public interface Heuristic {

   List<ITransformationVariable> getInitialPopulationTs(EGraph g, Executor executor, final int populationSize);
}
