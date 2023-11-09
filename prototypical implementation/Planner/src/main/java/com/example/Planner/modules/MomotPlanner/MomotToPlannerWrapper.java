package com.example.Planner.modules.MomotPlanner;

import com.example.Planner.Parameter;
import com.example.Planner.stack.Stack;
import com.example.Planner.stack.StackModel;
import com.example.Planner.template.PlannerService;
import com.example.Planner.template.lang.TwinOperation;
import com.example.Planner.template.lang.TwinOperationExecution;
import com.example.Planner.template.lang.TwinParameterValue;
import com.example.Planner.template.lang.TwinState;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.UnitApplication;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MomotToPlannerWrapper implements PlannerService {


    TwinState currentState;

    List<TwinOperationExecution> plan;

    private TwinOperationExecution getTwinOperation(TwinState sourceState, UnitApplication unitApplication){
        TwinOperationExecution result = new TwinOperationExecution();
        //unitApplication.getResultParameterValue();
        TwinOperation operationType = sourceState.getDescription().getOperationFromName(unitApplication.getUnit().getName());
        result.setOperation(operationType);
        Map<String, String> executionParameters = new HashMap<>();
        for(String param : operationType.getParameters()){
            executionParameters.put(param, unitApplication.getResultParameterValue(param).toString());
        }
        result.setExecutionParameters(executionParameters);
        return result;
    }

    private List<TwinOperationExecution> getAsPlan(TwinState sourceState, List<UnitApplication> operations){
        List<TwinOperationExecution> result = new LinkedList<>();
        for(UnitApplication op :  operations){
            result.add(getTwinOperation(sourceState, op));
        }
        return result;
    }

    private EObject toEGraph(TwinState state){
        EGraph result = null;
        Stack st = null;
        /*Use the Ecore factory*/
        EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;
        /*Create your EPackage*/
        EPackage myPackage = ecoreFactory.createEPackage();
        /*set EPackage properties*/
        myPackage.setName("myTest");
        myPackage.setNsPrefix("myTest");
        myPackage.setNsURI("http://com.myTest");

        /*Create your first EClass*/
        // todo: do this for currentState and all contained objects
        EObject test = ecoreFactory.createEObject();
        EList<EObject> contents = test.eContents();
        // todo: do this for every attribute of every object
        for(TwinParameterValue pv : currentState.getParameterValues()){
            EAttribute myAttribute = ecoreFactory.createEAttribute();
            myAttribute.setName(pv.getName());
            contents.add(myAttribute);
        }
        return test;
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
        EObject currentStateMomot = toEGraph(currentState);
        momot.setCurrentState(currentStateMomot);
        momot.compute();
        this.plan = getAsPlan(currentState, momot.getPlan());
    }
}
