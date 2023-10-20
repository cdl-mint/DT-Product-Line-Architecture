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
package com.example.Planner.momotcore.search.solution.repair;

import com.example.Planner.momotcore.problem.solution.TransformationSolution;
import com.example.Planner.momotcore.problem.solution.variable.TransformationPlaceholderVariable;

public class TransformationPlaceholderRepairer extends AbstractTransformationSolutionRepairer {

   @Override
   public TransformationSolution repair(final TransformationSolution solution) {
      for(int i = 0; i < solution.getNumberOfVariables(); i++) {
         if(!solution.getVariable(i).isExecuted()) {
            solution.setVariable(i, new TransformationPlaceholderVariable());
         }
      }
      return solution;
   }
}
