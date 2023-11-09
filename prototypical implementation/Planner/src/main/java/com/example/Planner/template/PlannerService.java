package com.example.Planner.template;

import com.example.Planner.template.lang.TwinOperationExecution;
import com.example.Planner.template.lang.TwinState;

public interface PlannerService {

    void setCurrentState(TwinState state);

    TwinOperationExecution getNextSteo();

    void compute();

}
