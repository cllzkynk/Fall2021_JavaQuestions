package review_Class;

import java.util.Scanner;

public class Task31 {
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		System.out.println("Is it sunny outside");

		boolean isSunny = scann.nextBoolean();
		if (isSunny == true) {
			System.out.println("It is a sunny day, I shoud go somewhere");

			System.out.println("What is the temperature outside?");
			int temp = scann.nextInt();
			if (temp > 85) {
				System.out.println("I am going to the beach");
			} else {
				System.out.println("I am going to the park");
			}
		} else {
			System.out.println("I stay home and practice Java");
		}

	}

}
