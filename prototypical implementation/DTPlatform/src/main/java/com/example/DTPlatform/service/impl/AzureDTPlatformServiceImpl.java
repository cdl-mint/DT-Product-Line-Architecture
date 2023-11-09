/*package com.example.DTPlatform.service.impl;

import com.example.DTPlatform.model.Twin;
import com.example.DTPlatform.service.DTPlatformService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
//@Transactional(readOnly = true)
public class AzureDTPlatformServiceImpl implements DTPlatformService {

    private String baseUrl;
    private String accessToken;
    private String twinName;

    public AzureDTPlatformServiceImpl(){
        this.baseUrl = "http://localhost:8081/henshin";
        twinName = "simulation";
    }

    public void getAttributeValue()
    {

        String urlEnding = "/" + twinManagerName + "/twins/" + twinName + "attributes" + attName;
        RestTemplate restTemplate = new RestTemplate();
        // todo: set bearer token: httpClient.DefaultRequestHeaders.Authorization = new AuthenticationHeaderValue("Bearer", _accessToken);
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(TWINMANAGER_BASE_URL + urlEnding, String.class);
        if(responseEntity.getStatusCode() == HttpStatus.OK){
            return responseEntity.getBody();
        }
        return null;

        if (response.IsSuccessStatusCode)
        {
            string responseBody = await response.Content.ReadAsStringAsync();
            Console.WriteLine(responseBody); //print JSON before deserializing it
            var twinData = JsonConvert.DeserializeObject<TwinResponse>(responseBody)!;
            Console.WriteLine($"Twin ID: {twinData.DtId}");
        }
        else
        {
            Console.WriteLine($"Error: {response.StatusCode}");
        }
    }



}
*/