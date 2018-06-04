package com.primitive;

public class BoolLogic {
	public static void main(String args[]) {
		boolean a = true;
		boolean b = false;
		boolean c = a & b;
		boolean d = a | b;
		boolean e = a ^ b;
		boolean f = ((a & b) | (a | b));
		boolean g = ((a & b) & (a | b));
		System.out.println(c + " " + e + " " + d + " " + f + " " + g);

	}
}



