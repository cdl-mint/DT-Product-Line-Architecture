package com.example.Planner;

import com.example.Planner.modules.MomotPlanner.MomotWrapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HenshinEndpointApplication {

	public static void main(String[] args) {


		//SpringApplication.run(HenshinEndpointApplication.class, args);
		MomotWrapper momot = new MomotWrapper();
		momot.compute();
	}

}
