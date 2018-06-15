package com.inheritance;

public class Employee extends Person {
	String title;
	String employer;
	char employeeGrade;
	double salary;
	String surname;

	Employee() {
		// super(); implicit constructor calling of super class
	 System.out.println("hello employee");
	 }

	Employee(String SurName, int age) {
		super(age);// explicit constructor calling for argumented constructor;
		this.surname = SurName;
		System.out.println(surname);
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

@Override
public String toString() {
		return title + " " + employer + " " + employeeGrade + " " + super.getEmail() + " " + super.getName() + " "
				+ super.getPhone();// using superkeyword invoke methods from super class

}

}
