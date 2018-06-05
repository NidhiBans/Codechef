package com.conditionals;

import java.util.Scanner; //there is need to import scanner class to get input from user

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Enter Number1 and Number2");
		Scanner scanner = new Scanner(System.in);// read input from system.in
		int Number1 = scanner.nextInt();// the input you want from user is integer type
		int Number2=scanner.nextInt();
		System.out.println("Choose Operation:\n 1.Add \n 2.Subtract \n 3.Multiply \n 4.Divide");
		int ChooseOperation = scanner.nextInt();
		if (ChooseOperation == 1) {
			System.out.println("Answer is " + (Number1 + Number2));

		} else if (ChooseOperation == 2 && Number1 > Number2) {
			System.out.println("Answer is " + (Number1 - Number2));
		} else if (ChooseOperation == 3) {
			System.out.println("Answer is " + (Number1 * Number2));
		} else if (ChooseOperation == 4 && Number2 != 0) {
			System.out.println("Answer is " + (Number1 / Number2));
		}

	}

}

