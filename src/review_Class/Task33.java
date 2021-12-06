package review_Class;

import java.util.Scanner;

public class Task33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("PLease enter a number");
		int value = scan.nextInt();

		if (value % 2 == 0) {
			System.out.println("Value is even");
			if (value >= 1000) {
				System.out.println("Even value is large");
			} else {
				System.out.println("Even value is just right");
			}

		} else {
			System.out.println("Value is odd");
		}

	}

}
