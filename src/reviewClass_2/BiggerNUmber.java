package reviewClass_2;

import java.util.Scanner;

public class BiggerNUmber {

	public static void main(String[] args) {

		Scanner userIn = new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");
		int num1 = userIn.nextInt();
		int num2 = userIn.nextInt();
		int num3 = userIn.nextInt();
		if (num1 > num2) {
			System.out.println("inside num1 > num2 value of num1 " + num1 + " num2 " + num2);
		} else {
			num1 = num2;
			System.out.println("inside the else block " + num1 + " num2 " + num2);
		}
		if (num1 > num3) {
			System.out.println("largest number is " + num1);
		} else {
			System.out.println("largest number is " + num3);

		}
	}
}
