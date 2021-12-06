package review_Class;

import java.util.Scanner;

public class Task32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your gender:M or F");
		char gender = scan.next().charAt(0);

		System.out.println("Please enter your age");
		int age = scan.nextInt();

		if (gender == 'F') {
			if (age > 25) {
				System.out.println("Woman");
			} else {
				System.out.println("Girl");

			}
		} else {
			if (age > 25) {
				System.out.println("Man");
			} else {
				System.out.println("Boy");
			}
		}
	}
}