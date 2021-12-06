package class_06;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int results = 0;
		char operation = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 2 numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println("Please enter any of the operators +,-,*,/");
		char operator = input.next().charAt(0);

		switch (operator) {
		case '+':
			results = num1 + num2;
			break;
		case '-':
			results = num1 - num2;
			break;
		case '*':
			results = num1 * num2;
			break;
		case '/':
			results = num1 / num2;
			break;
		default:
			System.out.println("Invalid operation");

		}
		System.out.println(results);
	}

}
