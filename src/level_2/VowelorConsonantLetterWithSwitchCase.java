/**
 * 
 */
package level_2;

import java.util.Scanner;

/**
 * @author CELÝL
 *
 */
public class VowelorConsonantLetterWithSwitchCase {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter a letter");
		char ch=scan.next().toLowerCase().charAt(0);
		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'u':
		case 'o':
		System.out.println(ch + " is vowel");
			break;

		default:
			System.out.println(ch + " is consonant");
			break;
		}
	scan.close();}

}
