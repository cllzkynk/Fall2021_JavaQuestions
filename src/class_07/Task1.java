package class_07;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String item;
		System.out.println("what would u like to buy?");
		item = scan.nextLine();
		int itemPrice;
		int money;

		System.out.println("What is the price for your chosen item");
		itemPrice = scan.nextInt();

		System.out.println("Insert the money");
		money = scan.nextInt();

		while (money != itemPrice) {
			if (money > itemPrice) {
				System.out.println("please. insert less");
				money = scan.nextInt();

			} else {
				System.out.println("not enough money");
				money = scan.nextInt();
			}

		}
		System.out.println("thank you for shopping");

	}
}