package com.demo.inheritence;

/*
 * 
 * We define an abstract class with the abstract modifier preceding the class keyword
An abstract class can be subclassed, but it can't be instantiated
If a class defines one or more abstract methods, then the class itself must be declared abstract
An abstract class can declare both abstract and concrete methods
A subclass derived from an abstract class must either implement all the base class's abstract methods or be abstract itself
 * 
 */

abstract class Employee {
	// non abstract class
	void showMyEmpDetails() {
		System.out.println("emp");	
	}
	// abstract class
	abstract void showEmpDetail();
}
class DBSEmployee extends Employee {
	@Override
	void showEmpDetail() {
		System.out.println("DBSEmployee ");
	}
	
	void showMyEmpDetails(){
		
		System.out.println("showMyEmpDetails() ");
	}
}
class TCSEmployee extends Employee {
	@Override
	void showEmpDetail() {
		System.out.println("tcsEmployee ");
	}

}

public class AbstactDemo {
	public static void main(String[] args) {
		DBSEmployee a = new DBSEmployee();
		a.showEmpDetail();
		a.showMyEmpDetails();
		TCSEmployee t = new TCSEmployee();
		t.showEmpDetail();

	}

}
