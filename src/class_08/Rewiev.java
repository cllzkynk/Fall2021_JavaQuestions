package class_08;

import java.util.Scanner;

public class Rewiev {

	public static void main(String[] args) {

		/*
		 * ask user to pay for water 5$ once user enters money ,we need to tell whether
		 * we need more money or less, once user gives us 5$ we will say enjoy your
		 * water
		 */

		int money;
		Scanner input;
		int waterPrice = 5;

		input = new Scanner(System.in);
		System.out.println("Please, pay for your water");
		money = input.nextInt();

		while (money != waterPrice) {
			if (money > waterPrice) {
				System.out.println("Too much, give us less");
				// money = input.nextInt();
			} else {
				System.out.println("Not enough money, our water is expensive");
				// money = input.nextInt();
			}
			money = input.nextInt();
		}
		System.out.println("Enjoy your water");
	}

}
