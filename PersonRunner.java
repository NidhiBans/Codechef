package com.inheritance;

public class PersonRunner {

	public static void main(String[] args) {

		Employee employee = new Employee("bANSAL", 22);


		employee.setName("Nidhi");
		employee.setPhone(12345);
		employee.setEmail("nbd@gmail.com");
		employee.setTitle("SE");
		employee.setEmployeeGrade('A');
		employee.setEmployer("Fresher");
		System.out.println(employee);

	}

}
