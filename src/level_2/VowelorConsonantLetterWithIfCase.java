/**
 * 
 */
package level_2;

import java.util.Scanner;

/**
 * @author CELÝL
 *
 */
public class VowelorConsonantLetterWithIfCase {

	
	public static void main(String[] args) {
	
			Scanner scan=new Scanner (System.in);
			System.out.println("Please enter a letter");
			char ch=scan.next().toLowerCase().charAt(0);
			
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch + " is vowel");
			}else {
				System.out.println(ch + " is consonant");
			}
scan.close();
	}

}
