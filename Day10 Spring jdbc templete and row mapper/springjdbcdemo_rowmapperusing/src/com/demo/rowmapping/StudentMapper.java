package com.demo.rowmapping;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.demo.student.Student;

public class StudentMapper implements RowMapper<Student> {
   //setting values from db and send to client
	
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student  = new Student();
		student.setId(rs.getInt("id"));///// values are set here coming from db that ResultSet rs
		student.setName(rs.getString("name"));
	    student.setAge(rs.getInt("age"));
		return student;
	}

}
