package behavior;

import generic.behavior.IBehavior;
import generic.structure.IStructure;

public class AutomatonBehavior implements IBehavior {

    private State state;

    public AutomatonBehavior(){
        this.state = State.IDLE;
    }

    @Override
    public IStructure.Operation compute(IStructure currentStructure) {
        if(state == State.IDLE){
            if(Integer.parseInt(currentStructure.getAttributeValue("temperature")) < 19.5){
                this.state = State.TEMP_TOO_LOW;
                IStructure.Operation result = currentStructure.getOperation("setTemp");
                result.setParameterValue("targetTemp", "20");
                return result;
            }else if(Integer.parseInt(currentStructure.getAttributeValue("temperature")) > 20.5) {
                this.state = State.TEMP_TOO_HIGH;
                IStructure.Operation result = currentStructure.getOperation("setTemp");
                result.setParameterValue("targetTemp", "20");
                return result;
            }else{
                return null;
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
