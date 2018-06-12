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
		for (int mark : listOfMarks) {//enhaced for loop provided in java 5 for creating loop around array listOfMarks

			sum = sum + mark;
		}
		return sum;
	}

	public int getNumberOfMarks() {
		int number;
		number = listOfMarks.length;//array property og getting length of array
		return number;
	}

	public int getMaxMarks() {
		Arrays.sort(listOfMarks);//array static method to sort an array
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
