package com.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/* Di injection using constructor based annotation*/

import com.demo.employee.Employee;

@Component
public class Company {
	
	private long id;
	private String comapanyname;
	private String address;
	

	private Employee empl;
	//dependency injection using constructor based
	@Autowired
	public Company(Employee employee){
		this.empl=employee;
		
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getComapanyname() {
		return comapanyname;
	}
	public void setComapanyname(String comapanyname) {
		this.comapanyname = comapanyname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee getEmpl() {
		return empl;
	}
	public void setEmpl(Employee empl) {
		this.empl = empl;
	}

	//user defined method
	public void showEmpInfo(){
		
		empl.showEmpDetails();
	}
	
}
