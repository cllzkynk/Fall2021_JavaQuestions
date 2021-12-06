package class_04;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = scan.nextInt();
		if (age >= 18) {
			System.out.println("We will issue a driver licence to you");
		} else {
			System.out.println("Please, get a learners permit");
		}
	}

}
