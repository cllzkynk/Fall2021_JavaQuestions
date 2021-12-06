package homework2;

import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
		// 
		// Let's write a java method that returns seconds when hours and minutes are entered.
		// 1 hour = 3600 sec
		// 1 minute = 60s

		Scanner scan = new Scanner(System.in);	
		System.out.println("enter a hour");
		int hour = scan.nextInt();	
		System.out.println("enter a minute");
		int min = scan.nextInt();	
			
		System.out.println("Hours and Minutes: " +secondsTransform(hour,min)+"seconds.");
		}		
		public static int secondsTransform(int hour,int min) {	
			int sec =(hour*3600)+(min*60)  ;
			return sec;	
		}
		
}
