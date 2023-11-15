package modules.AzureDTPlatform;


import com.example.DTPlatform.template.DTPlatformService;
import modules.AzureDTPlatform.lang.Twin;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
//@Transactional(readOnly = true)
public class AzureWrapper {

    private String baseUrl;
    private String accessToken;
    private String twinName;

    private Twin currentState;

    public AzureWrapper(){
    }

    public void compute()
    {
        String urlEnding = "/" + twinName + "/getById/";    // documentation: https://learn.microsoft.com/en-us/rest/api/digital-twins/dataplane/twins/digital-twins-get-by-id?tabs=HTTP
        RestTemplate restTemplate = new RestTemplate();
        // todo: set bearer token: httpClient.DefaultRequestHeaders.Authorization = new AuthenticationHeaderValue("Bearer", _accessToken);
        ResponseEntity<Twin> responseEntity = restTemplate.getForEntity(baseUrl + urlEnding, Twin.class);
        if(responseEntity.getStatusCode() == HttpStatus.OK){
             this.currentState = responseEntity.getBody();
        }
    }



}
