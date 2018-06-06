package com.conditionals;

public class SwitchExercises {

	public static void main(String[] args) {

		System.out.println(isWeekDay(8));
		System.out.println(NameOfMonth(4));
	}

		public static boolean isWeekDay(int noOfDay)
		{
			switch(noOfDay) {
			case 1:return true;

			case 2:return true;

			case 3:return true;

			case 4:return true;

			case 5:return true;

			default:return false;
			}
	}

	public static String NameOfMonth(int noOfMonth) {
		switch (noOfMonth) {
		case 1:
			return "January";


		case 2:
			return "February";

		case 3:
			return "March";

		case 4:
			return "April";

		case 5:
			return "May";

		case 6:
			return "June";


		case 7:
			return "July";

		case 8:
			return "August";

		case 9:
			return "September";

		case 10:
			return "october";

		case 11:
			return" November";

		case 12:
			return "December";
		default:
			return "invalid";
		}



	}
}








