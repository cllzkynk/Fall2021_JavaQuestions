package homework2;

import java.util.Scanner;

public class hw09 {

	public static void main(String[] args) {

		//Let's add up the numbers that the user entered until they enter the number 0.
				Scanner scan = new Scanner(System.in);
				System.out.println("please enter a number");
				int a = scan.nextInt();
				int sum = 0;
				
				do {
					System.out.println("please enter a number again");
					sum = sum+a;
					a = scan.nextInt();
				}while(a!=0);
				System.out.println("Sum: "+sum);
			}

	}


