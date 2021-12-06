package class_04;

import java.util.Scanner;

public class HomeTaks3 {
	public static void main(String[] args) {

		Scanner name = new Scanner(System.in);
		System.out.println("Please, enter your city");
		String city = name.nextLine();

		System.out.println("What is the temperature in Fahrenheit in " + city);
		int temperatureF = name.nextInt();
		double temperatureC = ((temperatureF - 32) * 5 / 9);

		System.out.println(
				"The temperature in " + city + " is " + temperatureF + " Fahrenheit or " + temperatureC + " Celcium");
		;

	}
}
