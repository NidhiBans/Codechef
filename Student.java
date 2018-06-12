package com.array;

import java.util.Arrays;

public class Student {
	String name;
	int[] listOfMarks;

	Student(String name, int listOfMarks[]) {
		this.name = name;
		this.listOfMarks = listOfMarks;
	}

	public int getTotalSumMarks() {
		int sum = 0;
		for (int mark : listOfMarks) {

			sum = sum + mark;
		}
		return sum;
	}

	public int getNumberOfMarks() {
		int number;
		number = listOfMarks.length;
		return number;
	}

	public int getMaxMarks() {
		Arrays.sort(listOfMarks);
		int number;
		number = listOfMarks.length;

		return listOfMarks[number - 1];

	}

	public int getMinMark() {

		return listOfMarks[0];
	}

	public int getAverageMarks() {
		int sum = getTotalSumMarks();
		int number = getNumberOfMarks();
		int average = sum / number;
		return average;
	}

}
