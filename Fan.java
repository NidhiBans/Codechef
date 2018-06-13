package com.oops;

public class Fan {
	private String make;
	private String color;
	private double radius;
	private int speed;
	private boolean isOn;



	public Fan(String str, double d, String str2) {
		this.make = str;
		this.color = str2;
		this.radius = d;
		System.out.println(make + "  " + color + " " + radius);
	}

	public void SetSpeed(int i) {
		this.speed = i;
		if (speed > 0) {
			switchOn();
		} else {
			switchOff();
		}
	}




	public void switchOff() {
		System.out.println(isOn);

	}

	public void switchOn() {

		this.isOn = true;
		System.out.println("speed of fan is " + speed + " " + isOn);
	}





}
