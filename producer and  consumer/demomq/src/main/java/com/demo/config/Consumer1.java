package com.demo.config;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer1 {
	@JmsListener(destination = "MESSAGE_QUEUE_Mounika")
	void consume(String messge) {
		
		System.out.println("message received "+messge);
	}

}

