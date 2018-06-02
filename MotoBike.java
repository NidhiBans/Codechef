package com.oops;

public class MotoBike {
	private int speed; // member variable of class created or state of object
	void start() {
		System.out.println("Bike is started");
	}

	MotoBike() {// call other constructor from this constructor using "this" parameter
	this(50);
}
	MotoBike(int speed) {// constructor created
		this.speed = speed;
		System.out.println(speed);
	}
}
