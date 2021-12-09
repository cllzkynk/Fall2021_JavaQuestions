package InterviewSorulari;

import java.util.Scanner;

public class Java_07_CheckNumberEvenOrOdd {

	public static void main(String[] args) {
		
		//Question even or odd number
		// Soru : Kullanicidan bir sayi isteyin cift ve tek sayi olup olmadigini sordurun..
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		
		int num = reader.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num+ " is even");
		}
		else {
			System.out.println(num+ " is odd");
		}
		reader.close();
	}

}
