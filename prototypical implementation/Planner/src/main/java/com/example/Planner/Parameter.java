package com.example.Planner;

public class Parameter {

	String name;
	String value;
	
	public Parameter(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public Parameter(Parameter param){
		this.name = param.getName();
		this.value = param.getValue();
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getValue() {
		return this.value;
	}
}
