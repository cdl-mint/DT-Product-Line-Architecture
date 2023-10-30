package com.example.Planner.service;

import com.example.DTPlatform.model.TwinSchema;
import com.example.Planner.dto.TwinOperation;
import com.example.Planner.dto.TwinState;

import java.util.List;

public interface PlannerService {

    TwinSchema currentState;

    void compute();

}
