package com.example.DTPlatform.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Twin {

    @Id
    String name;

    public TwinManager getType() {
        return type;
    }

    @ManyToOne
    TwinManager type;

    LocationCommunicationType communicationType;
    String ip;

    public Twin(){}

    public Twin(String name, String location, TwinManager type){
        this.name = name;
        this.ip = location;
        this.type = type;
    }

    public Twin (String name, Twin twin){
        this.ip = twin.ip;
        this.type = twin.type;
    }


}
