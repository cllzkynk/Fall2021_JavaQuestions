package practice_1;

import java.util.Scanner;

public class IfStatements {

	public static void main(String[] args) {
		/*
		 ask user to enter 3 numbers 
		
		 * 
		 * use substring method
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please nenter 3 numbers");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		int n3 = scan.nextInt();
		
		
		int dif1 =0; 
		int dif2 =0;
		
		
		if(n1 < n3) {
			dif1 = 0 - (n1 - n3);
		}else {
			dif1 = n1 - n3;
		}
		
		if(n2 < n3) {
			dif2 = 0 - (n2 - n3);
		}else {
			dif2 = n2 - n3;
		}
		
		
		System.out.println(dif1);
		System.out.println(dif2);
		
		System.out.println(dif1 < dif2? n1+" is the closest number" :n2+" is the closest number");
		/*
		System.out.println("Find the max number");
		System.out.println("Find the minimum number");
		*/
		

	}

}
