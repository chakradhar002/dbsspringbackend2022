package com.demo.appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.employee.Employee;
import com.demo.employeeimp.EmployeImp;

@Configuration
@ComponentScan(basePackages="com.demo")
public class AppConfig {
	//@@Configuration will tell that exactly what need to do eg
	// This 	@Bean bean(class)return  the instance of EmployeImp()
	//
	@Bean
	Employee getEmployee() {
		return new EmployeImp();
		
		
	}

}
