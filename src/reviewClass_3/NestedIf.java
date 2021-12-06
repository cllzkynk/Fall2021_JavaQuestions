package reviewClass_3;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {

		String pass = "pass123";
		double accountBalance = 100;
		Scanner scan = new Scanner(System.in);
		double transferAmount = 500;

		System.out.println("Welcome to Syntax Bank,please enter your password");
		pass = scan.nextLine();

		if ("pass123".equals(pass) || pass.equals("pass123")) {
			System.out.println("please, enter the Amount that you want to transfer");

			transferAmount = scan.nextDouble();
			if (transferAmount > accountBalance) {
				System.out.println("Not enough funds");
			} else {
				System.out.println("Transfer remaining balance " + (accountBalance - transferAmount));
			}

		} else {
			System.out.println("Sorry try again, invalid credentials");
		}

	}

}
