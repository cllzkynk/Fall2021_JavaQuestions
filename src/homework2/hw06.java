package homework2;

import java.util.Scanner;

public class hw06 {

	public static void main(String[] args) {
		//	print each character of the string to be entered.
				//kemal
				/*k
				 * e
				 * m
				 * a
				 * l
				 */
				Scanner scan = new Scanner(System.in);
				System.out.println("enter a string");
				String str = scan.nextLine();
				print(str);
			}
			public static void print(String str) {
			for(int i=0;i<str.length();i++) {
					char ch = str.charAt(i);
					System.out.println(ch);
				}
			}
				
	}


