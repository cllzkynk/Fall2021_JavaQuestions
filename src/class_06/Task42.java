package class_06;

import java.util.Scanner;

public class Task42 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the roll number of the Child");
		int rollNumber = scan.nextInt();
		String message;

		switch (rollNumber) {
		case 101:
			message = "Student name: Ramesh";
			break;

		case 102:
			message = "Student name: Mahesh";
			break;

		case 103:
			message = "Student name: Mukesh";
			break;

		default:
			message = "Not found Student name: in Class";

		}

		System.out.println(message);

	}

}
