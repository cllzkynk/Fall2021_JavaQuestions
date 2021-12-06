package class_10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		// let's ask user how many names he would like to store;
		// store those names;
		//

		Scanner scan;
		String[] names;
		int size;

		scan = new Scanner(System.in);
		System.out.println("how many names?");
		size = scan.nextInt();

		names = new String[size];
		// we're storing values into an array
		for (int i = 0; i < size; i++) {
			System.out.println("Please, enter any name");
			names[i] = scan.next();

		}
		// we're retrieving values from an array
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " ");

			// size - we count normally;
			// indexes - starting from 0;
		}

	}

}
