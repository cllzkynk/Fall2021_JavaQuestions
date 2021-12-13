package Random_;

import java.util.Scanner;

public class IsPrime {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter a number for check");

		System.out.println(isPrime(scan.nextInt()));
	}
	public static boolean isPrime(int a) {
		for (int i = 2; i < a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
}
