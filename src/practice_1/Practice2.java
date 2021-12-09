package practice_1;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		
		/*
		 * ask user to create a user name 
		 * it should have at least 
		 * 1 special char
		 * 1 uppercase letter
		 * 1 lower case letter 
		 * 1 digit
		 * the length of the username should be 8
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a user name that has at least " + 
				"		 * 1 special char    " + 
				"		 * 1 uppercase letter  " + 
				"		 * 1 lower case letter     " + 
				"		 * 1 digit    ");
		
		String specChars = "!@#$%^&*()_+";
		String nums = "0123456789";
		int countChar =0;
		int countUpperCase =0;
		int countLowerCase =0;
		int countDigit =0;
		String userName = scan.next();
		
		for(int i=0; i<userName.length();i++) {
			if(specChars.contains(userName.substring(i,i+1))) {
				System.out.println("We fount special char");
				countChar++;
			}
			if(userName.charAt(i) >= 'A' && userName.charAt(i ) <= 'Z') {
				countUpperCase++;
			}
			
			if(Character.isDigit(userName.charAt(i))) {
				countDigit++;
			}
			if(userName.charAt(i) >= 'a' && userName.charAt(i) <= 'z') {
				countLowerCase++;
			}
		}
		
		if(userName.length() == 8) {
			
			if(countChar >0 && countUpperCase > 0 && countLowerCase > 0 && countDigit>0) {
				System.out.println("You have created your user name successfully!");
			}else {
				System.out.println("You should check your user name one more time ");
			}
			
			
		}else {
			System.out.println("The length of your user name should change");
		}
		
		
		String [] arr = {"one", "two", "three", "four","five","six","seven","eight",
				"nine","ten"};
		String [] arr2 = {"eleven", "twelve", "thirteen", "fourteen","fifteen",
				"sixteen","seventeen","eighteen",
				"nineteen","twenty"};
		String [] arr3 = {"twenty", "thirty", "fourty", "fifty",
				"sixty","seventy","eighty",
				"ninety","hundred"};
		
		System.out.println("Please enter a number");
		int n = scan.nextInt();
		if(n < 11) {
		for (int i = 0; i < arr.length; i++) {
			
			if(i == n-1) {
				
				System.out.println(arr[i]);
	
		}
		}
		}else if(n < 21) {
		
			for (int j = 0; j < arr2.length; j++) {
				
				if(j == (n -11))
				System.out.println(arr2[j]);
			}
		}else if(n < 101) {
         for (int j = 0; j < arr2.length; j++) {
				
				if(j == (n /10 ))
				System.out.println(arr2[j]);
			}
		}
	}

	
}
