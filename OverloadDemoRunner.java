package com.oops;

public class OverloadDemoRunner {

	public static void main(String[] args) {
		OverloadDemo ob = new OverloadDemo();// Default Constructor Created
		ob.test();
		ob.test(6);
		ob.test(10, 20);
		double result;
		result = ob.test(123.25);
		System.out.println("Result of test is" + result);

	}

}
