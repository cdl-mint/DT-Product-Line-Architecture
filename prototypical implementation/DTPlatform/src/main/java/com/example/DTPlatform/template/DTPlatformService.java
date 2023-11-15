package com.example.DTPlatform.template;


import com.example.DTPlatform.template.lang.TwinOperationExecution;
import com.example.DTPlatform.template.lang.TwinState;

public interface DTPlatformService {

	TwinState getCurrentState();

	void setOperationToExecut(TwinOperationExecution op);

	void compute();

	
}
