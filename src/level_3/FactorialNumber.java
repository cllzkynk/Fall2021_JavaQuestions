/**
 * 
 */
package level_3;

import java.util.Scanner;

/**
 * @author CELÝL
 *
 */
public class FactorialNumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a positive number");
	int num = scan.nextInt();
	
	int fac=1;

	for (int i = 1; i <= num; i++) {
		fac=fac*i;
		
	}
	System.out.println("Factorial of "+ num + "  is "+ fac);
	scan.close();
	}

}
