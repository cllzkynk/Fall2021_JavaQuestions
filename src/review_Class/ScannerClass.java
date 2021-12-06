package review_Class;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		// next.line reads all the line, next - only one word

		String name;
		int age;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter your name");
		name = scanner.nextLine();
		System.out.println("Please,enter your age");
		age = scanner.nextInt();
		System.out.println("Hi " + name + ", you are " + age + " years old");
		if (age > 20) {
			System.out.println("Go and work");
		} else {
			System.out.println("Study a lot if you want to have money");
		}
	}
}