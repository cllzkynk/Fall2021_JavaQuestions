package class_07;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// play loto where we need to enter 1 to 100
		// lucky number is 7
		// keep asking a user to enter a num until they enter a lucky number

		Scanner scan = new Scanner(System.in);

		int numberFromUser;
		int LuckyNumber = 7;

		do {
			System.out.println("Please enter any number 1-100");
			numberFromUser = scan.nextInt();

		} while (numberFromUser != LuckyNumber);

		System.out.println("You won the price!");

	}

}
