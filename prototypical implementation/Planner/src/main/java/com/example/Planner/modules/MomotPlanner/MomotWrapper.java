package com.example.Planner.modules.MomotPlanner;


import com.example.Planner.stack.Stack;
import com.example.Planner.stack.StackFactory;
import com.example.Planner.stack.StackModel;
import com.example.Planner.stack.StackPackage;
import com.example.Planner.template.PlannerService;
import com.example.Planner.template.lang.TwinOperation;
import com.example.Planner.template.lang.TwinState;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;


public class MomotWrapper {
    List<UnitApplication> plan;   // TwinOperation = IMethod

    public void setCurrentState(EObject currentState) {
        this.currentState = currentState;
    }

    EObject currentState;

    public List<UnitApplication> getPlan(){
        return this.plan;
    }


    public void compute() {
        // todo: persist this.currentState instead of test model here, based on https://stackoverflow.com/questions/40202206/how-to-generate-emf-models-with-java-code
        File resourceFile = null;
        try {
            resourceFile = File.createTempFile("stack1", ".xmi");
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(URI.createFileURI(resourceFile.getAbsolutePath()));
        final HenshinResourceSet rSet = new HenshinResourceSet();
        Resource res = rSet.createResource("model/stack1.xmi");
        System.out.println(res.getURI());
        StackPackage.eINSTANCE.eClass();
        StackFactory factory = StackFactory.eINSTANCE;
        StackModel root = factory.createStackModel();
        Stack stack1 = factory.createStack();
        stack1.setId("stack1");
        root.getStacks().add(stack1);
        res.getContents().add(root);
        res = rSet.getResource("model/stack1.xmi");
        System.out.println(res.getContents());
        try {
            Process proc = Runtime.getRuntime().exec("java -jar --add-opens java.base/java.util=ALL-UNNAMED model_five_stacks.xmi\"");
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        List<UnitApplication> result = null;// todo: load result once momot is finished
        this.plan = result;
    }




}
