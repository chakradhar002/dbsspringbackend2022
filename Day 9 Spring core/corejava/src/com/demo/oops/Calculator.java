package com.demo.oops;



  class Sub {

	int doSub(int number1, int number2) {

		int result = number1 - number2;
		return result;

	}
}
public class Calculator {

	public static void main(String[] args) {
		
	
		
		Sub subobj = new Sub();
		int subresult =subobj.doSub(40, 10);
		System.out.println(subresult);

	}

}
