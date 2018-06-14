package com.object;

public class Reviews {
	private int id;
	private String description;
	private int rating;

	Reviews(int id1, String description1, int rating1) {
		this.id = id1;
		this.description = description1;
		this.rating = rating1;

	}

	@Override
	public String toString() {
		return id + " " + " " + description + " " + rating;
	}


}
