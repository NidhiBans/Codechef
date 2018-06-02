package com.oops;

public class BoxRunner {

	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;
		mybox1.setDim(10, 20, 15);

		vol = mybox1.volume();
		System.out.println("Volume of box1 is" + vol);
		mybox2.setDim(3, 6, 9);

		vol = mybox2.volume();
		System.out.println("volume of box2 is " + vol);

	}

}
