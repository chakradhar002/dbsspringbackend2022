package com.demo.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.demo.Employee;
import com.demo.Student;
import com.demo.config.StudentConfig;

/* 
 * 
 * Applciationfocntext using annotation
 * 
 * */

public class StudentClient {

	public static void main(String[] args) {

	ApplicationContext c= new AnnotationConfigApplicationContext(StudentConfig.class);
      Student s = c.getBean(Student.class);
      Employee e = c.getBean(Employee.class);
      
      s.setName("kavya");
      s.setMarks("45");;
      s.show();
      e.setName("Ram emp");
      e.showEmpDetails();
	}

}
