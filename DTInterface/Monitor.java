class Monitor{
	
	
	public void monitorTwins(DigitalTwin actual, DigitalTwin expected, String attributeName){
		while(true){
			Value actualValue = actual.getAttributeValue(attributeName);
			Value expectedValue = expected.getAttributeValue(attributeName);
			if(!actualValue.equals(expectedValue){
				throw new Exception();
			}
		}
	}
}



