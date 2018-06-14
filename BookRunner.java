package com.object;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "oops", "PK");
		Reviews review = new Reviews(344, "good", 80);
		book.addreview(review);// object composition carried out
		System.out.println(book);

	}

}
