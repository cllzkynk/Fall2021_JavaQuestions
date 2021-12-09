package InterviewSorulari;

import java.util.Scanner;

public class Java_01_PrintInteger {

	public static void main(String[] args) {
		
		// Question: Print an integer getting input from user
		// Kullaniciya bir tamsayi yazdiriniz...
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = scan.nextInt();
		
		System.out.println("You entered "+ num);
		
		scan.close();

	}

}
