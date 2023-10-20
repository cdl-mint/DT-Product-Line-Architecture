package com.example.DTPlatform.model;

import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

@Repository
public class TwinSchema {

	@Id
	String name;
	
	List<Attribute> attributes;
	List<Operation> operations;
	
	public List<Attribute> getAttributes(){
		return this.attributes;
	}
	
	public List<Operation> getOperations(){
		return this.operations;
	}
	
	public class Attribute{
		String name;
		String type;
		
		public String getName() {
			return this.name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
	}
	
	public class Operation{
		String name;
		List<String> parameters;
		
		public void setName(String name) {
			this.name = name;
		}
	}

}
