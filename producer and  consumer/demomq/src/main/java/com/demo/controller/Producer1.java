package com.demo.controller;

import javax.jms.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/print")
public class Producer1 {

	@Autowired
	JmsTemplate t;

	@Autowired
	Queue qu;

	@GetMapping(value = "/message/{msg}")
	String show(@PathVariable("msg") final String message) {

		t.convertAndSend(qu, message);

		return "sent sucessfully";

	}

}
