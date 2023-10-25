package com.example.Planner.service.impl;

import com.example.DTPlatform.model.TwinSchema;
import com.example.Planner.StackOrchestration;
import com.example.Planner.dto.TwinOperation;
import com.example.Planner.dto.TwinState;
import com.example.Planner.moea.search.algorithm.EvolutionaryAlgorithmFactory;
import com.example.Planner.momotcore.problem.solution.TransformationSolution;
import com.example.Planner.momotcore.search.algorithm.operator.mutation.TransformationParameterMutation;
import com.example.Planner.momotcore.search.algorithm.operator.mutation.TransformationPlaceholderMutation;
import com.example.Planner.momotcore.search.algorithm.operator.mutation.TransformationVariableMutation;
import com.example.Planner.momotcore.search.criterion.MinimumObjectiveCondition;
import com.example.Planner.service.PlannerService;
import com.example.Planner.stack.StackPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.moeaframework.core.NondominatedPopulation;
import org.moeaframework.core.Population;
import org.moeaframework.core.TerminationCondition;
import org.moeaframework.core.operator.OnePointCrossover;
import org.moeaframework.core.operator.TournamentSelection;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;


public class MomotImpl implements PlannerService {

    final static double OBJ_THRESHOLD = 13.6795;

    final static int OBJ_INDEX = 0; // standard deviation for stack problem

    final static Map<Integer, Double> objectiveThresholds = Map.of(OBJ_INDEX, OBJ_THRESHOLD);
    private static final int SOLUTION_LENGTH = 200;
    private static final int POPULATION_SIZE = 100;
    private static final int MAX_EVALUATIONS = 0;
    private static final TerminationCondition condition = MinimumObjectiveCondition.create(objectiveThresholds);

    private static final int EXPERIMENT_RUNS = 30;
    final static String EVAL_OBJECTIVE = "Standard Deviation";
    final static String OBJECTIVE_SELECTION_NAME = "SolutionLength";
    final static String INITIAL_MODEL = Paths.get("model", "model_fifty_stacks_std50_2500_27.359.xmi").toString();

    TwinState currentState;

    List<TwinOperation> plan;

    public List<TwinOperation> getPlan(){
        return this.plan;
    }

    public TwinOperation getNextItem(){
        // todo: delete and return most recent element in this.plan
        return null;
    }

    public void compute() {
        StackPackage.eINSTANCE.eClass();
        final HenshinResourceSet hrs = new HenshinResourceSet();
        // 1. 1 solution
        final StackOrchestration search = new StackOrchestration(INITIAL_MODEL, SOLUTION_LENGTH);
        final EvolutionaryAlgorithmFactory<TransformationSolution> moea = search
                .createEvolutionaryAlgorithmFactory(POPULATION_SIZE);
        search.addAlgorithm("NSGA-II_1", moea.createNSGAII(
                new TournamentSelection(2),
                // new RetiringSolutionVariation(orchestration.getSearchHelper(), 50, populationSize, 90),
                new OnePointCrossover(1.0), new TransformationParameterMutation(0.05, search.getModuleManager()),
                new TransformationVariableMutation(search.getSearchHelper(), 0.05),
                new TransformationPlaceholderMutation(0.05)));

        final com.example.Planner.moea.SearchExperiment<TransformationSolution> experiment = new com.example.Planner.moea.SearchExperiment<>(search, MAX_EVALUATIONS,
                condition);
        // experiment.setReferenceSetFile(REFERENCE_SET);
        experiment.setNumberOfRuns(100);
        //experiment.addProgressListener(new at.ac.tuwien.big.moea.experiment.executor.listener.SeedRuntimePrintListener());
        //
        experiment.run();

        System.out.println("-------------------------------------------------------");
        System.out.println("Analysis");
        System.out.println("-------------------------------------------------------");

        //performAnalysis(experiment);
        System.out.println("-------------------------------------------------------");
        System.out.println("Results");
        System.out.println("-------------------------------------------------------");
        //handleResults(experiment);
    }

    /*protected static at.ac.tuwien.big.momot.TransformationResultManager handleResults(
            final at.ac.tuwien.big.moea.SearchExperiment<at.ac.tuwien.big.momot.problem.solution.TransformationSolution> experiment) {

        final at.ac.tuwien.big.momot.TransformationResultManager resultManager = new at.ac.tuwien.big.momot.TransformationResultManager(experiment);

        System.out.println("REFERENCE SET:");
        System.out.println(at.ac.tuwien.big.moea.SearchResultManager.printObjectives(at.ac.tuwien.big.moea.SearchResultManager.getReferenceSet(experiment, null)));
        System.out.println(at.ac.tuwien.big.moea.SearchResultManager.printObjectives(resultManager.createApproximationSet()));

        Population population;
        population = at.ac.tuwien.big.moea.SearchResultManager.createApproximationSet(experiment, (String[]) null);
        System.out.println("- Save objectives of all algorithms to 'output/objectives/objective_values.txt'");
        at.ac.tuwien.big.moea.SearchResultManager.saveObjectives("output/objectives/objective_values.txt", population);

        population = at.ac.tuwien.big.moea.SearchResultManager.createApproximationSet(experiment, (String[]) null);
        System.out.println("- Save models of all algorithms to 'output/models/'");

        System.out.println("- Save objectives of algorithms seperately to 'output/objectives/<algorithm>.txt'");
        System.out.println("- Save models of algorithms seperately to 'output/solutions/<algorithm>.txt'´\n");

        for(final Map.Entry<at.ac.tuwien.big.moea.experiment.executor.SearchExecutor, List<NondominatedPopulation>> entry : resultManager.getResults().entrySet()) {

            System.out.println(entry.getKey().getName());

            population = com.example.Planner.moea.SearchResultManager.createApproximationSet(experiment, entry.getKey().getName());
            System.out.println(com.example.Planner.moea.SearchResultManager.printObjectives(population) + "\n");

            population = com.example.Planner.moea.SearchResultManager.createApproximationSet(experiment, entry.getKey().getName());
            at.ac.tuwien.big.moea.SearchResultManager.saveObjectives("output/objectives/" + entry.getKey().getName() + ".txt", population);
        }

        return resultManager;
    }

    protected static at.ac.tuwien.big.moea.experiment.analyzer.SearchAnalyzer performAnalysis(final com.example.Planner.moea.SearchExperiment<com.example.Planner.momotcore.problem.solution.TransformationSolution> experiment) {
        final com.example.Planner.moea.SearchAnalysis analysis = new com.example.Planner.moea.SearchAnalysis(experiment);
        //analysis.setHypervolume(true);
        analysis.setShowAggregate(true);
        analysis.setShowIndividualValues(true);
        analysis.setShowStatisticalSignificance(true);
        analysis.setSignificanceLevel(0.05);
        final at.ac.tuwien.big.moea.experiment.analyzer.SearchAnalyzer searchAnalyzer = analysis.analyze();
        System.out.println("---------------------------");
        System.out.println("Analysis Results");
        System.out.println("---------------------------");
        searchAnalyzer.printAnalysis();
        System.out.println("---------------------------");
        try {
            System.out.println("- Save Analysis to 'output/analysis/analysis.txt'");
            searchAnalyzer.saveAnalysis(new File("output/analysis/analysis.txt"));
        } catch(final IOException e) {
            e.printStackTrace();
        }
        return searchAnalyzer;
    }*/
}
