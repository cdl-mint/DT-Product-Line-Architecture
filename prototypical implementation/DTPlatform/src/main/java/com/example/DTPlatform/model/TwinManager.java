package com.example.DTPlatform.model;

import com.example.ModelManager.model.TwinSchema;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.LinkedList;
import java.util.List;


@Entity
public class TwinManager {
	public String getName() {
		return name;
	}



	@Id
	String name;

	// @ManyToOne TwinSchema schema -> this is the AAS definition

	@OneToMany(mappedBy="type")
	List<Twin> twins;

	// todo: Check the initialization sequence diagram for changes
    
    // CRUD Operations
	public TwinManager(){
		this.twins = new LinkedList<>();
	}

	public TwinManager(String name, TwinSchema definition){
		this.name = name;
	}



}
