package com.example.Planner.moea.search.algorithm.reinforcement.datastructures;

public interface IQTableAccessor<S, A> {
   public boolean addStateIfNotExists(final S s);

}
