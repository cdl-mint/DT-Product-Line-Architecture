package com.example.DTPlatform.template.lang;

import java.util.List;

public class TwinOperation {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    List<String> parameters;
}
