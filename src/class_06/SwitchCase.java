package class_06;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter day number");
		int day = scan.nextInt();

		if (day == 1) {
			System.out.println("Today is Monday, we have mo class");
		} else if (day == 2) {
			System.out.println("Today is Tuesday, we have manuall class");
		} else if (day == 3) {
			System.out.println("Today is Wednesday, we have manual class again");

		} else if (day == 4) {
			System.out.println("Today is Thursday, we have review class");

		} else if (day == 5) {
			System.out.println("today is Friday, but I have class tmrw and I will prepare");
		} else if (day == 6) {
			System.out.println("Today is SAturday I missed Java");

		} else if (day == 7) {
			System.out.println("Today is Sunday, I did a lot of coding");

		} else {
			System.out.println("This is invalid day");

		}

		System.out.println("-----SAME EXAMPLE BUT WITH SWITCH CASE------");

		String today;
		switch (day) { // switch statement always work with values

		case 1:
			today = "Monday";// what if the value of the day == monday
			break;
		case 2:
			today = "Tuesday";// what if the value of the day == tuesday....
			break;
		case 3:
			today = "Wednesday";// data type of variable must match with data type of cases!!!
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
			today = "Invalid day";
			// break--->is optional since it's a last statement in the switch block

		}
		System.out.println("Today is " + today);

		// no relational operators in switch statements (><)
		// default can be anywhere inside switch
		// no break after default needed
		//
	}

}
