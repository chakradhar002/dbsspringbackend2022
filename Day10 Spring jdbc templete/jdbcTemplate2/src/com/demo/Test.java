package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");
		int status = dao.saveEmployee(new Employee(104, "raj", 7400));

		if (status != 0) {
			System.out.println("inserted ..");
		} else {

			System.out.println(" Not inserted ..");
		}

	}

}
