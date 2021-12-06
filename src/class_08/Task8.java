package class_08;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// i want to create the multiplication table

		/*
		 * 1*1=1 1*2=3 1*2=3
		 * 
		 * 
		 * 
		 * 
		 * 1*10=10 num 1 never changes; we only work with i cause its value is
		 * increasing by 1 every time
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter any number ");

		int num1 = scan.nextInt();
		int mult;

		for (int i = 1; i <= 10; i++) {
			mult = num1 * i;
			System.out.println(num1 + "*" + i + " = " + mult);

		}

	}

}
