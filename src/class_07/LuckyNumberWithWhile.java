package class_07;

import java.util.Scanner;

public class LuckyNumberWithWhile {

	public static void main(String[] args) {

		int numberFromUser;
		int LuckyNumber = 7;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please,enter any numberfrom 1 to 100");
		numberFromUser = scan.nextInt();
		while (numberFromUser != LuckyNumber) {
			numberFromUser = scan.nextInt();

		}

	}

}
