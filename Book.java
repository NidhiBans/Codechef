package com.oops;

public class Book {
	private int noOfCopies; // member variable ENCAPSULATION carried out using access specifier

	public int getNoOfCopies() {// using setters and getters
		return noOfCopies;
	}

	public void IncNoOfCopies(int howmuch) {
		if (howmuch > 0) { // ENCPSULATION LEVEL2
			this.noOfCopies = this.noOfCopies + howmuch;
		}
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies; // this is used for local variable
	}


	}
