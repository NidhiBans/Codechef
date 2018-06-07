package com.Loops;

import java.util.Scanner;

public class DoWhileRunner {

	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println("Cube is:" + i * i * i);
			System.out.print("Enter The Number:");
			Scanner scanner = new Scanner(System.in);
			i = scanner.nextInt();

	}
		while (i >= 0);
		System.out.println("Thank You Have Fun!");

	}
}
