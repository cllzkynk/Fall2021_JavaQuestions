package class_05;

import java.util.Scanner;

public class HomeTask3 {

	public static void main(String[] args) {
		/*
		 * You are working in sales and have to calculate commission for the employees;
		 * 
		 * You need to ask user a sales amount and based on the amount you need to
		 * define their commission
		 * 
		 * if user sold products for more than $10 but less than 100 --> commission is
		 * 10%
		 * 
		 * if sales is more than 100 but less then 200 --> commission is 20%
		 * 
		 * if sales is more than 200 but less then 500 --> commission is 30%
		 * 
		 * if sales is more than 500 --> commission is 50%
		 * 
		 * You program should print How much in commission user will get
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		double amount, commission;
		System.out.println("Please, enter the amount of money");

		amount = scan.nextDouble();

		if (amount > 10 && amount < 200) {
			commission = (amount * 10) / 100;
		} else if (amount > 100 && amount < 200) {
			commission = (amount * 20) / 100;

		} else if (amount > 200 && amount < 500) {
			commission = (amount * 30) / 100;
		} else if (amount > 500) {
			commission = (amount * 50) / 100;

		} else {
			commission = 0;
		}
		System.out.println("The amount of your commission is " + commission);
// if you sell more than 1k --> you're an awesome seller

		if (commission > 1000) {
			System.out.println("You are awesome seller");
		}
	}
}
