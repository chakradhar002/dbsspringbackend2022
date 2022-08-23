package com.demo;

public class Student {
	
	private long id;
	private String name;
	private String marks;
	
	
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
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	
	public void show() {
		
		System.out.println(" id " +id);
		System.out.println(" name " +name);
		System.out.println(" marks "+marks);
	}

}
