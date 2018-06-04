package com.primitive;

public class MyChar {
	char ch;


	public MyChar(char ch) {
		this.ch = ch;

	}

	public boolean IsVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return true;
		} else {
			return false;
		}

	}

	public boolean IsNumber() {
		if (ch >= 48 && ch <= 57) {// between '0' and '9'
			return true;
		} else {
			return false;
		}
		}

	public boolean IsAlphabet() {// between 'a' and 'z'
	if(ch>=97 ||ch<=122) {
			return true;
		}
		if (ch >= 65 || ch <= 90) {
			return true;
		} else {
			return false;
	}
}

	public static void printLowerCaseAlphabets() { // methods containing static no need to create objects
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);

		}

	}

	public static void printUpperCaseAlphabets()
	{
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}
	}


