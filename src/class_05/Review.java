package class_05;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {

		Scanner scanner;
		scanner = new Scanner(System.in);

		// I want to capture sentence
		System.out.print("Please, enter any sentence");
		String sentence = scanner.nextLine();

		System.out.println("You enetered sentence: " + sentence);

		// I want to capture 1 character
		System.out.println("Please, enter any single character");
		char singleChar = scanner.next().charAt(0);
		System.out.println("You entered character: " + singleChar);

		// I want to capture number
		System.out.println("Please, enter any number");
		int num = scanner.nextInt();
		System.out.println("You entered number: " + num);

	}

}
