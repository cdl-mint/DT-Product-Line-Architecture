package proprietary.monitor;

import proprietary.planner.Planner;

public class Monitor{
	Planner planner;
	
	public void monitorAzure(){
		while(true){
			planner.planWithAzure(aws.getEntity("Thermostat1"));
			Thread.sleep(5);
		}
	}
	// Task 1.2: wie switchen wir hier von DTDL zu AWS (selbes bei Executor)??
	public void awsMonitor(){
		while(true){
			planner.planWithAWS(aws.getEntity("Thermostat1"));
			Thread.sleep(5);
		}
	}
	
}