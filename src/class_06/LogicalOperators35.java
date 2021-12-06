package class_06;

import java.util.Scanner;

public class LogicalOperators35 {

	public static void main(String[] args) {
		boolean loan = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you have a loan (please answer True or False)?");
		loan = scan.nextBoolean();

		if (loan) {
			System.out.println("What is your credit score?");
			int creditScore = scan.nextInt();

			if (creditScore < 600) {
				System.out.println("You're not eligible");
			} else if (creditScore > 600 && creditScore <= 700) {
				System.out.println("You may be eligible");
			} else if (creditScore >= 700 && creditScore <= 800) {
				System.out.println("You're eligible");
			} else if (creditScore > 800) {
				System.out.println("You're definitely eligible");
			}

		} else {
			System.out.println("Eligibility is unknown");
		}
	}

}
