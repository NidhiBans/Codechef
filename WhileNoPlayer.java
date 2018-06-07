package com.Loops;

public class WhileNoPlayer {
	private int number;

	public WhileNoPlayer(int number2) {
		this.number = number2;
	}

	public void SquareOfNo() {
		int i = 1;
		while (i * i < number) {

			System.out.println("square is" + i * i);
			i++;

		}

	}

	public void CubesOfNo() {
		int i = 1;
		while (i * i * i < number) {

			System.out.println("cube is" + i * i * i);
			i++;

		}

	}

}
