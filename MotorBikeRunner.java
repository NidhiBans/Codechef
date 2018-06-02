package com.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotoBike suzuki = new MotoBike();
		MotoBike ducati = new MotoBike(100);
		MotoBike Honda = new MotoBike(200);// instance of a class created
		ducati.start();
		Honda.start(); // instance has been invoked

	}

}
