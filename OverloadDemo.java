package com.oops;

public class OverloadDemo {
	void test() {// Demo of Function Overloading
		System.out.println("No Parameters");
	}

	void test(int a) {
		System.out.println("valu of a:" + a);
	}

	void test(int a, int b) {
		System.out.println("value of a and b is" + a + "," + b);
	}

	double test(double c) {
		System.out.println("value of c is" + c);
		return (c * c);
	}

}
