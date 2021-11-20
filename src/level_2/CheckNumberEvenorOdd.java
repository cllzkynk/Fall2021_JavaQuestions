/**
 * 
 */
package level_2;

import java.util.Scanner;

/**
 * @author CELÝL
 *
 */
public class CheckNumberEvenorOdd {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter a number");
		int num=scan.nextInt();
		
		if (num%2==0) {
			
			System.out.println(num + " is  even ");
		} else {
			System.out.println(num + " is  odd ");
		}
scan.close();
	}

}
