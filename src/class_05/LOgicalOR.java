package class_05;

import java.util.Scanner;

public class LOgicalOR {

	public static void main(String[] args) {
		// OR||
		// if (true || true)---> TRUE
		// if (true || false)---> TRUE
		// if( false || true)---> TRUE
		// if(false ||false)---> FALSE

		String day = "Sunday";

		if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have a java class");

		}
		System.out.println("The end");

		System.out.println("------------EXAMPLE-----------");

		/*
		 * if day is 1 0r 5---> I'm off from Syntax if day is 2 or 3---> git class if
		 * day is 4 ---> review day 6-7 ---> java any other ---> ivalid day
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("PLease, enter todays day using numbers only");

		int today = scan.nextInt();

		if (today == 1 || today == 5) {
			System.out.println("I'm off from Syntax");
		} else if (today == 2 || today == 3) {
			System.out.println("I have GIT class today");
		} else if (today == 4) {
			System.out.println("I will have a review day");
		} else if (today == 6 || today == 7) {
			System.out.println("Today is Java class");

		} else {
			System.out.println("Invalid day entered");

		}

	}
}
