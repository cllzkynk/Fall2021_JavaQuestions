package class_06;

import java.util.Scanner;

public class Task36 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two strings and two integers");
		String word1, word2;
		int int1, int2;

		word1 = scan.nextLine();
		word2 = scan.nextLine();

		int1 = scan.nextInt();
		int2 = scan.nextInt();

		if (word1.equals(word2) && int1 == int2) {
			System.out.println("AND");

		} else if (int1 == int2 || word1.equals(word2)) {
			System.out.println("OR");

		} else if (!(int1 == int2) && !(word1.equals(word2))) {
			System.out.println("NONE");

		}

	}
}
