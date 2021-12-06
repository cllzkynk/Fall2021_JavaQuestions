package reviewClass_3;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		int num1;
		int num2;
		char operation;
		int results = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter two numbers");

		num1 = scan.nextInt();
		num2 = scan.nextInt();

		System.out.println("Please enter the operation + - / *");
		operation = scan.next().charAt(0);
		switch (operation) {
		case '+':
			results = num1 + num2;
			break;

		case '-':
			results = num1 - num2;
			break;

		case '/':
			results = num1 / num2;
			break;

		case '*':
			results = num1 * num2;
			break;

		default:
			System.out.println("Invalid input");

		}

	}
}