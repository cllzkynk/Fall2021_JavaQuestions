package level_3;

import java.util.Scanner;

public class Floyd_Triangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter a number of rows ");

		int rows = scan.nextInt();

		printFloydTriangle(rows);
		scan.close();
	}

	public static void printFloydTriangle(int rows) {
		int number = 1;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}

}
