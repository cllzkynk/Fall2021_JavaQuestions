package class_07;

import java.util.Scanner;

public class ScannerWithLoop {
	public static void main(String[] args) {

		// ask user what is his name 5 times
		// hello +name

		Scanner scan = new Scanner(System.in);
		String name;

		int num = 1;
		while (num <= 5) {
			System.out.println("Please, tell me your name");
			name = scan.nextLine();
			System.out.println("Nice to meet you " + name);
			num++;

		}

	}

}
