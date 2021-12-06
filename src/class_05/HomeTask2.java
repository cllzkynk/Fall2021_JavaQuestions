package class_05;

import java.util.Scanner;

public class HomeTask2 {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest number among three numbers using nested if
		 * provided by a user (numbers must be distinct)
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		double largest, num1, num2, num3;

		System.out.println("Please,Enter three distinct double numbers");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();

		if (num1 > num2) {
			if (num1 > num3) {
				largest = num1;
			} else {
				largest = num3;
			}

		} else {
			if (num2 > num3) {
				largest = num2;

			} else {
				largest = num3;
			}
		}
		System.out.println("The largest number is " + largest);
	}
}
