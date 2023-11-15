package com.example.DTPlatform.template.lang;

import java.util.Map;

public class TwinOperationExecution {

    TwinOperation operation;
    TwinDescription twin;

    public TwinOperation getOperation() {
        return operation;
    }

    public void setOperation(TwinOperation operation) {
        this.operation = operation;
    }

    public TwinDescription getTwin() {
        return twin;
    }

    public void setTwin(TwinDescription twin) {
        this.twin = twin;
    }

    public Map<String, String> getExecutionParameters() {
        return executionParameters;
    }

    public void setExecutionParameters(Map<String, String> executionParameters) {
        this.executionParameters = executionParameters;
    }

    Map<String, String> executionParameters;
}
