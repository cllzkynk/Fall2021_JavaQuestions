package class_05;

import java.util.Scanner;

public class NewTask {

	public static void main(String[] args) {

		// Write a program to ask user to enter numbers of worked years and annual
		// salary.
		// If user worked for more or equals to 5 years than user is eligible for the
		// bonus, otherwise he is not.
		// Once user is eligible and salary is larger than 50000 than bonus = 5000,
		// otherwise bonus=3000.

		int years;
		int salary;
		Scanner scan = new Scanner(System.in);
		System.out.println("For how many year have you been woking with us?");

		years = scan.nextInt();

		if (years >= 5) {
			System.out.println("You're eligible for the bonus");

			System.out.println("Please enter the amount of your salary");
			salary = scan.nextInt();

			if (salary > 50000) {
				System.out.println("Your bonus is 5000");
			} else {
				System.out.println("Your bonus is 3000");
			}

		} else {
			System.out.println("I'm sorry you should be working longer with us");
		}

	}

}
