package class_06;

import java.util.Scanner;

public class Task44 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		String car;
		String carOrigin;
		car = scan.nextLine();

		switch (car) {
		case "BMW":
			carOrigin = "german car";
			break;

		case "Toyota":
			carOrigin = "japanese car";
			break;

		case "Maserati":
			carOrigin = "italian car";
			break;

		default:
			carOrigin = "unknown";

		}
		System.out.println("Your favorite car is " + carOrigin);

	}

}
