package com.object;

public class Book {
	private int id;
	private String name;
	private String author;
	private Reviews review;

	Book(int id1, String name1, String author1) {
		this.id = id1;
		this.name = name1;
		this.author = author1;

	}

	public void addreview(Reviews review1) {
		this.review = review1;
		System.out.println(review);

	}

	@Override
	public String toString() {
		return id + " " + name + " " + author;

}



}