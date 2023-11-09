package com.example.Planner.modules.StateMachinePlanner;

import com.example.Planner.modules.StateMachinePlanner.lang.State;
import com.example.Planner.modules.StateMachinePlanner.lang.StateMachine;
import com.example.Planner.modules.StateMachinePlanner.lang.Transition;
import com.example.Planner.template.lang.TwinState;

import java.lang.reflect.Field;

public class StateMachineEngine {

    StateMachine plan;

    TwinState currentState;

    Transition nextState;


    class Thermostat{
        public String name;

    }
    public void compute(){
        try {
            Thermostat t = null;
            Field[] fields = t.getClass().getFields();
            for (Field f : fields) {
                Object value = currentState.getParameterValue(f.getName());
                f.set(t, value);
            }
        }catch (IllegalAccessException ex){}
    }
}
