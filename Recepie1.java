package com.abstractclass;

public class Recepie1 extends Recepie {
	@Override
	public void getReady() {
		System.out.println("Get ready with raw material");

	}

	@Override
	void getStart() {
		System.out.println("Put it in a microwave");

	}

	@Override
	void getServe() {
		System.out.println("Serve it in a plate");

	}
}
