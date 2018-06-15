package com.inheritance;

public class Person {
	private String name;
	private String email;
	private int phone;
	private int age;

	Person() {
		System.out.println("Hello Person");
	}

	Person(int age1) {
		this.age = age1;
		System.out.println(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}
