package class_06;

import java.util.Scanner;

public class Task37 {

	public static void main(String[] args) {
		Boolean b1, b2;
		String drink;
		Scanner scan = new Scanner(System.in);
		System.out.println("Are you thirsty?");
		b1 = scan.nextBoolean();

		System.out.println("Are you sleepy?");
		b2 = scan.nextBoolean();

		if (b1 == true && b2 == false) {
			drink = "Water";
		} else if (b1 == true && b2 == true) {
			drink = "Coffee";

		} else if (b1 == false && b2 == true) {
			drink = "Tea";

		} else {
			drink = "Nothing";
		}
		System.out.println("Looks like you need to drink " + drink);
	}

}
