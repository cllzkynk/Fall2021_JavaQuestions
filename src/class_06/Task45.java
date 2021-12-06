package class_06;

import java.util.Scanner;

public class Task45 {

	public static void main(String[] args) {
		System.out.println("Input a number between 1-7");
		Scanner scan = new Scanner(System.in);
		int day = scan.nextInt();
		String today;

		switch (day) {
		case 1:
			today = "Monday";
			break;
		case 2:
			today = "Tuesday";
			break;
		case 3:
			today = "Wednesday";
			break;
		case 4:
			today = "Thursday";
			break;
		case 5:
			today = "Friday";
			break;
		case 6:
			today = "Saturday";
			break;
		case 7:
			today = "Sunday";
			break;
		default:
			today = "Invalid";
		}
		System.out.println(today);
	}

}
