package com.camunda.training.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.spring.client.annotation.ZeebeWorker;

//@Service
@Component
public class ServiceTask {
	
	@ZeebeWorker(type = "connector", autoComplete = true)
	  public Map<String, Object> orchestrateSomething(final ActivatedJob job) {
		  System.out.println("Inside rest connector ");
	      // Do the business logic
	      System.out.println("Yeah, now you can orchestrate something :-) You could use data from the process variables: " + job.getVariables());

	      // Probably add some process variables
	      HashMap<String, Object> variables = new HashMap<>();
	      variables.put("resultValue2", 43);
	      return variables;
	  }
}
