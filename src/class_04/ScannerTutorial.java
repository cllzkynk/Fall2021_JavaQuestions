package class_04;

import java.util.Scanner;

public class ScannerTutorial {

	public static void main(String[] args) {

		Scanner marta = new Scanner(System.in);

		System.out.println("What's your first name?");
		String name = marta.next();

		System.out.println("What's your last name?");
		String lastName = marta.next();

		System.out.println("Your name is " + name + " and your last name is " + lastName);
		System.out.println("HOw old are you,Marta?");
		int age = marta.nextInt();
		System.out.println("YOur age is " + age);

	}

}
