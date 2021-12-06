package class_06;

import java.util.Scanner;

public class LogicalOperators36 {

	public static void main(String[] args) {
		String word1, word2;
		int num1, num2;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two strings");
		word1 = scan.nextLine();
		word2 = scan.nextLine();

		System.out.println("Please enter two numbers ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();

		if (num1 == num2 && word1 == word2) {
			System.out.println("AND");

		} else if (num1 != num2 && word1 != word2) {
			System.out.println("NONE");

		}
	}

}
