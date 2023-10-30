package com.example.Planner.momotcore.problem.unit.parameter.comparator;

import org.eclipse.emf.ecore.EObject;

public class DefaultEObjectEqualityHelper implements IEObjectEqualityHelper {

   @Override
   public boolean equals(final EObject left, final EObject right) {
      if(left == null && right == null) {
         return true;
      }

      if(left == null && right != null || left != null && right == null) {
         return false;
      }

      return left.equals(right);
   }

}
