package com.Loops;

public class Mynumber {
	private int number;

	public Mynumber(int number2) {
		this.number = number2;
	}


	public boolean isPrime() {
		if (number < 2) {

			System.out.println("It is not a prime number");
			return false;
		}
		for (int i = 2; i < number - 1; i++) {
			if (number % i == 0) {
				System.out.println("it is not a prime number");
			return false;
			}
		}
		System.out.println("it is a prime no");
		return true;

	}

	public int SumOfDivisors() {
		int sum = 0;
		for (int i = 2; i < number - 1; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}

		}
		return sum;

	}


}
