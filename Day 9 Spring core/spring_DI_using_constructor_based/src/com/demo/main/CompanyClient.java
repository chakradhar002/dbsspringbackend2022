package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.appconfig.AppConfig;
import com.demo.bean.Company;

/* 
 * 
 * DI using constructor based using @Autowired annotation
 * 
 * */

public class CompanyClient {

	public static void main(String[] args) {

		ApplicationContext c = new AnnotationConfigApplicationContext(AppConfig.class);
		Company company = c.getBean(Company.class);
		company.showEmpInfo();

	}
}
