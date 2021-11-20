package level_2;

import java.util.Scanner;

public class PositiveandNegativeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		double num = scan.nextDouble();
		
		if (num>0.0) {
			System.out.println(num + "  is positive number ");
		} else if (num<0.0) {
			System.out.println(num + "  is negative number ");
		} else {
			System.out.println(num + "  is zero ");
		}
	
	scan.close();
	}

}
