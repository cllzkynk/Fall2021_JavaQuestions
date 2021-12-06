package reviewClass_4;

import java.util.Scanner;

public class WhileLoopWithSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1;
		double num2;
		char operation;
		double results;
		boolean continueLoop = true;
		String end;

		while (continueLoop) {

			System.out.println("Please Enter 2 numbers");
			Scanner scanner = new Scanner(System.in);
			num1 = scanner.nextDouble();
			num2 = scanner.nextDouble();

			System.out.println("Please Enter the operator +,-,*,/");
			operation = scanner.next().charAt(0);
			if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {
				System.out.println("Operation not supported");
				continue;
			}
			switch (operation) {
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
				results = 0;

			}
			System.out.println("The result of your operation is " + results);
			System.out.println("Enter Yes to perform more operations and No to terminate program");
			end = scanner.next();
			if ("No".equals(end)) {
				continueLoop = false;
			}

		}

	}
}
