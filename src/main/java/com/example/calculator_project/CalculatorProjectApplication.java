package com.example.calculator_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
//@EnableConfigServer
public class CalculatorProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorProjectApplication.class, args);
	}

}
