package class_05;

import java.util.Scanner;

public class LOgicalOperatorsAND {

	public static void main(String[] args) {

		// if number is >1 but smaller than 10---> small
		// if number is>11 but smaller than 100--->number is big

		// AND(&&)

		// if( true && true)----> TRUE
		// if (true && false)---> FALSE
		// if (False && true) ---> FALSE
		// if (false && false)---> FALSE
		// && only works if we have both TT or both FF

		// I need to define weather number that is entered is small, large or XL
		// small between 1 to 10
		// med - 11 to 100
		// large 101-1000

		Scanner input;
		int number;

		input = new Scanner(System.in);
		System.out.println("Please, enter any number");
		number = input.nextInt();

		if (number > 0 && number <= 10) {
			System.out.println("You entered small number");

		} else if (number > 10 && number <= 100) {
			System.out.println("You enterered medium number");
		} else if (number > 100 && number < 1000) {
			System.out.println("You entered lagre number");

		} else {
			System.out.println("");
		}

	}
}