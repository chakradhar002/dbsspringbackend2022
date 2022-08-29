package com.demo.exception;

public class ResourceNotFoundException extends RuntimeException {
	
	private String resourcename;
	private String fieldname;
	private Object fieldvalue;
	
	public ResourceNotFoundException(String resourcename, String fieldname, String fieldvalue) {
		super(String.format("%s not found with %s : '%s'", resourcename, fieldname, fieldvalue));
		this.resourcename = resourcename;
		this.fieldname = fieldname;
		this.fieldvalue = fieldvalue;
	}

	public String getResourcename() {
		return resourcename;
	}



	public String getFieldname() {
		return fieldname;
	}

	

	public Object getFieldvalue() {
		return fieldvalue;
	}

}
