package class_08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter beginning value");
		int start = scan.nextInt();

		System.out.println("Please enter ending value");
		int end = scan.nextInt();

		int sumEven = 0;
		int sumOdd = 0;

		for (int i = start; i < end; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
		}
		System.out.println("the sum of even numbers within the range is " + sumEven);
		System.out.println("the sum of odd numbers within the range is " + sumOdd);
	}

}
