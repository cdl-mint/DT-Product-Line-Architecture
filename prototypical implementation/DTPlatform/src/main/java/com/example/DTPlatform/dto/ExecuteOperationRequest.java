package com.example.DTPlatform.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class ExecuteOperationRequest {

    public String getTwinManagerName() {
        return twinManagerName;
    }

    public String getTwinName() {
        return twinName;
    }

    public String getOpName() {
        return opName;
    }

   /* public List<Parameter> getParams() {
        return params;
    }*/

    @ApiModelProperty
    private String twinManagerName;
    @ApiModelProperty
    private String twinName;
    @ApiModelProperty
    private String opName;
    //@ApiModelProperty
   // private List<Parameter> params;

    public ExecuteOperationRequest(String twinManagerName, String twinName, String opName) {
        this.twinManagerName = twinManagerName;
        this.twinName = twinName;
        this.opName = opName;
        //this.params = params;
    }

    public ExecuteOperationRequest(){

    }



}
