package com.strings;

import java.time.LocalDate;//need to import this package as it is not present in default package of java api

public class JavaDates {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();// NOW IS A FUNCTION IN THIS PROVIDING DATE
		System.out.println(now); // methods of exploring dates by java API opted from"JODA FRAMEWORKS"
		System.out.println(now.getDayOfMonth());

		System.out.println(now.getDayOfYear());
		System.out.println(now.getDayOfWeek());
		System.out.println(now.isLeapYear());
		System.out.println(now.lengthOfMonth());
		System.out.println(now.lengthOfYear());
		System.out.println(now.plusDays(100));

		LocalDate yesterday = LocalDate.of(2018, 6, 10); // of is a function in LocalDate to set specific date
		System.out.println("yesterday date is " + yesterday);
		now.withDayOfMonth(20);// methods to get day accordingly to modify specific day,year,month
		now.withDayOfYear(120);
		now.withYear(2020);
		System.out.println(now.isBefore(yesterday));

	}

}
