package com.example.DTPlatform.template.lang;

import java.util.List;

public class TwinDescription {

    public List<TwinOperation> getOperations() {
        return operations;
    }

    public TwinOperation getOperationFromName(String name){
        for(TwinOperation op: this.operations){
            if(op.name.equals(name)){
                return op;
            }
        }
        return null;
    }

    public void setOperations(List<TwinOperation> operations) {
        this.operations = operations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    List<TwinOperation> operations;

    String name;
}
