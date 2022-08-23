package com.demo.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.demo.Employee;
import com.demo.Student;

/* using ApplicationContext
 * 
 * */

public class StudentClient {

	public static void main(String[] args) {
		// define ioc
		ApplicationContext a = new FileSystemXmlApplicationContext("bean.xml");
		Student student = (Student) a.getBean("mystudentbean");
		Employee employee = (Employee) a.getBean("myemployeebean");

		student.show();
		employee.showEmpDetails();

	}

}
