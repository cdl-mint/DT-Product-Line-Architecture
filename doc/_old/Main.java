public class Main{
	
	public static void main(String[] args){
		// get parameters of object initialization from deployment model
		Monitor monitor = new Monitor();
		Analyzer analyzer = new Analyzer();
		Planner planner = new Planner();
		// get available objects from twin model
		DigitalTwin actualRobot = new AzureDigitalTwin("my.adtservice.com", "robot1_actual");
		DigitalTwin expectedRobot = new AzureDigitalTwin("my.adtservice.com", "robot1_expected");
		// get property to be checked from monitoring model
		/*
		 * robot1_actual.currentPos == robot1_expected.currentPos
		 */
			// monitoring model gets available properties from twin model
		try{
			MonitoringModel mm = null;//...
			
			monitor.monitorTwins(mm.getLeft(), mm.getRight(), mm.getProperty());
		}catch(Exception ex){
			Deviation dev = analyzer.identifyDeviation(actualRobot, expectedRobot, "myProperty");
			planner.react(dev);
		}
	}
	
}
