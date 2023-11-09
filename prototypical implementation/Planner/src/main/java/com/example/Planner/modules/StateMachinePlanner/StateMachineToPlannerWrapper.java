package com.example.Planner.modules.StateMachinePlanner;

import com.example.Planner.modules.MomotPlanner.MomotWrapper;
import com.example.Planner.template.PlannerService;
import com.example.Planner.template.lang.TwinOperation;
import com.example.Planner.template.lang.TwinOperationExecution;
import com.example.Planner.template.lang.TwinState;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.UnitApplication;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StateMachineToPlannerWrapper implements PlannerService {


    TwinState currentState;

    List<TwinOperationExecution> plan;

    private TwinOperationExecution getTwinOperation(TwinState sourceState, UnitApplication unitApplication){
        TwinOperationExecution result = new TwinOperationExecution();
        // todo: implement mapping Transition -> OperationExecution
        return result;
    }

    private List<TwinOperationExecution> getAsPlan(TwinState sourceState, List<UnitApplication> operations){
        List<TwinOperationExecution> result = new LinkedList<>();
        for(UnitApplication op :  operations){
            result.add(getTwinOperation(sourceState, op));
        }
        return result;
    }

    private EGraph toEGraph(TwinState state){
        EGraph result = null;
        // todo: implement mapping TwinState -> State
        return result;
    }

    @Override
    public void setCurrentState(TwinState state) {
        this.currentState = state;
    }

    @Override
    public TwinOperationExecution getNextSteo() {
        TwinOperationExecution result =  this.plan.get(0);
        this.plan.remove(0);
        return result;
    }

    @Override
    public void compute() {
        MomotWrapper momot = new MomotWrapper();
        EGraph currentStateMomot = toEGraph(currentState);
        //momot.setCurrentState(currentStateMomot);
        momot.compute();
        this.plan = getAsPlan(currentState, momot.getPlan());
    }
}
