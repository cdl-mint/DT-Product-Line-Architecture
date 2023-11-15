package com.example.DTPlatform.template.lang;

public class TwinParameterValue {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    String name;

    public TwinParameterValue(String name, String type, String value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    String type;
    String value;

    public TwinParameterValue(){}
}
