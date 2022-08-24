package com.demo.inheritence;

class Car {

	void show() {

		System.out.println("car");
	}

}

class Tata extends Car {

	void show() {

		System.out.println(" Tata car");
	}

}

public class Inheritencedemo {

	public static void main(String[] args) {

		Car c = new Tata();//dynamic dispatch or runtime polymorphisum
		Car c1 = new Car();//

		c.show();
		c1.show();

	}

}
