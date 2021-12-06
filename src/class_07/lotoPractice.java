package class_07;

import java.util.Scanner;

public class lotoPractice {

	public static void main(String[] args) {
		int luckyNum = 7;
		int userNumber;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Please, enter your number from 1 to 100");
			userNumber = scan.nextInt();
		} while (userNumber != luckyNum);
		System.out.println("Congratulations!!!");

	}
}