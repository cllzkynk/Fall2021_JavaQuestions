package level_3;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = scan.nextInt();

		System.out.println(isLeapYear(year) ? "Leap Year" : "Not a Leap Year");
		scan.close();
	}

	public static boolean isLeapYear(int year) {
		if (year % 400 == 0) {
			return true;

		} else if (year % 100 != 0 && year % 4 == 0) {
			return true;

		}

		return false;
	}

}
