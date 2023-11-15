package com.example.DTPlatform.template.lang;

import java.util.List;

public class TwinState {

    public String getTwinName() {
        return twinName;
    }

    public void setTwinName(String twinName) {
        this.twinName = twinName;
    }

    public List<TwinState> getContainedTwinState() {
        return containedTwinState;
    }

    public TwinParameterValue getParameterValue(String name){
        return null;
    }

    public void setContainedTwinState(List<TwinState> containedTwinState) {
        this.containedTwinState = containedTwinState;
    }

    public List<TwinParameterValue> getParameterValues() {
        return parameterValues;
    }

    public void setParameterValues(List<TwinParameterValue> parameterValues) {
        this.parameterValues = parameterValues;
    }

    public TwinState(String twinName, List<TwinState> containedTwinState, List<TwinParameterValue> parameterValues) {
        this.twinName = twinName;
        this.containedTwinState = containedTwinState;
        this.parameterValues = parameterValues;
    }

    String twinName;
    List<TwinState> containedTwinState;
    List<TwinParameterValue> parameterValues;

    public TwinDescription getDescription() {
        return description;
    }

    public void setDescription(TwinDescription description) {
        this.description = description;
    }

    TwinDescription description;

    public TwinState(){}
}
