package com.example.Planner.dto;

import io.swagger.annotations.ApiModelProperty;

public class CalculatePlanRequest {


    public CalculatePlanRequest(TwinState currentState) {
        this.currentState = currentState;
    }

    public TwinState getCurrentState() {
        return currentState;
    }

    @ApiModelProperty
    private TwinState currentState;




    public CalculatePlanRequest(){}



}
