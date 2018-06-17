package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Javalist {

	public static void main(String[] args) {
		List<Integer> marks = List.of(77, 88, 99, 100);// List is created
		System.out.println(marks);
		System.out.println(marks.size());// method to get size of list
		System.out.println(marks.contains(45));// check whether 45 present in list or not
		System.out.println(marks.contains(100));
		System.out.println(marks.indexOf(88));// get index of 88
		System.out.println(marks.isEmpty());// check whether list is empty
		System.out.println(marks.get(3));// get element at location 3

		List<Integer> marksArraylist = new ArrayList<Integer>(marks);// As default list is immutable it is need to be
																		// converted into ArrayList to add or remove
																		// elements
		marksArraylist.add(66);// to add an element to list
		System.out.println(marksArraylist);
		System.out.println(marksArraylist.remove(66));// to remove element from list
		System.out.println(marksArraylist.remove(2));
		System.out.println(marksArraylist.set(3, 55));// to add 55 at location 3 in list


		List<Integer> marksvector = new Vector<Integer>(marks);// As default list is immutable it is need to be
		// converted into Vector to add or remove
		// elements
		System.out.println(marksvector);
		System.out.println(marksvector.remove(66));
		System.out.println(marksvector.remove(2));
		System.out.println(marksvector.set(3, 55));

	}

}
