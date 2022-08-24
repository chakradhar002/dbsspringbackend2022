package com.demo.studentDAO;

import java.util.List;

import javax.sql.DataSource;

import com.demo.student.Student;

public interface StudentDAO {
	
	 /** 
     * This is the method to be used to create 
     *  record in the student table
     *
  */
	public void create(String name,Integer age);
	
	 /** 
     * This is the method to be used to list 
     * all the records from the student table
     *
  */
	
      List<Student> listOfStudents();

}
