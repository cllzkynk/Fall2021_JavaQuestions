package class_05;

import java.util.Scanner;

public class ImprovedMonth {

	public static void main(String[] args) {

		Scanner scan;
		String month;
		String season = null;

		scan = new Scanner(System.in);
		System.out.println("Please, enter your birth month");

		month = scan.next();

		if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season = "Summer";

		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season = "Autumn";

		} else if (month.equals("December") || month.equals("January") || month.equals("February")) {
			season = "Winter";

		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "Spring";

			// } else {
			// season = "invalid"; // instead of this we can initialize the variable
			// season =
		}
		System.out.println("You were born in " + season);
	}

}
