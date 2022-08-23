package com.demo.config;

import org.springframework.context.annotation.Bean;

import com.demo.Employee;
import com.demo.Student;

public class StudentConfig {

	@Bean
	Student studentdetails() {
		return new Student();

	}
	
	@Bean
	Employee empdetails() {
		return new Employee();

	}

}
