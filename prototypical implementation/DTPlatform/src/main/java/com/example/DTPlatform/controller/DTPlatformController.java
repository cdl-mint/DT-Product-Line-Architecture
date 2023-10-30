package com.example.DTPlatform.controller;

import java.util.List;

import com.example.DTPlatform.model.Twin;
import com.example.DTPlatform.model.TwinManager;
import com.example.DTPlatform.service.DTPlatformService;
import com.example.ModelManager.model.Clock;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/twinmanagers")
public class DTPlatformController {

   @Autowired
   TwinManagerService managerService;

    // CRUD
    @PostMapping(value = "/")
    @ApiOperation(value = "Creates a new project and returns its ID")
    public void createTwinManager(@RequestBody String managerName) {
       managerService.createTwinManager(managerName, null);
    }

}
