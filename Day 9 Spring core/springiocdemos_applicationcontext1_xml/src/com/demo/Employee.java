package com.demo;

public class Employee {
	
	private long id;
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void showEmpDetails() {
		
		System.out.println("  emp id " +id);
		System.out.println(" emp name " +name);

	}

}
