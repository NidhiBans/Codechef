package com.primitive;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar mychar = new MyChar('c');
		System.out.println(mychar.IsVowel());
		System.out.println(mychar.IsNumber());
		System.out.println(mychar.IsAlphabet());
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();

	}

}
