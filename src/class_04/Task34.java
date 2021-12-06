package class_04;

import java.util.Scanner;

public class Task34 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");

		System.out.print("Enter the first number:");
		int a = scan.nextInt();

		System.out.print("Enter the second number:");
		int b = scan.nextInt();

		System.out.print("Enter the third number:");
		int c = scan.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println("Largest number is:" + a);
			} else {
				System.out.println("Largest number is:" + c);

			}

		} else if (c > b) {
			System.out.println("Largest number is:" + c);
		} else {
			System.out.println("Largest number is:" + c);

		}
	}

}
