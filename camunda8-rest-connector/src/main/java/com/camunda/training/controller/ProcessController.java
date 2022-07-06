package com.camunda.training.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.camunda.training.ProcessConstants;

import io.camunda.zeebe.client.ZeebeClient;

@RestController
@RequestMapping("/process")
public class ProcessController {

	private final static Logger LOG = LoggerFactory.getLogger(ProcessController.class);

	@Autowired
	private ZeebeClient zeebe;

	// http://localhost:8080/process/start/
	@GetMapping("/start")
	public void startProcessInstancebyGet() {

		LOG.info("inside controller");
		zeebe.newCreateInstanceCommand().bpmnProcessId(ProcessConstants.BPMN_PROCESS_ID).latestVersion().send();
	}

}
