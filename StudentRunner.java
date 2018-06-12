package com.array;

public class StudentRunner {

	public static void main(String[] args) {
		int[] listOfMarks = { 100, 60, 78, 75, 58 };
		Student student = new Student("Nidhi", listOfMarks);
		System.out.println(student);
		int number = student.getNumberOfMarks();
		System.out.println("NumberOfMarks is" + number);
		int sum = student.getTotalSumMarks();
		System.out.println("TotalMarks is" + sum);
		int maximummark = student.getMaxMarks();
		System.out.println("Max marks are" + maximummark);
		int minimummarks = student.getMinMark();
		System.out.println("Min marks are" + minimummarks);
		int average = student.getAverageMarks();
		System.out.println("Average marks are" + average);

	}

}
