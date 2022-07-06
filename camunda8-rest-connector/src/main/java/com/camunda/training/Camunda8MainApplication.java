package com.camunda.training;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.camunda.zeebe.spring.client.EnableZeebeClient;
import io.camunda.zeebe.spring.client.annotation.ZeebeDeployment;

import org.springframework.boot.SpringApplication;

@SpringBootApplication
@EnableZeebeClient
@ZeebeDeployment(resources = "restconnector.bpmn")
public class Camunda8MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(Camunda8MainApplication.class, args);
		System.out.println("######check######");

	}

}
