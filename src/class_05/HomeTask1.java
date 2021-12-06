package class_05;

import java.util.Scanner;

public class HomeTask1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double largestNumber = 0, num1, num2, num3;

		System.out.println("Please,Enter three distinct double numbers");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();
		scan.close();

		// 1st way
		if (!(num1 == num2 && num2 == num3)) { // if it's 9, 9, 9 all the cond will be true and then we convert it with
												// the help of ! and now it's false and we will not go inside the code
												// but at the very end to else part where numbers are equal

			if (num1 > num2 && num1 > num3) {
				largestNumber = num1;
			} else if (num2 > num3) {
				largestNumber = num2;
			} else {
				largestNumber = num3;

			}
		} else {
			System.out.println("The numbers are equal");

		}
		System.out.println("The largest number is " + largestNumber);

		System.out.println("-------COMPARING 2 NUMBERS USING NESTED IF------");

		// 2nd way
		double biggest;

		if (num1 > num2) { // if num1 larger than num2
			if (num1 > num3) {
				biggest = num1;
			} else {
				biggest = num3;
			}

		} else { // num2 is larger than num1
			if (num2 > num3) {
				biggest = num2;

			} else {
				biggest = num3;
			}
		}
		System.out.println("The largest number is " + biggest);

	}
}
