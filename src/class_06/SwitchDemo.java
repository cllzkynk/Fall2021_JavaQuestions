package class_06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		/*
		 * let's ask a tester on which browser they would like to use
		 */

		Scanner scan;
		String browser;
		String message;

		scan = new Scanner(System.in);
		System.out.println("Please, enter your browser");
		;
		browser = scan.nextLine();
		switch (browser.toLowerCase()) {

		// .toUpper.Case - for upper case
		case "safari":

			message = "Your code will be executed on safari browser";
			break;
		case "chrome":
			message = "Your code will be executed on chrome browser";
			break;
		case "firefox":
			message = "Your code will be executed on firefox browser";
			break;
		default:
			message = "Entered browser is not supported";

		}
		System.out.println(message);

		// switch cannot work with double, float,long, boolean
		// also cannot use relational>< or logical operators && ||
		// duplicate cases are not allowed
		// all we're doing in switch statements-checking equality

		/*
		 * float f=10.99f; double d=19.90; switch(d) { long l =44535658l; switch(d)
		 * {Compiler Error CE:cannot switch the value of type of long
		 */

	}

}
