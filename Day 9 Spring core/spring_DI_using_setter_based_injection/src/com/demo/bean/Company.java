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
	//setter based  DI injection

	@Autowired
	public void setEmpl(Employee empl) {
		this.empl = empl;
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

	//user defined method
	public void showEmpInfo(){
		
		empl.showEmpDetails();
	}
	
}
