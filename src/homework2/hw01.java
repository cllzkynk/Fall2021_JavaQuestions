package homework2;

import java.util.Scanner;

public class hw01 {
	public static void main(String[] args) {

		// Let's ask the user to enter a string set and how many words
		// Write the java method that returns the occurrence.

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a sentence");		String str = scan.nextLine();
		
			System.out.println("Metindeki kelime sayisi: "+wordCount(str));
		}	
		
		public static int wordCount(String str) {
			int count = 0;
			for(int i = 0;i<str.length();i++) {	//bugün hava cok sicak
				if(str.charAt(i)==' ') {
					count++;
				}
			}
			count = count+1;
		return count;
			
			
		}

}
