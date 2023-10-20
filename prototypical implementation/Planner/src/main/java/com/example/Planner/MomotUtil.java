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
package com.example.Planner;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

public final class MomotUtil {


   public static EGraph copy(final EGraph original) {
      if(original == null) {
         return null;
      }

      try {
         // Copy the resource: (necessary?)
         // List<EObject> roots = original.getRoots();
         // EObject root = roots.get(0);
         // Resource resource = root.eResource();
         // Copier copier = null;
         // if(resource != null) {
         // Resource copiedResource = new ResourceImpl();
         // copier = new Copier();
         // copiedResource.getContents().addAll(copier.copyAll(resource.getContents()));
         // copier.copyReferences();
         // }

         // Copy the graph:
         return original.copy(null);
      } catch(final Exception e) {
         // System.out.println("MomotUtil.copy(): " + e.getClass().getSimpleName() + ": " + e.getMessage());
         // System.out.flush();
         try {
            return original.copy(null);
         } catch(final Exception ex) {

            // System.out.println("MomotUtil.copy(): " + e.getClass().getSimpleName() + ": " + e.getMessage());
            // System.out.flush();
            final Copier copier = new Copier();
            copier.copyAll(original.getRoots());
            copier.copyReferences();

            Boolean nullObjects = false;
            final EGraph copy = new EGraphImpl(original.size());
            for(final EObject object : original) {
               final EObject objectCopy = copier.get(object);
               if(objectCopy == null) {
                  nullObjects = true;
                  break;
               }
               copy.add(objectCopy);
            }

            if(!nullObjects) {
               return copy;
            } else {
               return new EGraphImpl(EcoreUtil.copyAll(original.getRoots()));
            }
         }
      }
   }

   public static EGraph createEGraph(final EObject root) {
      return new EGraphImpl(root);
   }

   public static EGraph createEGraph(final Resource resource) {
      return new EGraphImpl(resource);
   }

   public static HenshinResourceSet createResourceSet() {
      return new HenshinResourceSet();
   }

   public static HenshinResourceSet createResourceSet(final String baseDir) {
      return new HenshinResourceSet(baseDir);
   }

   public static EGraph eGraphOf(final Resource resource, final boolean decoupleFromResource) {
      final EGraph g = MomotUtil.createEGraph(resource);
      if(decoupleFromResource) {
         return MomotUtil.copy(g);
      }
      return g;
   }



   private MomotUtil() {
   }
}
