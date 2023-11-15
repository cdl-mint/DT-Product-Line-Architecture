package modules.AWSDTPlatform;

import modules.AWSDTPlatform.lang.Component;
import modules.AzureDTPlatform.lang.Twin;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
//@Transactional(readOnly = true)
public class AWSWrapper {

    private String baseUrl;
    private String accessToken;
    private String twinName;

    private Component currentState;


    public void compute()
    {
        String urlEnding = "/" + twinName + "/getById/";    // todo: switch with correct AWS Endpoint
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Component> responseEntity = restTemplate.getForEntity(baseUrl + urlEnding, Component.class);
        if(responseEntity.getStatusCode() == HttpStatus.OK){
            this.currentState = responseEntity.getBody();
        }
    }



}