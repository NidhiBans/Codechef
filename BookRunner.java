package com.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book OOPS = new Book();// ABSTRACTION is carried out that is to
		// hide the complexity if code we need
		// not to worry how implementation take
		// place
		Book DBMS = new Book();
		Book OS = new Book();
		OOPS.setNoOfCopies(30);
		OOPS.IncNoOfCopies(20);
		System.out.println("No of copies of oops is " + OOPS.getNoOfCopies());
		DBMS.setNoOfCopies(50);
		System.out.println("No of copies of DBMS is " + DBMS.getNoOfCopies());

		OS.setNoOfCopies(40);
		System.out.println("No of copies of os is " + OS.getNoOfCopies());


	}

}
