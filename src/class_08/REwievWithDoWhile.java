package class_08;

import java.util.Scanner;

public class REwievWithDoWhile {

	public static void main(String[] args) {

		int money;
		Scanner input;
		int waterPrice = 5;

		input = new Scanner(System.in);
		System.out.println("Please, pay for your water");

		do {
			money = input.nextInt();
			if (money > waterPrice) {
				System.out.println("Too much, give us less");

			} else if (money < waterPrice) {
				System.out.println("Not enough money, our water is expensive");
			}
			// money = input.nextInt();

		} while (money != waterPrice);
		System.out.println("Enjoy your water");

	}

}
