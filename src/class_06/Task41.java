package class_06;

import java.util.Scanner;

public class Task41 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter the age of a child");
		int age = scan.nextInt();
		String message;

		switch (age) {
		case (1):
			message = "You can Crawl";
			break;
		case (2):
			message = "You can Talk";
			break;
		case (3):
			message = "You can Dance";
			break;

		case (4):
			message = "You can get Trouble";
			break;
		default:
			message = "I don't know how old you are";

		}
		System.out.println(message);
	}
}
