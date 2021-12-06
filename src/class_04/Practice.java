package class_04;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the city");

		String city = input.nextLine();
		System.out.println("Enter the temperature in F in " + city);

		int tempF = input.nextInt();

		int tempC = (int) ((tempF - 32) / 1.8);

		System.out.println("Temperature in " + city + " is " + tempC + " Celcium");
	}
}
