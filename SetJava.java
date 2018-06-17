package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetJava {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		Set<Character> example = new HashSet<>(characters);// print elements by ignoring order in which they are
															// inserted
		example.add('S');
		example.remove('Z');


		System.out.println(example);
		Set<Character> example2 = new TreeSet<>(characters);// print in sorted order
		System.out.println(example2);

		Set<Character> example3 = new LinkedHashSet<>(characters);// print in order in which they are inserted
		System.out.println(example3);

	}

}
