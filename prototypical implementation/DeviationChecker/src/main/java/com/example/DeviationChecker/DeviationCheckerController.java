package com.example.DeviationChecker;

import com.example.ModelManager.model.Clock;
import com.example.ModelManager.model.OperationExecution;
import com.example.ModelManager.model.TwinSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/deviationchecker")
public class DeviationCheckerController {

    @Autowired
    private TwinManagerService twinManagerService;

    @GetMapping(value = "/check")
    public boolean checkForDeviation(){
        String twinManager = "twin1";
        String twin1 = "actual";
        String twin2 = "experimental1";
        String property = "stack1.load";

        String val1 = twinManagerService.getAttributeValue(twinManager, twin1, property);
        String val2 = twinManagerService.getAttributeValue(twinManager, twin2, property);

        return val1.equals(val2);

        /*twin1.cloneTwin("expected", "futureActual", futureTime);
        List<OperationExecution> newPlan = getPlan();	// Assumption: the new plan is calculated before futureTime is reached


        twin1.copyTwin("actual", "expected", futureTime);	// explanation: sync actual and expected again
        // explanation: now execute the new plan instead of the old one
        try {
            executePlan.wait();
        }catch(InterruptedException ex) {}
        // execute new Plan
        executePlan = new Thread(() -> {
            executePlan(newPlan, twin1);
        });*/
    }
}
