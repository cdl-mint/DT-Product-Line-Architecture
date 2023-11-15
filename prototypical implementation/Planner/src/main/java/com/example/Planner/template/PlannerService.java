package com.example.Planner.template;

import com.example.DTPlatform.template.lang.TwinOperationExecution;
import com.example.DTPlatform.template.lang.TwinState;

public interface PlannerService {

    void setCurrentState(TwinState state);

    TwinOperationExecution getNextSteo();

    void compute();

}
