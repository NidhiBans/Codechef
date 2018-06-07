package com.Loops;

public class TrainglePrint {
	private int number;

	public TrainglePrint(int i) {
		this.number = i;
		for (i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println(j + " ");
			}

			System.out.println();
		}



	}
}
