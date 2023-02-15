package proprietary.behavior.sm;

import generic.behavior.IBehavior;
import generic.structure.IStructure;

public class SMBehavior implements IBehavior{
	private State state;
	
	public IStructure.Operation compute(IStructure currentStructure){
		if(state == State.IDLE){
			if(Integer.getInteger(currentStructure.getAttributeValue("temp")) < 19.5){
				this.state = State.TEMP_TOO_LOW;
				IStructure.Operation result = currentStructure.getOperation("setTemp");	
				result.setParameterValue("targetTemp", "20");
				return result;
			}else if(Integer.getInteger(currentStructure.getAttributeValue("temp")) > 20.5) {
				this.state = State.TEMP_TOO_HIGH;
				IStructure.Operation result = currentStructure.getOperation("setTemp");	
				result.setParameterValue("targetTemp", "20");
				return result;
			}
		}
		throw new IllegalArgumentException();
	}
	
	public enum State{
		IDLE,
		TEMP_TOO_LOW,
		TEMP_TOO_HIGH;
	}
}
