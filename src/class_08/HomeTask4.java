package class_08;

import java.util.Scanner;

public class HomeTask4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("What do you want to buy");
		String item = scan.nextLine();

		System.out.println("What's the price for the item?");
		int price = scan.nextInt();

		System.out.println("Please, insert the amount of money to pay for the item");
		int money = scan.nextInt();

		while (money != price) {
			if (money < price) {
				System.out.println("Sorry. not enough money");
				money = scan.nextInt();

			} else {
				System.out.println("PLease, insert less money");
				money = scan.nextInt();

			}

		}
		System.out.println("Thank you for shopping");
	}
}