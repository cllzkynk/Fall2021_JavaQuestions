package class_08;

import java.util.Scanner;

public class Repl062 {

	public static void main(String[] args) {

		int x;
		int num;
		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		x = inp.nextInt();

		for (num = x - 1; num >= 0; num--) {
			System.out.println(num);

		}

	}

}