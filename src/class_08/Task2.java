package class_08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String response;

		do {
			System.out.print("Do you want to apply for credit car ");
			response = scan.nextLine();

		} while (!response.equalsIgnoreCase("yes"));

		System.out.print("You are selected ");

	}

}
