package class_06;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {

		double num1, num2, num3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter any three decimal numbers");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();

		if (num1 > num2 && num1 > num3) {
			System.out.println("The largest number is " + num1);
		} else if (num2 > num3) {
			System.out.println("The largest number is " + num2);
		} else {
			System.out.println("The largest number is " + num3);

		}
	}
}
