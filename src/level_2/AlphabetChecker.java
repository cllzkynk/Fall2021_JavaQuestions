/**
 * 
 */
package level_2;

import java.util.Scanner;

/**
 * @author CELÝL
 *
 */
public class AlphabetChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a character");

		char c = scan.next().charAt(0);

		if ((c >= 'a' & c <= 'z') || (c >= 'A' & c <= 'A')) {
			System.out.println(c + "   is in alphabet");
		} else {
			System.out.println(c + "    is in  not   alphabet");
		}

		scan.close();

	}

}
