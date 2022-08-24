package com.demo.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.demo.Employee;
import com.demo.Student;

/* using application factory
 * 
 * ApplicationContext interface is built on top of the BeanFactory interface. 
 * It adds some extra functionality than BeanFactory 
 * such as simple integration with Spring's AOP,
 *  message resource handling (for I18N), event 
 *  propagation, application layer specific 
 *  context (e.g. WebApplicationContext) for web application. So it is better to use ApplicationContext than BeanFactory.
 * 
 * */

public class StudentClient {

	public static void main(String[] args) {

		Resource r = new ClassPathResource("applicationcontext.xml");
		// define ioc
		BeanFactory f = new XmlBeanFactory(r);

		Student s = (Student) f.getBean("mystudentbean");
		Employee e = (Employee) f.getBean("myemployeebean");

		s.show();
		e.showEmpDetails();

	}

}
