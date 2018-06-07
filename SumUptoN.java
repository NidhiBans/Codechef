package com.Loops;

public class SumUptoN {
	int number;
	int sum = 0;

	public void Sum() {
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		{

		System.out.println(sum);

		}
	}

	void EnterNo(int number2) {
		number = number2;

	}

}




