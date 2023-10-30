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
package com.example.Planner.momotcore.search.fitness.dimension;

import at.ac.tuwien.big.moea.problem.solution.variable.PlaceholderVariable;
import at.ac.tuwien.big.moea.search.fitness.dimension.MinimumSolutionLengthDimension;
import com.example.Planner.momotcore.problem.solution.TransformationSolution;
import com.example.Planner.momotcore.problem.solution.variable.TransformationPlaceholderVariable;

public class MinimumTransformationLengthDimension extends MinimumSolutionLengthDimension<TransformationSolution> {

   public MinimumTransformationLengthDimension(final int minimum) {
      this("MinimumSolutionLength", minimum);
   }

   public MinimumTransformationLengthDimension(final String name, final int minimum) {
      super(TransformationSolution.class, name, minimum);
      ignoreVariable(PlaceholderVariable.class);
      ignoreVariable(TransformationPlaceholderVariable.class);
   }

}
