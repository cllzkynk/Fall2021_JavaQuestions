package chapter03;

import java.util.Scanner;

public class SimpleIfDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = input.nextInt();

		if (number % 5 == 0)
			System.out.println("HiFive");

		if (number % 2 == 0) { // s�sl� parantezi ben ekledim..

			System.out.println("Merhaba ben ikinci sat�r�n i�indeyim.");
			System.out.println("HiEven");
		}
	}
}
