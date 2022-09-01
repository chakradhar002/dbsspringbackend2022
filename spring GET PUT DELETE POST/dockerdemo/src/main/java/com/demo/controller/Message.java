package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message {

	@GetMapping(value = "/messgae")
	String showMessage() {
		return " hi this is my docker eg";

	}

}
