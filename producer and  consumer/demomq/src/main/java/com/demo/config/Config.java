package com.demo.config;

import javax.jms.Queue;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class Config {
  
	// this annotation using parameter is user to read propery from applcaition.properties
	@Value("${activemq.broker-url}")
	private String brokerurl;

	@Bean
	public Queue queue() {

		return (Queue) new ActiveMQQueue("MESSAGE_QUEUE_Mounika");

	}
                // this part is used to cnnect to mq
	@Bean
	public ActiveMQConnectionFactory activeMQConnectionFactory() {
		ActiveMQConnectionFactory fac = new ActiveMQConnectionFactory();

		fac.setBrokerURL(brokerurl);
		return fac;

	}

	@Bean
	public JmsTemplate jmsTemplate() {
		return new JmsTemplate(activeMQConnectionFactory());

	}

}
