package com.array;

import java.util.ArrayList;

public class ArrayListRunner {

	public static void main(String[] args) {
		ArrayList<String> Month = new ArrayList<String>();

		Month.add("Jan");// ArrayList provide feature of adding element to an array as it is difficult to
							// add element directly to an array
		Month.add("Feb");
		Month.add("Mar");
		Month.add("April");
		Month.add("May");
		Month.add("June");
		Month.add("July");
		Month.add("Aug");
		Month.add("Sept");
		Month.add("Oct");
		Month.add("Nov");
		Month.add("Dec");

		System.out.println(Month);
		System.out.println("ArrayList length is given by " + Month.size());// method to get length of ArrayList
		Month.remove("May");// method of removing an element
		System.out.println(Month);


		}

	}


