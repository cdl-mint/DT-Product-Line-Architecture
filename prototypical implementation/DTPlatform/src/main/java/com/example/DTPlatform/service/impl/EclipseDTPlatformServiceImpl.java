package com.example.DTPlatform.service.impl;

import com.example.DTPlatform.model.Twin;
import com.example.DTPlatform.service.DTPlatformService;
import org.springframework.stereotype.Service;

@Service
//@Transactional(readOnly = true)
public class EclipseDTPlatformServiceImpl implements DTPlatformService {

    private String baseUrl;
    private String twinManagerName;
    private String twinName;

    public EclipseDTPlatformServiceImpl(){
        this.baseUrl = "http://localhost:8081/henshin";
        twinName = "simulation";
        twinManagerName = "stack1";
    }

    public EclipseDTPlatformServiceImpl(Twin twin) {
        /*this.twinManagerName = twin.getTwinManager().getName();
        this.twinName = twin.getName();
        this.baseUrl = twin.getLocation();*/
    }



}
