package level_3;

import java.util.Scanner;

/*
 * @author CELÝL
 *
 */
public class Simple_Calculator_SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		System.out.println("Please enter an operator (+ , - , * , / ):");
		char operator = scan.next().charAt(0);
		double result = 0;
		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;

		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("Please enter the correct aporator");
			break;
		}
		System.out.println(result);
		scan.close();
	}

}
