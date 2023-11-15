package com.example.Planner;

import java.io.IOException;
import java.util.Collections;
import java.util.List;


import com.example.Planner.dto.*;
import com.example.Planner.dto.Parameter;
import com.example.Planner.template.PlannerService;
import com.example.Planner.stack.StackFactory;
import com.example.Planner.stack.StackModel;
import com.example.Planner.stack.StackPackage;
import io.swagger.annotations.ApiOperation;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/henshin")
public class HenshinController{

	@Autowired
	PlannerService plannerService;
	@PostMapping(value = "/executeOperation")
	@ApiOperation(value = "Creates a new project and returns its ID")
	public ResponseEntity executeRuleOnModel(@RequestBody ExecuteOperationRequest request) {
		System.out.println("/executeRuleOnModel called");
		ClassPathResource res = new ClassPathResource("jsonschema.json");
		//String resourcesPath = res.getPath();
		String resourcesPath = "src/main/resources/";
		String moduleUri = resourcesPath + "/model/stack.henshin";	// todo: this path should be derived from request.twinmanager + request.opname
		String modelUri = resourcesPath + "/model/model_ten_stacks.xmi";	// todo: this path should be derived from request.twinmanager
		final HenshinResourceSet hrs = new HenshinResourceSet();
		hrs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		StackFactory factory = StackFactory.eINSTANCE;
		StackPackage.eINSTANCE.eClass();
		Resource resource = new XMIResourceImpl(URI.createPlatformPluginURI(resourcesPath + "/metamodel/stack.ecore", true));	// todo: this path should be derived from request.twinmanager
		try {
			resource.load(Collections.emptyMap());
		}catch (IOException ex){
			System.out.println(ex.getMessage());
		}
		//resource.load();
		// load model
		final Resource initialModelRes = hrs.getResource(modelUri);
		StackModel root = (StackModel) initialModelRes.getContents().get(0);
		System.out.println(root.getStacks().get(0).getId());

		// load henshin rule
		String rulename = request.getOpName();
		List<Parameter> arguments = request.getParams();
		Module module = hrs.getModule(moduleUri);
		Engine engine = new EngineImpl();
		final Unit unit = module.getUnit(rulename);
		System.out.println(unit.getName());
		final UnitApplication application = new UnitApplicationImpl(engine, MomotUtil.eGraphOf(initialModelRes, true), unit, null); // hier auf false setzen, damit Änderungen automatisch persistiert werden?
		for (Parameter param : arguments) {
			//Parameter paramProprietary = new Parameter(param);
			application.setParameterValue(param.getName(), param.getValue());
		}
		// execute henshin rule on model
		boolean executed = application.execute(null);
		if (!executed) {
			throw new IllegalArgumentException("Rule execution failed!");
		}
		return new ResponseEntity(HttpStatus.OK);
	}


	@GetMapping(value="/plan")
	public CalculatePlanResponse calculatePlanWithMomot(@RequestBody CalculatePlanRequest request){
		CalculatePlanResponse response = new CalculatePlanResponse();
		//List<TwinOperation> plan = plannerService.plan(request.getCurrentState());
		//response.setPlan(plan);
		return response;
	}
	@GetMapping(value="/nextAction")
	public CalculatePlanResponse getNextAction(){
		CalculatePlanResponse response = new CalculatePlanResponse();
		//List<TwinOperation> plan = plannerService.plan(request.getCurrentState());
		//response.setPlan(plan);
		return response;
	}

	public String getAttributeValue(@RequestBody GetAttributeValueRequest request){
		String response = "";
		// todo: open connection to model model_ten_stacks.xmi
		// todo: read parameter value from model, and return it as String
		return response;
	}



}
