package com.demo.employeeimp;

import com.demo.bean.Empolyee;
import com.demo.employee.Employee;

public class EmployeImp implements Employee {

	@Override
	public void showEmpDetails() {
		Empolyee e = new Empolyee();//create  the object of bean class
		e.setEmpname("Ram kumar");
		e.setId(101);
		
		System.out.println(" details of empployee "+e.getId());
		System.out.println(" details of empployee "+e.getEmpname());
		
	}

}
