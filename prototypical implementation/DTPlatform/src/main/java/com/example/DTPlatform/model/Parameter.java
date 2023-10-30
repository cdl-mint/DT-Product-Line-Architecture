package com.example.DTPlatform.model;

import io.swagger.annotations.ApiModelProperty;

public class Parameter {

	@ApiModelProperty
	String name;
	@ApiModelProperty
	String value;
	
	public Parameter(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public Parameter(){

	}
	
	public String getName() {
		return this.name;
	}
	
	public String getValue() {
		return this.value;
	}
}
