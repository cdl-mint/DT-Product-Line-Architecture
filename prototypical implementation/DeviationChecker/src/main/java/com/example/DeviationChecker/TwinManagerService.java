package com.example.DeviationChecker;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class TwinManagerService {
    private static final String TWINMANAGER_BASE_URL = "";
    void deleteTwin(String managerName, String twinName){
        String urlEnding = "";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(TWINMANAGER_BASE_URL + urlEnding);
    }

    String getAttributeValue(String twinManagerName, String twinName, String attName) {
        String urlEnding = "/" + twinManagerName + "/twins/" + twinName + "attributes" + attName;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(TWINMANAGER_BASE_URL + urlEnding, String.class);
        if(responseEntity.getStatusCode() == HttpStatus.OK){
            return responseEntity.getBody();
        }
        return null;
    }

}
