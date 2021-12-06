package class_06;

import java.util.Scanner;

public class TaskInClass {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
		 * C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
		 * should print which grade was entered by a user with explanation.
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your grade");

		char grade;
		String message;
		grade = scan.next().charAt(0);

		switch (grade) {
		case 'A':
			message = "Exellent";
			break;

		case 'B':
			message = "Good";
			break;
		case 'C':
			message = "Avegare";
			break;
		case 'D':
			message = "Bad";
			break;
		default:
			message = "invalid input";

		}
		System.out.println(message);

	}

}
