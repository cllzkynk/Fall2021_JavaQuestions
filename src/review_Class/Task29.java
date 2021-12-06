package review_Class;

import java.util.Scanner;

public class Task29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter mounth number");
		int mon = scan.nextInt();

		if (mon == 1) {
			System.out.println("January");

		} else if (mon == 2) {
			System.out.println("February");

		} else if (mon == 3) {
			System.out.println("March");
		} else if (mon == 4) {
			System.out.println("April");
		} else if (mon == 5) {
			System.out.println("May");
		} else if (mon == 6) {
			System.out.println("June");
		} else if (mon == 7) {
			System.out.println("July");
		} else if (mon == 8) {
			System.out.println("August");
		} else if (mon == 9) {
			System.out.println("September");
		} else if (mon == 10) {
			System.out.println("October");
		} else if (mon == 11) {
			System.out.println("November");
		} else if (mon == 12) {
			System.out.println("December");
		} else {
			System.out.println("Invalid");
		}
	}

}