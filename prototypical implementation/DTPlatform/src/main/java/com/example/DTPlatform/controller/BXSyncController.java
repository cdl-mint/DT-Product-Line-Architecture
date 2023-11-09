package com.example.DTPlatform.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/bxsync")
public class BXSyncController {

    @GetMapping(value = "/{managerName}/twins/{twinName}/attributes/{attributeName}")
    @ApiOperation(value = "Creates a new project and returns its ID")
    String getAttributeValue(@PathVariable("managerName") String managerName, @PathVariable("twinName") String twinName, @PathVariable("attributeName") String attributeName) {
        /*TwinService currentTwin = this.managerService.getTwin(managerName, twinName);
        return currentTwin.getAttributeValue(attributeName);*/
        throw new RuntimeException("Not implemented yet");
    }

    @PutMapping(value = "/{managerName}/twins/{twinName}/operations{opName}/execute")
    void executeOperation(@PathVariable String managerName, @PathVariable String twinName, @PathVariable String opName) {
        //TwinManager manager = new TwinManager(managerName, null);
        /*manager.addTwin("simulation", "http://localhost:8081/henshin");
        TwinType.Twin twin = manager.getTwin(twinName);
        // todo: the above code should be replaced by calls to the TwinManagementController/TwinManagerService

        TwinService twinService = new HTTPTwinServiceImpl(twin); // todo: this could also be something else besides HenshinTwinImpl
        twinService.executeOperation(opName, arguments);*/
    }
}
