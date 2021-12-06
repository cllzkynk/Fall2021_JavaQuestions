package class_04;

import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {

		Scanner loan = new Scanner(System.in);
		System.out.println("What is the amount of loan needed?");
		int amount = loan.nextInt();
		if (amount <= 200000) {
			System.out.println("I will lend you money");
		} else {
			System.out.println("Sorry, you're rejected");
		}

	}

}
