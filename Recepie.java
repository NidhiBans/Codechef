package com.abstractclass;

public abstract class Recepie {
	public void execute() {// we can have non abstract method inside abstract class
		getReady();
		getStart();
		getServe();

	}

	abstract void getReady();// we can't have abstract method inside non abstract class
	// abstract method can't be implemented in abstract class

	abstract void getStart();

	abstract void getServe();

}
