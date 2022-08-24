package com.demo.studentclient;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.demo.student.Student;
import com.demo.studentDAO.StudentDAO;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("applicationcontext.xml");
		StudentDAO s = (StudentDAO) a.getBean("studentDao");
		// inserting record from client
		s.create("ram", 32);
		s.create("tom", 17);
		s.create("raj", 42);

		// view the record fetching from db

		List<Student> resutofstudentlist = s.listOfStudents();

		for (Student s1 : resutofstudentlist) {

			System.out.println(s1.getName());
			System.out.println(s1.getAge());
			System.out.println(s1.getId());

		}

	}

}
