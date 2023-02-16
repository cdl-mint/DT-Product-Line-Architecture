package generic.structure.azure;

import generic.behavior.Planner;
import generic.structure.IStructure;
import generic.structure.Monitor;

public class AzureMonitor extends Monitor {
    private AzureTemperatureSensor device1;

    public AzureMonitor(Planner p){

        super.planner = p;
        this.device1 = new AzureTemperatureSensor();
    }

    public IStructure getCurrent(){
        IStructure current = new AzureIStructure();
        current.setAttributeValue("temperature", device1.getTemperature());
        return current;
    }
}
