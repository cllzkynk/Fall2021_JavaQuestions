/**
 * 
 */
package level_2;

import java.util.Scanner;

/**
 * @author CELÝL
 *
 */
public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a year");
		int year = scan.nextInt();
		boolean leap = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leap = true;
				} else {
					leap = false;
				}
			} else {
				leap = false;
			}
		} else {
			leap = false;
		}
		if (leap) {
			System.out.println(year + "is  a leap year");
		} else {
			System.out.println(year + "is not a leap year");
		}
		scan.close();
	}

}
