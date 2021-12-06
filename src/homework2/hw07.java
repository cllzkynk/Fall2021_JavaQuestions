package homework2;

import java.util.Scanner;

public class hw07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a sentence");
		String str = scan.nextLine();
		System.out.println("enter a character");
		String ch= scan.next();
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.substring(i,i+1).equals(ch)) {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
