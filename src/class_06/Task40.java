package class_06;

import java.util.Scanner;

public class Task40 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		String name;
		String message;
		name = scan.nextLine();

		switch (name) {
		case "Asghar":
			message = "Will take care of Java Assignment";
			break;

		case "Moazam":
			message = "Will take care of SDLC Assignment";
			break;

		case "Weqas":
			message = "Will take care of Selenium Assignment";
			break;

		case "Asel":
			message = "Will take care of every Assignment";
			break;

		default:
			message = "Invalid instructor selected";

		}
		System.out.println(message);
	}
}
