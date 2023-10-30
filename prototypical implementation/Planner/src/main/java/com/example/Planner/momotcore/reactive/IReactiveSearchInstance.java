package com.example.Planner.momotcore.reactive;

import at.ac.tuwien.big.moea.experiment.executor.listener.AbstractProgressListener;
import com.example.Planner.momotcore.reactive.planningstrategy.SearchConfiguration;
import com.example.Planner.momotcore.reactive.result.SearchResult;

import java.util.List;

public interface IReactiveSearchInstance {

   public SearchResult performSearch(SearchConfiguration conf);

   SearchResult performSearch(SearchConfiguration conf, List<AbstractProgressListener> listeners);
}
