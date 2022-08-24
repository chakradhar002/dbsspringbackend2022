package com.demo.studentDAOimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.demo.rowmapping.StudentMapper;
import com.demo.student.Student;
import com.demo.studentDAO.StudentDAO;

public class StudentImpl implements StudentDAO {

	
	private JdbcTemplate jdbcTemplate;


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	@Override
	public void create(String name, Integer age) {

		String insertquery = "insert into student (name,age) values(?,?)";
		jdbcTemplate.update(insertquery, name, age);
		System.out.println("Record created " + name + " age " + age);
		return;
	}

	@Override
	public List<Student> listOfStudents() {
		String listquery="select * from student";
		List<Student>  student = jdbcTemplate.query(listquery, new StudentMapper());
		
		return student;
	}

}
