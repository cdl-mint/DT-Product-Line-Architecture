package com.example.Planner.dto;

import io.swagger.annotations.ApiModelProperty;
import com.example.DTPlatform.template.lang.TwinOperation;

import java.util.List;

public class CalculatePlanResponse {

    public List<TwinOperation> getPlan() {
        return plan;
    }

    public void setPlan(List<TwinOperation> plan) {
        this.plan = plan;
    }

    @ApiModelProperty
    private List<TwinOperation> plan;

    public CalculatePlanResponse() {}

}
